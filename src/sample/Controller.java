package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import javax.swing.text.html.ImageView;
import java.util.ArrayList;

public class Controller {

    @FXML
    Tarea tarea1, tarea2, tarea3, tarea4, tarea5, tarea6;

    @FXML
    RadioButton radiobutton1, radiobutton2, radiobutton3, radiobutton4, radiobutton5, radiobutton6;

    @FXML
    Label label1, label2, label3, label4, label5, label6;

    @FXML
    Label LabelAgregar;

    @FXML
    TextField TextfieldAgregar;


    ArrayList<Label> listadeLabel = new ArrayList();
    ArrayList<Tarea> listadeTarea = new ArrayList();
    ArrayList<RadioButton> listadeRadiobutton = new ArrayList();
    ArrayList<ImageView> listaImagenes = new ArrayList();

    @FXML
    public void initialize(){

        tarea1 = new Tarea("Hacer Práctica 2 PSP", false);
        tarea2 = new Tarea("Hacer Práctica 1 PSP", false);
        tarea3 = new Tarea("Hacer Práctica 2 DI", false);
        tarea4 = new Tarea("Hacer Práctica 1 DI", false);
        tarea5 = new Tarea("Hacer Práctica 2 PMDP", false);
        tarea6 = new Tarea("Hacer Práctica 1 PMDP", false);

        listadeLabel.add(label1);
        listadeLabel.add(label2);
        listadeLabel.add(label3);
        listadeLabel.add(label4);
        listadeLabel.add(label5);
        listadeLabel.add(label6);




        listadeRadiobutton.add(radiobutton1);
        listadeRadiobutton.add(radiobutton2);
        listadeRadiobutton.add(radiobutton3);
        listadeRadiobutton.add(radiobutton4);
        listadeRadiobutton.add(radiobutton5);
        listadeRadiobutton.add(radiobutton6);


        listadeTarea.add(tarea1);
        listadeTarea.add(tarea2);
        listadeTarea.add(tarea3);
        listadeTarea.add(tarea4);
        listadeTarea.add(tarea5);
        listadeTarea.add(tarea6);

        Binder.binderTarea(tarea1,label1, radiobutton1);
        Binder.binderTarea(tarea2,label2, radiobutton2);
        Binder.binderTarea(tarea3, label3, radiobutton3);
        Binder.binderTarea(tarea4,label4, radiobutton4);
        Binder.binderTarea(tarea5,label5, radiobutton5);
        Binder.binderTarea(tarea6,label6, radiobutton6);

    }

    @FXML
    public void RadioButton1seleccionado () {
        label1.setText("");
        Binder.binderTarea(tarea1,label1,radiobutton1);
        LabelAgregar.setDisable(false);
        activaragregartarea();

    }

    @FXML
    public void RadioButton2seleccionado () {
        label2.setText("");
        Binder.binderTarea(tarea2,label2,radiobutton2);
        LabelAgregar.setDisable(false);
        activaragregartarea();
    }

    @FXML
    public void RadioButton3seleccionado () {
        label3.setText("");
        Binder.binderTarea(tarea3,label3,radiobutton3);
        LabelAgregar.setDisable(false);
        activaragregartarea();
    }

    @FXML
    public void RadioButton4seleccionado () {
        label4.setText("");
        Binder.binderTarea(tarea4,label4,radiobutton4);
        LabelAgregar.setDisable(false);
        activaragregartarea();
    }

    @FXML
    public void RadioButton5seleccionado () {
        label5.setText("");
        Binder.binderTarea(tarea5,label5,radiobutton5);
        LabelAgregar.setDisable(false);
        activaragregartarea();
    }

    @FXML
    public void RadioButton6seleccionado () {
        label6.setText("");
        Binder.binderTarea(tarea6,label6,radiobutton6);
        LabelAgregar.setDisable(false);
        activaragregartarea();
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
    }

}
