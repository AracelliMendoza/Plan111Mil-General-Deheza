
package cine;


public class Actor {
    
    private boolean animado;
    private String apellido;
    private String nombre;
    private Sexo sexo;
    
    //Constructor por defecto
    
    public Actor(){
    
    }
    
    //Este constructor incluye todos los atributos de la clase Actor
    public Actor(boolean animado,String apellido, String nombre, Sexo sexo ) {
    
       this.animado = animado;
       this.apellido = apellido;
       this.nombre = nombre;
       this.sexo = sexo;
    }
    
//A continuaciòn se listan todos los mètodos de seteo de cada atributo de la clase
    
    public boolean isnamiado(){
    
    return animado;
    }
    
    public void setanimado(boolean animado){
    
        this.animado = animado;
        
    }
    public String getapellido(){
        
        return apellido;
    }
        
    public void setapellido(String apellido){
    
        this.apellido = apellido;
        }
        
     public String getnombre(){
    
    return nombre;
}
    public void setnombre(String nombre){
    
        this.nombre = nombre;
    }
    
    public Sexo setsexo (){
    
        return sexo;
              
    }
    
    public void setsexo(Sexo sexo){
    
    this.sexo = sexo;    
    }
    
    //@Override sirve para suscribir un atributo
    
   @Override
   public String toString(){
   
       return nombre + " " + apellido;
   
   }
    
}
