public class JaegerTest {
    public static void main(String[] args) {
        Jaeger test1 = new Jaeger();

        test1.setModelName("Mio");
        System.out.println("Имя робота = " + test1.getModelName());

        test1.setMark("M-1");
        System.out.println("Марка робота = " + test1.getMark());

        test1.setOrigin("China");
        System.out.println("Происхождение робота = " + test1.getOrigin());

        test1.setHeight(150.9f);
        System.out.println("Высота робота = " + test1.getHeight());

        test1.setWeight(180f);
        System.out.println("Вес робота = " + test1.getWeight());

        test1.setStrength(5);
        System.out.println("Сила робота = " + test1.getStrength());

        test1.setArmor(2);
        System.out.println("Броня робота = " + test1.getArmor());

        test1.move();
        test1.drift();
        test1.defending();
        test1.shot();

        Jaeger test2 = new Jaeger();

        test2.setModelName("Mark-2");
        System.out.println("Имя робота = " + test2.getModelName());

        test2.setMark("Bi-2");
        System.out.println("Марка робота = " + test2.getMark());

        test2.setOrigin("USA");
        System.out.println("Происхождение робота = " + test2.getOrigin());

        test2.setHeight(180.5f);
        System.out.println("Высота робота = " + test2.getHeight());

        test2.setWeight(230f);
        System.out.println("Вес робота = " + test2.getWeight());

        test2.setStrength(8);
        System.out.println("Сила робота = " + test2.getStrength());

        test2.setArmor(1);
        System.out.println("Броня робота = " + test2.getArmor());

        test2.move();
        test2.drift();
        test2.defending();
        test2.shot();
    }
}
