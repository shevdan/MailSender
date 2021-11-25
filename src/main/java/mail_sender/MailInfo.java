package mail_sender;


import lombok.Getter;
import lombok.Setter;

import java.io.FileNotFoundException;
import java.util.HashMap;

@Getter @Setter
public class MailInfo {
    private Client client;
    private MailCode code;

    public MailInfo(Client client, MailCode code){
        this.client = client;
        this.code = code;
    }

    public String getClientMailText() throws FileNotFoundException {
        HashMap<String, String> textHashTable = new HashMap<String, String>();
        String mailText = code.generateText();
        textHashTable.put("AGE", String.valueOf(client.getAge()));
        textHashTable.put("NAME", client.getName());

        for (String key: textHashTable.keySet()){
            mailText.replace(key, textHashTable.get(key));
        }

        return mailText;
    }

    public String getMail(){
        return  client.getMail();
    }


}
