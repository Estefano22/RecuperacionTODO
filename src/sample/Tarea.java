package sample;

public class Tarea {
    public boolean esFavorito;
    public String texto;
    public String detallesTarea;
    public String fechadeCreacion;
    public String fechadeUltimaModificacion;

    public Tarea (String texto, boolean esFavorito, String detallesTarea,  String fechadeCreacion, String fechadeUltimaModificacion){
        this.texto = texto;
        this.esFavorito = esFavorito;
        this.detallesTarea = detallesTarea;
        this.fechadeCreacion = fechadeCreacion;
        this.fechadeUltimaModificacion = fechadeUltimaModificacion;
    }
}
