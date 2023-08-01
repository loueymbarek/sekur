module SEKUR {
	requires javafx.controls;
	requires javafx.fxml;
	requires javafx.graphics;
	requires javafx.base;
	 exports controllers;
	 
	opens application to javafx.graphics,javafx.fxml;
	opens controllers to javafx.fxml;
}
