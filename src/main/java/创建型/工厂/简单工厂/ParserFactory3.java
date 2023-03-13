package 创建型.工厂.简单工厂;

import cn.hutool.core.util.StrUtil;
import 创建型.工厂.base.*;

import java.util.HashMap;

public class ParserFactory3 {

    private static final ParserFactory3 instance = new ParserFactory3();

    private ParserFactory3(){}

    public static ParserFactory3 getInstance(){
        return instance;
    }

    private final HashMap<String, IParser> parseMap = new HashMap<>();

    {
        parseMap.put("json",this.getJsonParser());
        parseMap.put("xml",this.getXmlParser());
        parseMap.put("yaml",this.getYamlParser());
        parseMap.put("properties",this.getPropertiesParser());
    }

    public IParser createParser(String extension){
        if(StrUtil.isBlank(extension)){
            return null;
        }
        return parseMap.get(extension);
    }

    private JsonParser getJsonParser(){
        return new JsonParser();
    }

    private XmlParser getXmlParser(){
        return new XmlParser();
    }

    private YamlParser getYamlParser(){
        return new YamlParser();
    }

    private PropertiesParser getPropertiesParser(){
        return new PropertiesParser();
    }
}
