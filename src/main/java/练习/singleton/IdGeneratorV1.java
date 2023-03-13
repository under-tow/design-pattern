package 练习.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 饿汉式
 * 不会有线程安全问题
 */
public class IdGeneratorV1 {

    private AtomicLong id = new AtomicLong(0);
    private static final IdGeneratorV1 instance = new IdGeneratorV1();

    public static IdGeneratorV1 getInstance(){
        return instance;
    }

    public Long getId(){
        return id.incrementAndGet();
    }
}
