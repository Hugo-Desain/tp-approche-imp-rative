package fr.tableaux;

public class ExerciceTableauChaines {
    public static void main(String args[]){
        String[] villes = {"Paris", "Londres", "Berlin", "Rome", "Barcelone"};

        for (int i = 0; i < villes.length; i++) {
            System.out.println(villes[i]);
        }
        System.out.println(villes.length);

        villes[3] = "Reims";

        for (int i = 0; i < villes.length; i++) {
            System.out.println(villes[i]);
        }
    }
;}


