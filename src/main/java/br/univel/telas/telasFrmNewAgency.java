package br.univel.telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import br.univel.classes.Control;
import java.awt.Toolkit;

public class telasFrmNewAgency extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telasFrmNewAgency frame = new telasFrmNewAgency();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Control c = new Control();
	private JTextField txtNome;
	private JTextField txtNumero;
	private JTextField txtCidade;
	/**
	 * Create the frame.
	 */
	public telasFrmNewAgency() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\JavaDOC\\Sistema\\icons\\Gg-48.png"));
		setTitle("Banco TADS");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	
		JPanel panel = new JPanel();
		panel.setBounds(0, 0, 434, 60);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel();
		lblNewLabel_1.setBounds(10, 4, 49, 52);
		lblNewLabel_1.setIcon(c.iconMain());
		panel.add(lblNewLabel_1);
		
		JLabel lblTitle = new JLabel(c.getTitleTADS());
		lblTitle.setBounds(85, 11, 113, 17);
		lblTitle.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblTitle.setForeground(Color.BLACK);
		panel.add(lblTitle);
		
		JLabel lblSubTitle = new JLabel(c.getSubTitle());
		lblSubTitle.setBounds(85, 35, 180, 20);
		lblSubTitle.setFont(new Font("Tahoma", Font.PLAIN, 13));
		panel.add(lblSubTitle);
		
		JLabel lblDate = new JLabel();
		lblDate.setBounds(295, 2, 113, 14);
		lblDate.setText(c.getDate()+" - "+c.getHour());
		panel.add(lblDate);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 68, 424, 183);
		panel.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Nome:");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(100, 11, 63, 22);
		panel_1.add(lblNewLabel);
		
		JLabel lblNmero = new JLabel("N\u00FAmero:");
		lblNmero.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNmero.setBounds(100, 56, 86, 22);
		panel_1.add(lblNmero);
		
		JLabel lblCidade = new JLabel("Cidade:");
		lblCidade.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblCidade.setBounds(100, 100, 74, 22);
		panel_1.add(lblCidade);
		
		txtNome = new JTextField();
		txtNome.setBounds(100, 33, 238, 20);
		panel_1.add(txtNome);
		txtNome.setColumns(10);
		
		txtNumero = new JTextField();
		txtNumero.setColumns(10);
		txtNumero.setBounds(100, 78, 238, 20);
		panel_1.add(txtNumero);
		
		txtCidade = new JTextField();
		txtCidade.setColumns(10);
		txtCidade.setBounds(100, 122, 238, 20);
		panel_1.add(txtCidade);
		
		JButton btnConfirme = new JButton("Confirme");
		btnConfirme.setBounds(249, 153, 89, 23);
		panel_1.add(btnConfirme);

	}

}
