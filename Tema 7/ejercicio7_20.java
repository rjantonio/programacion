import java.util.Scanner;
public class ejercicio7_20 {
  public static void main(String[]args) {
    Scanner x = new Scanner(System.in);
    Scanner y = new Scanner(System.in);
    
    int cant;
    int cont=1;
    System.out.print("Introduzca el número total de nombres de reyes: ");
    cant=x.nextInt();
    String[] reyes = new String[cant];
    System.out.println("Vaya introduciendo los nombres de los reyes y pulsando INTRO");
    
    for (int i=0;i<cant;i++) {
      reyes[i]=y.nextLine();
    }
    
    for (int i=0;i<cant;i++) {
      for (int j=0;j<i;j++) {
        if (reyes[i].equals(reyes[j])) {
          cont++;
        }
      }
      System.out.println(reyes[i]+" "+cont+"º");
      cont=1;
    }
  }
}
