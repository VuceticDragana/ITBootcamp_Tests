package javaTest;

import java.util.Scanner;

public class Zadatak4
{

  public static void main(String[] args)
  {
  //NAPISITE FUNKCIJU koja konvertuje iznos dinara u neku od ponudjenih valuta: evro, franak ili dolar
  //Korisnik unosi iznis dinara i valutu u koji zeli da konvertuje dinare
  //1 evro je 0,0085 dinara
  //1 franak je 0,0093 dinara
  //1 dolar je 0,010 dinara
  //Ispise vrsiti iskljucivo iz main metode
          
  //Primeri ispisa u konzoli:
          
  //Molim vas unesite iznos u dinarima: 
  //1200
  //Molim vas da unesete valutu u koju da konvertujemo dinare: 
  //evro
  //1200.0 dinara, kad se prebaci u evro, iznosi 10.200000000000001 u toj valuti

  //Primer ispisa u konzoli kad se unese pogresna valuta
          
  //Molim vas unesite iznos u dinarima: 
  //123
  //Molim vas da unesete valutu u koju da konvertujemo dinare: 
  //zlato
  //Niste uneli dobru valutu
    
    Scanner s = new Scanner(System.in);
    
    System.out.println("Molim vas unesite iznos u dinarima: ");
    double dinari = s.nextDouble();
    
    System.out.println("Molim vas da unesete valutu u koju da konvertujemo dinare: ");
    String valuta = s.next();
    
    s.close();
    
    if(valuta.equals("evro") || valuta.equals("franak") || valuta.equals("dolar"))
    {
      double iznos = konvertor(dinari, valuta);
      System.out.printf("%.1f dinara, kad se prebaci u evro, iznosi %.15f u toj valuti", dinari, iznos);
    }
    else
    {
      System.out.println("Niste uneli dobru valutu");
    }
  }
  
  public static double konvertor(double dinari, String valuta)
  {
    double iznos = 0;
    
    switch(valuta)
    {
    case "evro": iznos = dinari * 0.0085;    
    break;
    
    case "franak": iznos = dinari * 0.0093;   
    break;
    
    case "dolar": iznos = dinari * 0.010;    
    break;    
    }
    return iznos;
  }

}
