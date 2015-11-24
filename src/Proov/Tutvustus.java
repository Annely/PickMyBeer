package Proov;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Annely on 23.11.2015.
 */
public class Tutvustus {
    Stage tutvustus=new Stage();

    Tutvustus() {
        VBox teine= new VBox();
        Scene tereTulemast = new Scene(teine, 400, 400);
        //tahan siin kasutada kasutajanime BUT DON*T KNOW HOW
        //Ja üldse tuleb siia rohkem teksti ja näeb parem välja
        Label tekst = new Label("Loodetavasti oled valmis");
        tekst.setAlignment(Pos.TOP_CENTER);
        Button alusta = new Button("Alusta testiga!");
        alusta.setAlignment(Pos.CENTER);
        teine.getChildren().addAll(tekst, alusta);
        tutvustus.setScene(tereTulemast);
        tutvustus.show();




    }

}
