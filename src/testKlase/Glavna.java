package testKlase;

import java.util.ArrayList;

//Kreirati glavnu klasu I u njoj:
// instancirati jednu planinu
// napraviti listu koji ce sadrzati tri rekrativna planinara I tri alpiniste
// ispisati podatke o svim planinarima I za svakog od planinara ispisati da li ce se popeti
//na instanciranu planinu
// ispisati kolika je zbir svih clanarina planinara iz niza

public class Glavna
{

  public static void main(String[] args)
  {
    Planina p1 = new Planina("Planina", "Drzava", 1000);

    ArrayList<Planinar> planinar = new ArrayList<Planinar>();

    RekreativniPlaninar rp1 = new RekreativniPlaninar(1, "Pera", "Peric", 10, "Okrig1", 2000);
    RekreativniPlaninar rp2 = new RekreativniPlaninar(2, "Iva", "Ivic", 8, "Okrig2", 1000);
    RekreativniPlaninar rp3 = new RekreativniPlaninar(3, "Zika", "Zikic", 15, "Okrig3", 2500);

    Alpinista a1 = new Alpinista(4, "Jova", "Jovic", 20);
    Alpinista a2 = new Alpinista(5, "Mira", "Miric", 15);
    Alpinista a3 = new Alpinista(6, "Mika", "Mikic", 10);
    
    planinar.add(rp1);
    planinar.add(rp2);
    planinar.add(rp3);
    planinar.add(a1);
    planinar.add(a2);
    planinar.add(a3);
    
    double suma = 0;
    for (int i = 0; i < planinar.size(); i++)
    {
      planinar.get(i).stampaj();
      
      if(planinar.get(i).uspesanUspon(p1))
      {
        System.out.println("Popece se na planinu.");
      }
      else 
      {
        System.out.println("Nece se popeti na planinu.");
      }
      System.out.println("-----------------------------------");
      suma = suma + planinar.get(i).clanarina();
    }

    System.out.println("Zbir clanarina je " + suma + " dinara");
  }
  

}
