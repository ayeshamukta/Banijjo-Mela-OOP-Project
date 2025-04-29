module oop.banijjomelaoop {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;
    requires kernel;
    requires layout;

    opens oop.banijjomelaoop to javafx.fxml, javafx.base;
    opens oop.banijjomelaoop.ayesha_2022861 to javafx.fxml, javafx.base;
    opens oop.banijjomelaoop.Jinia_2021275 to javafx.fxml;
    opens oop.banijjomelaoop.Asik2030753 to javafx.fxml;  // Added this line

    exports oop.banijjomelaoop;
    exports oop.banijjomelaoop.Jinia_2021275;
    exports oop.banijjomelaoop.Asik2030753;  // Added this line
}