package gui;

import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class ViewController {
	@FXML
	private Button btTeste;
	
	public void onBtTesteAction()
	{
		System.out.println("Click");
	}
}
