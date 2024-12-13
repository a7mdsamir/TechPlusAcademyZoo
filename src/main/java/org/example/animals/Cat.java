package org.example.animals;

public final class Cat extends Animal{

    public Cat (String name){
        super(name);
    }



    @Override
    public void eat(){
        System.out.println("Cat eats");
    }
    public void meow(){
        System.out.println("Cat meow");
    }
}
