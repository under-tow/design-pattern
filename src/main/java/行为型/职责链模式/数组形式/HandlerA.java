package 行为型.职责链模式.数组形式;

public class HandlerA implements IHandler{
    @Override
    public boolean handle() {
        boolean handled = false;
        // ...业务逻辑
        System.out.println("数组形式：HandlerA exec");
        return handled;
    }
}
