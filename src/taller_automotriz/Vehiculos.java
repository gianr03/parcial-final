
package taller_automotriz;

public class Vehiculos {
    
    private String id;
    private String marca;
    private String placa;
    private String Daño;
    private String valorarreglo;

    public Vehiculos(String id, String marca, String placa, String Daño, String valorarreglo) {
        this.id = id;
        this.marca = marca;
        this.placa = placa;
        this.Daño = Daño;
        this.valorarreglo = valorarreglo;
    }
    
    
    

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getDaño() {
        return Daño;
    }

    public void setDaño(String Daño) {
        this.Daño = Daño;
    }

    public String getValorarreglo() {
        return valorarreglo;
    }

    public void setValorarreglo(String valorarreglo) {
        this.valorarreglo = valorarreglo;
    }
    
    
    
    
    
    
   
}
