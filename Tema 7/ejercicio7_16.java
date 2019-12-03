import java.util.Scanner;
public class ejercicio7_16 {
  public static void main(String[]args) {
    Scanner x = new Scanner(System.in);
    
    int[] num = new int[20];
    int random;
    int mult;
    
    for (int i=0;i<20;i++) {
      random=(int)(Math.random()*401);
      num[i]=random;
    }
    
    for (int i=0;i<20;i++) {
      System.out.print(num[i]+" ");
    }
    
    System.out.print("\n¿Qué números quieres resaltar? (1- Los múltiplos de 5, 2- Los múltiplos de 7): ");
    mult=x.nextInt();
    
    for (int i=0;i<20;i++) {
      if ((mult==1)&&((num[i]%5)==0)) {
        System.out.print("["+num[i]+"] ");
      }else if ((mult==2)&&((num[i]%7)==0)) {
        System.out.print("["+num[i]+"] ");
      }else {
        System.out.print(num[i]+" ");
      }
    }
  }
}
    
    
