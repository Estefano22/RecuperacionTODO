package sample;

import java.io.File;
import javafx.scene.control.Label;
import  javafx.scene.image.Image;
import javafx.scene.image.ImageView;


public class Binder {

    private static final File estrellaColoreada = new File("src/Imagenes/estrellacoloreada.JPG");
    private static final Image estrellaAmarilla = new Image(estrellaColoreada.toURI().toString());


    private static final File estrellaNormal = new File("src/Imagenes/estrella.JPG");
    private static final Image estrella = new Image(estrellaNormal.toURI().toString());

    public static void binderTarea(Tarea tarea, Label l, ImageView estrella){

        if (tarea.esFavorito){
            estrella.setImage(estrellaAmarilla);
        } else {
            estrella.setImage(Binder.estrella);
        }
        l.setText(tarea.texto);
    }

    }

