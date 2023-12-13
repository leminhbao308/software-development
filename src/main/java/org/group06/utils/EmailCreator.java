package org.group06.utils;

import javax.mail.*;
import javax.mail.internet.*;
import java.util.Properties;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;

public class EmailCreator {
    private static final String EMAIL = "amfashionstore.se06@gmail.com";
    private static final String PASSWORD = "qlye rkjl eeyl ytps";

    public static void sendEmail(String to, String subject, String message) {
        // Cấu hình các thuộc tính của email

        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        // Tạo phiên làm việc (session) sử dụng thông tin cấu hình và Authenticator
        /**
         * Một phiên làm việc (session) được tạo bằng cách sử dụng các thuộc tính cấu hình và một đối tượng Authenticator để xác thực tài khoản email.
         */
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(EMAIL, PASSWORD);
            }
        });

        try {
            // Tạo đối tượng MimeMessage
            /**
             * Đối tượng MimeMessage được sử dụng để tạo và cấu hình email với thông tin như người gửi, người nhận, tiêu đề và nội dung.
             */
            Message mimeMessage = new MimeMessage(session);
            mimeMessage.setFrom(new InternetAddress(EMAIL));
            mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            mimeMessage.setSubject(subject);
            mimeMessage.setText(message);

            // Gửi email
            Transport.send(mimeMessage);
            System.out.println("Email sent successfully.");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    public static void sendEmailWithAttachment(String to, String subject, String message, String attachmentPath) {
        // Cấu hình các thuộc tính của email
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        // Tạo phiên làm việc (session) sử dụng thông tin cấu hình và Authenticator
        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(EMAIL, PASSWORD);
            }
        });

        try {
            // Tạo đối tượng MimeMessage
            Message mimeMessage = new MimeMessage(session);
            mimeMessage.setFrom(new InternetAddress(EMAIL));
            mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            mimeMessage.setSubject(subject);

            // Tạo phần thân của email
            /**
             * Đối tượng MimeBodyPart được sử dụng để tạo phần thân và phần đính kèm của email.
             */
            MimeBodyPart textPart = new MimeBodyPart();
            textPart.setText(message);

            // Tạo phần đính kèm
            /**
             * Phương thức attachmentPart.attachFile(attachmentPath) được sử dụng để đính kèm file vào email.
             */
            MimeBodyPart attachmentPart = new MimeBodyPart();
            attachmentPart.attachFile(attachmentPath);

            // Tạo multipart để kết hợp cả hai phần trên
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(textPart);
            multipart.addBodyPart(attachmentPart);

            // Gán phần thân cho email
            mimeMessage.setContent(multipart);

            // Gửi email
            Transport.send(mimeMessage);

            System.out.println("Email with attachment sent successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
