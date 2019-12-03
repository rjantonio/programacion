public class ejercicio7_13b {
  public static void main(String[]args) {
    
    int[][] estat = new int [4][10];
    String[] pais = new String[4];
    pais[0] = "España";
    pais[1] = "Rusia";
    pais[2] = "Japón";
    pais[3] = "Australia";
    int random;
    int min=210;
    int max=0;
    int suma=0;
    
    for (int i=0;i<4;i++) {
      for (int j=0;j<10;j++) {
        random=(int)(Math.random()*71)+140;
        estat[i][j]=random;
      }
    }
    System.out.printf("%65s", "Min Max Med\n");
    for (int i=0;i<4;i++) {
      System.out.printf("%11s",pais[i]+": ");
      for (int j=0;j<10;j++) {
        System.out.print(estat[i][j]+" ");
        suma+=estat[i][j];
        if (estat[i][j]>max) {
          max=estat[i][j];
        }else if (estat[i][j]<min) {
          min=estat[i][j];
        }
      }
      System.out.print("| "+min);
      System.out.print(" "+max);
      System.out.println(" "+(suma/10));
      min=210;
      max=0;
      suma=0;
    }
  }
}
