import java.util.Scanner;
public class ejercicio7_12 {
  public static void main(String[]args) {
    Scanner x =  new Scanner(System.in);
    
    int[] num = new int[10];
    int[] aux = new int[10];
    int ini;
    int fin;
    
    System.out.println("Escribe 10 números que se meterán en un array");
    
    for (int i=0;i<10;++i) {
      num[i]=x.nextInt();
    }
    
    for (int i=0;i<10;++i) {
      System.out.print(num[i]+"("+i+") ");
    }
    System.out.print("\n");
    do{
      System.out.print("Di la posición inicial: ");
      ini=x.nextInt();
      System.out.print("Di la posición final: ");
      fin=x.nextInt();
    }while((ini>fin)||(ini<0)||(ini>9)||(fin<0)||(fin>9));
    
    
    for (int i=0;i<10;++i) {
      if (i==0){
        aux[i]=num[9];
      }else if(i==fin){
        aux[fin]=num[ini];
      }else if ((i<=ini)||(i>fin)) {
        aux[i+1]=num[i];
      }else {
        aux[i]=num[i];
      }
    }
    for(int i=0;i<10;++i){
      System.out.print(aux[i]+" ");
    }
  }
}
//falla.
