package 结构型.代理模式;

public class UserController implements IUserController  {
    @Override
    public void login(String telephone, String password) {
        System.out.println("login");
    }
}
