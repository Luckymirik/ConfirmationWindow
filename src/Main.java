import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class Main {
    public static void main(String[] args) {
        String q1 = JOptionPane.showInputDialog("Вы пойдете на выборы?(да/нет)");
        if (q1.equals("да")) {
            JOptionPane.showMessageDialog(null, "Крвсава!!!");
        }else if (q1.equals("нет")){
            JOptionPane.showMessageDialog(null,"Ну и зря!!!!");
        }
        String q2 = JOptionPane.showInputDialog("За Путина будешь голосовать?(да/нет)");
        if (q2.equals("да")){
            JOptionPane.showMessageDialog(null,"Ты шо гонишь!!!!");
        }else if (q2.equals("нет")){
            JOptionPane.showMessageDialog(null,"Шаришь!!!!");
        }







    }
}