package com.tcs.MyFirstProjectApplication;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
//import com.tcs.AdditionalPackage.Dog;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Car {


    @Autowired
    private Dog dog; // dog object is scanned by Component annotation (Which a part of SpringBootApplication Annotation)
    // also called as injection of object

    @GetMapping("ok")
    public String ok() {
        return dog.fun();
    }

    @GetMapping("abc")
    public String abc(){
        return "Hello from abc API";
    }

}
