import java.util.Scanner;

public class taksiMetre{

  public static void main(String[] args) {

    double mesafe, ucret, toplam = 10;

    Scanner km = new Scanner(System.in);

    System.out.println(" Mesafe Giriniz(km): ");

    mesafe = km.nextDouble();

    ucret = 2.20;

    toplam += (mesafe * ucret);

    toplam = (toplam < 20) ? 20 : toplam;

    System.out.println(" Taksimetre(Ödenecek Ücret): " + toplam + "TL");
    
    km.close();

    }

    
  }



