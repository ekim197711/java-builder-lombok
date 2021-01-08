package com.example.javabuildervsconstructor.space;

public class SpaceCargoFactory {

    public SpaceCargo cargoFromFruit(){
        SpaceCargo cargo = new SpaceCargo();
        cargo.setContent("Fruit");
        return cargo;
    }

    public SpaceCargo cargoFromRock(){
        SpaceCargo cargo = new SpaceCargo();
        cargo.setContent("Rock");
        return cargo;
    }

}
