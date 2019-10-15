import java.util.Scanner;
public class ejercicio5_14 {
  public static void main(String[]args) {
    Scanner x = new Scanner(System.in);
    int base;
    int exp;
    int resultado=1;
    System.out.println("Escribe la base");
    base = x.nextInt();
    System.out.println("Escribe el exponente");
    exp = x.nextInt();
    for (int i=exp;i>0;--i) {
      resultado=resultado*base;
    }
    System.out.println(resultado);
  }
}
