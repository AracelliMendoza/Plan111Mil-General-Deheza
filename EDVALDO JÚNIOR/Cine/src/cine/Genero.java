
package cine;

public class Genero {
   private Integer id;
   private String nombre;
   
   public Genero(){
   
    } 
   
    public Genero(String nombre){
    
        this.nombre=nombre;
     }
   public String getnombre(){
   
       return nombre;
    }
   
   public void setnombre(String nombre){
   
   this.nombre=nombre;   
   }
   
   public Integer getid(){
   return id;
   }
   
   public void setid(Integer id){
       this.id=id;
   }
   
   @Override
   public String toString(){
   
   return this.nombre;
   }
   
}
