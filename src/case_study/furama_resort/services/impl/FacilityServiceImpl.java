package case_study.furama_resort.services.impl;

import case_study.furama_resort.models.facility.Facility;
import case_study.furama_resort.models.facility.Villa;
import case_study.furama_resort.services.IFacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;

public class FacilityServiceImpl implements IFacilityService {

    private static final Map<Facility,Integer> facilityList = new LinkedHashMap<>();

    static {
        Facility villa1 = new Villa("SVVL-9999",
                "Villa",100,253,
                10,"10 days",
                "5 Star",35.8f,3);
        facilityList.put(villa1,1);
    }


    public Map<Facility,Integer> displayListFacility() {
        return facilityList;
    }

    @Override
    public void addData(Facility facility) {
        facilityList.put(facility,0);
    }

    @Override
    public Facility displayFacilityMaintenance() {
        return null;
    }

    public boolean isIDFacilityAlreadyExists(String idFacility) {
        for (Facility facility : facilityList.keySet()) {
            if (Objects.equals(idFacility, facility.getIdFacility())) {
                return true;
            }
        }
        return false;
    }
}
