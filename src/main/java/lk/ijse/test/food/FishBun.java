package lk.ijse.test.food;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;



@Component
public class ChickenBun implements Bakery{
    @Override
    public void loveFood() {
        System.out.println("do you like ChikenBun");
    }
}
