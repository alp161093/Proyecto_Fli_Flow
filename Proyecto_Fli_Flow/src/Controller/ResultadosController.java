package Controller;

import javafx.fxml.FXML;
import javafx.scene.control.Label;

import static application.Main.CerrarVentanaAnterior;


import java.net.URL;
import java.util.ResourceBundle;


import application.Proyecto;
import javafx.event.ActionEvent;

public class ResultadosController {
	
	@FXML 
	private Label labeBugs;
	@FXML 
	private Label labelCodeSmells;
	@FXML 
	private Label labelVulnerabilidades;
	@FXML 
	private Label labelDuplicidad;
	
	public void initialize(URL url, ResourceBundle rb, Proyecto proyecto) {
		this.labeBugs.setText(proyecto.getResultados().getBugs());
		this.labeBugs.setStyle("-fx-alignment: CENTER; -fx-font-weight: bold;");
		this.labelCodeSmells.setText(proyecto.getResultados().getCodeSmells().getTotal());
		this.labelCodeSmells.setStyle("-fx-alignment: CENTER; -fx-font-weight: bold;");
		this.labelVulnerabilidades.setText(proyecto.getResultados().getVulnerabilidad());
		this.labelVulnerabilidades.setStyle("-fx-alignment: CENTER; -fx-font-weight: bold;");
		this.labelDuplicidad.setText(proyecto.getResultados().getDuplicidad());
		this.labelDuplicidad.setStyle("-fx-alignment: CENTER; -fx-font-weight: bold;");
	}
	// Event Listener on Button.onAction
	@FXML
	public void atrasOnClick(ActionEvent event) {
		CerrarVentanaAnterior(event); 
	}
}
