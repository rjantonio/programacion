public class ejercicio35 {
  public static void main(String[]args){
    
    System.out.println("Escribe la base y la altura de un rectángulo");
    double a = Double.parseDouble(System.console().readLine());
    double b = Double.parseDouble(System.console().readLine());
    System.out.println("El área del rectángulo es " + a*b);
  }
}
