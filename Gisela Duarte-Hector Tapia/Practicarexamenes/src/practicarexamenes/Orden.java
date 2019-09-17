
package practicarexamenes;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Orden {
    private List<Detalledeorden> item;
    private int id;
    private Date creacion;
    private Date envio;
    
    public Orden (int id, Date creacion){
        this.id = id;
        this.creacion= creacion;
        item = new ArrayList <>();
    }
    public void agregarItem(Detalledeorden detalle){
        item.add(detalle);
    }
    public int getNroItems(){
        return item.size();
    }
    public void setEnvio (Date envio){
        this.envio = envio;
    }
    
}
