package TPAGENDA;

public class Recordatorio extends Agenda {
    
    //Defini una variable del tipo string 
    protected String horaRecordatorio;
    
    public Recordatorio(String Nombre,String Descripcion,String Fecha){
        super(Nombre, Descripcion, Fecha);
    }

    public void setHoraRecordatorio(String horaRecordatorio){
        this.horaRecordatorio = horaRecordatorio;    
    }
    
    public String setHoraRecordatorio(){
        return horaRecordatorio;
    }



}

