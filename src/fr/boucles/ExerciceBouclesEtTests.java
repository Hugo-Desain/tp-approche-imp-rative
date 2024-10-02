package fr.boucles;

public class ExerciceBouclesEtTests {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;

        //• Afficher l’ensemble des éléments du tableau grâce à une boucle
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }

        //• Afficher l’ensemble des éléments dans l’ordre inverse du tableau
        for (int j = (array.length - 1); j >= 0; j--) {
            System.out.println(array[j]);
        }

        //• Combiner une boucle et un test de manière à n’afficher que les entiers supérieurs à 3
        for (int k = 0; k < array.length; k++) {
            if (array[k] > 3 ) {
                System.out.println(array[k]);
            }
        }

        //• Combiner une boucle et un test de manière à n’afficher que les entiers pairs
        for (int l = 0; l < array.length; l++) {
            if (array[l] % 2 == 0)
                System.out.println(array[l]);
        }

        //• Combiner une boucle et un test de manière à n’afficher que valeurs des index pairs
        for (int m = 0; m < array.length; m+=2) {
            if (m % 2 == 0)
                System.out.println(array[m]);
        }

        //• Combiner une boucle et un test de manière à n’afficher que les entiers impairs
        for (int n = 0; n < array.length; n++) {
            if (array[n] % 2 != 0)
                System.out.println(array[n]);
        }
    }
}
