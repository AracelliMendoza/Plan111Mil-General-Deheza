
package cine;

import java.util.Calendar;
import java.util.Date;


public class Horariofuncion {
    
    private int diadesemana;
    private int duracionintervalo;
    private int duracionpublicidad;
    private boolean estrasnoche;
    private Date horaprimerafuncion;
    private Date horaultimafuncion;
    
    public Horariofuncion(int diadesemana, int duracionintervalo, int duracionpublicidad, boolean estrasnoche, Date horaprimerafuncion, Date horaultimafuncion){
    this.diadesemana = diadesemana;
    this.duracionintervalo = duracionintervalo;
    this.duracionpublicidad = duracionpublicidad;
    this.estrasnoche = estrasnoche;
    this.horaprimerafuncion = horaprimerafuncion;
    this.horaultimafuncion=horaultimafuncion ;
        
    }
    
    public String obtenerdescripciondia(){
    String dia;
    switch(this.diadesemana){
    
        case Calendar.MONDAY:
            dia = "Lunes";
            break;
            
        case Calendar.TUESDAY:
            dia ="Martes";
            break;
                  
        case Calendar.WEDNESDAY:
            dia ="Miércoles";
            break;
        case Calendar.THURSDAY:
            dia = "Jueves";
            break;
        case Calendar.FRIDAY:
            dia = "Viernes";
            break;
        
        case Calendar.SATURDAY:
            dia = "Sábado";
            break;
            
            case Calendar.SUNDAY:
            dia = "Domingo";
            break;
            
        default:
            dia = "NO ES UN DÍA"; 
    
    } 
     return dia;
    
}
    public int getdiadesemana(){
    
    return diadesemana;
    
    }
            
      public void setdiadesemana(int diadeseamna){
      
      this.diadesemana = diadesemana;
      }

public int getduracionintervalo(){

return duracionintervalo;

}

public void setduracionintervalo(int duracionintervalo){

this.duracionintervalo=duracionintervalo;
}
     
public int getduracionpublicidad(){

return duracionpublicidad;
}
            
public void setduracionpublicidad(int duracionpublicidad){

this.duracionpublicidad=duracionpublicidad;
}

public boolean getestrasnoche(){

return estrasnoche;
}


public void setestrasnoche(boolean estrasnoche){

this.estrasnoche=estrasnoche;
}
    
public Date gethoraprimerafuncion(){

return horaprimerafuncion;
}

public void sethoraprimerafuncion(Date horaprimerafuncion){

this.horaprimerafuncion=horaprimerafuncion;
}
   public Date gethoraultimafuncion(){
   
   return horaultimafuncion;
   }

   public void sethoraultimafuncion(Date horaultimafuncion){
   
   this.horaultimafuncion=horaultimafuncion;
   }
   
   @Override
   public String toString(){
   
   StringBuilder sb = new StringBuilder();
       sb.append("Los horarios para el dia: ").append(obtenerdescripciondia()).append("son");
       sb.append("Duración del intervalo: ").append(duracionintervalo).append("\n");
       sb.append("Duracion de la publicidad").append(duracionpublicidad).append("\n");
       sb.append("Acepta Trasnoche; ").append(estrasnoche).append("\n");
       sb.append("Horario Primeira función: ").append(horaprimerafuncion).append("\n");
       sb.append("Horario última Función: ").append(horaultimafuncion).append("\n");
       return sb.toString();
   }
 
   
}