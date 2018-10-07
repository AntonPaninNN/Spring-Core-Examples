package di.constructor.annotationbased;

import di.constructor.Document;
import di.constructor.PdfDocument;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("di.constructor.annotationbased")
public class Config {

    @Bean
    public Document document() {
        return new PdfDocument();
    }
}
