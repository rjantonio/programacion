public class ejercicio7_18 {
  public static void main(String[]args) {
    
    int[] num = new int[10];
    int[] aux = new int[10];
    int random;
    int menor=100;
    int mayor=200;
    int posmay=0;
    int posmen=0;
    boolean metmen=false;
    boolean metmay=false;
    
    for (int i=0;i<10;i++) {
      random=(int)(Math.random()*201);
      num[i]=random;
    }
    
    for (int i=0;i<10;i++) {
      System.out.print(num[i]+"("+i+") ");
    }
    System.out.println();
    
    for (int i=0;i<10;i+=2) {
      for (int j=0;j<10;j++) {
        if ((num[j]<menor)&&(num[j]<100)) {
          menor=num[j];
          posmen=j;
          metmen=true;
        }else if ((num[j]<mayor)&&(num[j]>=100)) {
          mayor=num[j];
          posmay=j;
          metmay=true;
        }
        metmen=false;
        metmay=false;
      }
      aux[i]=menor;
      aux[i+1]=mayor;
    }
    for (int i=0;i<10;i++) {
      System.out.print(aux[i]+"("+i+") ");
    }
  }
}
//sigue sin funcionar.
