package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Controller {



    ArrayList<Label> lista = new ArrayList();

    @FXML
    public void initialize() {
        lista.add(label1);
        lista.add(label2);
        lista.add(label3);
        lista.add(label4);
        lista.add(label5);
        lista.add(label6);

    }

    @FXML
    RadioButton radiobutton1, radiobutton2, radiobutton3, radiobutton4, radiobutton5, radiobutton6;



    @FXML
    Label label1,label2, label3, label4, label5, label6;


    @FXML
    Label LabelAgregar;

    @FXML
    TextField TextfieldAgregar;


    @FXML
    public void RadioButton1seleccionado(){
        label1.setText("");
        LabelAgregar.setDisable(false);
        activaragregartarea();

    }

    @FXML
    public void RadioButton2seleccionado(){
        label2.setText("");
        LabelAgregar.setDisable(false);
        activaragregartarea();
    }

    @FXML
    public void RadioButton3seleccionado(){
        label3.setText("");
        LabelAgregar.setDisable(false);
        activaragregartarea();
    }

    @FXML
    public void RadioButton4seleccionado(){
        label4.setText("");
        LabelAgregar.setDisable(false);
        activaragregartarea();
    }

    @FXML
    public void RadioButton5seleccionado(){
        label5.setText("");
        LabelAgregar.setDisable(false);
        activaragregartarea();
    }

    @FXML
    public void RadioButton6seleccionado(){
        label6.setText("");
        LabelAgregar.setDisable(false);
        activaragregartarea();
    }

    public void activaragregartarea (){
        if (! LabelAgregar. isDisabled()){
            TextfieldAgregar.setDisable(false);
        }
    }

    public void agregartexto(){
        for (Label l : lista) {
            if (l.getText().contentEquals("")) {
                l.setText(TextfieldAgregar.getText());
                break;
            }


        }

    }


}