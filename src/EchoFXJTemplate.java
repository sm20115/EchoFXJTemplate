/*
Syed Eliyas Bin Feisal Muhammad Abdul Rauf
6962157
sm20115@email.vccs.edu

CSC200
Tanes Kanchanawanchai

Echo

 */

import javafx.application.Application;
import javafx.scene.control.Alert;
import javafx.scene.control.Alert.AlertType;
import javafx.stage.Stage;

import javax.swing.*;
import java.util.Scanner;

public class EchoFXJTemplate extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {

        Byte byteValue;
        char charValue;
        String input = "a string";

        Scanner keyboard = new Scanner(System.in);
        Scanner stringValue = new Scanner(input);

        //byte system
        System.out.println("Enter your age: ");
        byteValue = keyboard.nextByte();
        JOptionPane.showMessageDialog(null, "You have just entered " + byteValue);

        //char system
        System.out.println("Enter an alphabet of your 1st name: ");
        charValue = keyboard.next().charAt(0);
        JOptionPane.showMessageDialog(null, "You have just entered " + charValue);

        //findinline system
        System.out.println("Enter another alphabet for your last name: ");
        charValue = keyboard.next().charAt(0);
        JOptionPane.showMessageDialog(null, "You have just entered " + charValue);

       // String output = stringValue.findInLine(".");
        //JOptionPane.showMessageDialog(null, "You have an input value of " + output);

        Alert alert = new Alert(AlertType.NONE);//(AlertType.something) can be: none, info, warning, confirmation, error
        alert.setTitle("EchoApp");
        alert.setContentText("Your generated code is  " + byteValue + charValue);
        alert.show();
        }
    }


  /*  public class EchoFXJTemplate extends Application {

    @Override
        public void start(Stage primaryStage) throws Exception{
        byte

    }
    }
    */
