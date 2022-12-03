package case_study.furama_resort.controllers;

import case_study.furama_resort.models.facility.Facility;
import case_study.furama_resort.services.impl.FacilityServiceImpl;

import java.util.Map;

public class FacilityController {
    FacilityServiceImpl facilityServiceImpl = new FacilityServiceImpl();

    public Map<Facility,Integer> displayListFacility() {
        return this.facilityServiceImpl.displayListFacility();
    }

    public boolean isIDFacilityAlreadyExists(String idFacility) {
        return this.facilityServiceImpl.isIDFacilityAlreadyExists(idFacility);
    }

    public void addToListFacility(Facility facility) {
        this.facilityServiceImpl.addData(facility);
    }

    public Facility displayFacilityMaintenance() {
        return this.facilityServiceImpl.displayFacilityMaintenance();
    }

}
