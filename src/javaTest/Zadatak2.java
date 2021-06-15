package javaTest;

import java.util.Scanner;

public class Zadatak2
{

  public static void main(String[] args)
  {
  //Napisati program koji racuna potrosnju goriva
  //Korisnik unosi distancu i tip vozila, a program ispisuje koliko ce goriva biti potroseno
  //Motor trosi 5 litara goriva na 100 kilometara, automobil trosi 7 litara na 100 kilometara,
  //kombi trosi 11 litara na 100km, dok kamion trosi 15 litara na 100km
          
  //Primeri ispisa u konzoli:
          
  //Molim vas unesite distancu u kilometrima:
  //134
  //Molim vas unesite tip vozila: 
  //Kombi
  //Kombi na 134.0 km potrosi 14.74 litara goriva

  //Primer ispisa kad se unese pogresno vozilo
          
  //Molim vas unesite distancu u kilometrima:
  //133
  //Molim vas unesite tip vozila: 
  //Tenk
  //Uneli ste pogresan tip vozila
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Molim vas unesite distancu u kilometrima: ");
    double distanca = s.nextDouble();
    
    System.out.println("Molim vas unesite distancu u kilometrima: ");
    String tipVozila = s.next();
    
    s.close();
    
    double litre = 0;
    
    switch(tipVozila)
    {
    case "Motor": litre = distanca / 100 * 5;
    System.out.printf("%s na %.1f km potrosi %.2f litara goriva", tipVozila, distanca, litre);
    break;
    
    case "Automobil": litre = distanca / 100 * 7;
    System.out.printf("%s na %.1f km potrosi %.2f litara goriva", tipVozila, distanca, litre);
    break;
    
    case "Kombi": litre = distanca / 100 * 11;
    System.out.printf("%s na %.1f km potrosi %.2f litara goriva", tipVozila, distanca, litre);
    break;
    
    case "Kamion": litre = distanca / 100 * 15;
    System.out.printf("%s na %.1f km potrosi %.2f litara goriva", tipVozila, distanca, litre);
    break;
    
    default: System.out.println("Uneli ste pogresan tip vozila");
    }
  }

}
