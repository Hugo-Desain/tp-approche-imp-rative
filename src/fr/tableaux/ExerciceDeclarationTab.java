package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String args[]) {
        int[] tab = {8, -7, 12, 1, -2, 14, 17, 9};

        System.out.println(tab[0]);

        System.out.println(tab.length);

        System.out.println(tab[tab.length -1]);

        //L’entier d’index 10 retourne une erreur parce que le tableau ne contient que 8 indexs.
    }
}
