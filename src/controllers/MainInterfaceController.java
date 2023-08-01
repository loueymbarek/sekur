package controllers;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class MainInterfaceController implements Initializable {
	  @FXML
	    private AnchorPane anchormrincipale;
	  @FXML
	    private Button btn_os;
	   @FXML
	    private AnchorPane anchor;
	    @FXML
	    private Button btn_stockage;

	    @FXML
	    private Button btn_ecrire;
	    @FXML
	    private ImageView imageview;
	    @FXML
	    private Stage primaryStage;
	    
	    @FXML
	    private Parent fxml;
	    
	    
	    @FXML
	    void ecrire() {
	    	System.out.println("button ecrire clicked");
	    	

	    }

	    @FXML
	    void open_os() {
	    	System.out.println("button os clicked");
	    	btn_ecrire.setDisable(false);
	    	imageview.setVisible(true);
	    	
	    	

	    }

	    @FXML
	    void open_stockage() {
	    	System.out.println("button stockage clicked");
	    }
	    @FXML
	    void open_OSConfig() {
	    	System.out.println("Config OS button clicked");
	    	try {
			anchor.getScene().getWindow().hide();		
			Stage interface2=new Stage();			
			fxml= FXMLLoader.load(getClass().getResource("/interfaces/Interface2.fxml"));
			Scene scene=new Scene(fxml);
			
			interface2.getIcons().add(new Image("D:\\Desktop\\java\\SEKUR\\src\\images\\wekode-removebg-preview.png"));
			interface2.setScene(scene);
			interface2.setHeight(720);
			interface2.setWidth(700);
			interface2.setResizable(false);
			
			interface2.setTitle("SEKUR");
			
			
			interface2.show();
			} catch (IOException e) {
				System.out.println("");
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

	    }
	

   

	public void initialize(URL arg0, ResourceBundle arg1) {
		
		// TODO Auto-generated method stub
		imageview.setVisible(false);
		
		
		
	}


}
