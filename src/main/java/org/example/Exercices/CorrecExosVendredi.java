package org.example.Exercices;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.ParseException;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.*;
public class CorrecExosVendredi {
    public static void NbrPairOuImpair() {
        int nbr;
        System.out.print("Entrez un entier : ");
        Scanner sc = new Scanner(System.in);
        nbr = sc.nextInt();
        if (nbr % 2 == 0)
            System.out.println("Le nombre est pair.");
        else
            System.out.println("Le nombre est impair.");
    }

    public static void NbrCarac() {
        String text = "Une chaîne de caractères";
        int count = 0;

        //Compter chaque caractére sauf l'espace
        for (int i = 0; i < text.length(); i++) {
            if (text.charAt(i) != ' ')
                count++;
        }
        System.out.println("Nombre total de caractères est: " + count);
    }

    public static void TempCelFar() {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez une température en degrés celsius : ");
        double celsius = input.nextDouble();
        // Convertir Celsius en Fahrenheit
        double fahrenheit = 9.0 / 5 * celsius + 32;
        // Afficher le résultat
        System.out.println(celsius + " Celsius -> " + fahrenheit + " Fahrenheit");
    }

    // Programme Java pour valider un mot de passe en Java

    public static void ValidMdp() {

        // Specify the maximum number of letters in a password
        final int MAX = 8;


        // Specifying the number of uppercase letters in password
        final int MIN_Uppercase = 2;
        // Specifying the minimum lowercase letters in password
        final int MIN_Lowercase = 2;
        // Specifying the number of digits in a password
        final int NUM_Digits = 2;
        // Specify the minimum number of special case letters
        final int Special = 2;
        // Count number of uppercase letters in a password
        int uppercaseCounter = 0;
        // Counter lowercase letters in a password
        int lowercaseCounter = 0;
        // Count digits in a password
        int digitCounter = 0;
        // count special case letters in a password
        int specialCounter = 0;

        // Take input of password from the user

        System.out.println("Enter the password\n");

        Scanner input = new Scanner(System.in);

        // Take password input from the user and save it in the string password

        String password = input.nextLine();

        for (int i = 0; i < password.length(); i++) {
            char c = password.charAt(i);
            if (Character.isUpperCase(c))
                uppercaseCounter++;
            else if (Character.isLowerCase(c))
                lowercaseCounter++;
            else if (Character.isDigit(c))
                digitCounter++;
            if (c >= 33 && c <= 46 || c == 64) {
                specialCounter++;
            }

        }

        if (password.length() >= MAX && uppercaseCounter >= MIN_Uppercase
                && lowercaseCounter >= MIN_Lowercase && digitCounter >= NUM_Digits && specialCounter >= Special) {
            System.out.println("Valid Password");
        } else {
            System.out.println("Your password does not contain the following:");
            if (password.length() < MAX)
                System.out.println(" atleast 8 characters");
            if (lowercaseCounter < MIN_Lowercase)
                System.out.println("Minimum lowercase letters");
            if (uppercaseCounter < MIN_Uppercase)
                System.out.println("Minimum uppercase letters");
            if (digitCounter < NUM_Digits)
                System.out.println("Minimum number of numeric digits");
            if (specialCounter < Special)
                System.out.println("Password should contain at lest 3 special characters");

        }


    }


//carre magique

    //prog qui vérifie un carré magique
    /*
     * Le carré commence à la ligne et colonne 0
     */

//    public static void CarreMagic() {
//
//
//        public static void main (String args[]) {
//
//            n = lire();
//            init(n);       // inutile, mais pédagogique!
//            magique(n);
//            imprimer(n);
//        }
//            final static int N = 100;
//            static int a[][] = new int[N][N];
//            static int n;
//
//            static void init(int n) {
//
//                for (int i = 0; i < n; ++i)
//                    for (int j = 0; j < n; ++j)
//                        a[i][j] = 0;
//            }
//
//            static void magique(int n) {
//                int i, j;
//
//                i = n - 1;
//                j = n / 2;
//                for (int k = 1; k <= n * n; ++k) {
//                    a[i][j] = k;
//                    if ((k % n) == 0)
//                        i = i - 1;
//                    else {
//                        i = (i + 1) % n;
//                        j = (j + 1) % n;
//                    }
//                }
//            }
//
//            static void erreur(String s) {
//
//                System.err.println("Erreur fatale: " + s);
//                System.exit(1);
//            }
//
//            static int lire() {
//                int n;
//                BufferedReader in =
//                        new BufferedReader(new InputStreamReader(System.in));
//
//                System.out.print("Taille du carré magique, svp?::  ");
//                try {
//                    n = Integer.parseInt(in.readLine());
//                } catch (IOException e) {
//                    n = 0;
//                } catch (ParseException e) {
//                    n = 0;
//                }
//                if ((n <= 0) || (n > N) || (n % 2 == 0))
//                    erreur("Taille impossible.");
//                return n;
//            }
//
//            static void imprimer(int n) {
//
//                for (int i = 0; i < n; ++i) {
//                    for (int j = 0; j < n; ++j)
//                        System.out.print(leftAligned(5, a[i][j] + " "));
//                    System.out.println();
//                }
//            }
//
//            static String leftAligned(int size, String s) {
//
//                StringBuffer t = new StringBuffer(s);
//                for (int i = s.length(); i < size; ++i)
//                    t = t.append(" ");
//                return new String(t);
//            }
//
//
//        }


    }


