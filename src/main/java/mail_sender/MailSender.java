package mail_sender;

import java.io.FileNotFoundException;

public class MailSender {
    public static void sendMail(MailInfo info) throws FileNotFoundException {
        System.out.println("Sending  " + info.getClientMailText() + "\nSent to " + info.getMail());
    }
}
