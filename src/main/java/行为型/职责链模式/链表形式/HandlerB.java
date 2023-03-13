package 行为型.职责链模式.链表形式;

public class HandlerB extends Handler{
    @Override
    public void handle() {
        boolean handled = false;
        // ..
        System.out.println("链表形式：HandlerB exec");
        if(!handled && successor != null){
            successor.handle();
        }
    }
}
