package br.univel.telas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import br.univel.classes.Control;
import javax.swing.JButton;
import java.awt.GridBagLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.io.IOException;
import java.net.URL;
import java.awt.GridBagConstraints;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JTable;
import java.awt.Toolkit;

public class telasFrmRegisterEditing extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telasFrmRegisterEditing frame = new telasFrmRegisterEditing();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	Control c = new Control();
	private JTable table;
	/**
	 * Create the frame.
	 */
	public telasFrmRegisterEditing() {
		setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\JavaDOC\\Sistema\\icons\\Gg-48.png"));
		setTitle("Banco TADS");
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
		
		JPanel panel_1 = new JPanel();
		panel_1.setBounds(0, 230, 434, 31);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		ImageIcon iconDelete = new ImageIcon("C:\\JavaDOC\\Sistema\\icons\\Delete-52.png");
		Image imgDelete = iconDelete.getImage();
		BufferedImage biDelete = new BufferedImage(imgDelete.getWidth(null), 
				imgDelete.getHeight(null), BufferedImage.TYPE_INT_ARGB);
		Graphics gDelete = biDelete.createGraphics();
		gDelete.drawImage(imgDelete, 10, 14, 30, 26, null);
		ImageIcon newIconDelete = new ImageIcon(biDelete);
		
		JButton btnAdd = new JButton("");
		btnAdd.setIcon(newIconDelete);
		btnAdd.setPreferredSize(new Dimension(50,50));
		btnAdd.setBounds(390, 4, 40, 23);
		panel_1.add(btnAdd);
		
		ImageIcon iconEdit = new ImageIcon("C:/JavaDOC/Sistema/icons/Edit-52.png");
		Image imgEdit = iconEdit.getImage();
		BufferedImage biEdit = new BufferedImage(imgEdit.getWidth(null), 
				imgEdit.getHeight(null), BufferedImage.TYPE_INT_ARGB);
		Graphics gEdit = biEdit.createGraphics();
		gEdit.drawImage(imgEdit, 15, 16, 19, 20, null);
		ImageIcon newIconEdit = new ImageIcon(biEdit);
		
		
		JButton btnEdit = new JButton("");
		btnEdit.setIcon(newIconEdit);
		btnEdit.setPreferredSize(new Dimension(50, 50));
		btnEdit.setBounds(350, 4, 40, 23);
		panel_1.add(btnEdit);
		
		JPanel panelTable = new JPanel();
		panelTable.setBounds(0, 59, 434, 172);
		contentPane.add(panelTable);
		panelTable.setLayout(null);
		
		table = new JTable();
		table.setBounds(35, 25, 1, 1);
		panelTable.add(table);

	}
}
