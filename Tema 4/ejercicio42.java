public class ejercicio42 {
  public static void main (String[]args) {
    System.out.println("Di qué hora es");
    int hora;
    hora = Integer.parseInt(System.console().readLine());
    
    if ((hora>=6)&&(hora<13)) {
      System.out.println("Buenos días");
    } else if ((hora>=13)&&(hora<21)){
      System.out.println("Buenas tardes");
    }else {
      System.out.println("Buenas noches");
    }
  }
}
