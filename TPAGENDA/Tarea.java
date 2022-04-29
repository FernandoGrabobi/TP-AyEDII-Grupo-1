package TPAGENDA;
public class Tarea extends Agenda{

    boolean check;    

    public Tarea(String nombre, String descripcion, String fecha, long ID, boolean check){
        super(nombre, descripcion, fecha, ID);
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.ID = ID;
        this.check = check;
       
    } 

}
