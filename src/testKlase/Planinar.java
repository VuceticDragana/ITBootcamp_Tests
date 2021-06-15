package testKlase;

//Kreirati apstraktnu klasu Planinar koja od zašticenih atributa ima:
// jedinstveni celobrojni identifikacioni broj
// ime i prezime
//Dok od javnih metoda:
// konstruktor koji postavlja sve atribute klase.
// gettere
// apstraktnu metodu štampaj
// apstraktnu metodu koja vraca clanarinu planinara
// apstraktnu metodu uspesanUspon koja vraca informaciju da li ce 
//se planinar upešno popeti na planinu. Metoda kao ulazni parametar prima objekat tipa Planina.

public abstract class Planinar
{
  private int id;
  private String ime;
  private String prezime;
  
  public Planinar(int id, String ime, String prezime)
  {
    super();
    this.id = id;
    this.ime = ime;
    this.prezime = prezime;
  }

  public int getId()
  {
    return id;
  }

  public String getIme()
  {
    return ime;
  }

  public String getPrezime()
  {
    return prezime;
  }
  
  public abstract void stampaj();
  public abstract double clanarina();
  public abstract boolean uspesanUspon(Planina p);

}
