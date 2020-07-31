package fegopa;


import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import DAOVO.��û��_DAO;
import DAOVO.��û��_VO;

import javax.swing.JTextArea;

public class �ν���û�� {

	private JFrame frame;
	private JTextField �̸�;
	private JTextField ����ڹ�ȣ;
	private JTextField ����ó;
	private JTextField ����ν���ȣ;
	private JTextField �ν�����;
	private JTextField �ν��Ұ�;

	��û��_DAO ��ûdao = new ��û��_DAO();
	private JTextField ÷������;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					�ν���û�� window = new �ν���û��();
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
	public �ν���û��() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 359, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		�̸� = new JTextField();
		�̸�.setBounds(65, 85, 218, 21);
		frame.getContentPane().add(�̸�);
		�̸�.setColumns(10);

		����ڹ�ȣ = new JTextField();
		����ڹ�ȣ.setColumns(10);
		����ڹ�ȣ.setBounds(65, 121, 218, 21);
		frame.getContentPane().add(����ڹ�ȣ);

		����ó = new JTextField();
		����ó.setColumns(10);
		����ó.setBounds(65, 156, 218, 21);
		frame.getContentPane().add(����ó);

		����ν���ȣ = new JTextField();
		����ν���ȣ.setColumns(10);
		����ν���ȣ.setBounds(65, 191, 218, 21);
		frame.getContentPane().add(����ν���ȣ);

		�ν����� = new JTextField();
		�ν�����.setColumns(10);
		�ν�����.setBounds(65, 226, 218, 21);
		frame.getContentPane().add(�ν�����);

		�ν��Ұ� = new JTextField();
		�ν��Ұ�.setColumns(10);
		�ν��Ұ�.setBounds(65, 267, 218, 71);
		frame.getContentPane().add(�ν��Ұ�);

		÷������ = new JTextField();
		÷������.setBounds(65, 381, 218, 21);
		frame.getContentPane().add(÷������);
		÷������.setColumns(10);
		
		JButton ���Ϻҷ����� = new JButton("");
		���Ϻҷ�����.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				File file = null;
				JFileChooser chooser = new JFileChooser();
				int val = chooser.showSaveDialog(null);
				if (val == 0) {
					file = chooser.getSelectedFile();
					÷������.setText(file.getName());
				}

			}
		});
		
		
		���Ϻҷ�����.setBounds(126, 348, 97, 23);
		frame.getContentPane().add(���Ϻҷ�����);

		JButton �ڷΰ��� = new JButton("");
		�ڷΰ���.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				����������_�Ϲ�.main(null);

			}
		});
		�ڷΰ���.setBounds(57, 421, 97, 23);
		frame.getContentPane().add(�ڷΰ���);

		JButton ��û�Ϸ� = new JButton("");
		��û�Ϸ�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				��û��_VO vo = new ��û��_VO(�̸�.getText(), ����ڹ�ȣ.getText(), ����ó.getText(), ����ν���ȣ.getText(), �ν��Ұ�.getText(), ÷������.getText());
				if (�̸�.getText().equals("") || ����ڹ�ȣ.getSelectedText().equals("") || ����ó.getSelectedText().equals("")
						|| ����ν���ȣ.getSelectedText().equals("")) {
					��ûdao.insertApply(vo);
					JOptionPane.showMessageDialog(null, "��û�Ϸ�");
				} else {
					JOptionPane.showMessageDialog(null, "��ĭ�� ������ Ȯ�����ּ���");
				}

			}
		});
		��û�Ϸ�.setBounds(193, 421, 97, 23);
		frame.getContentPane().add(��û�Ϸ�);

		String url = getClass().getResource("").getPath();
		Image image18 = new ImageIcon(url + "image/18.png").getImage();
		JLabel lbl_img18 = new JLabel(new ImageIcon(image18.getScaledInstance(343, 481, Image.SCALE_SMOOTH)));
		lbl_img18.setBounds(0, 0, 343, 481);
		frame.getContentPane().add(lbl_img18);
		
		

	}
}
