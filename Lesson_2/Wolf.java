public class Wolf {
    //объявите в нем поля: пол, кличка, вес, возраст, окрас
    boolean genderMan;
    String nickName;
    int weight;
    int age;
    String color;

    //реализуйте методы: идти, сидеть, бежать, выть, охотиться
    //в каждом методе выводите сообщение вида: "Воет", "Сидит".
    void move() {
        System.out.println("Иду");
    }

    void sit() {
        System.out.println("Сижу");
    }

    void run() {
        System.out.println("Бегу");
    }

    void howl() {
        System.out.println("Вою");
    }

    void hunt() {
        System.out.println("Охочусь");
    }


}