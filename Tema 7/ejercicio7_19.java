import java.util.Scanner;
public class ejercicio7_19 {
  public static void main(String[]args) {
    Scanner x = new Scanner(System.in);
    
    int[] num = new int[12];
    int intro;
    int random;
    int pos;
    
    for (int i=0;i<12;i++) {
      random=(int)(Math.random()*201);
      num[i]=random;
    }
    
    for (int i=0;i<12;i++) {
      System.out.print(num[i]+" ");
    }
    
    System.out.print("\nIntroduzca el número que quiere insertar: ");
    intro=x.nextInt();
    System.out.print("Introduzca la posición dónde lo quiere insertar (0-11): ");
    pos=x.nextInt();
    
    for (int i=11;i>pos;i--) {
      num[i]=num[i-1];
    }
    num[pos]=intro;
    for (int i=0;i<12;i++) {
      System.out.print(num[i]+" ");
    }
  }
}
