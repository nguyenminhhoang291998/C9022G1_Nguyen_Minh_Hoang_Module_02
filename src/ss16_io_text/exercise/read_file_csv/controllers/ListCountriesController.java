package ss16_io_text.exercise.read_file_csv.controllers;

import ss16_io_text.exercise.read_file_csv.services.ListCountriesService;

public class ListCountriesController {
    private final ListCountriesService listCountriesService = new ListCountriesService();

    public void readListCountries(String path){
        this.listCountriesService.readListCountries(path);
    }
}
