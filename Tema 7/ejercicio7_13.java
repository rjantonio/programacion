import java.util.Scanner;
public class ejercicio7_13 {
  public static void main(String[]args) {
    Scanner x = new Scanner(System.in);
    
    int[] num = new int[100];
    int random;
    int min=500;
    int max=0;
    int dest;
    
    for(int i=0;i<100;++i){
      random=(int)(Math.random()*501);
      num[i]=random;
      if(random>max){
        max=random;
      }else if(random<min){
        min=random;
      }
    }
    
    for (int i=0;i<100;++i){
      System.out.print(num[i]+" ");
    }
    System.out.print("\n¿Qué quiere destacar?(1. Máximo; 2. Mínimo): ");
    dest=x.nextInt();
    
    for (int i=0;i<100;++i){
      if((dest==1)&&(num[i]==max)){
        System.out.print("**"+num[i]+"** ");
      }else if ((dest==2)&&(num[i]==min)){
        System.out.print("**"+num[i]+"** ");
      } else {
        System.out.print(num[i]+" ");
      }
    }
  }
}
