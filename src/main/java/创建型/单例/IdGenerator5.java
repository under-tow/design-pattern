package 创建型.单例;

import java.util.concurrent.atomic.AtomicLong;

public enum  IdGenerator5 {
    INSTANCE;

    private AtomicLong id = new AtomicLong(0);

    public long getId(){
        return id.getAndIncrement();
    }
}
