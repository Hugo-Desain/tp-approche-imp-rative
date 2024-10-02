package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String args[]){

        //•Déclarez un tableau de chaines de caractères contenant 5 noms de villes au choix.
        String[] villes = {"Paris", "Londres", "Berlin", "Rome", "Barcelone"};

        //•Affichez les 5 éléments du tableau
        for (int i = 0; i < villes.length; i++) {
            System.out.println(villes[i]);
        }

        //•Affichez la longueur du tableau
        System.out.println(villes.length);

        //Modifiez l’élément d’index 3 du tableau avec la valeur de ville "Reims"
        villes[3] = "Reims";

        //•Affichez les 5 éléments du tableau après modification
        for (int i = 0; i < villes.length; i++) {
            System.out.println(villes[i]);
        }
    }
;}


