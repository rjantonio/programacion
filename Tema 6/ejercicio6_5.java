public class ejercicio6_5 {
  public static void main(String[]args) {
    
    int numran;
    int menor=200;
    int mayor=100;
    int suma=0;
    int media;
    
    for (int i=0;i<50;++i) {
      numran=(int)(Math.random()*100)+100;
      if (numran>mayor) {
        mayor=numran;
      }else if (numran<menor) {
        menor=numran;
      }
      System.out.print(numran+" ");
      suma+=numran;
    }
    media=suma/50;
    System.out.println();
    System.out.println("El mayor es: "+mayor);
    System.out.println("El menor es: "+menor);
    System.out.println("La media es: "+media);
  }
}
