public class ejercicio38 {
  public static void main(String[]args) {
    
    System.out.println("Escribe el número de horas trabajadas");
    int a = Integer.parseInt(System.console().readLine());
    System.out.println("El salario semanal es de " + (a*12) + " euros");
  }
}
