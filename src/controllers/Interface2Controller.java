package controllers;

import java.net.URL;
import javafx.concurrent.Task;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;

import java.util.Observable;
import java.util.ResourceBundle;

import javafx.animation.Animation;
import javafx.animation.FadeTransition;
import javafx.animation.ScaleTransition;
import javafx.animation.TranslateTransition;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ProgressBar;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.util.Duration;
import models.Fuseau_horaire;
import models.type_clavier;

public class Interface2Controller implements Initializable {
	   @FXML
	    private ImageView image;

    @FXML
    private TextField tf_os;
    @FXML
    private Label tc_label;
    @FXML
    private Label fh_label;

    @FXML
    private TextField tf_usb;
    @FXML
    private Label sekur_label;

    @FXML
    private TextField tf_ssid;

    @FXML
    private PasswordField tf_mdpwifi;

    @FXML
    private CheckBox reglages_locaux;

    @FXML
    private ComboBox<Fuseau_horaire> fuseau_horaire_cb; 

    @FXML
    private ComboBox<type_clavier> type_clavier_cb;

    @FXML
    private Button btn_valider;

    @FXML
    private CheckBox check_os;

    @FXML
    private CheckBox check_camera;

    @FXML
    private CheckBox check_micro;

    @FXML
    private CheckBox check_projecteur;

    @FXML
    private CheckBox check_hautparleur;

    @FXML
    private CheckBox check_buzzeur;

    @FXML
    private CheckBox check_hidden;

    @FXML
    private CheckBox check_activer_ssh;

    @FXML
    private ProgressBar progress_bar;
    @FXML
    void check_camera_op() {
       //checkbox de camera en action
        boolean isCameraSelected = check_camera.isSelected();

        if (isCameraSelected) {
        	System.out.println("camèra selected");
         
        } else {
        
        }
    }
    @FXML
    void check_microphone_op() {
    	boolean ismicrophoneSelected = check_micro.isSelected();

        if (ismicrophoneSelected) {
        	System.out.println("microphone selected");
         
        } else {
        
        }

    }
    @FXML
    void check_buzzeur_op() {
    	boolean isbuzzeurSelected = check_buzzeur.isSelected();

        if (isbuzzeurSelected) {
        	System.out.println("buzzeur selected");
         
        } else {
        
        }

    }
    @FXML
    void check_projecteur_op() {

        boolean isprojecteurSelected = check_projecteur.isSelected();

        if (isprojecteurSelected) {
        	System.out.println("projecteur selected");
         
        } else {
        
        }

    }
    @FXML
    void check_hautparleur_op() { 

        boolean ishautparleurSelected = check_hautparleur.isSelected();

        if (ishautparleurSelected) {
        	System.out.println("haut-parleur selected");
         
        } else {
        
        }

    }



   


    @FXML
    void activer_ssh_op() {
    
    	    boolean isSSHActivated = check_activer_ssh.isSelected();

            if (isSSHActivated) {
                
                Alert alert = new Alert(AlertType.CONFIRMATION);
                alert.setTitle("Activate SSH");
                alert.setHeaderText("Are you sure you want to activate SSH?");
                alert.setContentText("SSH allows remote access to your device. Proceed with caution.");

                
                ButtonType result = alert.showAndWait().orElse(ButtonType.CANCEL);

                if (result == ButtonType.OK) {
                   
                    System.out.println("SSH activated!");
                   
                } else {
                    
                    check_activer_ssh.setSelected(false);
                }
            } else {
                
                System.out.println("SSH disctivated!");
            }
    	}
    	
    
    @FXML
    private void updateProgressBar() {
        Task<Void> task = new Task<>() {
            @Override
            protected Void call() throws Exception {
                double progress = 0.0;
                double totalSteps = 6;

                if (!tf_os.getText().isEmpty() && !tf_usb.getText().isEmpty()) {
                    progress += 2.0 / totalSteps;
                }

                if (check_camera.isSelected() || check_micro.isSelected() || check_projecteur.isSelected()
                        || check_hautparleur.isSelected() || check_buzzeur.isSelected()) {
                    progress += 2.0 / totalSteps;
                }

                if ((!tf_ssid.getText().isEmpty() && !tf_mdpwifi.getText().isEmpty()) || (check_hidden.isSelected())) {
                    progress += 2.0 / totalSteps;
                }

                if (progress >= 1.0) {
                    progress_bar.setStyle("-fx-accent: #63c4da;");
                } else {
                    progress_bar.setStyle("-fx-accent: orange;");
                }

                // Update the progress bar on the JavaFX application thread
                updateProgress(progress, 1.0);
                return null;
            }
        };

        // Bind the progress bar's progress property to the task's progress property
        progress_bar.progressProperty().bind(task.progressProperty());

        // Start the task on a separate thread
        Thread thread = new Thread(task);
        thread.start();
    }

    


