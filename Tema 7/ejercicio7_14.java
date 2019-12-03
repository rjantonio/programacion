import java.util.Scanner;
public class ejercicio7_14 {
  public static void main(String[]args) {
    Scanner x = new Scanner(System.in);
    
    String[] cosas = new String[8];
    String[] colores= new String[9];
    String[] aux = new String[8];
    int ini=0;
    int fin=7;
    boolean igual=false;
    
    colores[0]="verde";
    colores[1]="rojo";
    colores[2]="azul";
    colores[3]="amarillo";
    colores[4]="naranja";
    colores[5]="rosa";
    colores[6]="negro";
    colores[7]="blanco";
    colores[8]="morado";
    
    for (int i=0;i<8;++i) {
      System.out.print("Escribe una palabra, puede ser un color o no: ");
      cosas[i]=x.nextLine();
    }
    
    
    for (int i=0;i<8;++i) {
      for (int j=0;j<9;++j){
        if (cosas[i].equals(colores[j])) {
          igual=true;
        }
      }
      if (igual==true){
        aux[ini]=cosas[i];
        ini++;
      }else {
        aux[fin]=cosas[i];
        fin--;
      }
      igual=false;
    }
    
    
    for (int i=0;i<8;++i){
      System.out.print(aux[i]+" ");
    }
    
  }
}
