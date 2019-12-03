public class ejercicio7_21 {
  public static void main(String[]args) {
    
    int[] num = new int[15];
    int random;
    boolean salir=false;
    
    for (int i=0;i<15;i++) {
      random=(int)(Math.random()*501);
      num[i]=random;
    }
    
    System.out.println("Array original:");
    for (int i=0;i<15;i++) {
      System.out.print(num[i]+" ");
    }
    
    System.out.println("\nArray cincuerizado");
    for (int i=0;i<15;i++) {
      for (int j=0;j<5;j++) {
        if (((num[i]%5)==0)&&(salir==false)) {
          System.out.print(num[i]+" ");
          salir=true;
        }else if (salir==false) {
          num[i]=num[i]+1;
        }
      }
      salir=false;
    }
  }
}
