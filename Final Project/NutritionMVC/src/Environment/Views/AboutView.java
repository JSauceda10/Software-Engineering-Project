package Environment.Views;

import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class AboutView extends BorderPane{
            private VBox Center;
    
    private Label Title = new Label("");
    private Label Info = new Label("");
    
    public AboutView(){
        this.setId("aboutView");
        
        Center = new VBox();
        this.Center.setId("Center");
        
        updateView();        
    }
    
    public void updateView() 
    {
        this.getChildren().clear();

        Title.setText("About");
        Title.setId("pageTitle");
        Info.setText("The Rio Grande Valley area in South Texas constantly ranks as one of the most obese areas in the United States, with some of the cities in that area ranking  "
                + "\nin the Top 10 of most obese cities in the United States year after year. Students at the University of Texas Rio Grande Valley developed The Healthy Living Application"
                + "\nto help curb the growing obesity epidemic not only in the RGV, but also in the United States. It was designed to help users maintain a healthy lifestyle"
                + "\nby helping the user keep track of their medical information, providing nutritional information about foods stored in the apps database, providing exercise"
                + "\ninformation and recommendations, and a built-in calorie calculator to help you count calories and plan out meals based on your needs."
                + "\n"
                + "\n"
                + "\n"
                + "\nIf you experience any problems with the application, please contact: "
                + "\n"
                + "\nStephen Izquierdo - stephen.izquierdo01@utrgv.edu"
                + "\nRaymundo Vilano - raymundo.vilanoreyna01@utrgv.edu");
        Info.setId("pageInfo");
        
        this.Center.getChildren().add(Title);       
        this.Center.getChildren().add(Info); 
        
        this.setCenter(Center);
    }
}
