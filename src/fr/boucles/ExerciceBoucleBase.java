package fr.boucles;

public class ExerciceBoucleBase {
    public static void main(String[] args) {
        int i = 1;
        while (i <= 10) {
            System.out.println(i);
            i++;
        }

        String name = "Desain Hugo";
        for (int j = 1; j <=20 ; j++) {
            System.out.println(name);
        }

        int k = 2;
        while (k <= 100) {
            System.out.println(k);
            k += 2;
        }

        for (int l = 1; l <=99 ; l+=2) {
            System.out.println(l);
        }
    }
}
