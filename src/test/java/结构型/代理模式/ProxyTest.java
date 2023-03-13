package 结构型.代理模式;


import org.junit.Test;
import 结构型.代理模式.IUserController;
import 结构型.代理模式.MetricsCollectorProxy;
import 结构型.代理模式.MetricsCollectorProxy2;
import 结构型.代理模式.UserController;

public class ProxyTest {

    @Test
    public void test(){

        MetricsCollectorProxy2 proxy2 = new MetricsCollectorProxy2();
        IUserController iUserController2 = (IUserController) proxy2.createProxy(new UserController());
        iUserController2.login("phone2","password2");

        MetricsCollectorProxy proxy = new MetricsCollectorProxy();
        IUserController iUserController = (IUserController) proxy.createProxy(new UserController());
        iUserController.login("phone","password");
    }

}
