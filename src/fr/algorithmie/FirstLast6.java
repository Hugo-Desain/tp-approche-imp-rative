package fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {

        int[] array = {6, 1, 15, -3, 8, 7, 4, -2, 28, -1, 17, 2, 3, 0, 14, -4};

        boolean retour = array.length > 0 && (array[0] == 6 || array[array.length - 1] == 6);

        System.out.println(retour);

    }
}
