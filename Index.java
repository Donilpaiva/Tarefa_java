package Tarefa_java;

import javax.swing.*;
import java.awt.event.*;

public class Index extends Pastelaria_java implements ActionListener
{
    public Index()
    {
        super();
        mi1.addActionListener(this);
        mi2.addActionListener(this);
        mi3.addActionListener(this);
        mi4.addActionListener(this);

        bb1.addActionListener(this);
        bb2.addActionListener(this);
        bb3.addActionListener(this);
        bb4.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == mi1) {
            P1.setVisible(true);
            P2.setVisible(false);
            P3.setVisible(false);
            P4.setVisible(false);
            C5.setText("Pastel de Carne");
        }
        if (e.getSource() == mi2) {
            P1.setVisible(false);
            P2.setVisible(true);
            P3.setVisible(false);
            P4.setVisible(false);
            C5.setText("Pastel de Queijo");

        }
        if (e.getSource() == mi3) {
            P1.setVisible(false);
            P2.setVisible(false);
            P3.setVisible(true);
            P4.setVisible(false);
            C5.setText("Pastel de Palmito");
        }
        if (e.getSource() == mi4) {
            P1.setVisible(false);
            P2.setVisible(false);
            P3.setVisible(false);
            P4.setVisible(true);
            C5.setText("Pastel de Pizza");
        }
        if (e.getSource() == bb1) {
            P5.setVisible(true);
            P6.setVisible(false);
            P7.setVisible(false);
            P8.setVisible(false);
            C6.setText("Caldo de Cana");
        }
        if (e.getSource() == bb2) {
            P5.setVisible(false);
            P6.setVisible(true);
            P7.setVisible(false);
            P8.setVisible(false);
            C6.setText("Refrigerante");
        }
        if (e.getSource() == bb3) {
            P5.setVisible(false);
            P6.setVisible(false);
            P7.setVisible(true);
            P8.setVisible(false);
            C6.setText("Chá Gelado");
        }
        if (e.getSource() == bb4) {
            P5.setVisible(false);
            P6.setVisible(false);
            P7.setVisible(false);
            P8.setVisible(true);
            C6.setText("Água");
        }
        if (e.getSource() == B4) {
            System.exit(0);
        }
        if (e.getSource() == B3) {
            JOptionPane.showMessageDialog(null,"Cadastro Realizado com Sucesso!\n" + "Verifique sua caixa postal para acessar seu código e senha.", "Mensagem",JOptionPane.INFORMATION_MESSAGE);
        }
        if (e.getSource() == B2) {
            S1.setText("");
            S2.setText("");
            C1.setText("");
            C2.setText("");
            C3.setText("");
            C4.setText("");
        }
        if (e.getSource() == B1) {
            JOptionPane.showMessageDialog(null,"Resumo do Pedido\n" + C1.getText() + "\n" + C2.getText() + "\n" + C3.getText() + "\n" + C4.getText() + "\n" + "\n" + "ítens:\n" + C5.getText() + "\n"
                    + C6.getText() + "\n", "Mensagem",JOptionPane.PLAIN_MESSAGE);
        }
        }
        public static void main (String arg[] )
        {
            JFrame janela = new Index();
            janela.show( );
            WindowListener x = new WindowAdapter()
            {
                public void windowClosing(WindowEvent e)
                {

                    System.exit(0);
                }
            };
            janela.addWindowListener(x);
        }
    }


