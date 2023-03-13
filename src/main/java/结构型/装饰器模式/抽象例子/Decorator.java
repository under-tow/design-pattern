package 结构型.装饰器模式.抽象例子;

/**
 * 具体构件
 */
public class Decorator implements Component{

    private Component component;

    public Decorator(Component component){
        this.component = component;
    }

    @Override
    public void operation() {
        // 委派给具体构件
        component.operation();
    }
}
