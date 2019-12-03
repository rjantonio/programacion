public class ejercicio7_10 {
  public static void main(String[]args) {
    
    int[] num = new int[20];
    int[] aux = new int[20];
    int prin=0;
    int fin=19;
    int random;
    
    for (int i=0;i<20;++i) {
      random=(int)(Math.random()*101);
      num[i]=random;
    }
    
    for (int i=0;i<20;++i) {
      if((num[i]%2)==0) {
        aux[prin]=num[i];
        ++prin;
    }else {
      aux[fin]=num[i];
      --fin;
      }
    }
    for (int i=0;i<20;++i) {
      System.out.print(aux[i]+" ");
    }
  }
}
