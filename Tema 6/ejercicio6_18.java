public class ejercicio6_18 {
  public static void main(String[]args) {
    
    int dado1;
    int dado2;
    int dado3;
    String color1="";
    String color2="";
    String color3="";
    
    do {
    
      dado1=(int)(Math.random()*6)+1;
      dado2=(int)(Math.random()*6)+1;
      dado3=(int)(Math.random()*6)+1;
      
    }while((dado1==dado2)||(dado2==dado3)||(dado3==dado1));
    
    switch(dado1){
      case 1:
      color1="Rojo";
      break;
      case 2:
      color1="Azul";
      break;
      case 3:
      color1="Verde";
      break;
      case 4:
      color1="Amarillo";
      break;
      case 5:
      color1="Violeta";
      break;
      case 6:
      color1="Naranja";
      break;
    }
    switch(dado2){
      case 1:
      color2="Rojo";
      break;
      case 2:
      color2="Azul";
      break;
      case 3:
      color2="Verde";
      break;
      case 4:
      color2="Amarillo";
      break;
      case 5:
      color2="Violeta";
      break;
      case 6:
      color2="Naranja";
      break;
    }
    switch(dado3){
      case 1:
      color3="Rojo";
      break;
      case 2:
      color3="Azul";
      break;
      case 3:
      color3="Verde";
      break;
      case 4:
      color3="Amarillo";
      break;
      case 5:
      color3="Violeta";
      break;
      case 6:
      color3="Naranja";
      break;
    }
    System.out.println("Los colores que han elegido son: "+color1+" "+color2+" "+color3);
  }
}
    
