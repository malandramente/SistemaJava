package br.univel.telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.univel.classes.Control;

import java.awt.Toolkit;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.FlowLayout;

public class telasFrmWithdraw extends JFrame {

	private JPanel contentPane;
	private JTextField txtValue;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telasFrmWithdraw frame = new telasFrmWithdraw();
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
	public telasFrmWithdraw() {
		setTitle("Banco TADS");
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\JavaDOC\\Sistema\\icons\\Gg-48.png"));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 60);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setIcon(c.iconMain());
		lblNewLabel_1.setBounds(10, 4, 49, 52);
		panel.add(lblNewLabel_1);
		
		JLabel lblTitle = new JLabel(c.getTitleTADS());
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitle.setForeground(Color.BLACK);
		lblTitle.setBounds(85, 11, 113, 17);
		panel.add(lblTitle);
		
		JLabel lblSubTitle = new JLabel(c.getSubTitle());
		lblSubTitle.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblSubTitle.setBounds(85, 35, 180, 20);
		panel.add(lblSubTitle);
		
		JLabel lblDate = new JLabel();
		lblDate.setText(c.getDate()+" - "+c.getHour());
		lblDate.setBounds(295, 2, 113, 14);
		panel.add(lblDate);
		
		JLabel lblAG = new JLabel("AG: 0000-00");
		lblAG.setBounds(295, 16, 113, 14);
		panel.add(lblAG);
		
		JLabel lblTypeAcc = new JLabel("$TipoConta: 00000-00");
		lblTypeAcc.setBounds(295, 30, 129, 14);
		panel.add(lblTypeAcc);
		
		JLabel lblSaldo = new JLabel("Saldo: R$ 0,00");
		lblSaldo.setBounds(295, 43, 113, 14);
		panel.add(lblSaldo);
		
		JButton btn50 = new JButton("R$ 50,00");
		btn50.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn50.setBounds(10, 71, 195, 49);
		contentPane.add(btn50);
		
		JButton btn150 = new JButton("R$ 150,00");
		btn150.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn150.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btn150.setBounds(229, 71, 195, 49);
		contentPane.add(btn150);
		
		JButton btn100 = new JButton("R$ 100,00");
		btn100.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn100.setBounds(10, 131, 195, 49);
		contentPane.add(btn100);
		
		JButton btn500 = new JButton("R$ 500,00");
		btn500.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn500.setBounds(10, 191, 195, 49);
		contentPane.add(btn500);
		
		JButton btn200 = new JButton("R$ 200,00");
		btn200.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btn200.setBounds(229, 131, 195, 49);
		contentPane.add(btn200);
		
		JLabel lblNewLabel = new JLabel("Informe outro valor");
		lblNewLabel.setBounds(229, 191, 132, 15);
		contentPane.add(lblNewLabel);
		
		txtValue = new JTextField();
		txtValue.setBounds(229, 208, 95, 32);
		contentPane.add(txtValue);
		txtValue.setColumns(10);
		
		JButton btnConfirme = new JButton("Confirme");
		btnConfirme.setBounds(329, 208, 95, 32);
		contentPane.add(btnConfirme);
	}
}
