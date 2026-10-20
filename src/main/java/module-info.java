module ni.edu.uam.evaluacionpractica.ventadesucursal {
    requires javafx.controls;
    requires javafx.fxml;


    opens ni.edu.uam.evaluacionpractica.ventadesucursal to javafx.fxml;
    exports ni.edu.uam.evaluacionpractica.ventadesucursal;
}