public class ejercicio6_11 {
  public static void main(String[]args) {
    
    int notaran;
    int contins=0;
    int contapr=0;
    int contbien=0;
    int contnot=0;
    int contsob=0;
    
    for (int i=0;i<20;++i) {
      notaran=(int)(Math.random()*11)+1;
      if ((notaran>=0)&&(notaran<5)){
        contins++;
      } else if (notaran==5){
        contapr++;
      }else if (notaran<7){
        contbien++;
      }else if (notaran<9){
        contnot++;
      }else {
        contsob++;
      }
    }
    System.out.println("El número de suspensos ha sido: "+contins);
    System.out.println("El número de aprobados ha sido: "+contapr);
    System.out.println("El número de bienes ha sido: "+contbien);
    System.out.println("El número de notables ha sido: "+contnot);
    System.out.println("El número de sobresalientes ha sido: "+contsob);
  }
}
                
