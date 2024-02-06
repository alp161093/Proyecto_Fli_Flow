package Controller;


	
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;

public class ProyectoController {

	    @FXML
	    private TableView<?> tablaProyectos;

	    @FXML
	    private TableColumn<?, ?> colID;

	    @FXML
	    private TableColumn<?, ?> colIdUser;

	    @FXML
	    private TableColumn<?, ?> colNombre;

	    @FXML
	    private TableColumn<?, ?> colURL;

	    @FXML
	    private TableColumn<?, ?> colFechaCreacion;

	    @FXML
	    private TableColumn<?, ?> colFechaModificacion;

	    @FXML
	    private TableColumn<?, ?> colEljecutar;

	    @FXML
	    private TableColumn<?, ?> colConsultar;

	    @FXML
	    private TableColumn<?, ?> colEliminar;

	    @FXML
	    private TextField fieldNombreProyecto;

	    @FXML
	    private TextField fieldRutaProyecto;

	    @FXML
	    void atrasOnClick(ActionEvent event) {

	    }

	    @FXML
	    void crearProyectoOnClick(ActionEvent event) {

	    }

}



