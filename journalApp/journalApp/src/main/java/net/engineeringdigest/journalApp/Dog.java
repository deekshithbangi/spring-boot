package net.engineeringdigest.journalApp;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RestController;

@Component
public class Dog {

    public String fun() {
        return "Something";
   }
}
