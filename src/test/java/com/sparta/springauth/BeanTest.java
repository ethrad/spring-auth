package com.sparta.springauth;

import com.sparta.springauth.food.Food;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class BeanTest {
/*    @Autowired
    Food pizza;

    @Autowired
    Food chicken;*/

    @Autowired
    @Qualifier("chicken") // 우선 순위 : primary < qualifier
            // 보통 범위가 작은 설정이 우선 순위가 높다
    Food food;

    @Test
    @DisplayName("테스트")
    void Test1(){
        food.eat();
    }
}
