import java.util.Scanner;
public class ejercicio6_6 {
  public static void main(String[]args) {
    Scanner x = new Scanner(System.in);
    
    int numran;
    int vidas=5;
    int numlec;
    boolean acierto=false;
    
    numran=(int)(Math.random()*101);
    
    System.out.println("Intenta adivinar un número del 0 al 100, el programa te dirá pistas");
    
    do {
      if (vidas>1) {
        System.out.print("Te quedan "+vidas+" vidas: ");
      }else if (vidas==1) {
        System.out.print("Te queda 1 vida: ");
      }
      numlec=x.nextInt();
      if (numlec==numran) {
        System.out.println("¡Felicitaciones, has acertado!");
        vidas=0;
        acierto=true;
      } else if (numlec>numran) {
        System.out.println("El número es menor que "+numlec);
        vidas--;
      }else {
        System.out.println("El número es mayor que "+numlec);
        vidas--;
      }
      if ((vidas==0)&&(acierto==false)){
        System.out.println("Has fallado, el número era "+numran);
      }
    }while(vidas>0);
  }
}
    
    
