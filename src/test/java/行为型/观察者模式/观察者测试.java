package 行为型.观察者模式;

import org.junit.Test;
import 行为型.观察者.ConcreteObserverOne;
import 行为型.观察者.ConcreteObserverTwo;
import 行为型.观察者.ConcreteSubject;

public class 观察者测试 {

    @Test
    public void test(){
        ConcreteSubject subject = new ConcreteSubject();
        subject.registerObserver(new ConcreteObserverOne());
        subject.registerObserver(new ConcreteObserverTwo());
        subject.notifyObserver(new Object());
    }

}
