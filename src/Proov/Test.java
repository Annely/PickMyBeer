package Proov;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.ArrayList;

/**
 * Created by Annely on 24.11.2015.
 */
public class Test {
    Stage test = new Stage();
    ArrayList tulemused = new ArrayList();

    Test() {
        VBox kysimus1 = new VBox();
        Scene kysimused1 = new Scene( kysimus1, 400, 400);
        Label kyss1 = new Label("Väljas võib küll sadada lumi, kuid mis aastaaega väjendab hetkel sinu meeleolu?");
        Button kevad = new Button("Kevad");
        Button suvi = new Button("Suvi");
        Button sygis = new Button("Sügis");
        Button talv = new Button("Talv");
        kysimus1.getChildren().addAll(kyss1, kevad, suvi, sygis, talv);

        VBox kysimus2 = new VBox();
        Scene kysimused2 = new Scene(kysimus2, 400, 400);
        Label kyss2 = new Label("Mis täna plaanis?");
        Button purju = new Button("Pildituks!");
        Button chill = new Button("Hängime tüdrukutega");
        Button poisid = new Button("Chillime poistega");
        Button yksi = new Button("Kodus koos kassiga");
        kysimus2.getChildren().addAll(kyss2, purju, chill, poisid, yksi);


        test.setScene(kysimused1);
        test.show();

        kevad.setOnAction(event -> {
            tulemused.add(2);
            tulemused.add(4);
            test.setScene(kysimused2);

        });
        sygis.setOnAction(event -> {
            tulemused.add(10);
            tulemused.add(4);
            test.setScene(kysimused2);
        } );

        talv.setOnAction(event -> {
            tulemused.add(1);
            tulemused.add(5);
            test.setScene(kysimused2);
        });

       suvi.setOnAction(event -> {
           tulemused.add(6);
           tulemused.add(7);
           test.setScene(kysimused2);
       });

                     /**
                * On ArrayList, mis koosneb numbritest 1-10
                * Iga küsimuse iga vastus salvestab tulemusse teatud numbrid ArrayListist
                * Tulemus kogub endasse need arvud ja leiab kõige sagedamini esineva(d) numbri(d)
                * Järgmisel lehel tõlgitakse iga number õlleks
                *
                */


    }

}
