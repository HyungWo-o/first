package fegopa;


import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import DAOVO.�Ϲ�ȸ��_DAO;

public class ����������_�Ϲ� {
	�Ϲ�ȸ��_DAO �Ϲ�dao = new �Ϲ�ȸ��_DAO();
	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					����������_�Ϲ� window = new ����������_�Ϲ�();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public ����������_�Ϲ�() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 359, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton ���������̵���ư = new JButton("exit");
		
		���������̵���ư.setBounds(264, 10, 67, 48);

		frame.getContentPane().add(���������̵���ư);

		���������̵���ư.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				frame.dispose();
				//����������.main(null); //���� �ȸ���
				//������������ �α��� ��ư �����
//			}
		});
		
		
		JButton �α׾ƿ���ư = new JButton("�α׾ƿ�");
		�α׾ƿ���ư.setBounds(224, 83, 107, 27);
		frame.getContentPane().add(�α׾ƿ���ư);

		�α׾ƿ���ư.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				�α׾ƿ���ư.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						frame.dispose();
						�α���������.main(null); 
						//���� �ʱ�ȭ �� �������� �̵� or �α����������� �̵�
						//��ɱ���x
					}
				});
			}
		});
		
		JButton �ν���û��ư = new JButton("\uBD80\uC2A4\uC2E0\uCCAD");
		�ν���û��ư.setBounds(30, 164, 280, 55);
		frame.getContentPane().add(�ν���û��ư);
		
		�ν���û��ư.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				�ν���û��.main(null); 
			}
		});

		JButton ��û��_�������� = new JButton("\uBD80\uC2A4\uC2E0\uCCAD\uC11C_\uC218/\uC0AD");
		��û��_��������.setBounds(30, 244, 269, 60);

		frame.getContentPane().add(��û��_��������);
		
		��û��_��������.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				�ν���û��_����.main(null); 
			}
		});


		JButton ��û��Ȳ��ȸ��ư = new JButton("\uC2E0\uCCAD\uD604\uD669\uC870\uD68C");
		��û��Ȳ��ȸ��ư.setBounds(30, 324, 269, 60);
		frame.getContentPane().add(��û��Ȳ��ȸ��ư);
		
		��û��Ȳ��ȸ��ư.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				�Ϲݽ�û��Ȳ��ȸ.main(null); 
			}
		});


		JButton ��������_����Ż���ư = new JButton("\uAC1C\uC778\uC815\uBCF4 \uC218/\uD0C8");
		��������_����Ż���ư.setBounds(30, 405, 269, 66);
		frame.getContentPane().add(��������_����Ż���ư);
		
		��������_����Ż���ư.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				����Ż��_�Ϲ�.main(null); 
				//����Ż�� ������
			}
		});


		JLabel lbl_����� = new JLabel("\uC131\uBA85\uB744\uC6B0\uAE30");
		lbl_�����.setFont(new Font("����", Font.BOLD, 30));
		lbl_�����.setText(�Ϲ�dao.selectID());
		lbl_�����.setBounds(73, 89, 92, 32);
		frame.getContentPane().add(lbl_�����);
		
		
		

		String url = getClass().getResource("").getPath();
		Image image17 = new ImageIcon(url + "image/17.png").getImage();
		JLabel lbl_img17 = new JLabel(new ImageIcon(image17.getScaledInstance(343, 481, Image.SCALE_SMOOTH)));
		lbl_img17.setBounds(0, 0, 343, 481);
		frame.getContentPane().add(lbl_img17);

	}

}
