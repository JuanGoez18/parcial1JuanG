
public class VehiculosCl {
    String placacl;
    String descripcioncl;
    String nombre_conductorcl;
    String rutacl;
    String marcacl;
    String modelo;

    public VehiculosCl(String placacl, String descripcioncl, String nombre_conductorcl, String rutacl, String marcacl, String modelo) {
        this.placacl = placacl;
        this.descripcioncl = descripcioncl;
        this.nombre_conductorcl = nombre_conductorcl;
        this.rutacl = rutacl;
        this.marcacl = marcacl;
        this.modelo = modelo;
    }

    public String getPlacacl() {
        return placacl;
    }

    public String getDescripcioncl() {
        return descripcioncl;
    }

    public String getNombre_conductorcl() {
        return nombre_conductorcl;
    }

    public String getRutacl() {
        return rutacl;
    }

    public String getMarcacl() {
        return marcacl;
    }

    public String getModelo() {
        return modelo;
    }
    
    
}
