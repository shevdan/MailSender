package mail_sender;

import java.io.FileNotFoundException;
import java.util.ArrayList;

public class MailBox {
    private ArrayList<MailInfo> infos = new ArrayList<>();

    public void addMailInfo(MailInfo info){
        infos.add(info);
    }

    public void sendAll() throws FileNotFoundException {
        for (int  i = 0; i < infos.size(); i++){
            MailSender.sendMail(infos.get(i));
        }
    }
}
