public class ejercicio6_16 {
  public static void main(String[]args){
    
    int numran1;
    int numran2;
    int numran3;
    String forma1="";
    String forma2="";
    String forma3="";
    
    numran1=(int)(Math.random()*5)+1;
    numran2=(int)(Math.random()*5)+1;
    numran3=(int)(Math.random()*5)+1;
    
    switch (numran1){
      case 1:
      forma1="corazón";
      break;
      case 2:
      forma1="diamante";
      break;
      case 3:
      forma1="herradura";
      break;
      case 4:
      forma1="campana";
      break;
      case 5:
      forma1="limón";
      break;
    }
    switch (numran2){
      case 1:
      forma2="corazón";
      break;
      case 2:
      forma2="diamante";
      break;
      case 3:
      forma2="herradura";
      break;
      case 4:
      forma2="campana";
      break;
      case 5:
      forma2="limón";
      break;
    }
    switch (numran3){
      case 1:
      forma3="corazón";
      break;
      case 2:
      forma3="diamante";
      break;
      case 3:
      forma3="herradura";
      break;
      case 4:
      forma3="campana";
      break;
      case 5:
      forma3="limón";
      break;
    }
    
    System.out.println(forma1+" "+forma2+" "+forma3);
    if ((forma1==forma2)&&(forma2==forma3)){
      System.out.println("Enhorabuena, ha ganado 10 monedas");
    }else if((forma1!=forma2)&&(forma2!=forma3)&&(forma3!=forma1)){
      System.out.println("Lo siento, ha perdido");
    }else {
      System.out.println("Bien, ha recuperado la moneda");
    }
  }
}
      
