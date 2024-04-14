package com.example.javafxgui;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javafx.util.*;

public class Calculator extends Application {

    TextField display;

    Button btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnPlus, btnMinus,
    btnMultiply, btnDivide,btnPercentage, btnModulus, btnDot, btnSquare, btnClear, btnBack, btnSubmit;

    Font fontBg, fontSm, fontNm;

   Double firstNumber, secondNumber;

   String operator;

   double answer;

   int answerInt;

   int answerDoub;



    public void start (Stage stage) throws Exception {

        stage.setTitle("Windows Calc");
        GridPane grid = new GridPane();
        grid.setAlignment(Pos.CENTER);


        fontBg = new Font ("ink-free", 40);
        fontNm = new Font ("ink-free", 20);
        fontSm = new Font ("ink-free", 40);

        display = new TextField();
//        display.setMaxHeight(60);
        display.setMinHeight(60);


        display.setEditable(false);
        display.setStyle("-fx-alignment: CENTER-RIGHT;");



        btn0 = new Button("0");
        btn0.setPrefSize(150, 70);
        btn0.setFont(fontNm);

        btn1 = new Button("1");
        btn1.setPrefSize(70, 70);
        btn1.setFont(fontNm);

        btn2 = new Button("2");
        btn2.setPrefSize(70, 70);
        btn2.setFont(fontNm);

        btn3 = new Button("3");
        btn3.setPrefSize(70, 70);
        btn3.setFont(fontNm);

        btn4 = new Button("4");
        btn4.setPrefSize(70, 70);
        btn4.setFont(fontNm);

        btn5 = new Button("5");
        btn5.setPrefSize(70, 70);
        btn5.setFont(fontNm);

        btn6 = new Button("6");
        btn6.setPrefSize(70, 70);
        btn6.setFont(fontNm);

        btn7 = new Button("7");
        btn7.setPrefSize(70, 70);
        btn7.setFont(fontNm);

        btn8 = new Button("8");
        btn8.setPrefSize(70, 70);
        btn8.setFont(fontNm);

        btn9 = new Button("9");
        btn9.setPrefSize(70, 70);
        btn9.setFont(fontNm);

        btnPlus = new Button("+");
        btnPlus.setPrefSize(70, 150);
        btnPlus.setFont(fontNm);
        btnPlus.getStyleClass().add("operator-btn");

        btnMinus = new Button("-");
        btnMinus.setPrefSize(70, 70);
        btnMinus.setFont(fontNm);
        btnMinus.getStyleClass().add("operator-btn");

        btnMultiply = new Button("*");
        btnMultiply.setPrefSize(70, 70);
        btnMultiply.setFont(fontNm);
        btnMultiply.getStyleClass().add("operator-btn");

        btnDivide = new Button("/");
        btnDivide.setPrefSize(70, 70);
        btnDivide.setFont(fontNm);
        btnDivide.getStyleClass().add("operator-btn");

        btnPercentage = new Button("%");
        btnPercentage.setPrefSize(70, 70);
        btnPercentage.setFont(fontNm);
        btnPercentage.getStyleClass().add("operator-btn");

        btnModulus = new Button("mod");
        btnModulus.setPrefSize(70, 70);
        btnModulus.setFont(fontNm);
        btnModulus.getStyleClass().add("operator-btn");

        btnDot = new Button(".");
        btnDot.setPrefSize(70, 70);
        btnDot.setFont(fontNm);
        btnDot.getStyleClass().add("operator-btn");

        btnSquare = new Button("^2");
        btnSquare.setPrefSize(70, 70);
        btnSquare.setFont(fontNm);
        btnSquare.getStyleClass().add("operator-btn");

        btnSubmit = new Button("=");
        btnSubmit.setPrefSize(70, 150);
        btnSubmit.setFont(fontNm);
        btnSubmit.getStyleClass().add("operator-btn");

        btnClear = new Button("CLR");
        btnClear.setPrefSize(70, 70);
        btnClear.setFont(fontNm);
        btnClear.getStyleClass().add("operator-btn");

        btnBack = new Button("<=");
        btnBack.setPrefSize(70, 70);
        btnBack.setFont(fontNm);
        btnBack.getStyleClass().add("operator-btn");

        // Layout SetUp

        GridPane gp = new GridPane();
        gp.setGridLinesVisible(false);
        gp.setVgap(10);
        gp.setHgap(10);
        gp.setAlignment(Pos.CENTER);
        gp.add(display, 0 , 1, 4, 1);
        gp.addRow(2, btnClear, btnSquare, btnModulus, btnBack);
        gp.addRow(3, btnMinus, btnMultiply, btnDivide, btnPercentage);
        gp.addRow(4, btn7, btn8, btn9);
        gp.addRow(5, btn4, btn5, btn6);
        gp.addRow(6, btn1, btn2, btn3);
        gp.add(btn0, 0, 7, 2, 1);
        gp.add(btnDot, 2, 7, 1,1);
        gp.add(btnPlus, 3, 4, 1, 2);
        gp.add(btnSubmit, 3, 6 ,1,2 );

        // Button Functionalities

        btn0.setOnAction(e -> {
            display.appendText(btn0.getText());
        });

        btn1.setOnAction(e -> {
            display.appendText(btn1.getText());
        });

        btn2.setOnAction(e -> {
            display.appendText(btn2.getText());
        });

        btn3.setOnAction(e -> {
            display.appendText(btn3.getText());
        });

        btn4.setOnAction(e -> {
            display.appendText(btn4.getText());
        });

        btn5.setOnAction(e -> {
            display.appendText(btn5.getText());
        });

        btn6.setOnAction(e -> {
            display.appendText(btn6.getText());
        });

        btn7.setOnAction(e -> {
            display.appendText(btn7.getText());
        });

        btn8.setOnAction(e -> {
            display.appendText(btn8.getText());
        });

        btn9.setOnAction(e -> {
            display.appendText(btn9.getText());
        });

        btnClear.setOnAction(e -> {
            display.setText("");
        });

        btnBack.setOnAction((e -> {
            display.setText(
                    display.getText().substring(0, display.getLength()-1)
            );
        }));

        btnDot.setOnAction(e -> {
            if (display.getText().isEmpty()) {
                display.setText("0.");
            } else if(display.getText().contains(".")) {
                display.setText(display.getText());
            } else {
                display.appendText((btnDot.getText()));
            }
        });

        btnPlus.setOnAction(e -> {
            firstNumber = Double.parseDouble(display.getText());
            operator = "+";
            display.setText("");
        });

        btnMinus.setOnAction(e -> {
            if (display.getText().isEmpty()) {
                display.setText(btnMinus.getText());
            }
            firstNumber = Double.parseDouble(display.getText());
            operator = "-";
            display.setText("");
        });

        btnModulus.setOnAction(e -> {
            firstNumber = Double.parseDouble(display.getText());
            operator = "%";
            display.setText("");
        });

        btnMultiply.setOnAction(e -> {
            firstNumber = Double.parseDouble(display.getText());
            operator = "*";
            display.setText("");
        });

        btnDivide.setOnAction(e -> {
            firstNumber = Double.parseDouble(display.getText());
            operator = "/";
            display.setText("");
        });

        btnPercentage.setOnAction(e -> {
            firstNumber = Double.parseDouble(display.getText());
            answer = firstNumber/100;
            answerInt = (int) answer;

            if(String.valueOf(answer).endsWith(".0")) {
                display.setText(String.valueOf(answerInt));
            } else {
                display.setText(String.valueOf(answer));
            }
        });

        btnSquare.setOnAction(e -> {
            firstNumber = Double.parseDouble(display.getText());
            answer = firstNumber * firstNumber;
            answerInt = (int) answer;

            if(String.valueOf(answer).endsWith(".0")) {
                display.setText(String.valueOf(answerInt));
            } else {
                display.setText(String.valueOf(answer));
            }
        });




        btnSubmit.setOnAction(e -> {

                secondNumber = Double.parseDouble(display.getText());

                if (operator.equals("+")) {
                    answer = firstNumber + secondNumber;
                    display.setText(String.valueOf(answer));

                    answerInt = (int) answer;

                    if(String.valueOf(answer).endsWith(".0")) {
                        display.setText(String.valueOf(answerInt));
                    } else {
                        display.setText(String.valueOf(answer));
                    }
                }

            if (operator.equals("-")) {
                answer = firstNumber - secondNumber;
                display.setText(String.valueOf(answer));

                answerInt = (int) answer;

                if(String.valueOf(answer).endsWith(".0")) {
                    display.setText(String.valueOf(answerInt));
                } else {
                    display.setText(String.valueOf(answer));
                }
            }

                if (operator.equals("%")) {
                    answer = firstNumber % secondNumber;
                    display.setText(String.valueOf(answer));

                    answerInt = (int) answer;

                    if(String.valueOf(answer).endsWith(".0")) {
                        display.setText(String.valueOf(answerInt));
                    } else {
                        display.setText(String.valueOf(answer));
                    }
                }

            if (operator.equals("*")) {
                answer = firstNumber * secondNumber;
                display.setText(String.valueOf(answer));

                answerInt = (int) answer;

                if(String.valueOf(answer).endsWith(".0")) {
                    display.setText(String.valueOf(answerInt));
                } else {
                    display.setText(String.valueOf(answer));
                }
            }

            if (operator.equals("/")) {
                answer = firstNumber / secondNumber;
                display.setText(String.valueOf(answer));

                answerInt = (int) answer;

                if(String.valueOf(answer).endsWith(".0")) {
                    display.setText(String.valueOf(answerInt));
                } else {
                    display.setText(String.valueOf(answer));
                }
            }
        });





        Scene scene = new Scene(gp, 350, 600);
        stage.setScene(scene);
        stage.setTitle("Simple Calculator");
        stage.show();
        stage.setResizable(false);
        String css = this.getClass().getResource("calculatorstyle.css").toExternalForm();
        scene.getStylesheets().add(css);
    }


    public static void main(String[] args) {
            launch();
    }
}
