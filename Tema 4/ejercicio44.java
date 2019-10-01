public class ejercicio44 {
  public static void main(String[]args) {
    System.out.println("Dale un valor a 'a'  y otro a 'b' para resolver una ecuación");
    double a;
    double b;
    double c;
    a = Double.parseDouble(System.console().readLine());
    b = Double.parseDouble(System.console().readLine());
    
    c = -b/a;
    
    if (a!=0) {
      System.out.println("La solucion es: " + c);
    } else {
    System.out.println("La ecuación no tiene solución");
  }
}
}
