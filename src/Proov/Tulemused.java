package Proov;

import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.util.*;

/**
 * Created by Annely on 1.12.2015.
 */
public class Tulemused {

    ArrayList<Integer> lahendus = Test.tulemused;
    TreeMap<Integer, ArrayList<Integer>> sorteeritudMap = new TreeMap<>();
    HashMap<Integer, Integer> tulemused = new HashMap<>();

    Tulemused() {
            looAken();
            leiaSagedus();
            sisend(0);
            populaarseimad();
            System.out.println(populaarseimad());

    }

       boolean sisend (Integer key) {
           if (tulemused.containsKey(key)) {
               int count = tulemused.get(key);
               tulemused.put(key, count + 1);

               ArrayList<Integer> numbrid = sorteeritudMap.get(count);
               numbrid.remove(key);
               if (!sorteeritudMap.containsKey(count + 1)) {
                   sorteeritudMap.put(count + 1, new ArrayList<>());
                   sorteeritudMap.get(count + 1).add(key);
               } else {
                   tulemused.put(key, 1);
                   if (!sorteeritudMap.containsKey(1)) {
                       sorteeritudMap.put(1, new ArrayList<>());
                       sorteeritudMap.get(1).add(key);
                   }

               }
           }
           return true;

       }

    ArrayList <Integer> populaarseimad() {
        return sorteeritudMap.pollLastEntry().getValue();
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
                loenda= 1;
                tulemused.put((lahendus.get(i)), loenda);
            }
        }
        System.out.println(tulemused);
    }

    private void looAken() {
        Stage lopp = new Stage();
        Pane pane = new Pane();
        Scene lopetamine = new Scene(pane, 400, 400);
        lopp.setScene(lopetamine);
        lopp.show();

    }


}

