import java.util.Scanner;
public class ejercicio7_9 {
  public static void main(String[]args) {
    Scanner x = new Scanner(System.in);
    
    int[]num = new int[8];
    
    System.out.println("Escribe 8 números:");
    for (int i=0;i<8;++i) {
      num[i]=x.nextInt();
    }
    
    for (int i=0;i<8;++i) {
      System.out.print(num[i]+" ");
      if((num[i]%2)==0){
        System.out.println("Par");
      }else {
        System.out.println("Impar");
      }
    }
  }
}
