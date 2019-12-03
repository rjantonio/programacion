public class ejercicio7_9b {
  public static void main(String[]args) {
    
    int[][] num = new int[12][12];
    int[][] aux = new int[12][12];
    int random;
    int piso=12;
    
    for (int i=0;i<12;i++) {
      for (int j=0;j<12;j++) {
        random=(int)(Math.random()*100);
        num[i][j]=random;
      }
    }
    System.out.println("Matriz primera");
    for (int i=0;i<12;i++) {
      for (int j=0;j<12;j++) {
        System.out.printf("%3d", num[i][j]);
      }
      System.out.println();
    }
    for (int i=0;i<6;i++) {
        for (int j=i;j<piso-1;j++) {
          aux[i][j+1]=num[i][j];
      }
      for (int k=i;k<piso-1;k++) {
          aux[k+1][piso-1]=num[k][piso-1];
     }
        for (int j=i;j<piso-1;j++) {
          aux[piso-1][j]=num[piso-1][j+1];
       }
     for (int k=i;k<piso-1;k++) {
          aux[k][i]=num[k+1][i];
     }
     piso--;
    }
    System.out.println("Matriz nueva:");
    for (int i=0;i<12;i++) {
      for (int j=0;j<12;j++) {
        System.out.printf("%3d", aux[i][j]);
      }
      System.out.println();
    }
  }
}

