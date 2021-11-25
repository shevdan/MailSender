package mail_sender;

import lombok.*;

import java.util.concurrent.atomic.AtomicInteger;

@Getter @Setter
public class Client {
    private static final AtomicInteger count = new AtomicInteger(0);
    private int id;
    private String name;
    private int age;
    private Gender sex;
    private String mail;

    public Client(String name, int age, Gender sex, String mail){
        this.id = count.incrementAndGet();
        this.name = name;
        this.age = age;
        this.sex = sex;
        this.mail = mail;
    }

}
