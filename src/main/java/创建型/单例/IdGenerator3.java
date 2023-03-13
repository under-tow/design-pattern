package 创建型.单例;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 双重锁校验
 */
public class IdGenerator3 {

    private IdGenerator3(){}

    private AtomicLong id = new AtomicLong(0);

    private static IdGenerator3 instance;

    public static IdGenerator3 getInstance(){
        if(instance == null){
            synchronized (IdGenerator3.class){
                if(instance == null){
                    instance = new IdGenerator3();
                }
            }
        }
        return instance;
    }

    public long getId(){
        return id.getAndIncrement();
    }
}
