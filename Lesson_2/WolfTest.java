public class WolfTest {
    public static void main(String[] args) {
        Wolf test = new Wolf();
        // проверка пола
        test.setGenderMan(true);
        if (test.isGenderMan()) {
            System.out.println("Пол волка = Мужской");
        } else {
            System.out.println("Пол волка = Женский");
        }
        // Провека клички
        test.setNickName("Серый");
        System.out.println("Кличка волка = " + test.getNickName());
        // Проверка возраста
        test.setAge(11);
        System.out.println("Возраст волка = " +  test.getAge());
        // Проверка цвета
        test.setСolor("Белый");
        System.out.println("Цвет волка = " + test.getСolor());
        
        test.move();
        test.sit();
        test.run();
        test.howl();
        test.hunt();
    }
}
