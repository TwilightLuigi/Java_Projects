/*
* Lab 2 for CS 1181
* This program demonstrates the use of Netbeans IDE
* The program will diplay a menu to the user and ask them for imput.
* It will then take the user imput and do numerical manipulation, and output results 
 */
package currencyconversion;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javax.swing.Box;

/**
 * @author Sierra Sprungl CS1181L-C06 Instructor: R. Volkers TA's: William Hess
 * and Chris Stropes
 */
public class CurrencyConversion extends Application {

    /**
     *
     * @param primaryStage
     */
    @Override
    public void start(Stage primaryStage) {

        BorderPane bp = new BorderPane();
        Label topl = new Label("Enter a currency amount");
        TextField toptf = new TextField();
//        double i = 0;
//        String imput = String.valueOf(i);
        toptf.setText("0");
        Label left1 = new Label("Input Currency");
        RadioButton ib1 = new RadioButton("US Doller");
        RadioButton ib2 = new RadioButton("European Euro");
        RadioButton ib3 = new RadioButton("British Pound");
        RadioButton ib4 = new RadioButton("Canadian Dollar");
        RadioButton ib5 = new RadioButton("Japanese Yen");
        Label right1 = new Label("Output Currency");
        RadioButton ob1 = new RadioButton("US Doller");
        RadioButton ob2 = new RadioButton("European Euro");
        RadioButton ob3 = new RadioButton("British Pound");
        RadioButton ob4 = new RadioButton("Canadian Doller");
        RadioButton ob5 = new RadioButton("Japanese Yen");
        Label bottom1 = new Label("Converted currency");
        TextField bottomtf = new TextField();
        TextArea center1 = new TextArea();

        HBox top = new HBox(topl, toptf);
        top.setSpacing(200);
        top.setPadding(new Insets(5, 5, 5, 5));
        top.setStyle("-fx-border-width: 2px; -fx-border-color: red");
        bp.setTop(top);
        VBox left = new VBox(left1, ib1, ib2, ib3, ib4, ib5);
        left.setSpacing(30);
        left.setPadding(new Insets(5, 5, 5, 5));
        left.setStyle("-fx-border-width: 2px; -fx-border-color: red");
        bp.setLeft(left);
        VBox right = new VBox(right1, ob1, ob2, ob3, ob4, ob5);
        right.setSpacing(30);
        right.setPadding(new Insets(5, 5, 5, 5));
        right.setStyle("-fx-border-width: 2px; -fx-border-color: red");
        bp.setRight(right);
        HBox bottom = new HBox(bottom1, bottomtf);
        bottomtf.setEditable(false);
        bottom.setSpacing(225);
        bottom.setPadding(new Insets(5, 5, 5, 5));
        bottom.setStyle("-fx-border-width: 2px; -fx-border-color: red");
        bp.setBottom(bottom);
        ScrollPane sp = new ScrollPane(center1);
        center1.setEditable(false);
        sp.setPadding(new Insets(2, 2, 2, 2));
        sp.setStyle("-fx-border-width: 2px; -fx-border-color: red");
        bp.setCenter(sp);
        ToggleGroup tg = new ToggleGroup();

        ib1.setToggleGroup(tg);
        ib2.setToggleGroup(tg);
        ib3.setToggleGroup(tg);
        ib4.setToggleGroup(tg);
        ib5.setToggleGroup(tg);
        ToggleGroup tg2 = new ToggleGroup();
        ob1.setToggleGroup(tg2);
        ob2.setToggleGroup(tg2);
        ob3.setToggleGroup(tg2);
        ob4.setToggleGroup(tg2);
        ob5.setToggleGroup(tg2);

        Scene scene = new Scene(bp, 500, 350);

        primaryStage.setTitle("Currency Conversion");

        primaryStage.setScene(scene);

        primaryStage.show();

        ib1.setOnAction(new EventHandler<ActionEvent>() {

            @Override
            public void handle(ActionEvent e) {
 

                if (ib1.isSelected() && ob1.isSelected()) {
                    double userImput = Double.parseDouble(toptf.getText());
                    try {
                        
                        if (userImput < 0) {
                            throw new Exception("The input value must be greater then 0. Please enter a new value.");

                        }

                    } catch (Exception a) {
                        center1.setText(a.getMessage());

                    }

                    double con = userImput * 1;
                    Math.round(con);
                    String c = String.valueOf(con);
                    bottomtf.setText(c);

                }
                if (ib1.isSelected() && ob2.isSelected()) {
                    double userImput = Double.parseDouble(toptf.getText());
                    double con = userImput * 0.828;
                    //Math.round((con*100.0)/100.0);
                    String c = String.valueOf(con);
                    bottomtf.setText(c);

                }
                if (ib1.isSelected() && ob3.isSelected()) {
                    double userImput = Double.parseDouble(toptf.getText());
                    double con = userImput * 0.738;
                    Math.round(con);
                    String c = String.valueOf(con);
                    bottomtf.setText(c);

                }
                if (ib1.isSelected() && ob4.isSelected()) {
                    double userImput = Double.parseDouble(toptf.getText());
                    double con = userImput * 1.253;
                    Math.round(con);
                    String c = String.valueOf(con);
                    bottomtf.setText(c);

                }
                if (ib1.isSelected() && ob5.isSelected()) {
                    double userImput = Double.parseDouble(toptf.getText());
                    double con = userImput * 112.800;
                    Math.round(con);
                    String c = String.valueOf(con);
                    bottomtf.setText(c);
                }

            }
        });
        ib2.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

                if (ib2.isSelected() && ob1.isSelected()) {
                    double userImput = Double.parseDouble(toptf.getText());
                    double value = userImput * 1.20773;
                    String v = String.valueOf(value);
                    bottomtf.setText(v);
                }
                if (ib2.isSelected() && ob2.isSelected()) {
                    double userImput = Double.parseDouble(toptf.getText());
                    double value = userImput * 1;
                    String v = String.valueOf(value);
                    bottomtf.setText(v);

                }
                if (ib2.isSelected() && ob3.isSelected()) {
                    double userImput = Double.parseDouble(toptf.getText());
                    double value = userImput * 0.8913;
                    String v = String.valueOf(value);
                    bottomtf.setText(v);

                }
                if (ib2.isSelected() && ob4.isSelected()) {
                    double userImput = Double.parseDouble(toptf.getText());
                    double value = userImput * 1.51329;
                    String v = String.valueOf(value);
                    bottomtf.setText(v);
                }
                if (ib2.isSelected() && ob5.isSelected()) {
                    double userImput = Double.parseDouble(toptf.getText());
                    double value = userImput * 136.2319;
                    String v = String.valueOf(value);
                    bottomtf.setText(v);
                }

            }
        });

        ib3.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                if (ib3.isSelected() && ob1.isSelected()) {
                    double userImput = Double.parseDouble(toptf.getText());
                    double value = userImput * 1.35501;
                    String v = String.valueOf(value);
                    bottomtf.setText(v);

                }
                if (ib3.isSelected() && ob2.isSelected()) {
                    double userImput = Double.parseDouble(toptf.getText());
                    double value = userImput * 1.12195;
                    String v = String.valueOf(value);
                    bottomtf.setText(v);

                }
                if (ib3.isSelected() && ob3.isSelected()) {
                    double userImput = Double.parseDouble(toptf.getText());
                    double value = userImput * 1;
                    String v = String.valueOf(value);
                    bottomtf.setText(v);

                }
                if (ib3.isSelected() && ob4.isSelected()) {
                    double userImput = Double.parseDouble(toptf.getText());
                    double value = userImput * 1.69783;
                    String v = String.valueOf(value);
                    bottomtf.setText(v);

                }
                if (ib3.isSelected() && ob5.isSelected()) {
                    double userImput = Double.parseDouble(toptf.getText());
                    double value = userImput * 152.8455;
                    String v = String.valueOf(value);
                    bottomtf.setText(v);
                }
            }
        });

        ib4.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {

                if (ib4.isSelected() && ob1.isSelected()) {
                    double userImput = Double.parseDouble(toptf.getText());
                    double value = userImput * 0.79808;
                    String v = String.valueOf(value);
                    bottomtf.setText(v);

                }
                if (ib4.isSelected() && ob2.isSelected()) {
                    double userImput = Double.parseDouble(toptf.getText());
                    double value = userImput * 0.66081;
                    String v = String.valueOf(value);
                    bottomtf.setText(v);
                }
                if (ib4.isSelected() && ob3.isSelected()) {
                    double userImput = Double.parseDouble(toptf.getText());
                    double value = userImput * 0.588986;
                    String v = String.valueOf(value);
                    bottomtf.setText(v);

                }
                if (ib4.isSelected() && ob4.isSelected()) {
                    double userImput = Double.parseDouble(toptf.getText());
                    double value = userImput * 1;
                    String v = String.valueOf(value);
                    bottomtf.setText(v);

                }
                if (ib4.isSelected() && ob5.isSelected()) {
                    double userImput = Double.parseDouble(toptf.getText());
                    double value = userImput * 90.0239;
                    String v = String.valueOf(value);
                    bottomtf.setText(v);

                }
            }
        });

        ib5.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent e) {
                if (ib5.isSelected() && ob1.isSelected()) {
                    double userImput = Double.parseDouble(toptf.getText());
                    double value = userImput * 0.008865;
                    String v = String.valueOf(value);
                    bottomtf.setText(v);
                }
                if (ib5.isSelected() && ob2.isSelected()) {
                    double userImput = Double.parseDouble(toptf.getText());
                    double value = userImput * 0.00734;
                    String v = String.valueOf(value);
                    bottomtf.setText(v);
                }
                if (ib5.isSelected() && ob3.isSelected()) {
                    double userImput = Double.parseDouble(toptf.getText());
                    double value = userImput * 0.006543;
                    String v = String.valueOf(value);
                    bottomtf.setText(v);

                }
                if (ib5.isSelected() && ob4.isSelected()) {
                    double userImput = Double.parseDouble(toptf.getText());
                    double value = userImput * 0.011108;
                    String v = String.valueOf(value);
                    bottomtf.setText(v);

                }
                if (ib5.isSelected() && ob5.isSelected()) {
                    double userImput = Double.parseDouble(toptf.getText());
                    double value = userImput * 1;
                    String v = String.valueOf(value);
                    bottomtf.setText(v);

                }
            }
        });
        ob1.setOnAction(e -> {
            if (ib1.isSelected() && ob1.isSelected()) {
                double userImput = Double.parseDouble(toptf.getText());
                double value = userImput * 1;
                String v = String.valueOf(value);
                bottomtf.setText(v);
            }
            if (ib2.isSelected() && ob1.isSelected()) {
                double userImput = Double.parseDouble(toptf.getText());
                double value = userImput * 1.20773;
                String v = String.valueOf(value);
                bottomtf.setText(v);
            }
            if (ib3.isSelected() && ob1.isSelected()) {
                double userImput = Double.parseDouble(toptf.getText());
                double value = userImput * 1.35501;
                String v = String.valueOf(value);
                bottomtf.setText(v);

            }
            if (ib4.isSelected() && ob1.isSelected()) {
                double userImput = Double.parseDouble(toptf.getText());
                double value = userImput * 0.79808;
                String v = String.valueOf(value);
                bottomtf.setText(v);
            }
            if (ib5.isSelected() && ob1.isSelected()) {
                double userImput = Double.parseDouble(toptf.getText());
                double value = userImput * 0.008865;
                String v = String.valueOf(value);
                bottomtf.setText(v);
            }
        });
        ob2.setOnAction(e -> {
            if (ib1.isSelected() && ob2.isSelected()) {
                double userImput = Double.parseDouble(toptf.getText());
                double value = userImput * 0.828;
                String v = String.valueOf(value);
                bottomtf.setText(v);
            }
            if (ib2.isSelected() && ob2.isSelected()) {
                double userImput = Double.parseDouble(toptf.getText());
                double value = userImput * 1;
                String v = String.valueOf(value);
                bottomtf.setText(v);
            }
            if (ib3.isSelected() && ob2.isSelected()) {
                double userImput = Double.parseDouble(toptf.getText());
                double value = userImput * 1.12195;
                String v = String.valueOf(value);
                bottomtf.setText(v);
            }

            if (ib4.isSelected() && ob2.isSelected()) {
                double userImput = Double.parseDouble(toptf.getText());
                double value = userImput * 0.66081;
                String v = String.valueOf(value);
                bottomtf.setText(v);
            }
            if (ib5.isSelected() && ob2.isSelected()) {
                double userImput = Double.parseDouble(toptf.getText());
                double value = userImput * 0.00734;
                String v = String.valueOf(value);
                bottomtf.setText(v);
            }
        });
        ob3.setOnAction(e -> {
            if (ib1.isSelected() && ob3.isSelected()) {
                double userImput = Double.parseDouble(toptf.getText());
                double value = userImput * 0.738;
                String v = String.valueOf(value);
                bottomtf.setText(v);
            }

            if (ib2.isSelected() && ob3.isSelected()) {
                double userImput = Double.parseDouble(toptf.getText());
                double value = userImput * 0.8913;
                String v = String.valueOf(value);
                bottomtf.setText(v);
            }

            if (ib3.isSelected() && ob3.isSelected()) {
                double userImput = Double.parseDouble(toptf.getText());
                double value = userImput * 1;
                String v = String.valueOf(value);
                bottomtf.setText(v);
            }

            if (ib4.isSelected() && ob3.isSelected()) {
                double userImput = Double.parseDouble(toptf.getText());
                double value = userImput * 0.588986;
                String v = String.valueOf(value);
                bottomtf.setText(v);
            }
            if (ib5.isSelected() && ob3.isSelected()) {
                double userImput = Double.parseDouble(toptf.getText());
                double value = userImput * 0.006543;
                String v = String.valueOf(value);
                bottomtf.setText(v);
            }

        });
        ob4.setOnAction(e -> {
            if (ib1.isSelected() && ob4.isSelected()) {
                double userImput = Double.parseDouble(toptf.getText());
                double value = userImput * 1.253;
                String v = String.valueOf(value);
                bottomtf.setText(v);
            }
            if (ib2.isSelected() && ob4.isSelected()) {
                double userImput = Double.parseDouble(toptf.getText());
                double value = userImput * 1.51329;
                String v = String.valueOf(value);
                bottomtf.setText(v);
            }
            if (ib3.isSelected() && ob4.isSelected()) {
                double userImput = Double.parseDouble(toptf.getText());
                double value = userImput * 1.69783;
                String v = String.valueOf(value);
                bottomtf.setText(v);
            }

            if (ib4.isSelected() && ob4.isSelected()) {
                double userImput = Double.parseDouble(toptf.getText());
                double value = userImput * 1;
                String v = String.valueOf(value);
                bottomtf.setText(v);
            }

            if (ib5.isSelected() && ob4.isSelected()) {
                double userImput = Double.parseDouble(toptf.getText());
                double value = userImput * 0.011108;
                String v = String.valueOf(value);
                bottomtf.setText(v);
            }

        });
        ob5.setOnAction(e -> {
            if (ib1.isSelected() && ob5.isSelected()) {
                double userImput = Double.parseDouble(toptf.getText());
                double value = userImput * 112.800;
                String v = String.valueOf(value);
                bottomtf.setText(v);
            }

            if (ib2.isSelected() && ob5.isSelected()) {
                double userImput = Double.parseDouble(toptf.getText());
                double value = userImput * 136.2319;
                String v = String.valueOf(value);
                bottomtf.setText(v);
            }

            if (ib3.isSelected() && ob5.isSelected()) {
                double userImput = Double.parseDouble(toptf.getText());
                double value = userImput * 152.8455;
                String v = String.valueOf(value);
                bottomtf.setText(v);
            }
            if (ib4.isSelected() && ob5.isSelected()) {
                double userImput = Double.parseDouble(toptf.getText());
                double value = userImput * 90.0239;
                String v = String.valueOf(value);
                bottomtf.setText(v);
            }

            if (ib5.isSelected() && ob5.isSelected()) {
                double userImput = Double.parseDouble(toptf.getText());
                double value = userImput * 1;
                String v = String.valueOf(value);
                bottomtf.setText(v);
            }
        });

    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
}
