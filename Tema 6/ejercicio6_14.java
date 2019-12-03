import java.util.Scanner;
public class ejercicio6_14 {
  public static void main(String[]args) {
    Scanner x = new Scanner(System.in);
    Scanner y = new Scanner(System.in);
    
    int numlec;
    int numran;
    int vidas=5;
    int mult=101;
    int suma=0;
    String maymen="";
    
    System.out.println("Este programa intenta advinar un numero pensado por ti(entre 0 y 100), escríbelo y luego te hará preguntas");
    numlec=x.nextInt();
    
    do {
      numran=(int)(Math.random()*mult)+suma;
      System.out.println("Me quedan "+vidas+" vidas");
      System.out.println("He pensado el número: "+numran);
      if (numran==numlec){
        System.out.println("¡He acertado el número!");
        vidas=0;
      }else {
        System.out.println("¿El número es mayor o menor?");
        maymen=y.nextLine();
        if (maymen.equals("mayor")){
          mult=mult-numran;
          suma=suma+numran;
        }else {
          mult=mult-numran;
        }
      }
      vidas--;
    }while((vidas>0)&&(numran!=numlec));
    if ((vidas==0)&&(numran!=numlec)){
        System.out.println("Me he quedado sin vidas, he perdido");
      }
  }
}
//Incompleto(no funciona del todo bien)
