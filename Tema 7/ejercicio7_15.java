import java.util.Scanner;
public class ejercicio7_15 {
  public static void main(String[]args) {
    Scanner x = new Scanner(System.in);
    
    int num;
    int[] mesa = new int[10];
    int random;
    boolean intro=true;
    
    for(int i=0;i<10;i++) {
      random=(int)(Math.random()*5);
      mesa[i]=random;
    }
    
    do {
      System.out.println("Mesa nº    1  2  3  4  5  6  7  8  9 10");
      System.out.print("Ocupación  ");
      for (int i=0;i<10;i++){
        System.out.print(mesa[i]+"  ");
      }
      do {
        System.out.print("\n¿Cuántos son? (Introduzca -1 para salir del programa): ");
        num=x.nextInt();
        if(num>4){
          System.out.println("Lo siento, no admitimos grupos de 6, haga grupos de 4 personas como máximo e intente de nuevo.");
        }
      }while(num>4);
      intro=true;
      for (int i=0;i<10;i++) {
        if ((mesa[i]==0)&&(intro==true)&&(num>0)) {
          System.out.println("Por favor siéntese en la mesa número "+(i+1));
          mesa[i]=num;
          intro=false;
        }else if (((mesa[i]+num)<=4)&&(intro==true)&&(num>=0)) {
          System.out.println("Tendrán que compartir mesa. Por favor, siéntense en la mesa número "+(i+1));
          mesa[i]=mesa[i]+num;
          intro=false;
        }
      }
      if ((intro==true)&&(num>=0)){
          System.out.println("Lo siento, en estos momentos no queda sitio.");
        }
    }while(num>0);
    if (num<0) {
      System.out.println("Gracias, hasta pronto");
    }
  }
}
//no funciona bien, se como hacerlo pero da pereza (si hay una mesa vacia no la prioriza, tienes que desanidar los if's)
