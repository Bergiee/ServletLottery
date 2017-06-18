package inl�mning42;


import java.util.*;
import java.io.*;

public class Dice
{
   private int value = 0;
   private static Random r = new Random();
   public Dice() {
       // Kasta en g�ng n�r t�rningen skapas
       roll();
   }
   public int roll() {
       // Slumpgenererat heltal modulo 6 (resten vid heltalsdivision)
       // plus ett ger ett slumptal mellan 1 och 6.
       value = Math.abs(r.nextInt()) % 6 + 1;
       return value;
   }
   public String toString() {
       // Konvertera v�rdet till en str�ng
       return Integer.toString(value);
   }

   public static void main(String args[]) {
       // Skapa t�rning
       Dice luckydice = new Dice();

       // Kasta t�rning 25 g�nger
       for (int i = 0; i < 2; i++)
       {
           luckydice.roll();
           System.out.println("V�rdet �r= " + luckydice);
       }

       // L�s tecken innan programmet avslutas
       System.out.print("Tryck ENTER f�r att avsluta");
       try {
           int ch = System.in.read();
       }
       catch (IOException e)
       {
           // Ignorera
       }
   }
}