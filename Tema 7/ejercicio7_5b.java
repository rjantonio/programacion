public class ejercicio7_5b {
  public static void main(String[]args) {
    
    int[][] num = new int[6][10];
    int random;
    int may=0;
    int men=1000;
    String mayo="";
    String meno="";
    
    for (int i=0;i<6;i++) {
      for (int j=0;j<10;j++) {
        random=(int)(Math.random()*1001);
        num[i][j]=random;
        if (random>may) {
          may=random;
        } else if (random<men) {
          men=random;
        }
      }
    }
    for (int i=0;i<6;i++) {
      for (int j=0;j<10;j++) {
        System.out.print(num[i][j]+" ");
        if (num[i][j]==may) {
          mayo=mayo+i+" "+j;
        }else if (num[i][j]==men) {
          meno=meno+i+" "+j;
        }
      }
      System.out.println();
    }
    System.out.println("La posición del mayor es: "+mayo);
    System.out.println("La posición del menor es: "+meno);
  }
}
