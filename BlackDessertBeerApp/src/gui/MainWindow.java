package gui;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import java.awt.BorderLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class MainWindow {

	private JFrame frame;
	private JTextField txtCereal;
	private JTextField txtWatter;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainWindow window = new MainWindow();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage("C:\\Users\\Martínez\\git\\black-desert-beer-app\\BlackDessertBeerApp\\img\\logo.og.png"));
		frame.setAlwaysOnTop(true);
		frame.setBounds(100, 100, 195, 378);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel pnTitle = new JPanel();
		frame.getContentPane().add(pnTitle, BorderLayout.NORTH);
		
		JLabel lblTitle = new JLabel("Beer Calculator");
		lblTitle.setFont(new Font("Tahoma", Font.PLAIN, 20));
		pnTitle.add(lblTitle);
		
		JPanel pnCentre = new JPanel();
		frame.getContentPane().add(pnCentre, BorderLayout.CENTER);
		pnCentre.setLayout(null);
		
		JLabel lblCereal = new JLabel("");
		lblCereal.setIcon(new ImageIcon("C:\\Users\\Martínez\\git\\black-desert-beer-app\\BlackDessertBeerApp\\img\\00007005.png"));
		lblCereal.setBounds(40, 11, 44, 44);
		pnCentre.add(lblCereal);
		
		JLabel lblWatter = new JLabel("");
		lblWatter.setIcon(new ImageIcon("C:\\Users\\Martínez\\git\\black-desert-beer-app\\BlackDessertBeerApp\\img\\00009059.png"));
		lblWatter.setBounds(40, 66, 44, 44);
		pnCentre.add(lblWatter);
		
		JLabel lblLeaveningAgent = new JLabel("");
		lblLeaveningAgent.setIcon(new ImageIcon("C:\\Users\\Martínez\\git\\black-desert-beer-app\\BlackDessertBeerApp\\img\\00009005.png"));
		lblLeaveningAgent.setBounds(40, 121, 44, 44);
		pnCentre.add(lblLeaveningAgent);
		
		JLabel lblSugar = new JLabel("");
		lblSugar.setIcon(new ImageIcon("C:\\Users\\Martínez\\git\\black-desert-beer-app\\BlackDessertBeerApp\\img\\00009002.png"));
		lblSugar.setBounds(40, 176, 44, 44);
		pnCentre.add(lblSugar);
		
		JLabel lblBeer = new JLabel("");
		lblBeer.setIcon(new ImageIcon("C:\\Users\\Martínez\\git\\black-desert-beer-app\\BlackDessertBeerApp\\img\\00009213.png"));
		lblBeer.setBounds(40, 266, 44, 44);
		pnCentre.add(lblBeer);
		
		JLabel lblDivider = new JLabel("");
		lblDivider.setBounds(10, 231, 46, 14);
		pnCentre.add(lblDivider);
		
		JLabel lblBasicAmmountCereal = new JLabel("x5");
		lblBasicAmmountCereal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBasicAmmountCereal.setBounds(10, 23, 46, 25);
		pnCentre.add(lblBasicAmmountCereal);
		
		JLabel lblBasicAmmountWatter = new JLabel("x6");
		lblBasicAmmountWatter.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBasicAmmountWatter.setBounds(10, 77, 46, 25);
		pnCentre.add(lblBasicAmmountWatter);
		
		JLabel lblBasicAmmountLeaveningAgent = new JLabel("x2");
		lblBasicAmmountLeaveningAgent.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBasicAmmountLeaveningAgent.setBounds(10, 131, 46, 25);
		pnCentre.add(lblBasicAmmountLeaveningAgent);
		
		JLabel lblBasicAmmountSugar = new JLabel("x1");
		lblBasicAmmountSugar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBasicAmmountSugar.setBounds(10, 183, 46, 25);
		pnCentre.add(lblBasicAmmountSugar);
		
		JLabel lblBasicAmmountBeer = new JLabel("x1");
		lblBasicAmmountBeer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBasicAmmountBeer.setBounds(10, 274, 46, 25);
		pnCentre.add(lblBasicAmmountBeer);
		
		txtCereal = new JTextField();
		txtCereal.setToolTipText("Introduce ammount of cereal you are going to process");
		txtCereal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtCereal.setBounds(94, 23, 86, 26);
		pnCentre.add(txtCereal);
		txtCereal.setColumns(10);
		
		txtWatter = new JTextField();
		txtWatter.setEditable(false);
		txtWatter.setToolTipText("Ammount of 'Mineral Watter' needed");
		txtWatter.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtWatter.setColumns(10);
		txtWatter.setBounds(94, 76, 86, 26);
		pnCentre.add(txtWatter);
		
		textField = new JTextField();
		textField.setToolTipText("Ammount of 'Leavening Agent' needed");
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBounds(94, 130, 86, 26);
		pnCentre.add(textField);
		
		textField_1 = new JTextField();
		textField_1.setToolTipText("Ammount of 'Sugar' needed");
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBounds(94, 182, 86, 26);
		pnCentre.add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setToolTipText("Ammount of 'Beer' created");
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField_2.setEditable(false);
		textField_2.setColumns(10);
		textField_2.setBounds(94, 273, 86, 26);
		pnCentre.add(textField_2);
		
		JLabel label = new JLabel("=");
		label.setFont(new Font("Tahoma", Font.PLAIN, 20));
		label.setBounds(79, 231, 44, 14);
		pnCentre.add(label);
	}
}
