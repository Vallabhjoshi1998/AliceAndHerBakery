package com.vallabhjoshi.FirstWeekHomeworkApp.AliceAndHerBakery;

import org.springframework.stereotype.Component;

@Component
public class CakeBaker {


    //Constructor Dependency Injection - it is better to use this when are using it "only once" and if we want that no one should be able to change anything using
    //the dependency injected here i.e. frosting and syrup
    private final Frosting frosting;
    private final Syrup syrup;

    public CakeBaker(Frosting frosting, Syrup syrup){
        this.frosting = frosting;
        this.syrup = syrup;
    }

    public void cakeBake(){
        frosting.getFrostingType();
        syrup.getSyrupType();
    }

}
