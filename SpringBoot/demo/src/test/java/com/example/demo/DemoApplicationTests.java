package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {
 @Autowired
 private  DefaultCache aa;
 @Autowired
    private  DefaultCache aa1;
    @Test
    void contextLoads() {
        System.out.println(aa);
        System.out.println(aa1
        );

    }

}
