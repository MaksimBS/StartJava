public class JaegerTest {
    public static void main(String[] args) {
        Jaeger test1 = new Jaeger("Mio","M-1","China",150.9f,180f,5,2);

        System.out.println("Имя робота = " + test1.getModelName());
        System.out.println("Марка робота = " + test1.getMark());
        System.out.println("Происхождение робота = " + test1.getOrigin());
        System.out.println("Высота робота = " + test1.getHeight());
        System.out.println("Вес робота = " + test1.getWeight());
        System.out.println("Сила робота = " + test1.getStrength());
        System.out.println("Броня робота = " + test1.getArmor());

        test1.move();
        test1.drift();
        test1.defending();
        test1.shot();

        Jaeger test2 = new Jaeger("Mark-2","Bi-2","USA",180.5f,230f,8,2);

        System.out.println("Имя робота = " + test2.getModelName());
        System.out.println("Марка робота = " + test2.getMark());
        System.out.println("Происхождение робота = " + test2.getOrigin());
        System.out.println("Высота робота = " + test2.getHeight());
        System.out.println("Вес робота = " + test2.getWeight());
        System.out.println("Сила робота = " + test2.getStrength());
        System.out.println("Броня робота = " + test2.getArmor());

        test2.move();
        test2.drift();
        test2.defending();
        test2.shot();
    }
}
