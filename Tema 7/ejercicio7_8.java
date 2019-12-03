import java.util.Scanner;
public class ejercicio7_8 {
  public static void main(String[]args) {
    Scanner x = new Scanner(System.in);
    
    int[] num = new int[12];
    
    System.out.println("Di las temperaturas medias de cada mes:");
    for (int i=0;i<12;++i) {
      num[i]=x.nextInt();
    }
    
    for (int i=0;i<12;++i) {
      for (int j=0;j<num[i];++j) {
        System.out.print("*");
      }
      System.out.println();
    }
  }
}


