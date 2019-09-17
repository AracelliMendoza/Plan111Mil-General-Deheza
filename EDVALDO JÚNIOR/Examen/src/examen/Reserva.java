
package examen;

import java.util.Date;


public class Reserva {
    private Date fechareserva;
    private String equipo1, equipo2, equipo3; 
    private String horarioreserva;
  
    
    public Reserva(Date fechareserva, String equipo1, String equipo2, String equipo3, String equipo4, String equipo5, String horarioreserva){
    
    this.fechareserva=fechareserva;
    this.horarioreserva=horarioreserva;
    this.equipo1=equipo1;
    this.equipo2=equipo2;
    this.equipo3=equipo3;
  
    
    }

    public Date getFechareserva() {
        return fechareserva;
    }

    public String getEquipo1() {
        return equipo1;
    }

    public String getEquipo2() {
        return equipo2;
    }

    public String getEquipo3() {
        return equipo3;
    }

 
    public String getHorarioreserva() {
        return horarioreserva;
    }

    public void setFechareserva(Date fechareserva) {
        this.fechareserva = fechareserva;
    }

    public void setEquipo1(String equipo1) {
        this.equipo1 = equipo1;
    }

    public void setEquipo2(String equipo2) {
        this.equipo2 = equipo2;
    }

    public void setEquipo3(String equipo3) {
        this.equipo3 = equipo3;
    }

 
    
}
