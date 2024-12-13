package org.example.zoo;

import org.example.animals.Animal;
import org.example.animals.Cat;
import org.example.animals.Dog;
import org.example.animals.Rat;

import java.util.Scanner;


public class Zoo {
    public static void main(String[] args) {

        Animal animals [] = new Animal[5] ;
        Scanner s = new Scanner(System.in);
        String an = "";

        for (int i =0; i< 5; i++){
            System.out.println("Enter next animal [Cat , Rat , Dog]");
            an = s.nextLine();

            if (an.equals("Cat"))
                animals[i] = new Cat("catt");
            else if (an.equals("Rat"))
                animals[i] = new Rat("ratt");
            else
                animals[i] = new Dog("dogg");
        }

        for (int i =0; i< 5; i++){
            animals[i].eat();
        }
        /*
        Animal c = new Cat("AAA");
        c.eat();
        c.walk();
//        c.meow();
        Cat cat = (Cat) c;
        cat.meow();

        Animal d = new Dog("DDD");
        d.eat();
        d.walk();

        Dog dog = (Dog) d;
        dog.hawhaw();
*/

        
    }
}