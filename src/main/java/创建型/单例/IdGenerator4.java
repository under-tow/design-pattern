package 创建型.单例;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 推荐~
 * 静态内部类
 */
public class IdGenerator4 {

    private AtomicLong id = new AtomicLong(0);

    private static class IdGeneratorHolder{
        public static final IdGenerator4 logger = new IdGenerator4();
    }

    public static IdGenerator4 getInstance(){
        return IdGeneratorHolder.logger;
    }

    public long getId(){
        return id.getAndIncrement();
    }
}
