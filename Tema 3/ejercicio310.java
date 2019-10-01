public class ejercicio310 {
  public static void main(String[]args) {
    System.out.println("Escribe el número de bytes");
    int bytes = Integer.parseInt(System.console().readLine());
    int rkbytes;
    int rmbytes;
    int rbytes;
    int kbytes;
    int mbytes;
    mbytes = bytes/(1024*1024);
    rmbytes = mbytes;
    mbytes = bytes%(1024*1024);
    mbytes = mbytes*1024;
    kbytes = mbytes;
    rkbytes = mbytes;
    mbytes = mbytes*1024;
    rbytes = mbytes;
    System.out.printf("El resultado es "  + " " +rmbytes+ " " +rkbytes+ " " +rbytes);
  }
}
    
    
    
    
    
