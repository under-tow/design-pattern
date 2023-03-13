package 结构型.装饰器模式.抽象例子;

public class ConcreteDecoratorA extends Decorator{

    public ConcreteDecoratorA(Component component){
        super(component);
    }

    @Override
    public void operation(){
        super.operation();
        // 完成相关业务代码
    }
}
