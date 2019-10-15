import java.util.Scanner;

public class ejercicio5_12 {
  public static void main(String[]args) {
    Scanner x = new Scanner(System.in);
    int a;
    int b=0;
    int c=1;
    int resultado;
    System.out.println("Escribe un numero");
    a = x.nextInt();
    
      if ( a==0) {
        System.out.println("No has seleccionado ningún número");
      } else {
        if (a==1) {
          System.out.println("0");
        }else {
        for (int i=0;i<a;i++) {
        b = b+c;
        System.out.print(b+ " ");
        c=c+b;
        ++i;
        if (i<a) {
          System.out.print(c+ " ");
          }
        }
      }
    }
  }
}
