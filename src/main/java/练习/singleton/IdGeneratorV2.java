package 练习.singleton;

import java.util.concurrent.atomic.AtomicLong;

/**
 * 懒汉式
 */
public class IdGeneratorV2 {

    private static IdGeneratorV2 instance = null;

    private AtomicLong id = new AtomicLong(0);

    public static synchronized IdGeneratorV2 getInstance(){
        if(instance == null){
            instance = new IdGeneratorV2();
        }
        return instance;
    }

    public Long getId(){
        return id.incrementAndGet();
    }

}
