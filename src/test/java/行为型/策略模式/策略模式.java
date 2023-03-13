package 行为型.策略模式;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;

public class 策略模式 {

    @Test
    public void test() throws InvocationTargetException, NoSuchMethodException, InstantiationException, IllegalAccessException {

        Strategy a1 = StrategyFactory1.getStaticStrategy("A");
        a1.algorithmInterface();

        Strategy b1 = StrategyFactory1.getStaticStrategy("B");
        b1.algorithmInterface();

        Strategy a2 = StrategyFactory2.getPrototypeStrategy("A");
        a2.algorithmInterface();

        Strategy b2 = StrategyFactory2.getPrototypeStrategy("B");
        b2.algorithmInterface();

        Strategy a3 = StrategyFactory3.getStaticStrategy("A");
        a3.algorithmInterface();

        Strategy b3 = StrategyFactory3.getStaticStrategy("B");
        b3.algorithmInterface();


    }

}
