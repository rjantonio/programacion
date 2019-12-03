import java.util.Scanner;
public class ejercicio7_7 {
  public static void main(String[]args) {
    Scanner x = new Scanner (System.in);
    
    int[] num = new int[100];
    int random;
    int num1;
    int num2;
    
    for (int i=0;i<100;++i){
      random=(int)(Math.random()*21);
      num[i]=random;
      System.out.print(random+" ");
    }
    
    System.out.println("\nEscribe dos numeros, en la relacion anterios, los qu coincidan con el 1º se cambiaran por el 2º");
    num1=x.nextInt();
    num2=x.nextInt();
    
    for (int i=0;i<100;++i) {
      if (num[i]==num1) {
        System.out.print("'"+num2+"' ");
      }else {
        System.out.print(num[i]+" ");
      }
    }
  }
}
      
