package Proov;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.*;

/**
 * Created by Annely on 1.12.2015.
 */
public class Tulemused {

    ArrayList<Integer> lahendus = Test.tulemused;
    HashMap<Integer, Integer> tulemused = new HashMap<>();
    int max;
    ArrayList<Integer> populaarseim = new ArrayList<>();

    Tulemused() {
        leiaSagedus();
        maksimaalne();
        maxKeyd();
        looAken();

    }

    public int maksimaalne() {
        max = Collections.max(tulemused.values());
        System.out.println(max);
        return max;
    }

    public int maxKeyd() {

        Set<Integer> keySet = tulemused.keySet();
        for (int key : keySet) {
            if (max == tulemused.get(key)) {
                populaarseim.add(key);
            }
        }
        System.out.println(populaarseim);
        return 0;
    }


    public void leiaSagedus() {
        /**abiks siin oli : http://stackoverflow.com/questions/8545590/java-find-the-most-popular-element-in-int-array
         * millele lisasin Hashmapi
         */

        Collections.sort(lahendus);
        System.out.println(lahendus);
        int loenda = 1;
        int eelmine = lahendus.get(0);
        int i;
        for (i = 1; i < lahendus.size(); i++) {
            if (lahendus.get(i) == eelmine) {
                loenda++;
                tulemused.put((lahendus.get(i)), loenda);
            } else {
                eelmine = lahendus.get(i);
                loenda = 1;
                tulemused.put((lahendus.get(i)), loenda);
            }
        }
        System.out.println(tulemused);
    }

    private void looAken() {
        Stage lopp = new Stage();
        VBox vbox= new VBox();
        Scene lopetamine = new Scene(vbox, 400, 400);
        Label soovitus = new Label ("Soovitame sulle:");
        soovitus.setAlignment(Pos.TOP_CENTER);
        vbox.getChildren().add(soovitus);
        lopp.setScene(lopetamine);
        lopp.show();
        for (int i = 0; i < populaarseim.size(); i++) {
            if (populaarseim.get(i).equals(1)) {
                Label olu1 = new Label("Lehe Blackmouth Cur");
                vbox.getChildren().addAll(olu1);
            } else if (populaarseim.get(i).equals(2)) {
                Label olu2 = new Label("Põhjala Must Kuld");
                vbox.getChildren().add(olu2);
            } else if (populaarseim.get(i).equals(3)) {
                Label olu3 = new Label("Õllekõrs Indian Pale Ale");
                vbox.getChildren().add(olu3);
            } else if (populaarseim.get(i).equals(4)) {
                Label olu4 = new Label("Õllekõrs Coffee Stout");
                vbox.getChildren().add(olu4);
            } else if (populaarseim.get(i).equals(5)) {
                Label olu5 = new Label("Õllenaut Vanaeit");
                vbox.getChildren().add(olu5);
            } else if (populaarseim.get(i).equals(6)) {
                Label olu6 = new Label("Muddis Saison");
                vbox.getChildren().add(olu6);
            } else if (populaarseim.get(i).equals(7)) {
                Label olu7 = new Label("Vormsi tõeline murjam");
                vbox.getChildren().add(olu7);
            } else if (populaarseim.get(i).equals(8)) {
                Label olu8 = new Label("Raasiku Õlletehas Verner hele");
                vbox.getChildren().add(olu8);
            } else if (populaarseim.get(i).equals(9)) {
                Label olu9 = new Label("Vormsi Wormsi Enn");
                vbox.getChildren().add(olu9);
            } else if (populaarseim.get(i).equals(10)) {
                Label olu10 = new Label("Raasiku õlletehas Verner meeõlu");
                vbox.getChildren().add(olu10);
            }
        }
        lopp.setScene(lopetamine);
        lopp.show();

    }


}

