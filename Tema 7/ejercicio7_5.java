import java.util.Scanner;
public class ejercicio7_5 {
  public static void main(String[]args) {
    Scanner x = new Scanner(System.in);
    
    int min=100000;
    int max=0;
    int[] numero = new int[10];
    
    System.out.println("Escribe 1 número, tendrás que escribir 10");
    
    for (int i=0;i<10;++i) {
      numero[i]=x.nextInt();
      if (numero[i]<min) {
        min=numero[i];
        }else if (numero[i]>max) {
          max=numero[i];
        }
      }
    System.out.println("Ahora se mostrarán los números");
    for (int i=0;i<10;++i) {
      System.out.print(numero[i]);
      if(numero[i]==max) {
        System.out.print(" Mayor");
      } else if (numero[i]==min) {
        System.out.print(" Menor");
      }
      System.out.println();
    }
  }
}
      
