public class parimpar {
  public static void main (String[]args) {
    int valorRecogido;
    int resto;
    
    System.out.print("Introduzca un entero: ");
    valorRecogido = Integer.parseInt(System.console().readLine());
    
    resto = valorRecogido%2;
    
    if (resto == 0) {
    System.out.println("El número introducido es PAR");
    
    System.out.println("El número introducido es IMPAR");
    }
  }
}
