import java.util.Scanner;
public class ejercicio5_11 {
  public static void main(String[]args) {
    Scanner x = new Scanner(System.in);
    int a;
    int cuadrado;
    int cubo;
    
    System.out.println("Escribe un número");
    a = x.nextInt();
    
    for (int i=0;i<5;++i) {
      ++a;
      cuadrado = a*a;
      cubo = a*a*a;
      System.out.printf("%d %d %d\n", a , cuadrado, cubo);
    }
  }
}
