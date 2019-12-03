public class ejercicio7_4b {
  public static void main(String[]args) {
    
    int[][] num = new int[4][5];
    int random;
    int suma=0;
    int sumat=0;
    
    for (int i=0;i<4;i++) {
      for (int j=0;j<5;j++) {
        random=(int)(Math.random()*900)+100;
        num[i][j]=random;
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

//no hace lo de esperar porque no se el comando.
