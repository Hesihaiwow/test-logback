package com.hsh.testlogback;

import org.junit.jupiter.api.Test;
import org.junit.platform.commons.logging.Logger;
import org.junit.platform.commons.logging.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.function.Supplier;

@SpringBootTest
class TestLogbackApplicationTests {

    private static final Logger logger = LoggerFactory.getLogger(TestLogbackApplicationTests.class);

    @Test
    void contextLoads() {
    }

    @Test
    void testLogBack(){

        System.out.println("hello world");
        logger.info(new Supplier<String>() {
            @Override
            public String get() {
                return "---------------test------------------";
            }
        });
    }

}
