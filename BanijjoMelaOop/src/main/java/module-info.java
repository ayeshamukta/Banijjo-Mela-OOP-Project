module oop.banijjomelaoop {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens oop.banijjomelaoop to javafx.fxml;
    opens oop.banijjomelaoop.ayesha_2022861 to javafx.fxml;

    exports oop.banijjomelaoop;
    exports oop.banijjomelaoop.ayesha_2022861;
    exports oop.banijjomelaoop.Jinia_2021275;
    opens oop.banijjomelaoop.Jinia_2021275 to javafx.fxml;

}