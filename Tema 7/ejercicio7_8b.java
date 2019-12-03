import java.util.Scanner;
public class ejercicio7_8b {
  public static void main(String[]args) {
    Scanner x = new Scanner(System.in);
    
    boolean[][] tabla = new boolean[8][8];
    String lec;
    char coordx;
    char coordy;
    int cordx=0;
    int cordy=0;
    int auxx=0;
    int auxy=0;
    
    System.out.print("Escribe la posición del alfil (Ej:d5): ");
    lec=x.nextLine();
    coordx = lec.charAt(0);
    coordy = lec.charAt(1);
    
    for (int i=0;i<8;i++) {
      for (int j=0;j<8;j++) {
        tabla[i][j]=false;
      }
    }
    
    switch (coordx) {
      case 'a':
      cordx=0;
      break;
      case 'b':
      cordx=1;
      break;
      case 'c':
      cordx=2;
      break;
      case 'd':
      cordx=3;
      break;
      case 'e':
      cordx=4;
      break;
      case 'f':
      cordx=5;
      break;
      case 'g':
      cordx=6;
      break;
      case 'h':
      cordx=7;
      break;
    }
    switch (coordy) {
      case '1':
      cordx=0;
      break;
      case '2':
      cordx=1;
      break;
      case '3':
      cordx=2;
      break;
      case '4':
      cordx=3;
      break;
      case '5':
      cordx=4;
      break;
      case '6':
      cordx=5;
      break;
      case '7':
      cordx=6;
      break;
      case '8':
      cordx=7;
      break;
    }
    auxx=cordx;
    auxy=cordy;
    for (int i=0;i<8;i++) {
      for (int j=0;j<8;j++) {
        while ((cordx>=0)&&(cordy>=0)&&(cordx<=7)&&(cordy<=7)) {
          
        }
      }
    }
  }
}
