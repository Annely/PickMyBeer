package Proov;


import java.util.*;

/**
 * Created by Annely on 1.12.2015.
 */
public class Tulemused {

    ArrayList<Integer> lahendus = Test.tulemused;
    HashMap<Integer, Integer> tulemused = new HashMap<>();
    int max;
    static ArrayList<Integer> populaarseim = new ArrayList<>();

    Tulemused() {
        leiaSagedus();
        maksimaalne();
        maxKeyd();

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
        new TulemustePrint();
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




}

