import java.util.Scanner;
public class ejercicio7_2b {
  public static void main(String[]args) {
    Scanner x = new Scanner(System.in);
    
    int[][] num = new int[4][5];
    int lec;
    int suma=0;
    int sumat=0;
    
    System.out.println("Escribe 20 números enteros");
    for (int i=0;i<4;i++) {
      for (int j=0;j<5;j++) {
        lec=x.nextInt();
        num[i][j]=lec;
      }
    }
    for (int i=0;i<4;i++) {
      for (int j=0;j<5;j++) {
        System.out.print(num[i][j]+" ");
        suma+=num[i][j];
      }
      System.out.println(suma);
      suma=0;
    }
    for (int i=0;i<5;i++) {
      for (int j=0;j<4;j++) {
        suma+=num[j][i];
        sumat+=num[j][i];
      }
      System.out.print(suma+" ");
      suma=0;
    }
    System.out.print(sumat);
  }
}
