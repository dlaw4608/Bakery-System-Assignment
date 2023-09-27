module com.example.bakerysystem {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.bakerysystem to javafx.fxml;
    exports com.example.bakerysystem;
    exports com.example.bakerysystem.Controllers;
    opens com.example.bakerysystem.Controllers to javafx.fxml;
}