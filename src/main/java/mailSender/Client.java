package mailSender;


import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@ToString @Setter @Getter
public class Client {
    private String name;
    private int age;
    private int id;
    private Gender sex;

    public Client() {
        id = IdGenerator.generateId();
    }
}
