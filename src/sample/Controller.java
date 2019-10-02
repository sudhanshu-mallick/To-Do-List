package sample;

import javafx.scene.control.DatePicker;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class Controller {

    public DatePicker datepick;
    public TextField task;
    public TextArea alltask;

    public void buttonclicked()
    {

        alltask.appendText(""+datepick.getValue()+"\t"+task.getText()+"\n");
    }}