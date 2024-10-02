package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String args[]) {

        //• Déclarez un tableau d’entiers contenant tous les chiffres suivants : 8, -7, 12, 1, -2, 14, 17, 9
        int[] tab = {8, -7, 12, 1, -2, 14, 17, 9};

        //• Affichez l’élément du tableau d’index 0 du tableau
        System.out.println(tab[0]);

        //• Affichez la longueur du tableau
        System.out.println(tab.length);

        //• Affichez l’entier positionné au dernier index du tableau
        System.out.println(tab[tab.length -1]);


        //L’entier d’index 10 retourne une erreur parce que le tableau ne contient que 8 indexs.
    }
}
