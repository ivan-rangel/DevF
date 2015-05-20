import java.util.*;

public class Cadena{

  public  static void main(String args[]){
    String cad= "El DevF rockea";
    Cadena miCadena= new Cadena();
    miCadena.cadInversa(cad);
  }
  public void cadInversa(String cadAux){
    String cadInv="";
    int contE=0;
    for (int cont=cadAux.length()-1;cont>=0;cont--){
      cadInv=cadInv+cadAux.charAt(cont);
      if (cadAux.charAt(cont)=='e'|| cadAux.charAt(cont)=='E')
        contE++;
    }
    System.out.println(cadInv);
    System.out.println("Frecuencia de 'e' ==>"+contE);
  }
}
