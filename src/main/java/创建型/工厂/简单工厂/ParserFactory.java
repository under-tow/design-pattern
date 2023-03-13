package 创建型.工厂.简单工厂;

import 创建型.工厂.base.*;

public class ParserFactory {

    public static IParser createParser(String extension){
        IParser parser= null;
        if("json".equals(extension)){
            parser = new JsonParser();
        }else if("xml".equals(extension)){
            parser = new XmlParser();
        }else if("yaml".equals(extension)){
            parser = new YamlParser();
        }else if("properties".equals(extension)){
            parser = new PropertiesParser();
        }
        return parser;
    }
}
