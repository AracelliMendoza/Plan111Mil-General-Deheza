
package cine;


public class PaisDeOrigen {
    private Integer id;
    private String idioma;
    private String nombre;
    
    public PaisDeOrigen(){
    }
    
    public PaisDeOrigen(String idioma,String nombre){
        this.idioma=idioma;
        this.nombre=nombre;
    }

    public String getIdidioma(){
        return idioma;    
    }
    public void setIdidioma(String idioma){
        this.idioma=idioma;
    }
    public String getNombre(){
        return nombre;    
    }
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    public Integer getId(){
        return id;
    }
    public void setId(Integer id){
        this.id=id;
    }
    @Override
    public String toString(){
        return this.nombre;
    }
    
}
