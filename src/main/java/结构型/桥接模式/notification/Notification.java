package 结构型.桥接模式.notification;

import 结构型.桥接模式.sender.MsgSender;

public abstract class Notification {

    protected MsgSender msgSender;

    public Notification(MsgSender msgSender){
        this.msgSender = msgSender;
    }

    public abstract void notify(String message);

}
