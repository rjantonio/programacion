public class ejercicio7_12b {
  public static void main(String[]args) {
    
    int[][] num = new int[9][9];
    int random;
    int may=0;
    int men=1000;
    int suma=0;
    int cont=0;
    int media;
    
    System.out.println("Matriz primera: ");
    for (int i=0;i<9;i++) {
      for (int j=0;j<9;j++) {
        random=(int)(Math.random()*401)+500;
        num[i][j]=random;
        System.out.print(num[i][j]+" ");
      }
      System.out.println();
    }
    System.out.println("Matriz dividida: ");
    for (int i=0;i<9;i++) {
      for (int j=0;j<i+1;j++) {
        System.out.print(num[i][j]+" ");
      }
      System.out.println();
    }
  }
}
