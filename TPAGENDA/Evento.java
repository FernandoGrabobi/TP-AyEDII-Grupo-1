package TPAGENDA;

public class Evento extends Agenda {

    protected String horaInicio, horaFin;
    protected String lugarDelEvento;


    ///Constructor

    Evento (String nombre, String descripcion, String fecha, String horaInicio, String horaFin, String lugarDelEvento){
        super(nombre,descripcion,fecha);
        this.horaInicio = horaInicio;
        this.horaFin = horaFin;
        this.lugarDelEvento = lugarDelEvento;
    }    
}
