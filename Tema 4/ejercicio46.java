public class ejercicio46 {
  public static void main(String[]args) {
    System.out.println("Di la altura desde la que cae un objeto");
    double h;
    double calculo;
    h = Double.parseDouble(System.console().readLine());
    calculo = h*2/9.81;
    
    if (calculo>=0) {
      calculo = 
      System.out.println("Tarda " + calculo + "segundos en caer");
    } else {
      System.out.println("No tiene solución");
    }
  }
}
