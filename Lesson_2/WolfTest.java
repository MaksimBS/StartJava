public class WolfTest {
    public static void main(String[] args) {
        Wolf test = new Wolf();
        test.genderMan = true;
        if (test.genderMan) {
            System.out.println("Пол волка = Мужской");
        } else {
            System.out.println("Пол волка = Женский");
        }
        test.nickName = "Серый";
        System.out.println("Кличка волка = " + test.nickName);
        test.age = 11;
        System.out.println("Возраст волка = " +  test.age);
        test.color = "Серый";
        System.out.println("Цвет волка = " + test.color);

        test.move();
        test.sit();
        test.run();
        test.howl();
        test.hunt();
    }
}