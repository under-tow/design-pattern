package 创建型.工厂.简单工厂;

import 创建型.工厂.base.IParser;

public class FileAnalysis {

    public String analysis(){
        String filePath = "";
        String extension = getFileExtension(filePath);
        IParser parser = ParserFactory.createParser(extension);
        return parser.parse(filePath);
    }

    private String getFileExtension(String filePath){
        // 解析文件拓展名
        return filePath.split(".")[1];
    }

}
