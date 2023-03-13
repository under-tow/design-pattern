package 创建型.工厂.简单工厂;

import cn.hutool.core.util.StrUtil;
import 创建型.工厂.base.*;

import java.util.HashMap;

public class ParserFactory2 {

    private static final HashMap<String, IParser> parseMap = new HashMap<>();

    static {
        parseMap.put("json",new JsonParser());
        parseMap.put("xml",new XmlParser());
        parseMap.put("yaml",new YamlParser());
        parseMap.put("properties",new PropertiesParser());
    }

    public static IParser createParser(String extension){
        if(StrUtil.isBlank(extension)){
            return null;
        }
        return parseMap.get(extension);
    }
}
