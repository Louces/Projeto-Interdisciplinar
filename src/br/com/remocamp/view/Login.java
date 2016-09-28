package br.com.remocamp.view;

import java.awt.EventQueue;
import java.awt.Window.Type;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Login {

	private JFrame frmRemocamp;
	private JPasswordField txtPass;
	private JTextField txtUsuario;
        public static String [] argumentos;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
                argumentos=args;
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login window = new Login();
					window.frmRemocamp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Login() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmRemocamp = new JFrame();
		frmRemocamp.setTitle("\u00A9 REMOCAMP - AMBUL\u00C2NCIAS");
		frmRemocamp.setType(Type.UTILITY);
		frmRemocamp.setBounds(100, 100, 299, 150);
		frmRemocamp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmRemocamp.setLocationRelativeTo(null); // to center
		frmRemocamp.getContentPane().setLayout(null);

		txtPass = new JPasswordField();
		txtPass.setBounds(82, 45, 150, 20);
                txtPass.setText("adm");
		frmRemocamp.getContentPane().add(txtPass);

		txtUsuario = new JTextField();
		txtUsuario.setText("adm");
		txtUsuario.setBounds(82, 11, 150, 20);
		frmRemocamp.getContentPane().add(txtUsuario);
		txtUsuario.setColumns(10);

		JLabel lblUsuario = new JLabel("Usuario");
		lblUsuario.setBounds(26, 14, 46, 14);
		frmRemocamp.getContentPane().add(lblUsuario);

		JLabel lblSenha = new JLabel("Senha");
		lblSenha.setBounds(26, 48, 46, 14);
		frmRemocamp.getContentPane().add(lblSenha);

		JButton btnEntrar = new JButton("Entrar");
		btnEntrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (txtUsuario.getText().equals("adm") && txtPass.getText().equals("adm")) {
					Principal principal = new Principal();
					principal.show();
					frmRemocamp.dispose();
				} else
					JOptionPane.showMessageDialog(null, "Usuário ou senha incorreta, tente novamente.");

			}
		});
		btnEntrar.setBounds(48, 76, 89, 23);
		frmRemocamp.getContentPane().add(btnEntrar);

		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnCancelar.setBounds(147, 76, 89, 23);
		frmRemocamp.getContentPane().add(btnCancelar);
	}
}
