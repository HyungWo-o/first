package fegopa;


import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import DAOVO.��û��_VO;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class �ν���û��_���� {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					�ν���û��_���� window = new �ν���û��_����();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public �ν���û��_����() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 359, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		textField = new JTextField();
		textField.setBounds(64, 84, 218, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(64, 123, 218, 21);
		frame.getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(64, 155, 218, 21);
		frame.getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setColumns(10);
		textField_3.setBounds(64, 192, 218, 21);
		frame.getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(64, 225, 218, 21);
		frame.getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setColumns(10);
		textField_5.setBounds(64, 263, 218, 21);
		frame.getContentPane().add(textField_5);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(64, 302, 218, 58);
		frame.getContentPane().add(textField_6);
		
		JButton �ڷΰ���_�����Ϲ� = new JButton("");
		�ڷΰ���_�����Ϲ�.setBounds(47, 425, 76, 23);
		frame.getContentPane().add(�ڷΰ���_�����Ϲ�);
		�ڷΰ���_�����Ϲ�.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				����������_�Ϲ�.main(null); 
			}
		});

		
		JButton �����ϱ� = new JButton("");
		
		�����ϱ�.setBounds(135, 425, 76, 23);
		frame.getContentPane().add(�����ϱ�);
		�����ϱ�.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				��û��_VO ��û��_vo = new ��û��_VO();
				
				
				
				
				frame.dispose();
				����������_�Ϲ�.main(null);
//				�˾�â ����� �����Ͻðڽ��ϱ� Ȯ�� �˾� ���� Ȯ�� ������ ������ �̵�
			}
		});
		�����ϱ�.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton �����Ϸ� = new JButton("");
		�����Ϸ�.setBounds(223, 425, 76, 23);
		frame.getContentPane().add(�����Ϸ�);
		�����Ϸ�.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				����������_�Ϲ�.main(null); 
			}
		});

		
		
		JButton ���Ϻҷ����� = new JButton("");
		���Ϻҷ�����.setBounds(135, 392, 76, 23);
		frame.getContentPane().add(���Ϻҷ�����);
		
		String url = getClass().getResource("").getPath();
		Image image19 = new ImageIcon(url + "image/19.png").getImage();
		JLabel lbl_img19 = new JLabel(new ImageIcon(image19.getScaledInstance(343, 481, Image.SCALE_SMOOTH)));
		lbl_img19.setBounds(0, 0, 343, 481);
		frame.getContentPane().add(lbl_img19);
	}

}
