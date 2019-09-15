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
public class ProduccionController implements Initializable {

    @FXML
    private ImageView img_regresa;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void regresa(MouseEvent event)throws IOException {
        Parent fxmlLoader = FXMLLoader.load(getClass().getResource("FXML.fxml"));
                        Scene fxmlLoader_scene = new Scene(fxmlLoader);
                        Stage fxmlLoader_stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
                        fxmlLoader_stage.hide();
                        fxmlLoader_stage.setScene(fxmlLoader_scene);
                        fxmlLoader_stage.show();
    }
    
}
