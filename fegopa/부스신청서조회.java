package fegopa;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 부스신청서조회 {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					부스신청서조회 window = new 부스신청서조회();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public 부스신청서조회() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 359, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		

		
		JPanel panel = new JPanel();
		panel.setBounds(12, 10, 319, 461);
		panel.setBackground(new Color(255,0,0,0));
		frame.getContentPane().add(panel);
		
		JButton btn_뒤로가기 = new JButton("");
		btn_뒤로가기.setBounds(266, 0, 53, 53);
		btn_뒤로가기.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame.dispose();
				마이페이지_일반.main(null);
				
			}
		});
		panel.setLayout(null);
		panel.add(btn_뒤로가기);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 155, 295, 296);
		panel.add(scrollPane);
		
		
		String url = getClass().getResource("").getPath();
		Image image15 = new ImageIcon(url + "image/15.png").getImage();
		JLabel lbl_img15 = new JLabel(new ImageIcon(image15.getScaledInstance(343, 481, Image.SCALE_SMOOTH)));
		lbl_img15.setBounds(0, 0, 343, 481);
		frame.getContentPane().add(lbl_img15);
	

	}
}
