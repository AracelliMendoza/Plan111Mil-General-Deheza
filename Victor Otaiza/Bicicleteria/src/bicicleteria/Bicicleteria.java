
package bicicleteria;

import java.util.ArrayList;
import java.util.List;


public class Bicicleteria {

   private List<Bicicleta> bicicletas;
   private float ganancias;
   private Integer cantidadDeVentas;
   
   public Bicicleteria(){
       bicicletas= new ArrayList<Bicicleta>();
       
   }
   
   public Bicicleteria(List<Bicicleta> bicicletas, float ganancias, Integer cantidadDeVentas){
       this.bicicletas= bicicletas;
       this.ganancias=ganancias;
       this.cantidadDeVentas=cantidadDeVentas;
   }
   
   public List<Bicicleta> Bicicletas(){
       return bicicletas;
   }
   
   public void addBicicletas(Bicicleta nuevaBici){
       bicicletas.add(nuevaBici);
   }
   
   public float getGanancias(){
       return ganancias;
   }
   
   public void setGanancias(float ganancias){
       this.ganancias=ganancias;
   }
   
   public Integer getCantidadDeVentas(){
       return cantidadDeVentas;
   }
   
   public void setCantidadDeVentas(Integer cantidadDeVentas){
       this.cantidadDeVentas=cantidadDeVentas;
   }
   
   
    
}
