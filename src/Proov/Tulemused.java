package Proov;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

/**
 * Created by Annely on 1.12.2015.
 */
public class Tulemused {

    Stage lopp = new Stage();

    Tulemused() {

        Pane pane = new Pane();
        Scene lopetamine = new Scene(pane, 400, 400);
        lopp.setScene(lopetamine);
        lopp.show();
    }


}
