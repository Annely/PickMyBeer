package Proov;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

/**
 * Created by Annely on 1.12.2015.
 */
public class Tulemused {
    ArrayList<Integer> lahendus = Test.tulemused;

    Tulemused() {
            looAken();
            leiaPopulaarseim();
    }


    private int leiaPopulaarseim() {
        Collections.sort(lahendus);

        //abiks siin oli : http://stackoverflow.com/questions/8545590/java-find-the-most-popular-element-in-int-array
        int eelmine = lahendus.get(0);
        int populaarseim = lahendus.get(0);
        int count = 1;
        int kokku = 1;
        for (int i = 0; i < lahendus.size(); i++) {
            if (lahendus.get(i) == eelmine) {
                count++;
            }
            else {
                if (count>kokku) {
                    populaarseim = lahendus.get(i-1);
                    kokku = count;
                }
                eelmine = lahendus.get(i);
                count = 1;
            }

        }
        return count > kokku ? lahendus.get(lahendus.size() - 1) : populaarseim;

    }

    private void looAken() {
        Stage lopp = new Stage();
        Pane pane = new Pane();
        Scene lopetamine = new Scene(pane, 400, 400);
        lopp.setScene(lopetamine);
        lopp.show();
    }


}

