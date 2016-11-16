package digitCasher;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginForm {

	private JFrame frame;
	private JTextField UN;
	private JPasswordField passwordField;
	private JLabel lblLogin;
	private JButton btnNewButton;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LoginForm window = new LoginForm();
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
	public LoginForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 454, 422);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Username");
		lblNewLabel.setBounds(61, 83, 84, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Password");
		lblNewLabel_1.setBounds(61, 131, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		UN = new JTextField();
		UN.setBounds(155, 80, 153, 20);
		frame.getContentPane().add(UN);
		UN.setColumns(10);
		
		passwordField = new JPasswordField();
		passwordField.setBounds(155, 128, 153, 20);
		frame.getContentPane().add(passwordField);
		
		lblLogin = new JLabel("Login");
		lblLogin.setBounds(188, 11, 46, 14);
		frame.getContentPane().add(lblLogin);
		
		btnNewButton = new JButton("Log in");
		btnNewButton.addActionListener(new ActionListener() {
			private JLabel jTextField1;
			private JPasswordField jPasswordField1;

			public void actionPerformed(ActionEvent e) {
				try{ jTextField1 = null;
				String username=jTextField1.getText(); jPasswordField1 = null;
				char[] pwd=jPasswordField1.getPassword(); String password=new String(pwd); if(username.equals("admin")&&password.equals("password")){ JOptionPane.showMessageDialog(null,"Valid User"); } else JOptionPane.showMessageDialog(null,"Invalid User"); } catch(Exception e1){ System.out.println(e1.getMessage());
				} 
					
				 {
					Class2 nw = new Class2();
			nw.newScreen();
					 JOptionPane.showMessageDialog(null,"Welcome");
					
					
				}
			}
		});
				
		
	
		btnNewButton.setBounds(177, 176, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnLogin = new JButton("Log in");
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				try {
					
				} catch (Exception ex) {
					JOptionPane.showMessageDialog(null,"Welcome");
				}
			}
		});
	}
}
					