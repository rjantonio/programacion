public class ejercico6_9 {
  public static void main(String[]args) {
    
    int numran;
    int cont=0;
    
    do {
      numran=(int)(Math.random()*51);
      cont++;
      numran*=2;
    }while(numran!=24);
    System.out.println("Se han generado "+cont+" números.");
  }
}
    
