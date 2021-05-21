package sample;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import javafx.scene.control.ToggleGroup;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.util.ArrayList;

public class ControllerPantallaPrincipal {

    @FXML
    Tarea tarea1, tarea2, tarea3, tarea4, tarea5, tarea6;

    @FXML
    RadioButton radiobutton1, radiobutton2, radiobutton3, radiobutton4, radiobutton5, radiobutton6;

    @FXML
    ImageView estrella1,estrella2,estrella3,estrella4,estrella5,estrella6;

    @FXML
    Label label1, label2, label3, label4, label5, label6;

    @FXML
    Label LabelAgregar;

    @FXML
    TextField TextfieldAgregar;

    ControllerPantallaDetalles controller2 = null;

    ArrayList<Label> listadeLabel = new ArrayList();
    ArrayList<Tarea> listadeTarea = new ArrayList();
    ArrayList<ImageView> listaImagenes = new ArrayList();

    final ToggleGroup group = new ToggleGroup();

    @FXML
    public void initialize(){

        tarea1 = new Tarea("Hacer Práctica 2 PSP", false, "tarea 1","09-03-2019", "");
        tarea2 = new Tarea("Hacer Práctica 1 PSP", false, "tarea 2", "09-03-2019", "");
        tarea3 = new Tarea("Hacer Práctica 2 DI", false, "tarea 3","09-03-2019","");
        tarea4 = new Tarea("Hacer Práctica 1 DI", false,"tarea 4","09-03-2019","");
        tarea5 = new Tarea("Hacer Práctica 2 PMDP", false,"tarea 5","09-03-2019","");
        tarea6 = new Tarea("Hacer Práctica 1 PMDP", false,"tarea 6","09-03-2019","");


        radiobutton1.setToggleGroup(group);
        radiobutton2.setToggleGroup(group);
        radiobutton3.setToggleGroup(group);
        radiobutton4.setToggleGroup(group);
        radiobutton5.setToggleGroup(group);
        radiobutton6.setToggleGroup(group);

        listadeLabel.add(label1);
        listadeLabel.add(label2);
        listadeLabel.add(label3);
        listadeLabel.add(label4);
        listadeLabel.add(label5);
        listadeLabel.add(label6);



        listadeTarea.add(tarea1);
        listadeTarea.add(tarea2);
        listadeTarea.add(tarea3);
        listadeTarea.add(tarea4);
        listadeTarea.add(tarea5);
        listadeTarea.add(tarea6);


        listaImagenes.add(estrella1);
        listaImagenes.add(estrella2);
        listaImagenes.add(estrella3);
        listaImagenes.add(estrella4);
        listaImagenes.add(estrella5);
        listaImagenes.add(estrella6);



        Binder.binderTarea(tarea1,label1,estrella1);
        Binder.binderTarea(tarea2,label2,estrella2);
        Binder.binderTarea(tarea3, label3,estrella3);
        Binder.binderTarea(tarea4,label4,estrella4);
        Binder.binderTarea(tarea5,label5,estrella5);
        Binder.binderTarea(tarea6,label6,estrella6);

    }

    @FXML
    public void RadioButton1seleccionado () {
        tarea1.texto="";
        Binder.binderTarea(tarea1,label1,estrella1);
        LabelAgregar.setDisable(false);
        activaragregartarea();

    }

    @FXML
    public void RadioButton2seleccionado () {
        tarea2.texto="";
        Binder.binderTarea(tarea2,label2,estrella2);
        LabelAgregar.setDisable(false);
        activaragregartarea();
    }

    @FXML
    public void RadioButton3seleccionado () {
        tarea3.texto="";
        Binder.binderTarea(tarea3,label3,estrella3);
        LabelAgregar.setDisable(false);
        activaragregartarea();
    }

    @FXML
    public void RadioButton4seleccionado () {
        tarea4.texto="";
        Binder.binderTarea(tarea4,label4,estrella4);
        LabelAgregar.setDisable(false);

        activaragregartarea();
    }

    @FXML
    public void RadioButton5seleccionado () {
        tarea5.texto="";
        Binder.binderTarea(tarea5,label5,estrella5);
        LabelAgregar.setDisable(false);
        activaragregartarea();
    }

