public class ejercicio36 {
  public static void main(String[]args){
    
    System.out.println("Escribe la base y la altura de un triángulo");
    double a = Double.parseDouble(System.console().readLine());
    double b = Double.parseDouble(System.console().readLine());
    System.out.println("El área de triángulo es " + (a*b/2));
  }
}
