package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.TableCell;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.util.Callback;

import static application.Main.CerrarVentanaAnterior;
import static application.Main.EliminarUsuario;

import java.net.URL;
import java.util.ResourceBundle;

import application.Main;
import application.Usuario;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;

public class ResultadosController {

	public void initialize(URL url, ResourceBundle rb) {
		
	}
	// Event Listener on Button.onAction
	@FXML
	public void atrasOnClick(ActionEvent event) {
		CerrarVentanaAnterior(event); 
	}
}
