package 结构型.桥接模式.notification;

import 结构型.桥接模式.sender.MsgSender;

public class NormalNotification extends Notification{

    public NormalNotification(MsgSender msgSender) {
        super(msgSender);
    }

    @Override
    public void notify(String message) {
        msgSender.send(message);
    }
}
