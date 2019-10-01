public class ejercicio47 {
  public static void main(String[]args) {
    System.out.println("Escribe 3 notas y se hará su media");
    double a;
    double b;
    double c;
    double resultado;
    a = Double.parseDouble(System.console().readLine());
    b = Double.parseDouble(System.console().readLine());
    c = Double.parseDouble(System.console().readLine());
    
    resultado = (a + b  + c)/3;
    System.out.println("La media es " + resultado);
  }
}
