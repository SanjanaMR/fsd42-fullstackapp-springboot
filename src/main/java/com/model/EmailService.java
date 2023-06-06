package com.model;
import java.util.Properties;
import javax.mail.*;
import javax.mail.internet.*;

public class EmailService {
	public static void sendEmail(String message, String subject, String to, String from) {
	    String host = "smtp.gmail.com";
	    Properties properties = System.getProperties();
	    properties.put("mail.smtp.host", host);
	    properties.put("mail.smtp.port", "465");
	    properties.put("mail.smtp.ssl.enable", "true");
	    properties.put("mail.smtp.auth", "true");
	    
	   
	    Session session = Session.getInstance(properties, new Authenticator() {

	        @Override
	        protected PasswordAuthentication getPasswordAuthentication() {
	          // TODO Auto-generated method stub
	          return new PasswordAuthentication("tailsfluffy2@gmail.com", "ugwulyytymjytpgk");
	        }
	      });
	      session.setDebug(true);
	      MimeMessage m = new MimeMessage(session);
	      try {
	        m.setFrom(from);

	        m.addRecipient(Message.RecipientType.TO, new InternetAddress(to));

	        m.setSubject(subject);

	        m.setText(message);
	        Transport.send(m);
	        System.out.println("success");
	      } catch (MessagingException e) {
	        // TODO Auto-generated catch block
	        e.printStackTrace();
	      }
	      

}

	
}
