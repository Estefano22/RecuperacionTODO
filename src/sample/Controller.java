package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Controller {

    //Integer i=new Integer(2);

    ArrayList<Label> lista = new ArrayList();

    @FXML
    public void initialize() {
        lista.add(texto1);
        lista.add(texto2);
        lista.add(texto3);
        lista.add(texto4);
        lista.add(texto5);
        lista.add(texto6);

    }

    @FXML
    RadioButton radiobutton1;

    @FXML
    RadioButton radiobutton2;

    @FXML
    RadioButton radiobutton3;

    @FXML
    RadioButton radiobutton4;

    @FXML
    RadioButton radiobutton5;

    @FXML
    RadioButton radiobutton6;

    @FXML
    Label texto1;

    @FXML
    Label texto2;

    @FXML
    Label texto3;

    @FXML
    Label texto4;

    @FXML
    Label texto5;

    @FXML
    Label texto6;

    @FXML
    Label labelagregar;

    @FXML
    TextField textfieldagregar;


    @FXML
    public void tarea1(){
        texto1.setText("");
        labelagregar.setDisable(false);
        activaragregartarea();
        agregartexto();


    }

    @FXML
    public void tarea2(){
        texto2.setText("");
        labelagregar.setDisable(false);
        activaragregartarea();
        agregartexto();
        texto2.setText("");

    }

    @FXML
    public void tarea3(){
        texto3.setText("");
        labelagregar.setDisable(false);
        activaragregartarea();
        agregartexto();
        texto3.setText("");

    }

    @FXML
    public void tarea4(){
        texto4.setText("");
        labelagregar.setDisable(false);
        activaragregartarea();
        agregartexto();
        texto4.setText("");

    }

    @FXML
    public void tarea5(){
        texto5.setText("");
        labelagregar.setDisable(false);
        activaragregartarea();
        agregartexto();
        texto5.setText("");

    }

    @FXML
    public void tarea6(){
        texto6.setText("");
        labelagregar.setDisable(false);
        activaragregartarea();
        agregartexto();
        texto6.setText("");


    }

public void activaragregartarea (){
        if (! labelagregar. isDisabled()){
            textfieldagregar.setDisable(false);
        }
}

public void agregartexto(){
    textfieldagregar.getText();
    for (Label l : lista) {
        if (l.getText().contentEquals("")) {
            l.setText(textfieldagregar.getText());

        }
    }


}


}
