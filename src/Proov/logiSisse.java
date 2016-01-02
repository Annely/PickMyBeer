package Proov;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

/**
 * Created by Annely on 23.11.2015.
 */
public class logiSisse {
    Stage stage = new Stage();

    logiSisse() {
        looAken();

    }

    public void looAken() {
        VBox vbox = new VBox();
        Scene scene = new Scene(vbox);
        Label kasutaja = new Label("Kasutajanimi");
        TextField kasutajaNimi = new TextField();
        Label parool = new Label("Parool");
        PasswordField kasutajaParool = new PasswordField();
        Button sisene = new Button("Sisene");
        Label teade = new Label ();

        vbox.getChildren().addAll(kasutaja, kasutajaNimi, parool, kasutajaParool, sisene, teade);

        stage.setScene(scene);
        stage.show();

        sisene.setOnAction(event -> {
                    String heaParool = kasutajaParool.getText();
                    if (heaParool.equals("Hindeks5")) {
                        String sina = kasutajaNimi.getText();
                        System.out.println(sina);
                        stage.close();
                        new Tutvustus();
                    } else {
                        teade.setText("Vale Parool!");
                    }
                }

        );
    }





}
