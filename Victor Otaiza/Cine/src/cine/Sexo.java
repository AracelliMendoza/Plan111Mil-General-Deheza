package cine;


public class Sexo {
    private String nombre;
    
    public Sexo(){
    }
    
    public Sexo(String nombre){
        this.nombre=nombre;
    }
    
    //metodo Get - retorna un atributo del objeto
    public String getNombre(){
        return nombre;
    }
    
    //metodo set - asigana un valor a un atributo
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
}
