/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Environment.EmailPackage;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import java.io.IOException;
import java.security.Security;
import java.util.Date;
import java.util.Properties;

import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.Multipart;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.AddressException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;

import Environment.XMLToHTMLToPDF.MainApplication;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.layout.Region;

public class EmailController {
    
    private EmailModel Model; 
    private static EmailView View;

    public EmailController(EmailModel Model, EmailView View) {
        this.Model = Model;
        this.View = View;
        attachEvents();
    }
    
    public EmailController() {
        this.Model = new EmailModel();
        this.View = new EmailView();
        attachEvents();
    }
    
    private void attachEvents() {
       View.getSendButton().setOnAction(e-> setupHandlers());     
}
    
   void setupHandlers()
    {
        String temp = View.mailToField.getText();
        Model.Email(temp);
    }
    
   

    public EmailModel getModel() {
        return Model;
    }

    public void setModel(EmailModel Model) {
        this.Model = Model;
    }

    public EmailView getView() {
        return View;
    }

    public void setView(EmailView View) {
        this.View = View;
    }
    
}
