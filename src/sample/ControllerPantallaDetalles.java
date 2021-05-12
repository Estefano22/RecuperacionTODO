package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ControllerPantallaDetalles {

    @FXML
    public void initialize(){
    }

    Tarea tareaAux;

    @FXML
    TextField textfieldnombredelatarea;

    @FXML
    TextArea TextAreaDetalles;

    @FXML
    Label labelFechadeCreacion, labelFechadeUltimaModificacion;

    String textoOriginal, nombreOriginal;

    @FXML
    public void recibirTarea(Tarea tarea){

        tareaAux = new Tarea(tarea.texto,tarea.esFavorito,tarea.detallesTarea,tarea.fechadeCreacion,tarea.fechadeUltimaModificacion);


        textfieldnombredelatarea.setText(tarea.texto);
        labelFechadeCreacion.setText(tarea.fechadeCreacion);

        textoOriginal=TextAreaDetalles.getText();
        nombreOriginal=textfieldnombredelatarea.getText();
    }

    @FXML
    public void modificarDetalles(){

        Long tiempoReal = System.currentTimeMillis();
        SimpleDateFormat formatodeFecha = new SimpleDateFormat("dd-MM-YYYY kk:mm");
        Date fecha = new Date(tiempoReal);
        String tiempo = formatodeFecha.format(fecha);

        labelFechadeUltimaModificacion.setText(""+tiempo);
        labelFechadeUltimaModificacion.setVisible(!TextAreaDetalles.getText().equals(textoOriginal));
    }

    public void cambiarNombredelaTarea(){

        Long tiempoReal = System.currentTimeMillis();
        SimpleDateFormat formatodeFecha = new SimpleDateFormat("dd-MM-YYYY kk:mm");
        Date fecha = new Date(tiempoReal);
        String tiempo = formatodeFecha.format(fecha);

        labelFechadeUltimaModificacion.setText(""+tiempo);
        labelFechadeUltimaModificacion.setVisible(!textfieldnombredelatarea.getText().equals(nombreOriginal));
    }


}
