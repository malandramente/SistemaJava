package br.univel.telas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.univel.classes.Control;

import javax.print.DocFlavor.URL;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Font;
import java.awt.Toolkit;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class telasFrmMain extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telasFrmMain frame = new telasFrmMain();
					frame.setVisible(true);
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	Control c = new Control();
	
	/**
	 * Create the frame.
	 */
	public telasFrmMain() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\JavaDOC\\Sistema\\icons\\Gg-48.png"));
		setTitle("Banco TADS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 264);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 60);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblIcon = new JLabel("");
		lblIcon.setIcon(c.iconMain());
		
		lblIcon.setBounds(10, 11, 71, 48);
		panel.add(lblIcon);
		
		JLabel lblBancoTads = new JLabel(c.getTitleTADS());
		lblBancoTads.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblBancoTads.setForeground(Color.BLACK);
		lblBancoTads.setBounds(85, 11, 113, 17);
		panel.add(lblBancoTads);
		
		JLabel lblAquiSuaNota = new JLabel(c.getSubTitle());
		lblAquiSuaNota.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblAquiSuaNota.setBounds(85, 35, 180, 20);
		panel.add(lblAquiSuaNota);
		
		JLabel lblData = new JLabel();
		lblData.setText(c.getDate()+" - "+c.getHour());
		lblData.setBounds(295, 2, 113, 14);
		panel.add(lblData);
		
		JLabel lblAencia = new JLabel("AG: 0000-00");
		lblAencia.setBounds(295, 16, 113, 14);
		panel.add(lblAencia);
		
		JLabel lblTipoConta = new JLabel("$TipoConta: 00000-00");
		lblTipoConta.setBounds(295, 30, 128, 14);
		panel.add(lblTipoConta);
		
		JLabel lblSaldo = new JLabel("Saldo: R$ 0,00");
		lblSaldo.setBounds(295, 43, 113, 14);
		panel.add(lblSaldo);
		
		JButton btn1 = new JButton("1 - Informa\u00E7\u00F5es de contas");
		btn1.setBounds(10, 71, 200, 40);
		contentPane.add(btn1);
		
		JButton btn4 = new JButton("4 - Profissinais");
		btn4.setBounds(220, 71, 200, 40);
		contentPane.add(btn4);
		
		JButton btn2 = new JButton("2 - Nova conta");
		btn2.setBounds(10, 122, 200, 40);
		contentPane.add(btn2);
		
		JButton btn5 = new JButton("5 - Balan\u00E7o");
		btn5.setBounds(220, 122, 200, 40);
		contentPane.add(btn5);
		
		JButton btn3 = new JButton("3 - Clientes");
		btn3.setBounds(10, 173, 200, 40);
		contentPane.add(btn3);
		
		JButton btn6 = new JButton("6 - Ag\u00EAncias");
		btn6.setBounds(220, 173, 200, 40);
		contentPane.add(btn6);
		
	}
}
