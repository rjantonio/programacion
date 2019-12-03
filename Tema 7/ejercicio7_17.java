import java.util.Scanner;
public class ejercicio7_17 {
  public static void main(String[]args) {
    Scanner x = new Scanner(System.in);
    
    int random;
    int[] num = new int[10];
    int[] aux = new int[10];
    int intro;
    boolean esta=false;
    boolean igual=false;
    
    for (int i=0;i<10;i++) {
      random=(int)(Math.random()*101);
      num[i]=random;
    }
    
    for (int i=0;i<10;i++) {
      System.out.print(num[i]+" ");
    }
    System.out.println();
    System.out.print("Escribe un número: ");
    do {
      intro=x.nextInt();
      for (int i=0;i<10;i++) {
        if (intro==num[i]) {
          esta=true;
        }
      }
      if (esta==false) {
        System.out.print("Escribe otro número: ");
      }
    }while(esta==false);
    
    while(igual==false) {
      for (int i=0;i<10;i++) {
        if (i==9) {
          aux[0]=num[9];
        }else {
          aux[i+1]=num[i];
        }
      }
      for (int i=0;i<10;i++) {
        num[i]=aux[i];
      }
      if (aux[0]==intro) {
        igual=true;
      }
    }
    for (int i=0;i<10;i++) {
      System.out.print(aux[i]+" ");
    }
  }
}
