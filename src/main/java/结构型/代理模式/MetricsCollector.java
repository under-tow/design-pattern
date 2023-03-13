package 结构型.代理模式;

public class MetricsCollector {

    public void recordRequest(RequestInfo requestInfo){
        System.out.println("requestInfo = " + requestInfo);
    }

}
