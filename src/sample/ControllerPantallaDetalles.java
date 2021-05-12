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

    String textoprincipio, nombreprincipio;

    @FXML
    public void recibirTarea(Tarea tarea){

        tareaAux = new Tarea(tarea.texto,tarea.esFavorito,tarea.detallesTarea,tarea.fechadeCreacion,tarea.fechadeUltimaModificacion);

        labelFechadeCreacion.setText(tarea.fechadeCreacion);
        textfieldnombredelatarea.setText(tarea.texto);

        textoprincipio =TextAreaDetalles.getText();
        nombreprincipio =textfieldnombredelatarea.getText();
    }

    @FXML
    public void modificarDetalles(){

        Long tiempoactual = System.currentTimeMillis();
        SimpleDateFormat formatodelafecha = new SimpleDateFormat("dd-MM-YYYY kk:mm");
        Date fecha = new Date(tiempoactual);
        String tiempo = formatodelafecha.format(fecha);

        labelFechadeUltimaModificacion.setText(""+tiempo);
        labelFechadeUltimaModificacion.setVisible(TextAreaDetalles.getText().equals(textoprincipio));
    }

    public void cambiarNombredelaTarea(){

        Long tiempoReal = System.currentTimeMillis();
        SimpleDateFormat formatodeFecha = new SimpleDateFormat("dd-MM-YYYY kk:mm");
        Date fecha = new Date(tiempoReal);
        String tiempo = formatodeFecha.format(fecha);

        labelFechadeUltimaModificacion.setText(""+tiempo);
        labelFechadeUltimaModificacion.setVisible(textfieldnombredelatarea.getText().equals(nombreprincipio));
    }


}
