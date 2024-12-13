package org.example.fifa;

public class Fifa {
    public static void main(String[] args) {

        Player p = new PlayerImpt();
//        Drawable d = new PlayerImpt();
        Drawable3D d = (Drawable3D) p;

        p.move();
        p.pass();

        d.draw();


    }
}