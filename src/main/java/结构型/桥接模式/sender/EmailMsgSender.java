package 结构型.桥接模式.sender;

import java.util.List;

public class EmailMsgSender implements MsgSender {

    private List<String> telephones;

    public EmailMsgSender(List<String> telephones) {
        this.telephones = telephones;
    }

    @Override
    public void send(String message) {
        System.out.println(String.format("EmailMsgSender send {%s}", message));
    }
}
