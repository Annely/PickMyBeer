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
    static ArrayList<Integer> tulemused = new ArrayList<>();
    Stage test = new Stage();


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

        VBox kysimus3 = new VBox();
        Scene kysimused3 = new Scene(kysimus3, 400, 400);
        Label kyss3 = new Label("Millist neist eelistad?");
        Button vein = new Button("Valge poolkuiv vein");
        Button kokteilid = new Button("Värvilised kokteilid");
        Button olu = new Button("Ainult õlu, aitäh");
        Button viski = new Button("Viski");
        kysimus3.getChildren().addAll(kyss3, vein, kokteilid, olu, viski);

        VBox kysimus4 = new VBox();
        Scene kysimused4 = new Scene(kysimus4, 400, 400);
        Label kyss4 = new Label("Mis tuju sul hetkel on?");
        Button roomus = new Button("Väga hea");
        Button kehv = new Button("Kehvapoolne");
        Button neutraalne = new Button("Meh.. ");
        Button kuri = new Button("Kuri");
        kysimus4.getChildren().addAll(kyss4, roomus, kehv, neutraalne, kuri);

        VBox kysimus5 = new VBox();
        Scene kysimused5 = new Scene(kysimus5, 400, 400);
        Label kyss5 = new Label("Mille järgi isutab?");
        Button puuvili = new Button("Puuviljasalat");
        Button leivad = new Button("Küüslauguleivad");
        Button sushi = new Button("Sushi");
        Button kook = new Button("Shokolaadikook");
        kysimus5.getChildren().addAll(kyss5, puuvili, leivad, sushi, kook);

        VBox kysimus6 = new VBox();
        Scene kysimused6 = new Scene(kysimus6, 400, 400);
        Label kyss6 = new Label("Mille järgi isutab?");
        Button liis = new Button("Liis Lemsalu");
        Button edgar = new Button("Edgar Savisaar");
        Button andrus = new Button("Andrus Veerpalu");
        Button anu = new Button("Anu Saagim");
        kysimus6.getChildren().addAll(kyss6, liis, edgar, andrus, anu);


        test.setScene(kysimused1);
        test.show();

        //ESIMENE KÜSIMUS

        kevad.setOnAction(event -> {
            tulemused.add(2);
            tulemused.add(9);
            tulemused.add(10);
            test.setScene(kysimused2);

        });
        sygis.setOnAction(event -> {
            tulemused.add(6);
            tulemused.add(5);
            test.setScene(kysimused2);
        } );

        talv.setOnAction(event -> {
            tulemused.add(4);
            tulemused.add(7);
            test.setScene(kysimused2);
        });

       suvi.setOnAction(event -> {
           tulemused.add(1);
           tulemused.add(6);
           tulemused.add(8);
           tulemused.add(3);
           test.setScene(kysimused3);
       });

        //TEINE KÜSIMUS

        purju.setOnAction(event -> {
            tulemused.add(2);
            tulemused.add(4);
            tulemused.add(5);
            tulemused.add(6);
            tulemused.add(7);
            test.setScene(kysimused3);

        });
        chill.setOnAction(event -> {
            tulemused.add(2);
            tulemused.add(9);
            tulemused.add(8);
            tulemused.add(10);
            test.setScene(kysimused3);
        } );

        poisid.setOnAction(event -> {
            tulemused.add(6);
            tulemused.add(5);
            test.setScene(kysimused3);
        });

        yksi.setOnAction(event -> {
            tulemused.add(1);
            tulemused.add(9);
            tulemused.add(8);
            tulemused.add(3);
            test.setScene(kysimused3);
        });

        // KOLMAS KÜSIMUS

        vein.setOnAction(event -> {
            tulemused.add(1);
            tulemused.add(3);
            tulemused.add(8);
            test.setScene(kysimused4);

        });
        kokteilid.setOnAction(event -> {
            tulemused.add(2);
            tulemused.add(9);
            tulemused.add(8);
            tulemused.add(10);
            test.setScene(kysimused4);
        });

        olu.setOnAction(event -> {
            tulemused.add(6);
            tulemused.add(5);
            tulemused.add(4);
            tulemused.add(7);
            test.setScene(kysimused4);
        });

        viski.setOnAction(event -> {
            tulemused.add(4);
            tulemused.add(7);

            test.setScene(kysimused4);
        });

        //NELJAS KÜSIMUS
        roomus.setOnAction(event -> {
            tulemused.add(2);
            tulemused.add(9);
            tulemused.add(8);
            tulemused.add(10);
            test.setScene(kysimused5);

        });
        kehv.setOnAction(event -> {
            tulemused.add(4);
            tulemused.add(7);
            test.setScene(kysimused5);
        });

        neutraalne.setOnAction(event -> {
            tulemused.add(6);
            tulemused.add(5);
            tulemused.add(1);
            tulemused.add(3);
            test.setScene(kysimused5);
        });

        kuri.setOnAction(event -> {
            tulemused.add(4);
            tulemused.add(7);
            tulemused.add(8);

            test.setScene(kysimused5);
        });

        //VIIES KÜSIMUS
        puuvili.setOnAction(event -> {
            tulemused.add(2);
            tulemused.add(9);
            tulemused.add(10);
            test.setScene(kysimused6);


        });
        sushi.setOnAction(event -> {
            tulemused.add(1);
            tulemused.add(3);
            tulemused.add(8);
            test.setScene(kysimused6);
        });

        leivad.setOnAction(event -> {
            tulemused.add(4);
            tulemused.add(5);
            tulemused.add(6);
            test.setScene(kysimused6);
        });

        kook.setOnAction(event -> {
            tulemused.add(4);
            tulemused.add(7);
            test.setScene(kysimused6);
        });

        //KUUES KÜSIMUS
        liis.setOnAction(event -> {
            tulemused.add(8);
            tulemused.add(6);
            tulemused.add(9);
            System.out.println(tulemused);
            test.close();
            new Tulemused();


        });
        edgar.setOnAction(event -> {
            tulemused.add(4);
            tulemused.add(5);
            tulemused.add(6);
            tulemused.add(7);
            System.out.println(tulemused);
            test.close();
            new Tulemused();
        });

        andrus.setOnAction(event -> {
            tulemused.add(1);
            tulemused.add(2);
            tulemused.add(3);
            tulemused.add(10);
            System.out.println(tulemused);
            test.close();
            new Tulemused();
        });

        anu.setOnAction(event -> {
            tulemused.add(4);
            tulemused.add(7);
            tulemused.add(8);
            System.out.println(tulemused);
            test.close();
            new Tulemused();



                     /**
                * On ArrayList, mis koosneb numbritest 1-10
                * Iga küsimuse iga vastus salvestab tulemusse teatud numbrid ArrayListist
                * Tulemus kogub endasse need arvud ja leiab kõige sagedamini esineva(d) numbri(d)
                * Järgmisel lehel tõlgitakse iga number õlleks
                *
                */


    });

}
}
