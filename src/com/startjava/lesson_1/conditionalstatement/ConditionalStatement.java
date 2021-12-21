package com.startjava.lesson_1.conditionalstatement;

public class ConditionalStatement {
    public static void main(String[] args) {
        //Возраст
        byte age = 40;
        if (age > 20) {
            System.out.println("Возраст: " + age);
        }
        
        // Пол мужской
        boolean genderMan = true;
        if (genderMan) {
            System.out.println("Пол: Мужской");
        } else {
            System.out.println("Пол: Женский");
        }
        
        //высота в метрах.
        double height = 1.82;
        if (height < 1.80) {
            System.out.println("Рост ниже 1.8м.");
        } else {
            System.out.println("Рост 1.8м или выше");
        }
        
        //первая буква в имени
        char firstLetterName = 'X';
        if(firstLetterName == 'M') {
            System.out.println("Первая буква имени М");
        } else if(firstLetterName == 'I') {
            System.out.println("Первая буква имени I");
        } else {
            System.out.println("Первая буква имени " + firstLetterName);
        }
    }
}

