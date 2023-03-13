package 行为型.观察者;

public interface Subject {

    /**
     * 注册监听者
     * @param observer
     */
    void registerObserver(Observer observer);

    /**
     * 移除监听者
     * @param observer
     */
    void removeObserver(Observer observer);

    /**
     * 通知监听者
     * @param message
     */
    void notifyObserver(Object message);

}
