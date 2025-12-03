module sio.devoir1sio1a {
    requires javafx.controls;
    requires javafx.fxml;
    opens sio.devoir1sio1a.Model.Exo1;

    opens sio.devoir1sio1a to javafx.fxml;
    exports sio.devoir1sio1a;
}