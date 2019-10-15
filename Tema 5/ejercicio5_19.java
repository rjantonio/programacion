import java.util.Scanner;
public class ejercicio5_19 {
  public static void main(String[]args) {
    Scanner x = new Scanner(System.in);
    Scanner y = new Scanner(System.in);
    int h;
    String car;
    int altura=0;
    System.out.println("Escribe la altura de una pirámide");
    h = x.nextInt();
    System.out.println("Escribe el carácter con el que se hará la pirámide");
    car = y.nextLine();
    for (int i=1;i<=h;++i) {
      for (int j=altura;j<h;++j) {
        System.out.print(" ");
      }
      ++altura;
      for (int k=1;k<=(altura*2-1);++k) {
        System.out.print(""+car);
      }
      System.out.print("\n");
    }
  }
}
