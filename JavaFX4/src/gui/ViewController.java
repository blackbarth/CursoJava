package gui;

import gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;

public class ViewController {
	@FXML
	private Button btnSomar;

	@FXML
	private TextField txtPrimeiroNumero;
	@FXML
	private TextField txtSegundoNumero;
	@FXML
	private Label lblResultado;

	@FXML
	public void onBtnSomarAction() {
		try {
			double numero1 = Double.parseDouble(txtPrimeiroNumero.getText());
			double numero2 = Double.parseDouble(txtSegundoNumero.getText());
			double soma = numero1 + numero2;
			lblResultado.setText(String.format("%.2f", soma));
		} catch (NumberFormatException e) {
			Alerts.showAlert("ERRO", null, e.getMessage(), AlertType.ERROR);
		}

	}
}
