import java.util.Scanner;
public class ejercicio6_17 {
  public static void main(String[]args){
    Scanner x = new Scanner(System.in);
    
    int altura;
    int anchura;
    int altran;
    int anchran;
    
    System.out.print("Por favor, introduzca la altura de la pecera (mínimo 4): ");
    altura=x.nextInt();
    System.out.print("Ahora introduzca la anchura (mínimo 4): ");
    anchura=x.nextInt();
    
    altran=(int)(Math.random()*altura-3)+3;
    anchran=(int)(Math.random()*anchura-3)+3;
    
    System.out.println(altran);
    System.out.println(anchran);
    
    for(int i=0;i<anchura;++i){
      System.out.print("*");
    }
    System.out.println();
    for (int i=2;i<=altura-1;++i){
      System.out.print("*");
      for(int j=2;j<=anchura-1;++j){
        if ((i==altran)&&(j==anchran)){
          System.out.print("&");
        }else {
          System.out.print(" ");
        }
      }
      System.out.println("*");
    }
    for(int i=0;i<anchura;++i){
      System.out.print("*");
    }
  }
}
