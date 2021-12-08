public class Wolf {
    //Описание пол мужской
    private boolean genderMan;
    public void setGenderMan(boolean genderMan) {
        this.genderMan = genderMan;
    }

    public boolean isGenderMan() {
        return genderMan;
    }

    //Описание клички
    private String nickName;
    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    //Описание веса
    private int weight;
    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getWeight() {
        return weight;
    }

    //Описание возраст
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

    //Описание цвета
    private String color;
    public void setСolor(String color) {
        this.color = color;
    }

    public String getСolor() {
        return color;
    }

    //Методы
    public void move() {
        System.out.println("Иду");
    }

    public void sit() {
        System.out.println("Сижу");
    }

    public void run() {
        System.out.println("Бегу");
    }

    public void howl() {
        System.out.println("Вою");
    }

    public void hunt() {
        System.out.println("Охочусь");
    }
}
