public class ejercicio43 {
  public static void main(String[]args) {
    System.out.println("Escribe un número del 1 al 7 indicando un día de la semana");
    int numero;
    numero = Integer.parseInt(System.console().readLine());
    
    switch (numero) {
      case 1:
      System.out.println("Lunes");
      break;
      case 2:
      System.out.println("Martes");
      break;
      case 3:
      System.out.println("Miercoles");
      break;
      case 4:
      System.out.println("Jueves");
      break;
      case 5:
      System.out.println("Viernes");
      break;
      case 6:
      System.out.println("Sábado");
      break;
      case 7:
      System.out.println("Domingo");
      break;
      
      default:
    }
  }
}
