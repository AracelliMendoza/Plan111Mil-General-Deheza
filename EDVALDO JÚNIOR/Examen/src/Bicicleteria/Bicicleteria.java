
package Bicicleteria;

import java.util.ArrayList;
import java.util.List;



public class Bicicleteria {
    
    private List <Bicicleta> bicicletas;
    private float ganancia;
    private Integer cantidaddeventas;
    
    public Bicicleteria(){
    
    bicicletas = new ArrayList<Bicicleta>();
    cantidaddeventas = 0;
    ganancia = 0;
    }

    //método para agregar una bicicicleta
    public void addbicicleta(Bicicleta bicicleta){
        
        this.bicicletas.add(bicicleta);
    
    }
    
    public void removerbicicleta(Bicicleta bicicleta){
    
        bicicletas.remove(bicicleta);
        cantidaddeventas=0;
        ganancia = ganancia + bicicleta.getPrecio();
   }
        
    public Bicicleta buscarbicicleta(String nrodeserie){
  
    for (Bicicleta bici : bicicletas){
        if(bici.getNumerodeserie().equals(nrodeserie))
            return bici;
        
    }
    return null;
  }
    
}