    @FXML
    void btn_valider_op() {
    	 
        String osVersion = tf_os.getText(); 
        String usbName = tf_usb.getText(); 
        String wifiPassword = tf_mdpwifi.getText(); 
        String ssid = tf_ssid.getText();
        
        
        
       
        if (!osVersion.isEmpty() && !usbName.isEmpty() &&(( !wifiPassword.isEmpty() &&!ssid.isEmpty())||check_hidden.isSelected())&&(check_camera.isSelected() || check_micro.isSelected() || check_projecteur.isSelected()
                || check_hautparleur.isSelected() || check_buzzeur.isSelected())) {
        	
        	 Alert alert = new Alert(AlertType.CONFIRMATION);
             alert.setTitle("Information");
             alert.setHeaderText("This is an OK Alert");
             alert.setContentText("Click OK to continue.");
             alert.showAndWait();
           
        } else {
        	

       	 Alert alert = new Alert(AlertType.ERROR);
            alert.setTitle("Information !");
            alert.setHeaderText("This is an ERROR Alert");
            alert.setContentText("Please enter your INFOS.");
            progress_bar.setStyle("-fx-accent: #B12E21;");
            alert.showAndWait();
            
        }

    }

    @FXML
    void check_hidden_op() {
    	
    	 boolean ishiddenSelected = check_hidden.isSelected();

         if (ishiddenSelected) {
        	 
        	 tf_ssid.setDisable(true); 
            tf_mdpwifi.setDisable(true); 
        	 
        	 
        	 
          
         } else {
         	 tf_ssid.setDisable(false); 
             tf_mdpwifi.setDisable(false); 
         
         }

    }

    @FXML
    void fh_cb() {
    	 Fuseau_horaire selectedTimezone = (Fuseau_horaire) fuseau_horaire_cb.getValue();
    }

    @FXML
    void os_operation() {
    	  boolean isosSelected = check_os.isSelected();

          if (isosSelected) {
        	  System.out.println(" check os selected");
           
          } else {
          
          }

    }

    @FXML
    void reglages_locaux_op(){
    	
          
    	 
        fuseau_horaire_cb.setDisable(true); 
        type_clavier_cb.setDisable(true); 
        fuseau_horaire_cb.setOpacity(0.3);
        type_clavier_cb.setOpacity(0.3);
      
        tc_label.setOpacity(0.3);
        fh_label.setOpacity(0.3);
        
        boolean isReglagesLocauxSelected = reglages_locaux.isSelected();

       
        fuseau_horaire_cb.setDisable(!isReglagesLocauxSelected);
        type_clavier_cb.setDisable(!isReglagesLocauxSelected);

        
        if (isReglagesLocauxSelected) {
        	 fuseau_horaire_cb.setOpacity(1);
             type_clavier_cb.setOpacity(1);

             tc_label.setOpacity(1);
             fh_label.setOpacity(1);
             
        	System.out.println("reglages lc selected");
            
        } else {
        	
        }
    }
    

    @FXML
    void type_clavier_cb() {
    	 String selectedType_clavier = type_clavier_cb.getValue().toString();
    	 if (selectedType_clavier=="FR") {
    		 System.out.println("selected language"+" "+"frensh"+"");
    		 
    	 }
    	 if(selectedType_clavier=="EN") {
    		 System.out.println("selected language"+" "+"English"+"");
    	 }
    
    }
    
 
    private void animateLabel() {
      
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(2), sekur_label);

       
        fadeTransition.setToValue(1.0);

