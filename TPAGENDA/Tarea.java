package TPAGENDA;

import javax.sound.midi.Synthesizer;
import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class Tarea extends Agenda{

    JCheckBox chequear, chequear2;

    public Tarea(String nombre, String descripcion, String fecha, long ID){
        super(nombre, descripcion, fecha, ID);

       
    }

    public void iniciarCheck(){

        chequear = new JCheckBox();
        chequear.setText("tarea Realizada");
        chequear.setBounds(20, 30, 120, 40);

        chequear2 = new JCheckBox();
        chequear2.setText("tarea faltante");
        chequear2.setBounds(20, 60, 120, 40);

        //add(chequear);
        //add(chequear2);
    }

}
