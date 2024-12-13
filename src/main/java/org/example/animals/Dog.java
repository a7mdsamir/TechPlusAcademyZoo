package org.example.animals;

public final class Dog extends Animal{
    public Dog (String name){
        super(name);
    }



    @Override
    public void eat(){
        System.out.println("Dog eats");
    }
    public void hawhaw(){
        System.out.println("Dog hawhaw");
    }
}
