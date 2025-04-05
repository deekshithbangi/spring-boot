package net.engineeringdigest.journalApp;

//import net.engineeringdigest.something.Dog;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyClass {

//    private Dog dog;
//    can't use because this component is not scanned by ComponentScan(SpringBootApplication)
//    reason Dog class in not in the same package as in SpringBootApplication, So that it is not scanned by ComponentScan component

    @Autowired
    private Dog dog; // dog class is scanned bcz its in same package

    @GetMapping("abc")
    public String sayHello() {
        return "Hello";
    }

    @GetMapping("ok")
    public String dog() {
        return dog.fun();
    }

}
