package org.example.Exercices;

import java.util.Scanner;

public class Exos {

//exo1

    public static void numAuCarre() {
        int num;


        System.out.println("Choisis un nombre : ");
        Scanner sc = new Scanner(System.in);
        num = Integer.parseInt(sc.next());
        System.out.println("Ce nombre au carré vaut " + num * num);
    }

//exo2

    public static void cQuoiTonNom() {

        String nom;

        System.out.println("Machine : Quel est votre prénom?");
        Scanner sc = new Scanner(System.in);
        nom = sc.next();
        System.out.println("Utilisateur : Je m'appelle " + nom);
        System.out.println("Machine : Bonjour " + nom);


    }

//exo3

    public static void PrixetNombreDarticle() {
        int article = 3;
        int pht = 10;
        float ttc = (float) (pht + (pht*0.2));

        System.out.println("Prix Hors taxes : " + pht+"$");
        Scanner sc = new Scanner(System.in);
        System.out.println("Combien d'articles y-a-t-il? : " + article);
        System.out.println("Le prix ttc sera de chaque article sera de " + ttc+"$");

    }


//exo4

    public static void NbrPositifOuNegatif() {

        int num;

        System.out.println("Choisis un nombre : " );
        Scanner sc = new Scanner(System.in);
        num = Integer.parseInt(sc.next());
        if(num > 0){

            System.out.println("ce nombre est positif : " + num );
        }else if(num < 0){

            System.out.println("ce nombre est négatif : " + num );
        }
    }
}


