package mailSender;

public class IdGenerator {
    private static int counter = 0;

    public  static int generateId() {
        counter++;
        return counter;
    }
}
