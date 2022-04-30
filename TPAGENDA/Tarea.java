package TPAGENDA;
public class Tarea extends Agenda{

    boolean check;    

    public Tarea(String nombre, String descripcion, String fecha){
        super(nombre, descripcion, fecha);
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
    }

    public void setCheck(boolean check) {
        this.check = check;
    } 

}
