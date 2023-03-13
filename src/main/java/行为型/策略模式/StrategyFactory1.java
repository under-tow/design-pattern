package 行为型.策略模式;

import java.util.HashMap;
import java.util.Map;

public class StrategyFactory1 {

    private static final Map<String,Strategy> STRATEGIES = new HashMap<>();

    static {
        STRATEGIES.put("A",new ConcreteStrategyA());
        STRATEGIES.put("B",new ConcreteStrategyB());
    }

    /**
     * 策略对象 共享使用
     * @param type
     * @return
     */
    public static Strategy getStaticStrategy( String type ){
        if( type== null || type.isEmpty()){
            throw new IllegalArgumentException("type should not be empty");
        }
        return STRATEGIES.get(type);
    }

}
