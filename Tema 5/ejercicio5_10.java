import java.util.Scanner;
public class ejercicio5_10 {
  public static void main(String[]args) {
    Scanner x = new Scanner(System.in);
    System.out.println("Escribe numeros a los que se hara su media, el programa se ejecutara cuando escribas uno negativo");
    double a;
    double b=0;
    double c=0;
    double resultado;
    do {
      a = x.nextDouble();
      if (a>0) {
      b=b+a;
      c++;
    }
    } while (a>0); 
    resultado = b/c;
    System.out.println(resultado);
  }
}
