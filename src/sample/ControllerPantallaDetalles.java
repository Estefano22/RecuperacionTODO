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



    @FXML
    TextField textfieldNombreDeLaTarea;

    @FXML
    TextArea textAreaDetalles;

    @FXML
    Label labelFechadeCreacion, labelFechadeUltimaModificacion;

    String textoPrincipio, detallesPrincipio, fechaDeModificacionPrincipio;

@FXML
    public void recibirTarea(Tarea tarea){
        labelFechadeCreacion.setText(tarea.fechadeCreacion);
        textAreaDetalles.setText(tarea.detallesTarea);
        textfieldNombreDeLaTarea.setText(tarea.texto);
        labelFechadeUltimaModificacion.setText(tarea.fechadeUltimaModificacion);

        textoPrincipio = tarea.texto;
        detallesPrincipio = tarea.detallesTarea;
        fechaDeModificacionPrincipio = tarea.fechadeUltimaModificacion;
    }

    @FXML
    public void onKeyTypedDetalles(){
        actualizarFechaUltimaModificacion();
    }

    private void actualizarFechaUltimaModificacion(){

        // PASO 1 - Comprobar si tengo que actualizar la fecha o no.
        if(textoPrincipio.contentEquals(textfieldNombreDeLaTarea.getText()) && detallesPrincipio.contentEquals(textAreaDetalles.getText())) {
            labelFechadeUltimaModificacion.setText(fechaDeModificacionPrincipio);

        }else{
            Long tiempoactual = System.currentTimeMillis();
            SimpleDateFormat formatodelafecha = new SimpleDateFormat("dd-MM-YYYY kk:mm");
            Date fecha = new Date(tiempoactual);
            String tiempo = formatodelafecha.format(fecha);

            labelFechadeUltimaModificacion.setText(tiempo);
        }
        // Si lo tengo modificar -> poner la fecha nueva
        // Sino tendré que mostrar la

    }

}
