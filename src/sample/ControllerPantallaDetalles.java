package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ControllerPantallaDetalles {

    private Tarea tareaRecibida;
    ControllerPantallaPrincipal controllerPantallaPrincipal;

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
    ImageView pasarEstrella;


@FXML
    public void recibirTarea(Tarea tarea){
        labelFechadeCreacion.setText(tarea.fechadeCreacion);
        textAreaDetalles.setText(tarea.detallesTarea);
        textfieldNombreDeLaTarea.setText(tarea.texto);
        labelFechadeUltimaModificacion.setText(tarea.fechadeUltimaModificacion);

        textoPrincipio = tarea.texto;
        detallesPrincipio = tarea.detallesTarea;
        fechaDeModificacionPrincipio = tarea.fechadeUltimaModificacion;

        tareaRecibida = new Tarea(tarea.texto, tarea.esFavorito, tarea.detallesTarea, tarea.fechadeCreacion, tarea.fechadeUltimaModificacion);
    }

    @FXML
    public void onKeyTypedDetalles(){
        actualizarFechaUltimaModificacion();
    }

    private void actualizarFechaUltimaModificacion(){
        if(textoPrincipio.contentEquals(textfieldNombreDeLaTarea.getText()) && detallesPrincipio.contentEquals(textAreaDetalles.getText())) {
            labelFechadeUltimaModificacion.setText(fechaDeModificacionPrincipio);
            tareaRecibida.fechadeUltimaModificacion = fechaDeModificacionPrincipio;
        }else{
            Long tiempoactual = System.currentTimeMillis();
            SimpleDateFormat formatodelafecha = new SimpleDateFormat("dd-MM-YYYY kk:mm");
            Date fecha = new Date(tiempoactual);
            String tiempo = formatodelafecha.format(fecha);
            labelFechadeUltimaModificacion.setText(tiempo);
            tareaRecibida.fechadeUltimaModificacion = tiempo;
        }
        pasarinfoVentanaPrincipal();
    }

    public void pasarinfoVentanaPrincipal(){ // esto seria como onclick
    controllerPantallaPrincipal.actualiazarTarea(tareaRecibida);

    }

    public void enviarController1(ControllerPantallaPrincipal controller1){
        controllerPantallaPrincipal = controller1;

    }

}