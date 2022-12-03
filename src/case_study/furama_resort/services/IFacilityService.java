package case_study.furama_resort.services;

import case_study.furama_resort.models.facility.Facility;

import java.util.Map;

public interface IFacilityService extends IService<Facility> {

    Map<Facility,Integer> displayListFacility();

    @Override
    void addData(Facility facility);


    Facility displayFacilityMaintenance();
}
