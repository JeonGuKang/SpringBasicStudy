package com.example.core2;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Core2ApplicationTests {


}


interface B  {
    String boo ();
}

interface C {
    String foo();
}

interface D extends B, C {

     //What do I do? Which method should I call?
}
