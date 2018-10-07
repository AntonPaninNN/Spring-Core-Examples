package di.constructor.annotationbased;

import di.constructor.DocumentPrinter;
import di.constructor.SimpleDocumentPrinter;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(Config.class);
        DocumentPrinter documentPrinter = ctx.getBean(SimpleDocumentPrinter.class);
        documentPrinter.printDocument();
    }

}
