public class ejercicio39 {
  public static void main(String[]args) {
    
    System.out.println("escribe primero el radio y luego la altura de un cono");
    double radio = Double.parseDouble(System.console().readLine());
    double altura = Double.parseDouble(System.console().readLine());
    
    double base_cono = 3.14*radio*radio;
    double area_cono = base_cono*altura/3;
    System.out.println("El área del cono es " + area_cono);
  }
}
