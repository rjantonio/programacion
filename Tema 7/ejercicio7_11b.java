public class ejercicio7_11b {
  public static void main(String[]args) {
    
    int[][] num = new int[10][10];
    int random;
    int may=0;
    int men=300;
    int suma=0;
    int cont=0;
    int media;
    
    System.out.println("Matriz primera: ");
    for (int i=0;i<10;i++) {
      for (int j=0;j<10;j++) {
        random=(int)(Math.random()*101)+200;
        num[i][j]=random;
      }
    }
    for (int i=0;i<10;i++) {
      for (int j=0;j<10;j++) {
        System.out.print(num[i][j]+" ");
      }
      System.out.println();
    }
    System.out.println("Matriz dividida: ");
    for (int i=0;i<10;i++) {
      for (int k=0;k<i;k++) {
          System.out.print("    ");
        }
      for (int j=i;j<10;j++) {
        System.out.print(num[i][j]+" ");
        if (num[i][j]<men) {
          men=num[i][j];
        }else if (num[i][j]>may) {
          may=num[i][j];
          suma+=num[i][j];
          cont++;
        }
      }
      System.out.println();
    }
    media=suma/cont;
    System.out.println("El menor es: "+men);
    System.out.println("El mayor es: "+may);
    System.out.println("La media es: "+media);
  }
}
