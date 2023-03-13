package 结构型.代理模式;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class RequestInfo {

    String name;
    long responseTime;
    long starTime;

}
