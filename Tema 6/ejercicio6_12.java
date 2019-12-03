public class ejercicio6_12 {
  public static void main(String[]args) {
    
    int numran;
    
    for (int i=0;i<100000;++i) {
      numran=(int)(Math.random()*95)+32;
      System.out.print((char)numran);
    }
  }
}
