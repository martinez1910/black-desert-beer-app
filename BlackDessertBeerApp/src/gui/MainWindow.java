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
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class MainWindow {

	private JFrame frame;
	private JTextField txtCereal;
	private JTextField txtWater;
	private JTextField txtLeaveningAgent;
	private JTextField txtSugar;
	private JTextField txtBeer;
	

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
		frame.setIconImage(Toolkit.getDefaultToolkit().getImage(MainWindow.class.getResource("/img/logo.og.png")));
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
		lblCereal.setIcon(new ImageIcon(MainWindow.class.getResource("/img/00007005.png")));
		lblCereal.setBounds(40, 11, 44, 44);
		pnCentre.add(lblCereal);
		
		JLabel lblWater = new JLabel("");
		lblWater.setIcon(new ImageIcon(MainWindow.class.getResource("/img/00009059.png")));
		lblWater.setBounds(40, 66, 44, 44);
		pnCentre.add(lblWater);
		
		JLabel lblLeaveningAgent = new JLabel("");
		lblLeaveningAgent.setIcon(new ImageIcon(MainWindow.class.getResource("/img/00009005.png")));
		lblLeaveningAgent.setBounds(40, 121, 44, 44);
		pnCentre.add(lblLeaveningAgent);
		
		JLabel lblSugar = new JLabel("");
		lblSugar.setIcon(new ImageIcon(MainWindow.class.getResource("/img/00009002.png")));
		lblSugar.setBounds(40, 176, 44, 44);
		pnCentre.add(lblSugar);
		
		JLabel lblBeer = new JLabel("");
		lblBeer.setIcon(new ImageIcon(MainWindow.class.getResource("/img/00009213.png")));
		lblBeer.setBounds(40, 266, 44, 44);
		pnCentre.add(lblBeer);
		
		JLabel lblBasicAmmountCereal = new JLabel("x5");
		lblBasicAmmountCereal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBasicAmmountCereal.setBounds(10, 23, 46, 25);
		pnCentre.add(lblBasicAmmountCereal);
		
		JLabel lblBasicAmmountWater = new JLabel("x6");
		lblBasicAmmountWater.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblBasicAmmountWater.setBounds(10, 77, 46, 25);
		pnCentre.add(lblBasicAmmountWater);
		
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
		txtCereal.addKeyListener(new KeyAdapter() {
			@Override
			public void keyReleased(KeyEvent arg0) {
				calculate();
			}
		});
		txtCereal.setToolTipText("Introduce ammount of cereal you are going to process");
		txtCereal.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtCereal.setBounds(94, 23, 86, 26);
		pnCentre.add(txtCereal);
		txtCereal.setColumns(10);
		
		txtWater = new JTextField();
		txtWater.setEditable(false);
		txtWater.setToolTipText("Ammount of 'Mineral Water' needed");
		txtWater.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtWater.setColumns(10);
		txtWater.setBounds(94, 76, 86, 26);
		pnCentre.add(txtWater);
		
		txtLeaveningAgent = new JTextField();
		txtLeaveningAgent.setToolTipText("Ammount of 'Leavening Agent' needed");
		txtLeaveningAgent.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtLeaveningAgent.setEditable(false);
		txtLeaveningAgent.setColumns(10);
		txtLeaveningAgent.setBounds(94, 130, 86, 26);
		pnCentre.add(txtLeaveningAgent);
		
		txtSugar = new JTextField();
		txtSugar.setToolTipText("Ammount of 'Sugar' needed");
		txtSugar.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtSugar.setEditable(false);
		txtSugar.setColumns(10);
		txtSugar.setBounds(94, 182, 86, 26);
		pnCentre.add(txtSugar);
		
		txtBeer = new JTextField();
		txtBeer.setToolTipText("Minimum ammount of 'Beer' created");
		txtBeer.setFont(new Font("Tahoma", Font.PLAIN, 20));
		txtBeer.setEditable(false);
		txtBeer.setColumns(10);
		txtBeer.setBounds(94, 273, 86, 26);
		pnCentre.add(txtBeer);
		
		JLabel lblDivider = new JLabel("You will get:");
		lblDivider.setFont(new Font("Tahoma", Font.PLAIN, 19));
		lblDivider.setBounds(10, 231, 227, 24);
		pnCentre.add(lblDivider);
	}
	
	private void calculate() {
		//Wraps non-editable JTextFields
		JTextField[] nonEditableTextFields = {txtWater,txtLeaveningAgent,txtSugar,txtBeer};
		
		String strNumCereals = txtCereal.getText();
		int numCereals;
		
		//This try-catch forces the program to show NaN when first key introduced is not a number.
		try {
			numCereals = Integer.parseInt(strNumCereals);
		}catch(NumberFormatException e){
			numCereals = 0;
		}
		
		//If not number or lower than minimum write NaN (Not a Number).
		if(!isNumeric(strNumCereals) || numCereals < 5)
			for(JTextField txtField : nonEditableTextFields)
				txtField.setText("NaN");
		else {
			int beers = numCereals / 5;
			nonEditableTextFields[0].setText(Integer.toString(beers*6));//Water
			nonEditableTextFields[1].setText(Integer.toString(beers*2));//Leavening Agent
			nonEditableTextFields[2].setText(Integer.toString(beers*1));//Sugar
			nonEditableTextFields[3].setText(Integer.toString(beers));//Beer
		}
	}
	
	private boolean isNumeric(String s) {  
	    return s != null && s.matches("[-+]?\\d*\\.?\\d+");  
	} 
	
}
