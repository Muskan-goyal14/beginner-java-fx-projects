package jsg;

import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;

public class comboboxController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private ComboBox<String> combosel;

    @FXML
    private Button btnitem;

    @FXML
    void dobtn(ActionEvent event) {
    	
    	String item=combosel.getSelectionModel().getSelectedItem();
		//String item=combosel.getEditor().getText();
		showMsg(item);
    }

    @FXML
    void docombo(ActionEvent event) {
    	int index=combosel.getSelectionModel().getSelectedIndex();
		String item=combosel.getSelectionModel().getSelectedItem();
		showMsg(item+"   "+index);
		
    }
    void showMsg(String msg)
    {
    	Alert alert=new Alert(AlertType.INFORMATION);
    	alert.setTitle("combobox");
    	alert.setContentText(msg);
    	alert.show();
    }
    @FXML
    void initialize() {
       assert combosel != null : "fx:id=\"combosel\" was not injected: check your FXML file 'combobox.fxml'.";
        assert btnitem != null : "fx:id=\"btnitem\" was not injected: check your FXML file 'combobox.fxml'.";
        
        ArrayList<String>lst=new ArrayList<String>(Arrays.asList("Java","Android","Angular","J2EE"));
		combosel.getItems().addAll(lst);

    }
}
