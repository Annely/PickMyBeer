package Proov;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
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
        Scene kysimused1 = new Scene( kysimus1, 600, 300);
        kysimus1.setPrefWidth(150);
        Label kyss1 = new Label("Väljas võib küll sadada lumi, kuid mis aastaaega väjendab hetkel sinu meeleolu?");
        kyss1.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        kysimus1.setSpacing(5);
        kysimus1.setAlignment(Pos.CENTER);
        Button kevad = new Button("Kevad");
        Button suvi = new Button("Suvi");
        Button sygis = new Button("Sügis");
        Button talv = new Button("Talv");
        kevad.setMinWidth(kysimus1.getPrefWidth());
        suvi.setMinWidth(kysimus1.getPrefWidth());
        sygis.setMinWidth(kysimus1.getPrefWidth());
        talv.setMinWidth(kysimus1.getPrefWidth());
        kysimus1.getChildren().addAll(kyss1, kevad, suvi, sygis, talv);

        VBox kysimus2 = new VBox();
        Scene kysimused2 = new Scene(kysimus2, 600, 300);
        kysimus2.setPrefWidth(150);
        Label kyss2 = new Label("Mis täna plaanis?");
        kyss2.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        kysimus2.setSpacing(5);
        kysimus2.setAlignment(Pos.CENTER);
        Button purju = new Button("Pildituks!");
        Button chill = new Button("Tüdrukutega");
        Button poisid = new Button("Kuttidega");
        Button yksi = new Button("Kodus koos kassiga");
        purju.setMinWidth(kysimus2.getPrefWidth());
        chill.setMinWidth(kysimus2.getPrefWidth());
        poisid.setMinWidth(kysimus2.getPrefWidth());
        yksi.setMinWidth(kysimus2.getPrefWidth());
        kysimus2.getChildren().addAll(kyss2, purju, chill, poisid, yksi);

        VBox kysimus3 = new VBox();
        Scene kysimused3 = new Scene(kysimus3, 600, 300);
        kysimus3.setPrefWidth(150);
        Label kyss3 = new Label("Millist neist eelistad?");
        kyss3.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        kysimus3.setSpacing(5);
        kysimus3.setAlignment(Pos.CENTER);
        Button vein = new Button("Valge poolkuiv vein");
        Button kokteilid = new Button("Värvilised kokteilid");
        Button olu = new Button("Ainult õlu, aitäh");
        Button viski = new Button("Viski jääga");
        vein.setMinWidth(kysimus3.getPrefWidth());
        kokteilid.setMinWidth(kysimus3.getPrefWidth());
        olu.setMinWidth(kysimus3.getPrefWidth());
        viski.setMinWidth(kysimus3.getPrefWidth());
        kysimus3.getChildren().addAll(kyss3, vein, kokteilid, olu, viski);

        VBox kysimus4 = new VBox();
        Scene kysimused4 = new Scene(kysimus4, 600, 300);
        kysimus4.setPrefWidth(150);
        Label kyss4 = new Label("Mis tuju sul hetkel on?");
        kyss4.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        kysimus4.setSpacing(5);
        kysimus4.setAlignment(Pos.CENTER);
        Button roomus = new Button("Väga hea");
        Button kehv = new Button("Kehvapoolne");
        Button neutraalne = new Button("Meh.. ");
        Button kuri = new Button("Hoia eemale");
        roomus.setMinWidth(kysimus4.getPrefWidth());
        kehv.setMinWidth(kysimus4.getPrefWidth());
        neutraalne.setMinWidth(kysimus4.getPrefWidth());
        kuri.setMinWidth(kysimus4.getPrefWidth());
        kysimus4.getChildren().addAll(kyss4, roomus, kehv, neutraalne, kuri);

        VBox kysimus5 = new VBox();
        Scene kysimused5 = new Scene(kysimus5, 600, 300);
        kysimus5.setPrefWidth(150);
        Label kyss5 = new Label("Mille järgi isutab?");
        kyss5.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        kysimus5.setSpacing(5);
        kysimus5.setAlignment(Pos.CENTER);
        Button puuvili = new Button("Puuviljasalat");
        Button leivad = new Button("Küüslauguleivad");
        Button sushi = new Button("Sushi");
        Button kook = new Button("Shokolaadikook");
        puuvili.setMinWidth(kysimus5.getPrefWidth());
        leivad.setMinWidth(kysimus5.getPrefWidth());
        sushi.setMinWidth(kysimus5.getPrefWidth());
        kook.setMinWidth(kysimus5.getPrefWidth());
        kysimus5.getChildren().addAll(kyss5, puuvili, leivad, sushi, kook);

        VBox kysimus6 = new VBox();
        Scene kysimused6 = new Scene(kysimus6, 600, 300);
        kysimus6.setPrefWidth(150);
        Label kyss6 = new Label("Vali lemmik staar?");
        kyss6.setFont(Font.font("Arial", FontWeight.BOLD, 14));
        kysimus6.setSpacing(5);
        kysimus6.setAlignment(Pos.CENTER);
        Button liis = new Button("Liis Lemsalu");
        Button edgar = new Button("Edgar Savisaar");
        Button andrus = new Button("Andrus Veerpalu");
        Button anu = new Button("Anu Saagim");
        liis.setMinWidth(kysimus6.getPrefWidth());
        edgar.setMinWidth(kysimus6.getPrefWidth());
        andrus.setMinWidth(kysimus6.getPrefWidth());
        anu.setMinWidth(kysimus6.getPrefWidth());
        kysimus6.getChildren().addAll(kyss6, liis, edgar, andrus, anu);


        test.setScene(kysimused1);
        test.show();

        //ESIMENE K�SIMUS

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

        //TEINE K�SIMUS

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

        // KOLMAS K�SIMUS

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

        //NELJAS K�SIMUS
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

        //VIIES K�SIMUS
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

        //KUUES K�SIMUS
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
                * Iga k�simuse iga vastus salvestab tulemusse teatud numbrid ArrayListist
                * Tulemus kogub endasse need arvud ja leiab k�ige sagedamini esineva(d) numbri(d)
                * J�rgmisel lehel t�lgitakse iga number �lleks
                *
                */


    });

}
}
