package inlämning42;


import java.util.*;
import java.io.*;

public class Dice
{
   private int value = 0;
   private static Random r = new Random();
   public Dice() {
       // Kasta en gång när tärningen skapas
       roll();
   }
   public int roll() {
       // Slumpgenererat heltal modulo 6 (resten vid heltalsdivision)
       // plus ett ger ett slumptal mellan 1 och 6.
       value = Math.abs(r.nextInt()) % 6 + 1;
       return value;
   }
   public String toString() {
       // Konvertera värdet till en sträng
       return Integer.toString(value);
   }

   public static void main(String args[]) {
       // Skapa tärning
       Dice luckydice = new Dice();

       // Kasta tärning 25 gånger
       for (int i = 0; i < 2; i++)
       {
           luckydice.roll();
           System.out.println("Värdet är= " + luckydice);
       }

       // Läs tecken innan programmet avslutas
       System.out.print("Tryck ENTER för att avsluta");
       try {
           int ch = System.in.read();
       }
       catch (IOException e)
       {
           // Ignorera
       }
   }
}