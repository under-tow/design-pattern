package 结构型.桥接模式;

import org.junit.Test;
import 结构型.桥接模式.notification.NormalNotification;
import 结构型.桥接模式.sender.EmailMsgSender;

import java.util.Collections;

public class 桥接测试 {

    @Test
    public void test(){
        //  <提醒级别> 与 <发送者> 组合使用
        //  NormalNotification 与 EmailMsgSender 组合使用
        NormalNotification normalNotification = new NormalNotification(new EmailMsgSender(Collections.singletonList("10086")));
        normalNotification.notify("normal message~");

    }

}
