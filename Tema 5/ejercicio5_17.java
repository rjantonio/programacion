import java.util.Scanner;
public class ejercicio5_17 {
  public static void main(String[]args) {
    Scanner x = new Scanner(System.in);
    int num;
    int resultado=0;
    System.out.println("Escribe un numero, se sumara con los 100 siguientes");
    num = x.nextInt();
    for (int i=1;i<=100;++i) {
      ++num;
      resultado= resultado + num;
    }
    System.out.println(resultado);
  }
}
