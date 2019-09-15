/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto.ropa;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author LUIS FERNANDO
 */
public class FXMLController implements Initializable {

    @FXML
    private ImageView imag_Inventario;
    @FXML
    private ImageView image_ganancia;
    @FXML
    private ImageView image_produccion;
    @FXML
    private ImageView img_cierra;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void Inventario(MouseEvent event)throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("inventario.fxml"));
                        Scene fxmlLoader_scene = new Scene(fxmlLoader);
                        Stage fxmlLoader_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        fxmlLoader_stage.hide();
                        fxmlLoader_stage.setScene(fxmlLoader_scene);
                        fxmlLoader_stage.show();
    }

    @FXML
    private void Ganancias(MouseEvent event)throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("Ganancias.fxml"));
                        Scene fxmlLoader_scene = new Scene(fxmlLoader);
                        Stage fxmlLoader_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        fxmlLoader_stage.hide();
                        fxmlLoader_stage.setScene(fxmlLoader_scene);
                        fxmlLoader_stage.show();
    }

    @FXML
    private void produccion(MouseEvent event)throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("Produccion.fxml"));
                        Scene fxmlLoader_scene = new Scene(fxmlLoader);
                        Stage fxmlLoader_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        fxmlLoader_stage.hide();
                        fxmlLoader_stage.setScene(fxmlLoader_scene);
                        fxmlLoader_stage.show();
    }

    @FXML
    private void cierra(MouseEvent event) {
        System.exit(0);
    }
    
}
