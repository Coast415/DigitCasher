package digitCasher;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.JSlider;
import javax.swing.JScrollBar;
import javax.swing.JTable;

public class Class2 {

	private JFrame frmClass;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void newScreen() {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Class2 window = new Class2();
					window.frmClass.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Class2() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmClass = new JFrame();
		frmClass.setTitle("Class2");
		frmClass.setBounds(100, 100, 450, 300);
		frmClass.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmClass.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(397, 41, -327, 143);
		frmClass.getContentPane().add(panel);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.YELLOW);
		panel_1.setBounds(377, 41, -307, 155);
		frmClass.getContentPane().add(panel_1);
		
		JPanel panel_2 = new JPanel();
		panel_2.setToolTipText("X ");
		panel_2.setBackground(Color.YELLOW);
		panel_2.setBounds(100, 41, 277, 125);
		frmClass.getContentPane().add(panel_2);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(380, 41, 17, 125);
		frmClass.getContentPane().add(scrollBar);
		
		table = new JTable();
		table.setBackground(Color.GREEN);
		table.setBounds(89, 41, -72, 125);
		frmClass.getContentPane().add(table);
	}
}
