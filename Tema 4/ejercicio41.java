public class ejercicio41 {
  public static void main(String[]args){
    System.out.println("Di un día de la semana");
    String diasemana;
    diasemana = System.console().readLine();
    switch (diasemana) {
      case "lunes":
      System.out.println("Entorno de desarrollo");
      break;
      case "martes":
      System.out.println("Programación");
      break;
      case "miercoles":
      System.out.println("Programación");
      break;
      case "jueves":
      System.out.println("Programación");
      break;
      case "viernes":
      System.out.println("FOL");
      break;
      
      default :
    }
  }
}
