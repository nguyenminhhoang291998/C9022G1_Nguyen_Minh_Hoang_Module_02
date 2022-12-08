package case_study.furama_resort.views;

import case_study.furama_resort.common.UserException;

public class FuramaMain {

    private static final FuramaView furamaView = new FuramaView();

    public static void main(String[] args) throws  UserException {
            furamaView.displayMainMenu();
    }
}
