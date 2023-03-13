package 行为型.策略模式;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

public class StrategyFactory3 {

    private static final Map<String,Class<? extends Strategy>> STRATEGIES = new HashMap<>();

    static {
        STRATEGIES.put("A",ConcreteStrategyA.class);
        STRATEGIES.put("B",ConcreteStrategyB.class);
    }

    /**
     * 策略对象 不共享使用 （利用反射创建）
     * @param type
     * @return
     */
    public static Strategy getStaticStrategy( String type ) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        if( type== null || type.isEmpty()){
            throw new IllegalArgumentException("type should not be empty");
        }
        return STRATEGIES.get(type).getConstructor().newInstance();
    }

}
