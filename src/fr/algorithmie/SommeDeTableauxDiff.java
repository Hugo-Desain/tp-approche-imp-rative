package fr.algorithmie;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {

        int[] array1 = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4} ;
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18 };

        //• Créer un tableau qui contient la somme des 2 précédents tableaux
        int[] somme = new int[array1.length];

        for (int i = 0; i < somme.length; i++) {
            int data1 = (i < array1.length) ? array1[i] : 0;
            int data2 = (i < array2.length) ? array2[i] : 0;
            somme[i] = data1 + data2;

            System.out.println(somme[i]);
        }
    }
}
