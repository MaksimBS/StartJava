package com.startjava.lesson_2_3.robot;

public class JaegerTest {
    public static void main(String[] args) {
        Jaeger mio = new Jaeger("Mio", "M-1", "China", 150.9f, 180f, 5, 2);

        System.out.println("Model name = " + mio.getModelName());
        System.out.println("Mark = " + mio.getMark());
        System.out.println("Origin = " + mio.getOrigin());
        System.out.println("Height = " + mio.getHeight());
        System.out.println("Weight = " + mio.getWeight());
        System.out.println("Strenght = " + mio.getStrength());
        System.out.println("Armor = " + mio.getArmor());

        mio.move();
        mio.drift();
        mio.defending();
        mio.shot();

        Jaeger mark2 = new Jaeger("Mark-2", "Bi-2", "USA", 180.5f, 230f, 8, 2);

        System.out.println("Model name = " + mark2.getModelName());
        System.out.println("Mark = " + mark2.getMark());
        System.out.println("Origin = " + mark2.getOrigin());
        System.out.println("Height = " + mark2.getHeight());
        System.out.println("Weight = " + mark2.getWeight());
        System.out.println("Strenght = " + mark2.getStrength());
        System.out.println("Armor = " + mark2.getArmor());

        mark2.move();
        mark2.drift();
        mark2.defending();
        mark2.shot();
    }
}
