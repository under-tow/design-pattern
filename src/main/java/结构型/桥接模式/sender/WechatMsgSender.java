package 结构型.桥接模式.sender;

import java.util.List;

public class WechatMsgSender implements MsgSender {

    private List<String> telephones;

    public WechatMsgSender(List<String> telephones) {
        this.telephones = telephones;
    }

    @Override
    public void send(String message) {
        System.out.println(String.format("WechatMsgSender send {%s}", message));

    }
}
