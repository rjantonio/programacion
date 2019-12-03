import java.util.Scanner;
public class ejercicio7_11 {
  public static void main(String[]args) {
    Scanner x = new Scanner(System.in);
    
    int[] num = new int[10];
    int[] aux = new int[10];
    int ini=0;
    int fin=9;
    boolean primo=true;
    
    System.out.println("Escribe 10 números que se almacenarán en un array");
    for (int i=0;i<10;++i) {
      num[i]=x.nextInt();
    }
    
    for (int i=0;i<10;++i) {
      System.out.print(num[i]+"("+i+") ");
    }
    System.out.print("\n");
    
    for (int i=0;i<10;++i) {
      primo=true;
      for(int j=2;j<num[i];++j){
        if((num[i]%j)==0){
          primo=false;
        }
      }
      if(primo==true){
        aux[ini]=num[i];
        ++ini;
      }else {
        aux[fin]=num[i];
        --fin;
      }
    }
    for(int i=0;i<10;++i){
      System.out.print(aux[i]+" ");
    }
  }
}
