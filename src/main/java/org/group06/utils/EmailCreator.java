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
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(EMAIL, PASSWORD);
            }
        });

        try {
            Message mimeMessage = new MimeMessage(session);
            mimeMessage.setFrom(new InternetAddress(EMAIL));
            mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            mimeMessage.setSubject(subject);
            mimeMessage.setText(message);

            Transport.send(mimeMessage);

            System.out.println("Email sent successfully.");
        } catch (MessagingException e) {
            e.printStackTrace();
        }
    }

    public static void sendEmailWithAttachment(String to, String subject, String message, String attachmentPath) {
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(EMAIL, PASSWORD);
            }
        });

        try {
            Message mimeMessage = new MimeMessage(session);
            mimeMessage.setFrom(new InternetAddress(EMAIL));
            mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            mimeMessage.setSubject(subject);

            // Tạo phần thân của email
            MimeBodyPart textPart = new MimeBodyPart();
            textPart.setText(message);

            // Tạo phần đính kèm
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

    public static void sendImageEmail(String to, String subject, String message, String imagePath) {
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(EMAIL, PASSWORD);
            }
        });

        try {
            Message mimeMessage = new MimeMessage(session);
            mimeMessage.setFrom(new InternetAddress(EMAIL));
            mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            mimeMessage.setSubject(subject);

            // Tạo phần thân của email
            MimeBodyPart textPart = new MimeBodyPart();
            textPart.setText(message);

            // Tạo phần đính kèm cho hình ảnh
            MimeBodyPart imagePart = new MimeBodyPart();
            DataSource source = new FileDataSource(imagePath);
            imagePart.setDataHandler(new DataHandler(source));
            imagePart.setFileName(imagePath); // Đặt tên file tùy ý

            // Tạo multipart để kết hợp cả hai phần trên
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(textPart);
            multipart.addBodyPart(imagePart);

            // Gán phần thân cho email
            mimeMessage.setContent(multipart);

            // Gửi email
            Transport.send(mimeMessage);

            System.out.println("Email with image sent successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void sendHtmlEmail(String to, String subject, String htmlContent) {
        Properties properties = new Properties();
        properties.put("mail.smtp.auth", "true");
        properties.put("mail.smtp.starttls.enable", "true");
        properties.put("mail.smtp.host", "smtp.gmail.com");
        properties.put("mail.smtp.port", "587");

        Session session = Session.getInstance(properties, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(EMAIL, PASSWORD);
            }
        });

        try {
            Message mimeMessage = new MimeMessage(session);
            mimeMessage.setFrom(new InternetAddress(EMAIL));
            mimeMessage.setRecipient(Message.RecipientType.TO, new InternetAddress(to));
            mimeMessage.setSubject(subject);

            // Tạo phần thân của email dưới dạng HTML
            MimeBodyPart textPart = new MimeBodyPart();
            textPart.setContent(htmlContent, "text/html");

            // Tạo multipart để kết hợp phần thân HTML
            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(textPart);

            // Gán phần thân cho email
            mimeMessage.setContent(multipart);

            // Gửi email
            Transport.send(mimeMessage);

            System.out.println("HTML email sent successfully.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
