/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.ropa;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

/**
 *
 * @author LUIS FERNANDO
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private ProgressIndicator p_carga;
    public static int i;
    @FXML
    private Button btn_checa;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        p_carga.setProgress(0.0);
        btn_checa.setVisible(false);
        Thread th = new Thread(new rar());
        th.start();

    }

    @FXML
    private void Registro_usuarios(ActionEvent event) throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("FXML.fxml"));
                        Scene fxmlLoader_scene = new Scene(fxmlLoader);
                        Stage fxmlLoader_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        fxmlLoader_stage.hide();
                        fxmlLoader_stage.setScene(fxmlLoader_scene);
                        fxmlLoader_stage.show();
    }

    class rar implements Runnable {

        @Override
        public void run() {
            for (i = 0; i < 10; i++) {
                try {
                    p_carga.setProgress(i / 5.0);
                    Thread.sleep(190);
                    if (i == 9) {
                        btn_checa.setVisible(true);
                    }
                } catch (Exception e) {
                    System.out.println("malo chavo");

                }

            }
        }

    }
}
