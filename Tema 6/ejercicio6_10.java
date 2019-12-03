public class ejercicio6_10 {
  public static void main(String[]args) {
    
    int carran;
    int lonran;
    String car="";
    
    for (int i=0;i<10;++i) {
      carran=(int)(Math.random()*6)+1;
      lonran=(int)(Math.random()*40)+1;
      switch (carran) {
        case 1:
        car="*";
        break;
        case 2:
        car="-";
        break;
        case 3:
        car="=";
        break;
        case 4:
        car=".";
        break;
        case 5:
        car="|";
        break;
        case 6:
        car="@";
        break;
      }
      for (int j=0;j<lonran;++j) {
        System.out.print(car);
      }
      System.out.println();
    }
  }
}
        
      
