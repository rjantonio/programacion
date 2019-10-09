public class ejercicio57 {
 public static void main(String[]args) {
   int a;
   int b=1234;
   for (int i = 0; i<4; i++) {
     System.out.println("Escribe la combinacion correcta");
     a = Integer.parseInt(System.console().readLine());
     if (a==b) {
       System.out.println("La caja fuerte se ha abierto satisfactoriamente");
       i=4;
     } else {
       System.out.println("Lo siento esa no es la combinacion");
     }
   }
 }
}
     
   
