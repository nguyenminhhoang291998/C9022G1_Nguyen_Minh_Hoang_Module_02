package case_study.furama_resort.services.impl;

import case_study.furama_resort.models.facility.Facility;
import case_study.furama_resort.models.facility.Room;
import case_study.furama_resort.models.facility.Villa;
import case_study.furama_resort.services.IFacilityService;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class FacilityServiceImpl implements IFacilityService {


    private final String PATH_FILE_VILLA = "src/case_study/furama_resort/data/villa.csv";
    private final String PATH_FILE_ROOM = "src/case_study/furama_resort/data/room.csv";

    static {
//        Facility villa1 = new Villa("SVVL-9999", "Villa", 100, 253,
//                10, "10 days", "5 Star", 35.8f, 3);
//        Facility villa2 = new Villa("SVVL-9887", "Villa", 100, 253,
//                10, "10 days", "5 Star", 35.8f, 3);
//        facilityList.put(villa1, 5);
//        facilityList.put(villa2, 5);
    }


    public Map<Facility, Integer> getListFacility() {
        Map<Facility, Integer> facilityList = new LinkedHashMap<>();
        Map<Room, Integer> roomList = readFileRoom();
        facilityList.putAll(roomList);
        Map<Villa, Integer> villaList = readFileVilla();
        facilityList.putAll(villaList);
        return facilityList;
    }

    @Override

    public void addData(Facility facility) {
//        Check bằng id thông thường
//        if(isIDFacilityAlreadyExists(facility.getIdFacility())){
//            System.out.println("The ID you want to add already exists.");
//            return;
//        }

        // Check bằng equals, hashcode
        Map<Facility, Integer> facilityList = getListFacility();
        for (Facility fcl : facilityList.keySet()) {
            if (fcl.equals(facility)) {
                System.out.println("The ID you want to add already exists.");
                return;
            }
        }
        if (facility instanceof Room) {
            Room room = (Room) facility;
            Map<Room, Integer> roomList = readFileRoom();
            roomList.put(room, 0);
            writeFileRoom(roomList);
        } else {
            Villa villa = (Villa) facility;
            Map<Villa, Integer> villaList = readFileVilla();
            villaList.put(villa, 0);
            writeFileVilla(villaList);
        }
    }

    @Override
    public Map<Facility, Integer> getFacilityMaintenance() {
        Map<Facility, Integer> listFacility = getListFacility();
        Map<Facility, Integer> listFacilityMaintenance = new LinkedHashMap<>();

        for (Map.Entry<Facility, Integer> facilityIntegerMap : listFacility.entrySet()) {
            if (facilityIntegerMap.getValue() >= 5) {
                listFacilityMaintenance.put(facilityIntegerMap.getKey(), facilityIntegerMap.getValue());
            }
        }
        return listFacilityMaintenance;
    }

    public boolean isIDFacilityAlreadyExists(String idFacility) {
        Map<Facility, Integer> facilityList = getListFacility();
        for (Facility facility : facilityList.keySet()) {
            if (Objects.equals(idFacility, facility.getIdFacility())) {
                return true;
            }
        }
        return false;
    }

    private Map<Room, Integer> readFileRoom() {
        Map<Room, Integer> roomList = new LinkedHashMap<>();
        try {
            File file = new File(PATH_FILE_ROOM);
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] rList = line.split(",");
                roomList.put(new Room(rList[0], rList[1], Float.parseFloat(rList[2]), Float.parseFloat(rList[3]),
                        Integer.parseInt(rList[4]), rList[5], rList[6]), Integer.parseInt(rList[7]));
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("File không tồn tại hoặc nội dung có lỗi!");
//        } catch (Exception ex) {
//            return roomList;
//        }
        }
        return roomList;
    }

    private void writeFileRoom(Map<Room, Integer> roomList) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH_FILE_ROOM));
            Set<Map.Entry<Room, Integer>> setRoomList = roomList.entrySet();
            for (Map.Entry<Room, Integer> i : setRoomList) {
                bufferedWriter.write(i.getKey().writeInfor() + "," + i.getValue());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Map<Villa, Integer> readFileVilla() {
        Map<Villa, Integer> villaList = new LinkedHashMap<>();
        try {
            File file = new File(PATH_FILE_VILLA);
            if (!file.exists()) {
                file.createNewFile();
            }
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                String[] vList = line.split(",");
                villaList.put(new Villa(vList[0], vList[1], Float.parseFloat(vList[2]), Float.parseFloat(vList[3]),
                        Integer.parseInt(vList[4]), vList[5], vList[6], Float.parseFloat(vList[7]), Integer.parseInt(vList[8])), Integer.parseInt(vList[9]));
            }
            bufferedReader.close();
        } catch (IOException e) {
            System.err.println("File không tồn tại hoặc nội dung có lỗi!");
        } catch (Exception ex) {
            return villaList;
        }
        return villaList;
    }

    private void writeFileVilla(Map<Villa, Integer> villaList) {
        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(PATH_FILE_VILLA));
            Set<Map.Entry<Villa, Integer>> setVillaList = villaList.entrySet();
            for (Map.Entry<Villa, Integer> i : setVillaList) {
                bufferedWriter.write(i.getKey().writeInfor() + "," + i.getValue());
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
