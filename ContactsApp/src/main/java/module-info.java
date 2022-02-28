module a3.aalmanza5.contactsapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.json;


    opens a3.aalmanza5.contactsapp to javafx.fxml;
    exports a3.aalmanza5.contactsapp;
}