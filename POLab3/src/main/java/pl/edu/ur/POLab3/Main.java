/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pl.edu.ur.POLab3;
import java.util.Scanner;
/**
 *
 * @author Asia
 */
public class Main {
    private static void zadanie14(){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Podaj liczbe do przesuniecia bitowego: ");
        int liczba = scanner.nextInt();
        
        int przesuniecieLewo;
        int przesunieciePrawo;
        int przesunieceiPrawo2;
        
        przesuniecieLewo = (liczba << 2);
        System.out.println("Liczba po przesunieciu w lewo: " + przesuniecieLewo);
        
        przesunieciePrawo = (liczba >> 2);
        System.out.println("Liczba po przesunieciu w prawo: " + przesunieciePrawo);
        
        przesunieceiPrawo2 = (liczba >>> 2);
        System.out.println("Liczba po przesunieciu w prawo bez znaku: " + przesunieceiPrawo2);
    }
    
    private static void zadanie17(){
        // NOT -> !()
        // XOR -> ^
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Podaj pierwsza liczbe: ");
        int liczba1 = scanner.nextInt();
        System.out.print("Podaj druga liczbe: ");
        int liczba2 = scanner.nextInt();
        
        System.out.println("[ Operator NOT ]");
        
        if (!(liczba1 == 2)) System.out.println("Pierwsza liczba jest rozna od 2");
        else System.out.println("Pierwsza liczba jest rowna 2");
        
        System.out.println("[ Operator XOR ]");
        if ((liczba1 == 2) ^ (liczba2 == 3)) System.out.println("Pierwsza liczba jest rowna 2 lub druga liczba jest równa 3");
        else System.out.println("Pierwsza liczba jest rowna 2 i druga liczba jest rowna 3\nlub\npierwsza liczba jest rozna od 2 i druga liczba jest rozna od 3");
    }
    
    private static void zadanie22charArray(){
        
    }
    
    private static void zadanie22getBytes(){
        
    }
    
    private static void zadanie22equalsStr(){
        // porownywanie stringow
        Boolean b1,b2,wynik;
        b1 = new Boolean(true);
        b2 = new Boolean(false);
        wynik = b1.equals(b2);
        System.out.println("b1: " + b1 + ", b2: " + b2 + " jest rowne " + wynik);
    }
    
    private static void zadanie22ignoreCase(){
        // porownywanie z pominieciem wielkosci znakow
        String txt1 = "Jakis tekst";
        String txt2 = "JAKIS tekst";
        String txt3 = "jakis TEKST";
        
        System.out.println("Zwrocona wartosc: " + txt1.equalsIgnoreCase(txt2));
        System.out.println("Zwrocona wartosc: " + txt1.equalsIgnoreCase(txt3));
    }
    
    private static void zadanie22compareTo(){
        
    }
    
    private static void zadanie22compareToIgnoreCase(){
        
    }
    
    private static void zadanie22indexOfInt(){
        
    }
    
    private static void zadanie22indexOfStr(){
        String tekst = "Jakiś tekst";
        System.out.println("Index elementu k: " + tekst.indexOf("k"));
    }
    
    private static void zadanie22substring1(){
        // zwraca łańcuch znaków o poczatku <1. argument> łańcucha tekst1
        String tekst1 = "Jakiś tam tekst";
        System.out.println("Wynik: " + tekst1.substring(4));
    }
    
    private static void zadanie22substring2(){
        // zwraca łańcuch znaków o poczatku <1. argument> i końcu <2. argument> łańcucha tekst1
        String tekst1 = "Jakiś tam tekst";
        System.out.println("Wynik: " + tekst1.substring(2, 6));
    }
    
    private static void zadanie22replace(){
        // zamienia znak1 na znak2 w tekst1
        String tekst1 = "Jakiś tam tekst";
        System.out.println("Wynik: " + tekst1.replace("i","j"));
    }
    
    private static void zadanie22trim(){
        // usuwana biale znaki z tekst1
        String tekst1 = "       Jakiś    tam    tekst";
        System.out.println("Wynik: " + tekst1.trim());
    }
    
    private static void zadanie22toLowerCase(){
        // zamienia znaki na male
        String tekst1 = "Jakiś tam tekst";
        System.out.println("Wynik: " + tekst1.toLowerCase());
    }
    
    private static void zadanie22toUpperCase(){
        // zamienia znaki na wielkie
        String tekst1 = "Jakiś tam tekst";
        System.out.println("Wynik: " + tekst1.toUpperCase());
    }
    
