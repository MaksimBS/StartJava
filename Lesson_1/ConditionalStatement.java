public class ConditionalStatement
{
    public static void main(String[] args) {

        //Возраст
        byte age = 40;
        // 1- Мужской 2 - Женский
        byte gender = 1;
        //Рост в м.
        double height = 1.82;
        //Первая буква имени
        char firstLetterName = 'X';

        if (age > 20) {
            System.out.println("Возраст: " + age);
        }

        if (gender == 1) {
            System.out.println("Пол: М");
        } else if (gender == 2) {
            System.out.println("Пол: Ж");
        }

        if (height < 1.80) {
            System.out.println("Рост ниже 1.8м.");
        } else {
            System.out.println("Рост 1.8м или выше");
        }

        if(firstLetterName == 'M') {
            System.out.println("Первая буква имени начинается на М");
        } else if(firstLetterName == 'I') {
            System.out.println("Первая буква имени начинается на I");
        } else {
            System.out.println("Первая буква имени начинается на "+firstLetterName);
        }
    }
}

