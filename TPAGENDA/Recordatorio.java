package TPAGENDA;

public class Recordatorio extends Agenda {

    //Defini una variable del tipo string 
    protected String hora;
    
    
    public void set_Hora(String hora){
        this.hora = hora;    
    }
    
    public String get_Hora(){
        return hora;
    }

}

