package cine;


public class Actor {
    private boolean animado;
    private String apellido;
    private String nombre;
    private Sexo sexo;
    
    //construcot por defecto
    public Actor(){
    }
    
    //este constructor incluye todos los atributos de la clas actor
    public Actor(boolean animado, String apellido, String nombre, Sexo sexo){
        this.animado=animado;
        this.apellido=apellido;
        this.nombre=nombre;
        this.sexo=sexo;
    }
    
    //A continucaion se listan todos los metodos de seteo de cada atributo de la clase.
    public boolean isAnimado(){
        return animado;
    }
    
    public void setAnimado(boolean animado){
        this.animado=animado;
    }
    
    public String getApellido(){
        return apellido;
    }
    
    public void setApellido(String apellido){
        this.apellido=apellido;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
    
    public Sexo getSexo(){
        return sexo;
    }
    
    public void setSexo(Sexo sexo){
        this.sexo=sexo;
    }
    
    @Override
    public String toString(){
        return nombre+" "+apellido;
    }
    
}