        fadeTransition.setFromValue(0.1); 
        fadeTransition.setCycleCount(Animation.INDEFINITE); 
        fadeTransition.setAutoReverse(true);

    
        fadeTransition.play();
    }
    private void animateimage() {
        
        FadeTransition fadeTransition = new FadeTransition(Duration.seconds(2), image);

      
        fadeTransition.setToValue(0.1);

        
        fadeTransition.setFromValue(1.0); 
        fadeTransition.setCycleCount(Animation.INDEFINITE);
        fadeTransition.setAutoReverse(true); 

       
        fadeTransition.play();
        
    }
    private void addAnimationOnClick(Button button) {
        
        ScaleTransition scaleTransition = new ScaleTransition(Duration.seconds(0.2), button);

        
        double scaleFactor = 1.15; 
        scaleTransition.setToX(scaleFactor);
        scaleTransition.setToY(scaleFactor);

        
        scaleTransition.setCycleCount(2); 
        scaleTransition.setAutoReverse(true); 

       
        button.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               
                scaleTransition.play();
            }
        });
    }
private void addAnimationOnClickchceckbox(CheckBox checkbox) {
        
        ScaleTransition scaleTransition = new ScaleTransition(Duration.seconds(0.2), checkbox);

        
        double scaleFactor = 1.05; 
        scaleTransition.setToX(scaleFactor);
        scaleTransition.setToY(scaleFactor);

        
        scaleTransition.setCycleCount(2); 
        scaleTransition.setAutoReverse(true); 

       
        checkbox.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
               
                scaleTransition.play();
            }
        });
    }
private void addAnimationOnClickchceckbox1(CheckBox checkbox) {
    
    ScaleTransition scaleTransition = new ScaleTransition(Duration.seconds(0.2), checkbox);

    
    double scaleFactor = 1.3; 
    scaleTransition.setToX(scaleFactor);
    scaleTransition.setToY(scaleFactor);

    
    scaleTransition.setCycleCount(2); 
    scaleTransition.setAutoReverse(true); 

   
    checkbox.addEventHandler(ActionEvent.ACTION, new EventHandler<ActionEvent>() {
        @Override
        public void handle(ActionEvent event) {
           
            scaleTransition.play();
        }
    });
}


		@Override
		public void initialize(URL arg0, ResourceBundle arg1) {
			// TODO Auto-generated method stub
			 reglages_locaux_op();
			 addAnimationOnClickchceckbox(check_activer_ssh);
			 addAnimationOnClickchceckbox(reglages_locaux);
			 addAnimationOnClickchceckbox1(check_os);
			 addAnimationOnClickchceckbox1(check_camera);
			 addAnimationOnClickchceckbox1(check_micro);
			 addAnimationOnClickchceckbox1(check_projecteur);
			 addAnimationOnClickchceckbox1(check_hautparleur);
			 addAnimationOnClickchceckbox1(check_buzzeur);
			 addAnimationOnClickchceckbox(check_hidden);
			 animateLabel();
			 animateimage();
			 btn_valider.setOnAction(event ->btn_valider_op() );
			 addAnimationOnClick(btn_valider);
			 type_clavier_cb.setItems(FXCollections.observableArrayList(new type_clavier("FR"),  new type_clavier("EN")));
			    tf_os.textProperty().addListener((observable, oldValue, newValue) -> updateProgressBar());
		        tf_usb.textProperty().addListener((observable, oldValue, newValue) -> updateProgressBar());
		        tf_os.textProperty().addListener((observable, oldValue, newValue) -> updateProgressBar());
		        tf_mdpwifi.textProperty().addListener((observable, oldValue, newValue) -> updateProgressBar());
		        check_camera.selectedProperty().addListener((observable, oldValue, newValue) -> updateProgressBar());
		        check_micro.selectedProperty().addListener((observable, oldValue, newValue) -> updateProgressBar());
		        check_projecteur.selectedProperty().addListener((observable, oldValue, newValue) -> updateProgressBar());
		        check_hautparleur.selectedProperty().addListener((observable, oldValue, newValue) -> updateProgressBar());
		        check_buzzeur.selectedProperty().addListener((observable, oldValue, newValue) -> updateProgressBar());
		        check_hidden.selectedProperty().addListener((observable, oldValue, newValue) -> updateProgressBar());
		     
		        
		        
			
		}

}
