package sample;

import java.io.File;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import  javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Binder {

    private static File Estrellacoloreada = new File("src/Imagenes/estrellacoloreada.JPG");
    private static Image EstrellaAmarilla = new Image(Estrellacoloreada.toURI().toString());


    private static File Estrellanormal = new File("src/Imagenes/estrella.JPG");
    private static Image Estrella = new Image(Estrellanormal.toURI().toString());

    public static void binderTarea(Tarea tarea, Label l, RadioButton radioButton, ImageView estrella){

        if (tarea.esFavorito){
            estrella.setImage(EstrellaAmarilla);
        } else {
            estrella.setImage(Estrella);
        }
        l.setText(tarea.texto);
    }

    }

