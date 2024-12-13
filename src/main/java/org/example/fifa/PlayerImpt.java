package org.example.fifa;

public class PlayerImpt implements Player, Drawable3D{
    @Override
    public void move() {
        System.out.println("move");
    }

    @Override
    public void pass() {
        System.out.println("pass");
    }

    @Override
    public void speed() {
        System.out.println("speed");
    }

    @Override
    public void draw() {
        System.out.println("draw");
    }

    @Override
    public void draw3d() {
        System.out.println("draw3d");
    }
}
