package di.constructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class SimpleDocumentPrinter implements DocumentPrinter {

    private Document document;

    @Autowired
    public SimpleDocumentPrinter(Document document) {
        this.document = document;
    }

    public void printDocument() {
        document.printDocument();
    }

}
