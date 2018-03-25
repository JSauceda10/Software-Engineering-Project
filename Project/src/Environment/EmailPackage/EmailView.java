/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Environment.EmailPackage;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

/**
 *
 * @author Family
 */
public class EmailView extends VBox{
    
    Label header = new Label("Email");
    HBox HeaderBox = new HBox();
    GridPane EMAIL = new GridPane();
    
    
    Label mailToLabel = new Label("mailTo");
    TextField mailToField = new TextField();
    
    Label subjectLabel = new Label("subject");
    TextField subjectField = new TextField();
    

    
    Button sendButton = new Button("Send");

    public EmailView() {
     EMAIL.setHgap(10);
     EMAIL.setVgap(10);
     EMAIL.setPadding(new Insets(0, 10, 0, 10)); 
     EMAIL.addRow(3, mailToLabel, mailToField);
     EMAIL.addRow(4, sendButton);

     
     
     Font myFont = Font.font("Verdana", FontWeight.BOLD,  62);
     header.setFont(myFont);
     header.setTextFill(Color.WHITE);
     HeaderBox.setAlignment(Pos.CENTER);
     HeaderBox.getChildren().add(header);
     HeaderBox.setStyle("-fx-background-color: #cc7000;");
     
     this.getChildren().addAll(HeaderBox,EMAIL);
        
    }
    
 

    public Label getMailToLabel() {
        return mailToLabel;
    }

    public void setMailToLabel(Label mailToLabel) {
        this.mailToLabel = mailToLabel;
    }

    public TextField getMailToField() {
        return mailToField;
    }

    public void setMailToField(TextField mailToField) {
        this.mailToField = mailToField;
    }

    public Label getSubjectLabel() {
        return subjectLabel;
    }

    public void setSubjectLabel(Label subjectLabel) {
        this.subjectLabel = subjectLabel;
    }

    public TextField getSubjectField() {
        return subjectField;
    }

    public void setSubjectField(TextField subjectField) {
        this.subjectField = subjectField;
    }

    

    public Button getSendButton() {
        return sendButton;
    }

    public void setSendButton(Button sendButton) {
        this.sendButton = sendButton;
    }

  
    
}
