package 结构型.代理模式;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MetricsCollectorProxy {


    private MetricsCollector metricsCollector;

    public MetricsCollectorProxy() {
        this.metricsCollector = new MetricsCollector();
    }

    public Object createProxy(final Object proxiedObject){
        ClassLoader classLoader = proxiedObject.getClass().getClassLoader();
        Class<?>[] interfaces = proxiedObject.getClass().getInterfaces();
        return Proxy.newProxyInstance(classLoader, interfaces, new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                long start = System.currentTimeMillis();
                Object result = method.invoke(proxiedObject, args);
                long end = System.currentTimeMillis();

                long responseTime = end - start;
                String apiName = proxiedObject.getClass().getName() + ":" + method.getName();
                RequestInfo requestInfo = new RequestInfo(apiName,responseTime,start);
                metricsCollector.recordRequest(requestInfo);
                return result;
            }
        });
    }
}
