
package cine;


public class Paisdeorigen {
    
    private Integer id;
    private String nombre, idioma;
    
    public Paisdeorigen(String nombre){
    
    }
    
    public String getnombre(){
    
    return nombre;
    
    }
  
    public void setnombre(String nombre){
    
    this.nombre = nombre;
    }
    
    public String getidioma(){
    
    return idioma;
    }
    
    public void setidioma(String idioma){
    
        this.idioma = idioma;
    }
    
    public Integer getid(){
    
    return id;
    }
    
    public void setid(Integer id){
    
    this.id = id;
    }
     
    @Override
    public String toString(){
    
    return this.nombre;
    
    }
        
}