    @FXML
    public void RadioButton6seleccionado () {
        tarea6.texto="";
        Binder.binderTarea(tarea6,label6,estrella6);
        LabelAgregar.setDisable(false);
        activaragregartarea();
    }

    @FXML
    public void clikcarLabel1(){
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("pantalladetalles.fxml"));
            AnchorPane root = (AnchorPane) loader.load();
            controller2 = loader.getController();
            Scene scene = new Scene(root,650,500);
            stage.setScene(scene);
            stage.show();
            controller2.recibirTarea(tarea1);

        } catch(Exception e) {

        }
    }

    @FXML
    public void clikcarLabel2(){
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("pantalladetalles.fxml"));
            AnchorPane root = (AnchorPane) loader.load();
            controller2 = loader.getController();
            Scene scene = new Scene(root,650,500);
            stage.setScene(scene);
            stage.show();
            controller2.recibirTarea(tarea2);

        } catch(Exception e) {
            e.printStackTrace();

        }
    }

    @FXML
    public void clikcarLabel3(){
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("pantalladetalles.fxml"));
            AnchorPane root = (AnchorPane) loader.load();
            controller2 = loader.getController();
            Scene scene = new Scene(root,650,500);
            stage.setScene(scene);
            stage.show();
            controller2.recibirTarea(tarea3);

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    @FXML
    public void clikcarLabel4() {
        try {
            Stage stage = new Stage();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("pantalladetalles.fxml"));
            AnchorPane root = (AnchorPane) loader.load();
            controller2 = loader.getController();
            Scene scene = new Scene(root, 650, 500);
            stage.setScene(scene);
            stage.show();
            controller2.recibirTarea(tarea4);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

        @FXML
        public void clikcarLabel5(){
            try {
                Stage stage = new Stage();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("pantalladetalles.fxml"));
                AnchorPane root = (AnchorPane) loader.load();
                controller2 = loader.getController();
                Scene scene = new Scene(root,650,500);
                stage.setScene(scene);
                stage.show();
                controller2.recibirTarea(tarea5);

            } catch(Exception e) {
                e.printStackTrace();
            }
        }


        @FXML
        public void clikcarLabel6(){
            try {
                Stage stage = new Stage();
                FXMLLoader loader = new FXMLLoader(getClass().getResource("pantalladetalles.fxml"));
                AnchorPane root = (AnchorPane) loader.load();
                controller2 = loader.getController();
                Scene scene = new Scene(root,650,500);
                stage.setScene(scene);
                stage.show();
                controller2.recibirTarea(tarea6);

            } catch(Exception e) {
                e.printStackTrace();
            }
        }

    @FXML
    public void estrella1seleccionada(){
        tarea1.esFavorito = !tarea1.esFavorito;
        Binder.binderTarea(tarea1,label1,estrella1);
    }
    @FXML
    public void estrella2seleccionada(){
        tarea2.esFavorito = !tarea2.esFavorito;
        Binder.binderTarea(tarea2,label2,estrella2);
    }

    @FXML
    public void estrella3seleccionada(){
        tarea3.esFavorito = !tarea3.esFavorito;
        Binder.binderTarea(tarea3,label3,estrella3);
    }

    @FXML
    public void estrella4seleccionada(){
        tarea4.esFavorito = !tarea4.esFavorito;
        Binder.binderTarea(tarea4,label4,estrella4);
    }
    @FXML
    public void estrella5seleccionada(){
        tarea5.esFavorito = !tarea5.esFavorito;
        Binder.binderTarea(tarea5,label5,estrella5);
    }

    @FXML
    public void estrella6seleccionada(){
        tarea6.esFavorito = !tarea6.esFavorito;
        Binder.binderTarea(tarea6,label6,estrella6);
    }

    public void activaragregartarea () {
        if (!LabelAgregar.isDisabled()) {
            TextfieldAgregar.setDisable(false);
        }
    }

    public void agregartexto () {
        for (Label l : listadeLabel) {
            if (l.getText().contentEquals("")) {
                l.setText(TextfieldAgregar.getText());
                break;
            }
        }
        TextfieldAgregar.setDisable(false);
        TextfieldAgregar.setText("");

    }

}
