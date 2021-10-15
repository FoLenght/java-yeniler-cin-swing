import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Component;
import javax.swing.Box;
import java.awt.Color;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class selam extends JFrame {

	private JPanel contentPane;
	private JTextField txtSelam;
	private Component horizontalStrut;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					selam frame = new selam();
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
	public selam() {
		setForeground(Color.ORANGE);
		setTitle("Selam");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 828, 472);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblNewLabel = new JLabel("Selam ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblNewLabel.setToolTipText("");
		contentPane.add(lblNewLabel, BorderLayout.CENTER);
		
		
		txtSelam = new JTextField();
		txtSelam.setText("Selam");
		txtSelam.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(txtSelam, BorderLayout.SOUTH);
		txtSelam.setColumns(10);

		
		JButton btnNewButton = new JButton("Yaz");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblNewLabel.setText(txtSelam.getText());
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 30));
		contentPane.add(btnNewButton, BorderLayout.NORTH);
		
		horizontalStrut = Box.createHorizontalStrut(309);
		contentPane.add(horizontalStrut, BorderLayout.WEST);
		
	}

}
