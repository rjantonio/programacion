public class ejercicio6_1 {
  public static void main(String[]args) {
    
    int dado1;
    int dado2;
    int dado3;
    int suma;
    
    dado1=(int)(Math.random()*6)+1;
    dado2=(int)(Math.random()*6)+1;
    dado3=(int)(Math.random()*6)+1;
    
    suma=dado1+dado2+dado3;
    
    System.out.println("La tirada del dado 1 es: "+dado1);
    System.out.println("La tirada del dado 2 es: "+dado2);
    System.out.println("La tirada del dado 3 es: "+dado3);
    System.out.println("La suma de los 3 dados es: "+suma);
  }
}
