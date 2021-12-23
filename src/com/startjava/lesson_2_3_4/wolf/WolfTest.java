package com.startjava.lesson_2_3_4.wolf;

public class WolfTest {
    public static void main(String[] args) {
        Wolf test = new Wolf();
        // проверка пола
        test.setGenderMan(true);
        if (test.isGenderMan()) {
            System.out.println("Gender = Men");
        } else {
            System.out.println("Gender = Women");
        }
        // Провека клички
        test.setNickName("Grey");
        System.out.println("Name = " + test.getNickName());
        // Проверка возраста
        test.setAge(11);
        System.out.println("Age = " +  test.getAge());
        // Проверка цвета
        test.setСolor("White");
        System.out.println("Color = " + test.getСolor());
        
        test.move();
        test.sit();
        test.run();
        test.howl();
        test.hunt();
    }
}
