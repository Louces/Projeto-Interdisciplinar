package br.com.remocamp.view;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;

public class Remocao extends JInternalFrame {

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Remocao frame = new Remocao();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Remocao() {
		setTitle("Remo\u00E7ao - Reserva de ambulancia");
		setBounds(100, 100, 450, 644);

	}

}
