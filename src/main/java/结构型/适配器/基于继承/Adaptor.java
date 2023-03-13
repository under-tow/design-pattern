package 结构型.适配器.基于继承;

import 结构型.适配器.ITarget;

/**
 * 适配实现ITarget统一接口，接口内容自定义实现~
 */
public class Adaptor extends Adaptee implements ITarget {
    @Override
    public void commonFun1() {
        // 自定义实现，也可不用fa方法
        super.fa();
        System.out.println("基于<继承>方式适配器 适配后的 commonFun1");
    }

    @Override
    public void commonFun2() {
        // 自定义实现，也可不用fb方法
        super.fb();
        System.out.println("基于<继承>方式适配器 适配后的 commonFun3");
    }

    @Override
    public void commonFun3() {
        // 自定义实现，也可不用fc方法
        super.fc();
        System.out.println("基于<继承>方式适配器 适配后的 commonFun3");
    }
}
