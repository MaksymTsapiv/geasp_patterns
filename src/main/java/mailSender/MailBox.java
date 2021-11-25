package mailSender;

import java.util.ArrayList;

public class MailBox {
    private ArrayList<MailInfo> mailInfos;
    private MailInfo mailInfo;

    public void addMailInfo(MailInfo mailInfo){
        mailInfos.add(mailInfo);
    }

    public void sendAll(){
        for (MailInfo mailInfo : mailInfos){
            MailSender.sendMail(mailInfo);
        }
    }

}
