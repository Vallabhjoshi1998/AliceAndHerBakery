package com.vallabhjoshi.FirstWeekHomeworkApp.AliceAndHerBakery;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnProperty(value = "cake.flavour", havingValue = "strawberry")
public class StrawberryFrosting  implements  Frosting{
    @Override
    public void getFrostingType() {
        System.out.println("Strawberry Frosting");
    }
}
