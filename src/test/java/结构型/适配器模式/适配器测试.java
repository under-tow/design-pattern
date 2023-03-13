package 结构型.适配器模式;

import org.junit.Test;
import 结构型.适配器.基于组合.Adaptee;
import 结构型.适配器.基于继承.Adaptor;

public class 适配器测试 {

    @Test
    public void test(){

        结构型.适配器.基于继承.Adaptor adaptor1 = new Adaptor();
        adaptor1.commonFun1();
        adaptor1.commonFun2();
        adaptor1.commonFun3();

        Adaptee adaptee2 = new Adaptee();
        结构型.适配器.基于组合.Adaptor adaptor2 = new 结构型.适配器.基于组合.Adaptor(adaptee2);
        adaptor2.commonFun1();
        adaptor2.commonFun2();
        adaptor2.commonFun3();
    }

}
