public class ticketcompra {
  public static void main(String[]args) {
    
    String nombre1;
    int cantidad1;
    double precio1;
    int iva1;
    double precioconiva1;
    String nombre2;
    int cantidad2;
    double precio2;
    int iva2;
    double precioconiva2;
    String nombre3;
    int cantidad3;
    double precio3;
    int iva3;
    double precioconiva3;
    String nombre4;
    int cantidad4;
    double precio4;
    int iva4;
    double precioconiva4;
    
    double preciosiniva;
    double preciototal;
    double ivatotal;
    
    System.out.println("Escribe el nombre de cuatro productos, así como la cantidad comprada, el precio y el IVA aplcicado en estos");
    
    nombre1 = System.console().readLine();
    cantidad1 = Integer.parseInt(System.console().readLine());
    precio1 = Double.parseDouble(System.console().readLine());
    iva1 = Integer.parseInt(System.console().readLine());
    nombre2 = System.console().readLine();
    cantidad2 = Integer.parseInt(System.console().readLine());
    precio2 = Double.parseDouble(System.console().readLine());
    iva2 = Integer.parseInt(System.console().readLine());
    nombre3 = System.console().readLine();
    cantidad3 = Integer.parseInt(System.console().readLine());
    precio3 = Double.parseDouble(System.console().readLine());
    iva3 = Integer.parseInt(System.console().readLine());
    nombre4 = System.console().readLine();
    cantidad4 = Integer.parseInt(System.console().readLine());
    precio4 = Double.parseDouble(System.console().readLine());
    iva4 = Integer.parseInt(System.console().readLine());
    
    precioconiva1 = (cantidad1*precio1*iva1)/100;
    precioconiva2 = (cantidad2*precio2*iva2)/100;
    precioconiva3 = (cantidad3*precio3*iva3)/100;
    precioconiva4 = (cantidad4*precio4*iva4)/100;
    
    preciosiniva = cantidad1*precio1 + cantidad2*precio2 + cantidad3*precio3 + cantidad4*precio4;
    ivatotal = precioconiva1 + precioconiva2 + precioconiva3 + precioconiva4;
    preciototal = preciosiniva + ivatotal;
    
    System.out.printf("%-10s %10s %10s %10s", "Nombre" , "Cantidad" , "Precio" , "IVA\n");
    System.out.printf("%-10s %10d %10.2f %10.2f\n", nombre1 , cantidad1 , precio1 , precioconiva1);
    System.out.printf("%-10s %10d %10.2f %10.2f\n", nombre2 , cantidad2 , precio2 , precioconiva2);
    System.out.printf("%-10s %10d %10.2f %10.2f\n", nombre3 , cantidad3 , precio3 , precioconiva3);
    System.out.printf("%-10s %10d %10.2f %10.2f\n", nombre4 , cantidad4 , precio4 , precioconiva4);
    System.out.println("El importe sin IVA es " + preciosiniva);
    System.out.println("La cantidad correspondiente al IVA es " + ivatotal);
    System.out.println("El precio total a pagar es " + preciototal);

  }
}
    
