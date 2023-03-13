import org.junit.Test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Demo {

    @Test
    public void test() {
        HashMap<Object, Object> map = new LinkedHashMap<>(1,0.75f,true);
        map.put(3, 11);
        map.put(1, 12);
        map.put(5, 23);
        map.put(2, 22);

//        map.put(3, 26);
//        map.get(3);
        map.get(5);

        for (Map.Entry e : map.entrySet()) {
            System.out.println(e.getKey());
        }


    }

}
