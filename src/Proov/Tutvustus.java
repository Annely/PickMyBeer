package Proov;

import javafx.geometry.Pos;
import javafx.scene.Cursor;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.VBox;
import javafx.scene.text.*;
import javafx.scene.text.Font;
import javafx.stage.Stage;

import java.awt.*;

/**
 * Created by Annely on 23.11.2015.
 */
public class Tutvustus {
    Stage tutvustus=new Stage();


    Tutvustus() {
        String sina = logiSisse.sina;
        VBox teine= new VBox();
        Scene tereTulemast = new Scene(teine, 600, 600);
        teine.setSpacing(5);
        Image taust = new Image(getClass().getResourceAsStream("taustapilt.jpg"));
        Label pilt = new Label();
        pilt.setGraphic(new ImageView(taust));
        Label tekst = new Label("Tere, " +sina+"!");
        Label tekst2 = new Label ("Testi eesmärgiks on hinnata sinu meeleolu ja maitseeelistusi");
        Label tekst3 = new Label("ning pakkuda selle põhjal sulle sobivaima Eesti käsitööõlle");
        Label tekst4 = new Label("PS: Test ei pretendeeri absoluutsele tõele");
        tekst.setFont(Font.font("Arial", FontWeight.BOLD, 24));
        tekst2.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        tekst3.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        tekst4.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        teine.setAlignment(Pos.TOP_CENTER);
        teine.getChildren().addAll(tekst, tekst2, tekst3, tekst4, pilt);
        tutvustus.setScene(tereTulemast);
        tutvustus.show();
        pilt.setCursor(Cursor.HAND);
        pilt.setOnMouseClicked(event1 -> {
            tutvustus.close();
            new Test();
        });

    }

}
