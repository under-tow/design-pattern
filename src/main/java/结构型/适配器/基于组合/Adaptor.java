package 结构型.适配器.基于组合;

import 结构型.适配器.ITarget;

public class Adaptor implements ITarget {

    private Adaptee adaptee;

    public Adaptor(Adaptee adaptee) {
        this.adaptee = adaptee;
    }

    @Override
    public void commonFun1() {
        // 自定义实现，也可不用fa方法
        adaptee.fa();
        System.out.println("基于<组合>方式适配器 适配后的 commonFun1");
    }

    @Override
    public void commonFun2() {
        // 自定义实现，也可不用fb方法
        adaptee.fb();
        System.out.println("基于<组合>方式适配器 适配后的 commonFun3");
    }

    @Override
    public void commonFun3() {
        // 自定义实现，也可不用fc方法
        adaptee.fc();
        System.out.println("基于<组合>方式适配器 适配后的 commonFun3");
    }
}
