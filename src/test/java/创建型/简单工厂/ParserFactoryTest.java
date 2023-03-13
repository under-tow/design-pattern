package 创建型.简单工厂;

import org.junit.Assert;
import org.junit.Test;
import 创建型.工厂.base.IParser;
import 创建型.工厂.base.XmlParser;
import 创建型.工厂.简单工厂.ParserFactory;
import 创建型.工厂.简单工厂.ParserFactory2;
import 创建型.工厂.简单工厂.ParserFactory3;

public class ParserFactoryTest {

    @Test
    public void test(){

        IParser xmlParser = ParserFactory.createParser("xml");
        IParser xmlParser2 = ParserFactory2.createParser("xml");
        IParser xmlParser3 = ParserFactory3.getInstance().createParser("xml");

        Assert.assertTrue(xmlParser instanceof XmlParser);
        Assert.assertTrue(xmlParser2 instanceof XmlParser);
        Assert.assertTrue(xmlParser3 instanceof XmlParser);

    }
}
