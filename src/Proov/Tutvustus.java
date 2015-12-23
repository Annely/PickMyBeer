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
        Label tekst = new Label("Tere Sina!");
        Label tekst2 = new Label ("Testi eesmärgiks on hinnata sinu meeleolu ja maitseeelistusi");
        Label tekst3 = new Label("ning pakkuda selle põhjal sulle sobivaima Eesti käsitööõlle");
        Label tekst4 = new Label("PS: Test ei pretendeeri absoluutsele tõele");
        teine.setAlignment(Pos.TOP_CENTER);
        Button alusta = new Button("Alusta testiga!");
        alusta.setAlignment(Pos.CENTER);
        teine.getChildren().addAll(tekst, tekst2, tekst3, alusta, tekst4);
        tutvustus.setScene(tereTulemast);
        tutvustus.show();

        alusta.setOnAction(event -> {
                    tutvustus.close();
                    new Test();
                }
        );




    }

}
