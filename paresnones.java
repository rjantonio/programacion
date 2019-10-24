import java.util.Scanner;
public class paresnones {
  public static void main(String[]args) {
    Scanner x = new Scanner(System.in);
    
    int random;
    int parnon;
    int num;
    int suma;
    boolean par=false;
    
    parnon=(int)(Math.random()*2)+1;
    
    if (parnon==1) {
      System.out.println("Yo elijo pares");
    } else {
      System.out.println("Yo elijo nones");
    }
    random=(int)(Math.random()*11);
    
    System.out.println("¿Qué número has elegido?");
    num=x.nextInt();
    System.out.println("Yo he sacado "+random);
    
    suma=num+random;
    
    if (suma%2==0){
      par=true;
    }
    if (((parnon==1)&&(par==true))||((parnon==2)&&(par==false))) {
      System.out.println("Yo gano");
    } else {
      System.out.println("Tu ganas");
    }
  }
}
