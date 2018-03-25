package Environment.Views;

import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;

public class Test extends BorderPane{
    
    private VBox Center;
    
    private Label audio  =new Label("");
    private Label audioPower    =new Label("");
    private Label noOfSpeakers    =new Label("");
    
    private Button Access;
    
    public Test()     
    {
        this.setId("testView");  
        Center = new VBox();
        Access = new Button();
        updateAudioViewGrid();        
    }
    
    public void updateAudioViewGrid() 
    {
        this.getChildren().clear();

        //Users Data
        audio.setText("hola");
        audioPower.setText("hola");
        noOfSpeakers.setText("hola");
        
        this.Center.getChildren().addAll(audio, audioPower, noOfSpeakers);       
        this.setCenter(Center);
    }   

    /**
     * @return the Access
     */
    public Button getAccess() {
        return Access;
    }

    /**
     * @param Access the Access to set
     */
    public void setAccess(Button Access) {
        this.Access = Access;
    }
}
