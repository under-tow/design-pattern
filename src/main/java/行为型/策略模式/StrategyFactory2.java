package 行为型.策略模式;


public class StrategyFactory2 {

    /**
     * 策略对象 不共享使用
     * @param type
     * @return
     */
    public static Strategy getPrototypeStrategy( String type ){
        if( type== null || type.isEmpty()){
            throw new IllegalArgumentException("type should not be empty");
        }
        if(type.equals("A")){
            return new ConcreteStrategyA();
        }else if(type.equals("B")){
            return new ConcreteStrategyB();
        }
        return null;
    }

}
