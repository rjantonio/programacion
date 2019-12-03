import java.util.Scanner;
public class ejercicio7_6 {
  public static void main(String[]args) {
    Scanner x = new Scanner(System.in);
    
    int[] num = new int[15];
    int[] aux = new int[15];
    
    System.out.println("Escribe 15 números para un array");
    for (int i=0;i<15;++i) {
      num[i]=x.nextInt();
    }
    
    for (int i=0;i<15;++i) {
      if (i==14){
        aux[0]=num[i];
      }else {
        aux[i+1]=num[i];
      }
    }
    
    for (int i=0;i<15;++i) {
      System.out.print(aux[i]+" ");
    }
  }
}
    
