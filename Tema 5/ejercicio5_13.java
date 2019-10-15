import java.util.Scanner;
public class ejercicio5_13 {
  public static void main(String[]args) {
    Scanner x = new Scanner(System.in);
    double a;
    int conteo=0;
    for (int i=0;i<10;++i) {
      System.out.println("Escribe un numero, se dirá cuantos son positivos y cuantos negativos");
      a = x.nextDouble();
      if (a>=0) {
        conteo++;
      } 
    }
    System.out.println("Hay"+conteo+"números positivos y "+(10-conteo)+"números negativos");
  }
}
