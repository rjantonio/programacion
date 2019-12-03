public class ejercicio6_15 {
  public static void main(String[]args) {
    
    int notaran;
    int meloran;
    String nota="";
    boolean primero=true;
    String ultima="";
    
    meloran=(int)(Math.random()*7)+1;
    
    for (int i=0;i<meloran;++i) {
      for (int j=0;j<4;++j) {
        notaran=(int)(Math.random()*7)+1;
        switch(notaran){
          case 1:
          nota="Do";
          break;
          case 2:
          nota="Re";
          break;
          case 3:
          nota="Mi";
          break;
          case 4:
          nota="Fa";
          break;
          case 5:
          nota="Sol";
          break;
          case 6:
          nota="La";
          break;
          case 7:
          nota="Si";
          break;
        }
        if (primero==true) {
          ultima=nota;
        }
        primero=false;
        if ((i==meloran-1)&&(j==3)) {
          System.out.print(ultima);
        }else {
          System.out.print(nota+" ");
        }
      }
      System.out.print("|");
    }
    System.out.print("|");
  }
}
