package org.example.animals;

public final class Rat extends Animal{

    public Rat(String name){

        super(name);
    }



    @Override
    public void eat(){
        System.out.println("Rat eats");
    }
}
