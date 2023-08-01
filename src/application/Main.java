package application;
	


import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.stage.Stage;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;


public class Main extends Application {
	
	public void start(Stage primaryStage) {
		try {
			Parent root = FXMLLoader.load(getClass().getResource("/interfaces/MainInterface.fxml"));
			Scene scene = new Scene(root);
			primaryStage.getIcons().add(new Image("D:\\Desktop\\java\\SEKUR\\src\\images\\wekode-removebg-preview.png"));
			primaryStage.setScene(scene);
			primaryStage.setTitle("SEKUR");
			primaryStage.setResizable(false);

			primaryStage.show();
		} catch(Exception e) {
			e.printStackTrace();
			}
	}
	
	public static void main(String[] args) {
		launch(args);

	}
}
