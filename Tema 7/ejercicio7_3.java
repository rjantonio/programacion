import java.util.Scanner;
public class ejercicio7_3 {
  public static void main(String[]args) {
    Scanner x = new Scanner(System.in);
    
    int[] num = new int[10];
    
    System.out.println("Escribe 10 numeros enteros, luego se mostraran en orden inverso:");
    
    for (int i=0;i<10;++i) {
      num[i]=x.nextInt();
    }
    
    for (int i=9;i>=0;--i) {
      System.out.print(num[i]+" ");
    }
  }
}
    
