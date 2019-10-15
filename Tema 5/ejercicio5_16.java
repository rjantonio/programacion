import java.util.Scanner;
public class ejercicio5_16 {
  public static void main(String[]args) {
    Scanner x = new Scanner(System.in);
    int num;
    boolean esprimo = false;
    System.out.println("Escribe un número");
    num = x.nextInt();
    for (int i=2;i<num;++i) {
      if (num%i==0) {
        i=num;
      } else {
        esprimo = true;
      }
    }
    if (esprimo==true) {
      System.out.println("El numero es primo");
    } else {
      System.out.println("El numero no es primo");
    }
  }
}
