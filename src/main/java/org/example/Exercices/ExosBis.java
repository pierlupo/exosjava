package org.example.Exercices;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
public class ExosBis {

// Exos rendu de monnaie/achat

    //do
    //while

    //while


//ExosMoy

    public static void Notes() {

        int[] nbNotes;
        int NoteMax = 0;
        int NoteMin = 0;
        int MoyNote = 0;
        nbNotes = new int[5];


        System.out.println("Donnez-moi 5 notes : ");
        Scanner sc = new Scanner(System.in);
        nbNotes = new int[]{sc.nextInt()};
        for (int i = 0; i <= nbNotes.length; i++) {

            int noteTmp = 0;

            // Ajouter la note à la moyenne
            MoyNote += noteTmp;

            // Vérification si noteTmp > a noteMax
            if (noteTmp > NoteMax)
                NoteMax = noteTmp;

            // Vérification si noteTmp < a noteMin
            if (noteTmp < NoteMin)
                NoteMin = noteTmp;
        }

// Calcul de ma moyenne
        MoyNote = Math.round(MoyNote / nbNotes.length);

        System.out.println("Ma note max est :" + NoteMax);
        System.out.println("Ma note min est :" + NoteMin);
        System.out.println("Ma moyenne est :" + MoyNote);

    }

    public static void MoyNotes() {
        int NoteMax;
        int NoteMin;
        System.out.print("Entrez le nombre d'étudiants : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] notes = new double[n];
        double total = 0;
        for (int i = 0; i < notes.length; i++) {
            System.out.print("Entrez la note de l'étudiant " + (i + 1) + ": ");
            notes[i] = sc.nextDouble();

        }
        sc.close();
        for (int i = 0; i < notes.length; i++) {

            total += notes[i];
        }
        double moyenne = total / notes.length;


        System.out.printf("La moyenne de la classe est de : %.2f", moyenne);
    }


//Exo decalage:

    public static void getDecalage() {

        char[] table = {'D', 'E', 'C', 'A', 'L', 'A', 'G', 'E'};

        char temp;

        System.out.println("tableau avant traitement : " + Arrays.toString(table));

        for (int i = 0; i < table.length - 1; i++) {
            temp = table[i];
            table[i] = table[i + 1];
            table[i + 1] = temp;
        }
        System.out.println(Arrays.toString(table));

    }


//Exo RandomArr

    public static void RandomArr() {
        System.out.print("Entrez la longueur du tableau : ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Random rd = new Random(); // création d'un objet aléatoire
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rd.nextInt(10);
            System.out.println(arr[i]);
        }
        System.arraycopy(arr, 0, arr, 0, arr.length);
        for (int copiedArr : arr)
            System.out.println(copiedArr * 2);
    }




//Exo ArrOccu
public static void ArrOcc() {

    int [] tab = new int [] {1, 1, 7, 3, 2, 2, 2, 4, 1};
    int [] count = new int[100];
    /* i : compteur, tmp : stock tmporairement la valeur
    à un certain index du tableau tab[]*/
    int i,tmp = 0;
    /* tmp agira comme une valeur d'index pour le tableau count
    et gardera une trace du nombre d'occurrences de chaque nombre*/
    for(i = 0; i < tab.length; i++){
        tmp = tab[i];
        count[tmp]++;
    }
    for(i=1; i < count.length; i++){
        if(count[i] == 1){
            System.out.printf("%d se produit %d fois\n",i, count[i]);
        }
        else if(count[i] >= 2){
            System.out.printf("%d se produit %d fois\n",i, count[i]);
        }
    }
}


public static void triCroissant(){
        int[] array = {11, 34, 23, 62, 6, 41};

        // afficher tous les entiers avant le tri
        for (int entier : array) {
            System.out.println("nombre: " + entier);
        }

        // trier le tableau
        Arrays.sort(array);

        // afficher tous les entiers après le tri
        System.out.println("Tableau trié\n");
        for (int entier : array) {
            System.out.println("nombre: " + entier);
        }
    }

    public static void TabReverse(){

        int[] tab = {1, 2, 3, 4, 5, 6};
        System.out.println("Tableau initial: " + Arrays.toString(tab));

        for(int i=0; i< tab.length/2; i++){
            int tmp = tab[i];
            tab[i] = tab[tab.length-i-1];
            tab[tab.length-i-1] = tmp;
        }
        System.out.println("Tableau inversé: " + Arrays.toString(tab));
    }


//Exo Algo TriFusion:

}





































