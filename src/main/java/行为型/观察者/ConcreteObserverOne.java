package 行为型.观察者;

public class ConcreteObserverOne implements Observer{
    @Override
    public void update(Object message) {
        // 获取消息通知 ，执行自己的逻辑
        System.out.println("ConcreteObserverOne is notified");
    }
}
