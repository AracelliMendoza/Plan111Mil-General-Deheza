/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package futbol;

import java.util.Date;

/**
 *
 * @author Capacitacion18
 */
public class Reserva {
    private Date fechaReserva;
    private Equipo equipo1, equipo2;

    public Reserva(Date fechaReserva, Equipo equipo1, Equipo equipo2) {
        this.fechaReserva = fechaReserva;
        this.equipo1 = equipo1;
        this.equipo2 = equipo2;
    }

    public void setFechaReserva(Date fechaReserva) {
        this.fechaReserva = fechaReserva;
    }

    public void setEquipo1(Equipo e1) {
        this.equipo1 = e1;
    }

    public void setEquipo2(Equipo e2) {
        this.equipo2 = e2;
    }

    public Equipo getEquipo1() {
        return equipo1;
    }

    public Equipo getEquipo2() {
        return equipo2;
    }
    
    
    
}
