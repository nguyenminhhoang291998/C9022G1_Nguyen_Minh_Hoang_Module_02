package ss16_io_text.exercise.read_file_csv.views;

import ss16_io_text.exercise.read_file_csv.controllers.ListCountriesController;

public class ListCountriesView {
    public static void main(String[] args) {
        ListCountriesController listCountriesController= new ListCountriesController();
        listCountriesController.readListCountries("src/ss16_io_text/exercise/read_file_csv/models/list_countries.csv");
    }
}
