import java.util.Scanner;
public class ejercicio59 {
  public static void main(String[]args) {
    Scanner x = new Scanner(System.in);
    System.out.println("Escribe un numero");
    int a = x.nextInt();
    int b;
    int c = 0;
    int i=1;
    do {
      b=a;
      i=i*10;
      ++c;
     } while (a>i);
     System.out.println(c);
   }
}
    
