module com.lmdsio.javajfx_chap1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.lmdsio.javajfx_chap1 to javafx.fxml;
    exports com.lmdsio.javajfx_chap1;
}