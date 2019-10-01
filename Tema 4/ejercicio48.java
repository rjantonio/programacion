public class ejercicio48 {
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
    if (resultado < 5) {
      System.out.println("Suspenso");
    } else if (resultado < 7) {
      System.out.println("Bien");
    } else if (resultado < 9) {
      System.out.println("Notable");
    } else {
      System.out.println("Sobresaliente");
    }
  }
}

