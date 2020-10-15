package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.text.Text;


public class Controller {
    private int p1;
    private int p2;
    private String operator="";

    private boolean start = true;

    Model model = new Model();

    @FXML
    private Text textWindow;

    @FXML
    public void pressNum(ActionEvent event){
        String value =((Button)event.getSource()).getText();
        textWindow.setText(textWindow.getText()+value);
        if (start) {
            textWindow.setText("");
            start = false;
        }
    }
    @FXML
    public void pressCE(ActionEvent event){
        textWindow.setText("");

    }
    @FXML
    public void pressOperator(ActionEvent event){
        String value = ((Button)event.getSource()).getText();
        if (!"=".equals(value)){
            if (!operator.isEmpty())return;
            p1 = Integer.parseInt(textWindow.getText());
            operator = value;
            textWindow.setText("");
        }
        if (operator.isEmpty())return;
        p2=Integer.parseInt(textWindow.getText());
        textWindow.setText(String.valueOf(model.calculate(p1,p2, operator)));
        operator="";
        start = true;

    }

}
