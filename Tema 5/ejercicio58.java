import java.util.Scanner;
public class ejercicio58 {
  public static void main(String[]args) {
    System.out.println("Escribe un numero");
    Scanner x = new Scanner(System.in);
    int a = x.nextInt();
    for (int i=0; i<=10;i++) {
      System.out.println(a*i);
    }
  }
}
