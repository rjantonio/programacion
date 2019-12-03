public class ejercicio6_2 {
  public static void main(String[]args) {
    
    String palo="";
    String carta="";
    int numpalo;
    int numcarta;
    
    numpalo=(int)(Math.random()*4)+1;
    numcarta=(int)(Math.random()*13)+1;
    
    switch (numpalo) {
      case 1:
      palo="Picas";
      break;
      case 2:
      palo="Corazones";
      break;
      case 3:
      palo="Tréboles";
      break;
      case 4:
      palo="Diamantes";
      break;
    }
    switch (numcarta) {
      case 1:
      carta="As";
      break;
      case 11:
      carta="J";
      break;
      case 12:
      carta="Q";
      break;
      case 13:
      carta="K";
      break;
      default:
      carta=String.valueOf(numcarta);
    }
    System.out.println(carta+" de "+palo);
  }
}
