public class ejercicio6_3 {
  public static void main(String[]args) {
    
    String carta="";
    String palo="";
    int numcarta;
    int numpalo;
    
    numcarta=(int)(Math.random()*10)+1;
    numpalo=(int)(Math.random()*4)+1;
    
    switch(numcarta){
      case 1:
      carta="As";
      break;
      case 8:
      carta="Sota";
      break;
      case 9:
      carta="Caballo";
      break;
      case 10:
      carta="Rey";
      break;
      default:
      carta=String.valueOf(numcarta);
    }
    
    switch(numpalo){
      case 1:
      palo="Oro";
      break;
      case 2:
      palo="Copa";
      break;
      case 3:
      palo="Espada";
      break;
      case 4:
      palo="Basto";
      break;
    }
    
    System.out.println(carta+" de "+palo);
  }
}
