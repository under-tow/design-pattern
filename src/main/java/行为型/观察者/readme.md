当一个对象变化时，可以注册几个观察者（消费者），然后在业务逻辑中通知观察者做事

```java
// 比如： 用户注册成功后自动领取优惠券。正常写法是

user.register();
couponService.present();

// 用观察模式就是  换了一种方式来表达~


// 一次性设置好，之后也不可能动态的修改
public void setRegObservers(List observers) { regObservers.addAll(observers); }

user.register();
for (RegObserver observer : regObservers) { observer.handleRegSuccess(userId); }

···