package 行为型.职责链模式;

import org.junit.Test;
public class 职责链测试 {

    @Test
    public void test(){
        行为型.职责链模式.链表形式.HandlerChain handlerChain = new 行为型.职责链模式.链表形式.HandlerChain();
        handlerChain.addHandler(new 行为型.职责链模式.链表形式.HandlerA());
        handlerChain.addHandler(new 行为型.职责链模式.链表形式.HandlerB());
        handlerChain.handle();

        行为型.职责链模式.数组形式.HandlerChain handlerChain1 = new 行为型.职责链模式.数组形式.HandlerChain();
        handlerChain1.addHandler(new 行为型.职责链模式.数组形式.HandlerA());
        handlerChain1.addHandler(new 行为型.职责链模式.数组形式.HandlerB());
        handlerChain1.handle();
    }

}
