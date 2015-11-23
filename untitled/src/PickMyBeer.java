import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;



/**
 * Created by Annely on 15.11.2015.
 */
public class PickMyBeer extends Application{


    @Override
    public void start(Stage primaryStage) throws Exception {
        //defineerin esimese akna
        primaryStage.setTitle("tereTulemast");
        Stage stage=new Stage();
        VBox vbox =new VBox();
        Scene logimine= new Scene(vbox, 400, 400);
        primaryStage.setScene(logimine);
        primaryStage.show();
        StackPane rakendus;



        //defineerin teise akna
        Stage sisu = new Stage();
        VBox test = new VBox();
        Scene scene2 = new Scene(test, 400, 400);




        Label parool=new Label("Parool");
        final PasswordField KasutajaInput = new PasswordField();
        Button logiSisse = new Button("Logi Sisse");
        final Label teade= new Label();

        vbox.getChildren().addAll(parool, KasutajaInput, logiSisse, teade);



        logiSisse.setOnAction(new EventHandler<ActionEvent>() {
                                  @Override
                                  public void handle(ActionEvent event) {
                                      String heaParool = KasutajaInput.getText();
                                      if (heaParool.equals("PickMyBeer")) {

                                          System.out.println("Said Sisse!");


                                      }
                                      else {
                                          teade.setText("Vale parool");
                                      }

                                  }
                              }
        );


    }


    }


