package uts.codesale.mail;

import java.util.*;

import javax.mail.*;
import javax.mail.internet.*;

public class SendHTMLEmail
{
   public static void main(String [] args)
   {
      
      // Recipient's email ID needs to be mentioned.
      String to = "xuepingpeng@yahoo.com";

      // Sender's email ID needs to be mentioned
      String from = "pengxueping@gmail.com";
      
      // Get system properties
      Properties props = new Properties();
	  	props.put("mail.smtp.auth", "true");
	  	props.put("mail.smtp.starttls.enable", "true");
	  	props.put("mail.smtp.host", "smtp.gmail.com");
	  	props.put("mail.smtp.port", "587");
	  	props.put("mail.user", "pengxueping");
	    props.put("mail.password", "peng106125");

      // Get the default Session object.
      Session session = Session.getDefaultInstance(props);

      try{
         // Create a default MimeMessage object.
         MimeMessage message = new MimeMessage(session);

         // Set From: header field of the header.
         message.setFrom(new InternetAddress(from));

         // Set To: header field of the header.
         message.addRecipient(Message.RecipientType.TO,
                                  new InternetAddress(to));

         // Set Subject: header field
         message.setSubject("This is the Subject Line!");

         // Send the actual HTML message, as big as you like
         message.setContent("<h1>This is actual message</h1>",
                            "text/html" );

         // Send message
         Transport.send(message);
         System.out.println("Sent message successfully....");
      }catch (MessagingException mex) {
         mex.printStackTrace();
      }
   }
}
