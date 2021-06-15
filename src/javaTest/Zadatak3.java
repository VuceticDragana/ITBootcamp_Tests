package javaTest;

import java.util.Scanner;

public class Zadatak3
{

  public static void main(String[] args)
  {
  //Napisite program koji, koristeci petlju, racuna zbir unetih brojeva, sve dok korisnik ne unese 0
  //Primer ispisa resenja:

  //Molim vas unesite 1. broj
  //4
  //Trenutni zbir je 4
  //Molim vas unesite 2. broj
  //5
  //Trenutni zbir je 9
  //Molim vas unesite 3. broj
  //0
  //Uneli ste 0 Kraj programa
    
    Scanner s = new Scanner(System.in);
    int i = 2;
    
    System.out.println("Molim vas unesite 1. broj: ");
    int broj = s.nextInt();    
    
    int suma = 0;
    
    while(broj != 0)
    {
      suma = suma + broj;
      System.out.println("Trenutni zbir je " + suma);
      System.out.println("Molim vas unesite "+ i +". broj ");
      broj = s.nextInt();      
    }
    
    System.out.println("Uneli ste 0 Kraj programa");
    s.close();
  }

}
