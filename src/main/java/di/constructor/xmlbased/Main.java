package di.constructor.xmlbased;

import di.constructor.DocumentPrinter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new ClassPathXmlApplicationContext("beans.xml");
        DocumentPrinter printer = (DocumentPrinter) ctx.getBean("printer");
        printer.printDocument();
    }

}
