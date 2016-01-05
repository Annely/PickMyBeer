package Proov;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.util.ArrayList;


/**
 * Created by Annely on 5.01.2016.
 */
public class TulemustePrint {
    ArrayList<Integer> populaarseim = Tulemused.populaarseim;
    static double valitud;
    double keskmineHinne = Hinne.keskmineHinne;

    TulemustePrint(){
        looAken();
    }

    private void looAken() {
        Stage lopp = new Stage();
        GridPane pane = new GridPane();
        Scene lopetamine = new Scene(pane, 600, 700);
        pane.setHgap(10);
        pane.setVgap(10);
        Label soovitus = new Label ("Sinu tulemus:");
        soovitus.setFont(Font.font("Arial", FontWeight.BOLD, 20));
        pane.add(soovitus, 0, 0);


        VBox tabel = new VBox();
        ToggleGroup hinne = new ToggleGroup();
        Label tagasiside = new Label("Kas soovitus pidas paika?");
        RadioButton yks = new RadioButton("1");
        RadioButton kaks = new RadioButton("2");
        RadioButton kolm = new RadioButton("3");
        RadioButton neli = new RadioButton("4");
        RadioButton viis = new RadioButton("5");
        yks.setToggleGroup(hinne);
        kaks.setToggleGroup(hinne);
        kolm.setToggleGroup(hinne);
        neli.setToggleGroup(hinne);
        viis.setToggleGroup(hinne);
        Button hinda = new Button("Hinda");

        tabel.getChildren().addAll(tagasiside, yks, kaks, kolm, neli, viis, hinda);
        hinda.setOnAction(event -> {
                    if (yks.isSelected()) {
                        valitud = 1;
                        new Hinne();
                    } else if (kaks.isSelected()) {
                        valitud=2;
                        new Hinne();
                    }else if (kolm.isSelected()) {
                        valitud = 3;
                        new Hinne();
                    } else if (neli.isSelected()) {
                        valitud = 4;
                        new Hinne();
                    }else if (viis.isSelected()) {
                        valitud=5;
                        new Hinne();
                    }


             });




        pane.add(tabel, 5, 1);
        lopp.setScene(lopetamine);
        lopp.show();

        if(populaarseim.size()<5){
        for (int i = 0; i < populaarseim.size(); i++) {
            if (populaarseim.get(i).equals(1)) {
                Label olu1 = new Label("Lehe Blackmouth Cur");
                Image pilt1 = new Image(getClass().getResourceAsStream("Lehe Blackmouth Cur.jpg"));
                Label label1 = new Label();
                label1.setGraphic(new ImageView(pilt1));
                pane.add(olu1, 0, i+1);
                pane.add(label1, 1, i+1);
            } else if (populaarseim.get(i).equals(2)) {
                Label olu2 = new Label("Põhjala Must Kuld");
                Image pilt2 = new Image(getClass().getResourceAsStream("Lehe Must Kuld.jpg"));
                Label label2 = new Label();
                label2.setGraphic(new ImageView(pilt2));
                pane.add(olu2, 0, i+1);
                pane.add(label2, 1, i + 1);
            } else if (populaarseim.get(i).equals(3)) {
                Label olu3 = new Label("Õllekõrs Indian Pale Ale");
                Image pilt3 = new Image(getClass().getResourceAsStream("Õllekõrs Indian Pale Ale.jpg"));
                Label label3 = new Label();
                label3.setGraphic(new ImageView(pilt3));
                pane.add(olu3, 0, i+1);
                pane.add(label3, 1, i+1);
            } else if (populaarseim.get(i).equals(4)) {
                Label olu4 = new Label("Õllekõrs Coffee Stout");
                Image pilt4 = new Image(getClass().getResourceAsStream("Õllekõrs Coffee Stout.jpg"));
                Label label4 = new Label();
                label4.setGraphic(new ImageView(pilt4));
                pane.add(olu4, 0, i+1);
                pane.add(label4, 1, i+1);
            } else if (populaarseim.get(i).equals(5)) {
                Label olu5 = new Label("Õllenaut Vanaeit");
                Image pilt5 = new Image(getClass().getResourceAsStream("Õllenaut Vanaeit.jpg"));
                Label label5 = new Label();
                label5.setGraphic(new ImageView(pilt5));
                pane.add(olu5, 0, i+1);
                pane.add(label5, 1, i + 1);
            } else if (populaarseim.get(i).equals(6)) {
                Label olu6 = new Label("Muddis Saison");
                Image pilt6 = new Image(getClass().getResourceAsStream("Muddis Saison.jpg"));
                Label label6 = new Label();
                label6.setGraphic(new ImageView(pilt6));
                pane.add(olu6, 0, i+1);
                pane.add(label6, 1, i + 1);
            } else if (populaarseim.get(i).equals(7)) {
                Label olu7 = new Label("Vormsi tõeline murjam");
                Image pilt7 = new Image(getClass().getResourceAsStream("Vormsi Tõeline Murjam.jpg"));
                Label label7 = new Label();
                label7.setGraphic(new ImageView(pilt7));
                pane.add(olu7, 0, i+1);
                pane.add(label7, 1, i + 1);
            } else if (populaarseim.get(i).equals(8)) {
                Label olu8 = new Label("Raasiku Õlletehas Verner hele");
                Image pilt8 = new Image(getClass().getResourceAsStream("Raasiku Verner.png"));
                Label label8 = new Label();
                label8.setGraphic(new ImageView(pilt8));
                pane.add(olu8, 0, i+1);
                pane.add(label8, 1, i + 1);
            } else if (populaarseim.get(i).equals(9)) {
                Label olu9 = new Label("Vormsi Wormsi Enn");
                Image pilt9 = new Image(getClass().getResourceAsStream("Vormsi Enn.jpg"));
                Label label9 = new Label();
                label9.setGraphic(new ImageView(pilt9));
                pane.add(olu9, 0, i+1);
                pane.add(label9, 1, i+1);
            } else if (populaarseim.get(i).equals(10)) {
                Label olu10 = new Label("Raasiku õlletehas Verner meeõlu");
                Image pilt10 = new Image(getClass().getResourceAsStream("Raasiku meeolu.png"));
                Label label10 = new Label();
                label10.setGraphic(new ImageView(pilt10));
                pane.add(olu10, 0, i+1);
                pane.add(label10, 1, i + 1);
            }
        }
        lopp.setScene(lopetamine);
        lopp.show();

    }
        else {
            Label uus = new Label ("Liiga palju tulemusi, proovi veel");
            Button tagasi = new Button("Tagasi algusesse");
            pane.add(uus, 0, 1);
            pane.add(tagasi, 0, 2);

        }

        }

}
