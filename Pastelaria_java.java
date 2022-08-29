package Tarefa_java;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;

public class Pastelaria_java extends JFrame {
    JMenuBar M1;
    JMenu Menu1, Menu2, Menu3;
    JMenuItem mi1, mi2, mi3, mi4 ;
    JMenuItem bb1, bb2, bb3, bb4;
    JLabel L1, L2, L3, L4 , L5, L6, L7, L8;
    JLabel Texto1, Texto2, Texto3, Nome, Endereco, Telefone, Email, Pagto, Molhos, Entrega;
    JPanel	P1, P2, P3, P4, P5, P6, P7, P8 ;
    ImageIcon img1, img2, img3, img4, img5, img6, img7, img8 ;
    JButton B1, B2, B3, B4;
    JPasswordField S1, S2;
    JTextField C1, C2, C3, C4, C5, C6;
    JComboBox FPagto;
    JCheckBox CH1, CH2, CH3, CH4;
    JRadioButton J1, J2;
    ButtonGroup radio;

    Pastelaria_java( )
    {
        setTitle("Bem vindo a pastelaria Java, o melhor pastel da internet!");
        setSize(800,600);
        setLocation(400,150);
        getContentPane().setBackground(new Color(255,246,143));

        Texto1 = new JLabel("Já é cliente? Digite seu código :");
        Texto1.setForeground(Color.black);
        Texto1.setLocation(20,5);
        Texto1.setSize(400,50);

        Texto2 = new JLabel("Digite sua senha :");
        Texto2.setForeground(Color.black);
        Texto2.setLocation(400,5);
        Texto2.setSize(400,50);

        Texto3 = new JLabel("Ainda não é? Então entre com os dados abaixo :");
        Texto3.setForeground(Color.black);
        Texto3.setLocation(20,40);
        Texto3.setSize(400,50);

        Nome = new JLabel("Nome :");
        Nome.setForeground(Color.black);
        Nome.setLocation(20,75);
        Nome.setSize(400,50);

        Endereco = new JLabel("Endereço :");
        Endereco.setForeground(Color.black);
        Endereco.setLocation(20,110);
        Endereco.setSize(400,50);

        Telefone = new JLabel("Telefone :");
        Telefone.setForeground(Color.black);
        Telefone.setLocation(20,145);
        Telefone.setSize(400,50);

        Email = new JLabel("Email :");
        Email.setForeground(Color.black);
        Email.setLocation(20,180);
        Email.setSize(400,50);

        Molhos = new JLabel("Molhos:");
        Molhos.setSize(200,20);
        Molhos.setLocation(580,190);

        CH1 = new JCheckBox("Molho vinagrete");
        CH1.setLocation(580,215);
        CH1.setSize(150,20);
        CH1.setBackground(new Color(217, 203,150));

        CH2 = new JCheckBox("Molho de pimenta");
        CH2.setLocation(580,240);
        CH2.setSize(150,20);
        CH2.setBackground(new Color(217, 203,150));

        CH3 = new JCheckBox("Molho de azeitona");
        CH3.setLocation(580,265);
        CH3.setSize(150,20);
        CH3.setBackground(new Color(217, 203,150));

        CH4 = new JCheckBox("Molho de alho");
        CH4.setLocation(580,290);
        CH4.setSize(150,20);
        CH4.setBackground(new Color(217, 203,150));

        Pagto = new JLabel("Forma de Pagamento:");
        Pagto.setSize(200,20);
        Pagto.setForeground(Color.black);
        Pagto.setLocation(580,320);

        String opcoes [ ] = { "Dinheiro ","PIX ","Cartão à vista ", "Cartão de crédito " };
        FPagto = new JComboBox( opcoes );
        FPagto.setSize(150,20);
        FPagto.setLocation(580,345);

        Entrega = new JLabel("Entrega:");
        Entrega.setSize(200,20);
        Entrega.setForeground(Color.black);
        Entrega.setLocation(580,380);

        J1 = new JRadioButton("Retira");
        J1.setSize(100,20);
        J1.setBackground(new Color(240, 255, 240));
        J1.setLocation(580,405);

        J2 = new JRadioButton("Delivery");
        J2.setSize(100,20);
        J2.setBackground(new Color(240, 255, 240));
        J2.setLocation(580,430);

        radio = new ButtonGroup( );
        radio.add(J1);
        radio.add(J2);

        S1 = new JPasswordField("");
        S1.setForeground(new Color(0,0,0));
        S1.setLocation(230,20);
        S1.setSize(100,25);

        S2 = new JPasswordField("");
        S2.setForeground(new Color(0,0,0));
        S2.setLocation(530,20);
        S2.setSize(100,25);

        C1 = new JTextField(" ");
        C1.setForeground(new Color(0,0,0));
        C1.setLocation(100,90);
        C1.setSize(530,25);

        C2 = new JTextField(" ");
        C2.setForeground(new Color(0,0,0));
        C2.setLocation(100,125);
        C2.setSize(530,25);

        C3 = new JTextField(" ");
        C3.setForeground(new Color(0,0,0));
        C3.setLocation(100,160);
        C3.setSize(100,25);

        C4 = new JTextField(" ");
        C4.setForeground(new Color(0,0,0));
        C4.setLocation(100,195);
        C4.setSize(245,25);

        C5 = new JTextField(" ");
        C5.setForeground(new Color(0,0,0));
        C5.setLocation(20,395);
        C5.setSize(250,25);

        C6 = new JTextField(" ");
        C6.setForeground(new Color(0,0,0));
        C6.setLocation(300,395);
        C6.setSize(250,25);

        B2 = new JButton("Limpar");
        B2.setForeground(new Color(0,0,0));
        B2.setBackground(new Color(217, 203,150));
        B2.setLocation(390,160);
        B2.setSize(100,25);
        B2.addActionListener((ActionListener) this);

        B3 = new JButton("Cadastrar");
        B3.setForeground(new Color(0,0,0));
        B3.setBackground(new Color(217, 203,150));
        B3.setLocation(390,195);
        B3.setSize(100,25);
        B3.addActionListener((ActionListener) this);

        M1 = new JMenuBar( );
        M1.setBackground(new Color(255,193,37));

        mi1 = new JMenuItem("Pastel de Carne");
        mi1.setBackground(new Color(217, 203,150));

        mi2 = new JMenuItem("Pastel de Queijo");
        mi2.setBackground(new Color(217, 203,150));

        mi3 = new JMenuItem("Pastel de Palmito");
        mi3.setBackground(new Color(217, 203,150));

        mi4 = new JMenuItem("Pastel de Pizza");
        mi4.setBackground(new Color(217, 203,150));

        bb1 = new JMenuItem("Caldo de Cana");
        bb1.setBackground(new Color(217, 203,150));

        bb2 = new JMenuItem("Refrigerante");
        bb2.setBackground(new Color(217, 203,150));

        bb3 = new JMenuItem("Chá Gelado");
        bb3.setBackground(new Color(217, 203,150));

        bb4 = new JMenuItem("Água");
        bb4.setBackground(new Color(217, 203,150));

        Menu1 = new JMenu("Cardápio");
        Menu1.setBackground(new Color(180,240,240));
        Menu1.add(mi1);
        Menu1.addSeparator();
        Menu1.add(mi2);
        Menu1.addSeparator();
        Menu1.add(mi3);
        Menu1.addSeparator();
        Menu1.add(mi4);

        Menu2 = new JMenu("Bebidas");
        Menu2.setBackground(new Color(180,240,240));
        Menu2.add(bb1);
        Menu2.addSeparator();
        Menu2.add(bb2);
        Menu2.addSeparator();
        Menu2.add(bb3);
        Menu2.addSeparator();
        Menu2.add(bb4);

        B4 = new JButton("Sair");
        B4.setBackground(new Color(255,193,37));
        B4.addActionListener((ActionListener) this);

        M1.add(Menu1);
        M1.add(Menu2);
        M1.add(B4);

        setJMenuBar(M1);

        img1 = new ImageIcon("./src/Tarefa_java/imagens/pastel_carne.jfif");
        img2 = new ImageIcon("./src/Tarefa_java/imagens/pastel_queijo.jfif");
        img3 = new ImageIcon("./src/Tarefa_java/imagens/pastel_palmito.jfif");
        img4 = new ImageIcon("./src/Tarefa_java/imagens/pastel_pizza.jfif");
        img5 = new ImageIcon("./src/Tarefa_java/imagens/caldo_cana.jfif");
        img6 = new ImageIcon("./src/Tarefa_java/imagens/refrigerante.jfif");
        img7 = new ImageIcon("./src/Tarefa_java/imagens/cha_gelado.jfif");
        img8 = new ImageIcon("./src/Tarefa_java/imagens/agua.jfif");

        L1 =new JLabel(img1);
        L2 =new JLabel(img2);
        L3 =new JLabel(img3);
        L4 =new JLabel(img4);
        L5 =new JLabel(img5);
        L6 =new JLabel(img6);
        L7 =new JLabel(img7);
        L8 =new JLabel(img8);

        B1 = new JButton("Confirmar");
        B1.setSize(100,25);
        B1.setLocation(580,500);
        B1.setBackground(new Color(255,193,37));
        B1.addActionListener((ActionListener) this);

        P1 =new JPanel();
        P1.setSize(250,140);
        P1.setLocation(20,250);
        P1.setBackground(new Color(217,203,150));
        P1.add(L1);
        P1.setVisible(false);

        P2 =new JPanel();
        P2.setSize(250,140);
        P2.setLocation(20,250);
        P2.setBackground(new Color(217,203,150));
        P2.add(L2);
        P2.setVisible(false);

        P3 =new JPanel();
        P3.setSize(250,140);
        P3.setLocation(20,250);
        P3.setBackground(new Color(217,203,150));
        P3.add(L3);
        P3.setVisible(false);

        P4 =new JPanel();
        P4.setSize(250,140);
        P4.setLocation(20,250);
        P4.setBackground(new Color(217,203,150));
        P4.add(L4);
        P4.setVisible(false);

        P5 =new JPanel();
        P5.setSize(250,140);
        P5.setLocation(300,250);
        P5.setBackground(new Color(217,203,150));
        P5.add(L5);
        P5.setVisible(false);

        P6 =new JPanel();
        P6.setSize(250,140);
        P6.setLocation(300,250);
        P6.setBackground(new Color(217,203,150));
        P6.add(L6);
        P6.setVisible(false);

        P7 =new JPanel();
        P7.setSize(250,140);
        P7.setLocation(300,250);
        P7.setBackground(new Color(217,203,150));
        P7.add(L7);
        P7.setVisible(false);

        P8 =new JPanel();
        P8.setSize(250,140);
        P8.setLocation(300,250);
        P8.setBackground(new Color(217,203,150));
        P8.add(L8);
        P8.setVisible(false);

        getContentPane().setLayout(null);
        getContentPane().add(P1);
        getContentPane().add(P2);
        getContentPane().add(P3);
        getContentPane().add(P4);
        getContentPane().add(P5);
        getContentPane().add(P6);
        getContentPane().add(P7);
        getContentPane().add(P8);
        getContentPane().add(B1);
        getContentPane().add(B2);
        getContentPane().add(B3);
        getContentPane().add(Texto1);
        getContentPane().add(Texto2);
        getContentPane().add(Texto3);
        getContentPane().add(Nome);
        getContentPane().add(Endereco);
        getContentPane().add(Telefone);
        getContentPane().add(Email);
        getContentPane().add(Molhos);
        getContentPane().add(CH1);
        getContentPane().add(CH2);
        getContentPane().add(CH3);
        getContentPane().add(CH4);
        getContentPane().add(Pagto);
        getContentPane().add(FPagto);
        getContentPane().add(Entrega);
        getContentPane().add(S1);
        getContentPane().add(S2);
        getContentPane().add(C1);
        getContentPane().add(C2);
        getContentPane().add(C3);
        getContentPane().add(C4);
        getContentPane().add(C5);
        getContentPane().add(C6);
        getContentPane().add(J1);
        getContentPane().add(J2);
        getContentPane().setBackground(new Color(240,255,240));
    }

}
