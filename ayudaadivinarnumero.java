import java.util.Scanner;
public class ayudaadivinarnumero {
  public static void main(String[]args) {
    Scanner x = new Scanner(System.in);
    int sol = 12345;
    int lec;
    int nmenor=0;
    int nmayor=100000000;
    do {
      System.out.println("Di un numero para acertar la solucion, el programa te dará pistas para acertarlo");
      lec = x.nextInt();
      if ((lec<sol)&&(lec>nmenor)) {
        nmenor=lec;
      } else {
        if ((lec>sol)&&(lec<nmayor)) {
          nmayor=lec;
        }
      }
      if (lec!=sol) {
        if ((nmenor!=0)&&(nmayor!=100000000)) {
          System.out.println("La solución es mayor a "+nmenor+" y menor a "+nmayor); 
      } else {
          if ((nmenor==0)&&(nmayor!=100000000)) {
            System.out.println("La solucioón es menor a "+nmayor);
          } else {
              if ((nmenor!=0)&&(nmayor==100000000)) {
              System.out.println("La solución es mayor a "+nmenor);
              } 
            }
          }
        }
      }while (lec!=sol);
    System.out.println("¡Felicidades, la solución es correcta!");
  }
}
