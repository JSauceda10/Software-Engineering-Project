/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Environment.EmailPackage;

import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;

/**
 *
 * @author Family
 */
public class EmailView extends GridPane{
    
    Label mailFromLabel = new Label("mailFrom");
    TextField mailFromField = new TextField();
    
    Label passwordLabel = new Label("password");
    TextField passwordField = new TextField();
    
    Label mailToLabel = new Label("mailTo");
    TextField mailToField = new TextField();
    
    Label subjectLabel = new Label("subject");
    TextField subjectField = new TextField();
    
    Label messageLabel = new Label("message");
    TextField messageField = new TextField();
    
    Label ccEmailLabel = new Label("message");
    TextField ccEmailField = new TextField();
    
    Button sendButton = new Button("Send");

    public EmailView() {
     this.setHgap(10);
     this.setVgap(10);
     this.setPadding(new Insets(0, 10, 0, 10)); 
     
     
     this.addRow(3, mailFromLabel, mailFromField);
     this.addRow(4, passwordLabel,passwordField);
     this.addRow(5, mailToLabel, mailToField);
     this.addRow(6, subjectLabel, subjectField);
     this.addRow(7, messageLabel, messageField);
     this.addRow(7, ccEmailLabel, ccEmailField);
     this.addRow(8, sendButton);
        
        
    }
    
    public void UpdateEmailView(String mailTo,String password,String mailFrom,String subject,String message)
    {
        
        getMailToField().setText(mailTo);
        getPasswordField().setText(password);
        getMailFromField().setText(mailFrom);
        getSubjectField().setText(subject);
        getMessageField().setText(message);
        
    }

    

    public Label getMailFromLabel() {
        return mailFromLabel;
    }

    public void setMailFromLabel(Label mailFromLabel) {
        this.mailFromLabel = mailFromLabel;
    }

    public TextField getMailFromField() {
        return mailFromField;
    }

    public void setMailFromField(TextField mailFromField) {
        this.mailFromField = mailFromField;
    }

    public Label getPasswordLabel() {
        return passwordLabel;
    }

    public void setPasswordLabel(Label passwordLabel) {
        this.passwordLabel = passwordLabel;
    }

    public TextField getPasswordField() {
        return passwordField;
    }

    public void setPasswordField(TextField passwordField) {
        this.passwordField = passwordField;
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

    public Label getMessageLabel() {
        return messageLabel;
    }

    public void setMessageLabel(Label messageLabel) {
        this.messageLabel = messageLabel;
    }

    public TextField getMessageField() {
        return messageField;
    }

    public void setMessageField(TextField messageField) {
        this.messageField = messageField;
    }

    public Button getSendButton() {
        return sendButton;
    }

    public void setSendButton(Button sendButton) {
        this.sendButton = sendButton;
    }

    public Label getCcEmailLabel() {
        return ccEmailLabel;
    }

    public void setCcEmailLabel(Label ccEmailLabel) {
        this.ccEmailLabel = ccEmailLabel;
    }

    public TextField getCcEmailField() {
        return ccEmailField;
    }

    public void setCcEmailField(TextField ccEmailField) {
        this.ccEmailField = ccEmailField;
    }
    
    
    
    
    
    
    
}
