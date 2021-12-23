package com.startjava.lesson_2_3_4.wolf;

public class Wolf {
    private boolean genderMan;
    public void setGenderMan(boolean genderMan) {
        this.genderMan = genderMan;
    }

    public boolean isGenderMan() {
        return genderMan;
    }

    private String nickName;
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    private int weight;
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    private int age;
    public void setAge(int age) {
         if (age > 8) {
             System.out.println("Не корректный возраст");
         } else {
             this.age = age;
         }
    }

    public int getAge() {
        return age;
    }

    private String color;
    public void setСolor(String color) {
        this.color = color;
    }

    public String getСolor() {
        return color;
    }

    public void move() {
        System.out.println("Go");
    }

    public void sit() {
        System.out.println("Sit");
    }

    public void run() {
        System.out.println("Run");
    }

    public void howl() {
        System.out.println("Howl");
    }

    public void hunt() {
        System.out.println("Hunt");
    }
}
