public class JaegerTest {
    public static void main(String[] args) {
        Jaeger mio = new Jaeger("Mio", "M-1", "China", 150.9f, 180f, 5, 2);

        System.out.println("Имя робота = " + mio.getModelName());
        System.out.println("Марка робота = " + mio.getMark());
        System.out.println("Происхождение робота = " + mio.getOrigin());
        System.out.println("Высота робота = " + mio.getHeight());
        System.out.println("Вес робота = " + mio.getWeight());
        System.out.println("Сила робота = " + mio.getStrength());
        System.out.println("Броня робота = " + mio.getArmor());

        mio.move();
        mio.drift();
        mio.defending();
        mio.shot();

        Jaeger mark2 = new Jaeger("Mark-2","Bi-2","USA",180.5f,230f,8,2);

        System.out.println("Имя робота = " + mark2.getModelName());
        System.out.println("Марка робота = " + mark2.getMark());
        System.out.println("Происхождение робота = " + mark2.getOrigin());
        System.out.println("Высота робота = " + mark2.getHeight());
        System.out.println("Вес робота = " + mark2.getWeight());
        System.out.println("Сила робота = " + mark2.getStrength());
        System.out.println("Броня робота = " + mark2.getArmor());

        mark2.move();
        mark2.drift();
        mark2.defending();
        mark2.shot();
    }
}
