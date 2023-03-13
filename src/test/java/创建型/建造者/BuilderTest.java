package 创建型.建造者;

import org.junit.Assert;
import org.junit.Test;
import 创建型.建造者.PoolConfig;

public class BuilderTest {

    @Test
    public void test() {
        PoolConfig poolConfig = null;
        try {
            poolConfig = new PoolConfig.Builder().setName("").setMaxIdle(8).setMinIdle(7).build();
        } catch (Exception e) {
            Assert.assertTrue(e instanceof IllegalArgumentException);
        }
        Assert.assertNull(poolConfig);

        PoolConfig poolConfig1 = new PoolConfig.Builder().setName("pool_name").setMaxIdle(8).setMinIdle(7).build();
        Assert.assertNotNull(poolConfig1);

    }

}
