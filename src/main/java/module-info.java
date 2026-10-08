module kth.roseayad.labb2 {
    requires javafx.controls;
    requires javafx.fxml;


    opens kth.roseayad.labb2 to javafx.fxml;
    exports kth.roseayad.labb2;
    exports kth.roseayad.labb2.shapes;
    opens kth.roseayad.labb2.shapes to javafx.fxml;
}