package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import java.util.ArrayList;

public class Controller {

    //Integer i=new Integer(2);

    ArrayList<String> lista = new ArrayList();


    @FXML
    public void initialize() {
        lista.add("Hacer Práctica 2 PSP");
        lista.add("Hacer Práctica 1 PSP");
        lista.add("Hacer Práctica 2 DI");
        lista.add("Hacer Práctica 1 DI");
        lista.add("Hacer Práctica 2 PMDP");
        lista.add("Hacer Práctica 1 PMDP");

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

public void tarea1(){
    texto1.setText("");

    }

    public void tarea2(){
        texto2.setText("");
    }

    public void tarea3(){
        texto3.setText("");
    }

    public void tarea4(){
        texto4.setText("");
    }

    public void tarea5(){
        texto5.setText("");
    }
    public void tarea6(){
        texto6.setText("");
    }





}
