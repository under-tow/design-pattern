package 创建型.单例;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 推荐~
 * 懒汉式
 */
public class IdGenerator {

    // 私有构造函数避免外部通过new创建实例
    private IdGenerator(){}

    // 防止并发问题 不用加static: 需要对象来调用的
    private AtomicLong id = new AtomicLong(0);

    // static：对象唯一，final：对象不可变
    private static final IdGenerator instance = new IdGenerator();

    // 加static 因为需要类来调用 方法唯一
    public static IdGenerator getInstance(){
        return instance;
    }

    // 不用加static: 需要对象来调用的
    public long getId(){
        return id.incrementAndGet();
    }

}
