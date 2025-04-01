package HelloWorldJava.Controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.Map;

@RestController
@RequestMapping("/api")
public class HelloController {

    // Tworzenie loggera dla klasy HelloController
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);

    @GetMapping("/hello")
    public Map<String, Object> hello() {
        // Logowanie informacji o obsłudze żądania GET
        logger.info("Obsługa żądania GET na endpoint /api/hello");

        // Zwracanie odpowiedzi
        return Map.of("message", "Hello World");
    }
}