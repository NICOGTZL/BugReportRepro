module BugReportRepro.main {

    requires javafx.fxml;
    requires java.base;
    requires javafx.controls;
    requires playwright;

    opens com.bugreportrepro;
}