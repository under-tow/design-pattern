package 创建型.单例;

import org.junit.Assert;
import org.junit.Test;
import 创建型.单例.*;

public class IdGeneratorTest {

    @Test
    public void test(){

        // 饿汉式
        IdGenerator idGen = IdGenerator.getInstance();
        Assert.assertNotNull(idGen);
        Assert.assertNotNull(idGen.getId());

        // 懒加载 大锁
        IdGenerator2 idGen2 = IdGenerator2.getInstance();
        Assert.assertNotNull(idGen2);
        Assert.assertNotNull(idGen2.getId());

        // 懒加载 双重锁校验
        IdGenerator3 idGen3 = IdGenerator3.getInstance();
        Assert.assertNotNull(idGen3);
        Assert.assertNotNull(idGen3.getId());

        // 懒加载 静态内部类
        IdGenerator4 idGen4 = IdGenerator4.getInstance();
        Assert.assertNotNull(idGen4);
        Assert.assertNotNull(idGen4.getId());

        // 懒加载 静态内部类
        IdGenerator5 idGen5 = IdGenerator5.INSTANCE;
        Assert.assertNotNull(idGen5);
        Assert.assertNotNull(idGen5.getId());

    }
}
