package mailSender;

public class MailSender {

    public static void sendMail(MailInfo mailInfo) {
        System.out.println( mailInfo.getMailText());
    }
}