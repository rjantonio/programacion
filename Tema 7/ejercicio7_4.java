public class ejercicio7_4 {
  public static void main(String[]args) {
    
    int[] numero = new int[20];
    int[] cuadrado = new int[20];
    int[] cubo = new int[20];
    int random;
    
    for (int i=0;i<20;++i) {
      random=(int)(Math.random()*101);
      numero[i]= random;
      System.out.print(numero[i]+" ");
      cuadrado[i]=random*random;
      System.out.print(cuadrado[i]+" ");
      cubo[i]=random*random*random;
      System.out.print(cubo[i]+"\n");
    }
  }
}
      
