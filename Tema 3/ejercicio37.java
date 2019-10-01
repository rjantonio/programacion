public class ejercicio37 {
  public static void main(String[]args) {
    
    System.out.println("Escribe el precio de los elementos comprados");
    double precio_sin_iva = Double.parseDouble(System.console().readLine());
    double precio_total = (precio_sin_iva*1.21);
    System.out.printf("El precio con iva es %.2f\n", precio_total);
  }
}
