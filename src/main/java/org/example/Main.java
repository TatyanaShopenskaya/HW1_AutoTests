package org.example;


public class Main {

    public static void main(String[] args) {

        User user = new User("Иван", true);     //true
        User user1 = new User("Иван1", false);  //false

        int prize = 0;
        int prize1 = 0;
        int i;
        int j;

        for (i = 0; i < 1000; i++) {
            MontiChollPlay montiChollPlay = new MontiChollPlay(user, ListOfDoors.getDoors());

            if (montiChollPlay.newMontiChollPlay(1).surprize())
                prize++;
        }
        for (j = 0; j < 1000; j++) {
            MontiChollPlay montiChollPlay1 = new MontiChollPlay(user1, ListOfDoors.getDoors());

            if (montiChollPlay1.newMontiChollPlay(1).surprize())
                prize1++;

        }

        System.out.println(user.getName() + ", который изменил свой выбор, сыграл " + i + " игр. Из них выиграл " + prize + " раз.");
        System.out.println(user1.getName() + ", который не изменил свой выбор сыграл " + j + " игр. Из них выиграл " + prize1 + " раз.");
    }
}







