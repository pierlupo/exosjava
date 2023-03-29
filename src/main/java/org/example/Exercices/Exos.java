package org.example.Exercices;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

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

//exo5

    public static void ProduitNegOuPos() {
        int num1 ;
        int num2 ;
        int total = 0;

        System.out.println("Choisis un nombre : " );
        Scanner sc = new Scanner(System.in);
        num1 = Integer.parseInt(sc.next());
        System.out.println("Choisis un autre nombre : " );
        num2 = Integer.parseInt(sc.next());
        total= num1*num2;
        if(total > 0){

            System.out.println("Le produit des deux nombres est positif : " + total );
        }else if(total < 0){

            System.out.println("Le  produit des deux nombres est négatif : " + total );
        }else{
            System.out.println("Le  produit des deux nombres est nul : " + total );
        }
        Scanner sc2 = new Scanner(System.in);
        total = Integer.parseInt(sc.next());

    }

//Exos 6

    public static void nomOrdreAlphabetique() {
        String prenom1="";
        String prenom2="";
        String prenom3="";

        System.out.println("Choisis un prenom : " );
        Scanner sc = new Scanner(System.in);
        prenom1 = sc.nextLine();
        System.out.println("Choisis un autre prenom : " );
        prenom2 = sc.nextLine();
        System.out.println("Choisis un autre prenom : " );
        prenom3 = sc.nextLine();
        String[] arrToSort = {prenom1,prenom2,prenom3};
        Arrays.sort(arrToSort);
        for(int i = 0; i < arrToSort.length; i++)
            System.out.print(arrToSort[i] + " ");
    }

//Exos 7


    public static void NbrPositifOuNegatifOuZero() {

        int num;

        System.out.println("Choisis un nombre : " );
        Scanner sc = new Scanner(System.in);
        num = Integer.parseInt(sc.next());
        if(num > 0){

            System.out.println("ce nombre est positif : " + num );
        }else if(num < 0){

            System.out.println("ce nombre est négatif : " + num );
        }else{
            System.out.println("ce nombre est égal à zéro : " + num );
        }
    }


//Exo 8

    public static void NbrEntreUnEtTrois() {

        for(int i = 0; i < 50; i++) {
            int num = 0;

                System.out.println("Choisis un nombre : " );
                Scanner sc = new Scanner(System.in);
                num = Integer.parseInt(sc.next());
            if  (num > 0 && num <= 3){
                System.out.println("ce nombre est compris entre un et trois : " + num);
                break;
            } else if  (num < 0 && num > 3){

                System.out.println("ce nombre ne convient pas : " + num);
                continue;
            }
        }
    }

//    do(){
//
//    }while()


//Exo comptage de mot:


    public static  void NombreDeMots () {

        String s = "cette phrase contient des mots";

        StringTokenizer stringTokenizer1 = new StringTokenizer(s);
        int tokensCount1  = stringTokenizer1.countTokens();
        System.out.println("Word count: "+String.valueOf(tokensCount1));
    }
//Exo occurrence:

    public static  void Occu () {

        String s = "anticonstitutionnellement";

        int stringLength = s.length();
        System.out.println("String length: " + stringLength);


    int totalCharacters = 0;
    char temp;
        for (int a = 0; a < s.length(); a++) {

        temp = s.charAt(a);
        if (temp == 'a')
            totalCharacters++;
    }

        System.out.println("a appears " + totalCharacters + " times in anticonstitutionnellement");
        System.out.println();
    }

//Exo anagram



    public static void isAnagramSort() {
        String s1;
        String s2;
        System.out.println("Entrer un mot : ");
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine();
        System.out.println("Choisissez un autre mot : " );
        s2 = sc.nextLine();

        if (s1.length() != s2.length()) {
            System.out.println("Ces deux mots ne sont pas des anagrammes");
        }
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();
        Arrays.sort(a1);
        Arrays.sort(a2);
        if(Arrays.equals(a1, a2)){;
        System.out.println("Ces deux mots : " +s1+ " et " +s2+ " sont des anagrammes.");
        }
    }



//Exo palin

    public static void isPalin() {

        String s1;
        System.out.println("Entrer un mot : ");
        Scanner sc = new Scanner(System.in);
        s1 = sc.nextLine();

        String clean = s1.replaceAll("\\s+", "").toLowerCase();
        int length = clean.length();
        int forward = 0;
        int backward = length - 1;
        while (backward > forward) {
                char forwardChar = clean.charAt(forward++);
                char backwardChar = clean.charAt(backward--);
                if (forwardChar != backwardChar){
                    System.out.println("Ce n'est pas un palindrome");
                break;}
                System.out.println("Nous avons un palindrome");
                break;
            }

        }

    }




