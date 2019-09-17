
package Bicicleteria;


public class Bicicleta {
    
    private String numerodeserie;
    private String modelo;
    private int ano;
    private float precio;
    
public Bicicleta(String numerodeserie, String modelo, int ano, float precio){

    this.numerodeserie=numerodeserie;
    this.modelo=modelo;
    this.ano=ano;
    this.precio=precio;
     
}

    public String getNumerodeserie() {
        return numerodeserie;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAno() {
        return ano;
    }

    public float getPrecio() {
        return precio;
    }

    public void setNumerodeserie(String numerodeserie) {
        this.numerodeserie = numerodeserie;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }
    
 
    
}