    private static void zadanie22split(){
        // dzieli tekst1 na <2. argument> łańcuchów znaków
        String tekst1 = "Jakiś tam tekst";
        for (String wynik: tekst1.split("i", 2)) {
         System.out.println(wynik);
      }
    }
    
    private static void zadanie22split2(){
        // dzieli tekst1 na łańcuchy znaków, podzial nastepuje przy znaku <1. argument>
        String tekst1 = "Jakiś tam tekst";
        for (String wynik: tekst1.split("i")) {
         System.out.println(wynik);
      }
    }
    
    private static void zadanie33i(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe do potegowania: ");
        int a = scanner.nextInt();
        System.out.print("Podaj wykladnik potegi: ");
        int b = scanner.nextInt();
        int wynik = 1;
        for (int i=0; i<b;i++){
            wynik = wynik * a;
        }
        System.out.println("Wynik: " + wynik);
    }
    
    private static void zadanie33r(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Podaj liczbe do potegowania: ");
        int a = scanner.nextInt();
        System.out.print("Podaj wykladnik potegi: ");
        int b = scanner.nextInt();
        
        System.out.println("Wynik: " + potega(a,b));
    }
    
    private static int potega(int a, int b){
        if (b==0) return 1;
        else return a=a*potega(a,--b);
    }
    
    private static void zadanie34(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ktory wyraz ciagu Fibonacciego obliczyc? ");
        int wyraz = scanner.nextInt();
        System.out.println("Wynik: " + Fibonacci(wyraz));
    }
    
    private static int Fibonacci(int n){
        if ((n==1)||(n==2)) return 1;
        else return Fibonacci(n-1)+Fibonacci(n-2);
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int menu = 1;
        do
        {
            System.out.println("Wybierz zadanie ->\n");
            System.out.println("[ 14 ] Zadanie 1.4");
            System.out.println("[ 17 ] Zadanie 1.7");
            System.out.println("[ 221 ] Zadanie 2.2a");
            System.out.println("[ 222 ] Zadanie 2.2b");
            System.out.println("[ 223 ] Zadanie 2.2c");
            System.out.println("[ 224 ] Zadanie 2.2d");
            System.out.println("[ 225 ] Zadanie 2.2e");
            System.out.println("[ 226 ] Zadanie 2.2f");
            System.out.println("[ 227 ] Zadanie 2.2g");
            System.out.println("[ 228 ] Zadanie 2.2h");
            System.out.println("[ 229 ] Zadanie 2.2i");
            System.out.println("[ 2210 ] Zadanie 2.2j");
            System.out.println("[ 2211 ] Zadanie 2.2k");
            System.out.println("[ 2212 ] Zadanie 2.2l");
            System.out.println("[ 2213 ] Zadanie 2.2m");
            System.out.println("[ 2214 ] Zadanie 2.2n");
            System.out.println("[ 2215 ] Zadanie 2.2o");
            System.out.println("[ 2216 ] Zadanie 2.2p");
            System.out.println("[ 331 ] Zadanie 3.3a");
            System.out.println("[ 332 ] Zadanie 3.3b");
            System.out.println("[ 34 ] Zadanie 3.4");
            System.out.println("[ 0 ] Koniec");
            System.out.print("> ");
            
            menu = scanner.nextInt();
            switch(menu){
                case 14: zadanie14(); break;
                case 17: zadanie17(); break;
                case 221: zadanie22charArray(); break;
                case 222: zadanie22getBytes(); break;
                case 223: zadanie22equalsStr(); break;
                case 224: zadanie22ignoreCase(); break;
                case 225: zadanie22compareTo(); break;
                case 226: zadanie22compareToIgnoreCase(); break;
                case 227: zadanie22indexOfInt(); break;
                case 228: zadanie22indexOfStr(); break;
                case 229: zadanie22substring1(); break;
                case 2210: zadanie22substring2(); break;
                case 2211: zadanie22replace(); break;
                case 2212: zadanie22trim(); break;
                case 2213: zadanie22toLowerCase(); break;
                case 2214: zadanie22toUpperCase(); break;
                case 2215: zadanie22split(); break;
                case 2216: zadanie22split2(); break;
                case 331: zadanie33i(); break;
                case 332: zadanie33r(); break;
                case 34: zadanie34(); break;
                case 0: break;
                default: System.out.println("Nieprawidlowa opcja!");
            }   
        }while(menu!=0);
    } 
}
