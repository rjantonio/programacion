import java.util.Scanner;
public class ejercicio5_18 {
  public static void main(String[]args) {
    Scanner x = new Scanner(System.in);
    int npeq;
    int nmay;
    System.out.println("Escribe un numero");
    npeq = x.nextInt();
    System.out.println("Escribe un numero mayor que el anterior, se diran los numeros comprendidos entre ellos de 7 en 7");
    nmay = x.nextInt();
    while (nmay>npeq) {
      npeq+=7;
      if (npeq<=nmay){
        System.out.print(npeq+" ");
      }
    }
  }
}
