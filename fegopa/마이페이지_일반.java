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

import DAOVO.일반회원_DAO;

public class 마이페이지_일반 {
	일반회원_DAO 일반dao = new 일반회원_DAO();
	private JFrame frame;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					마이페이지_일반 window = new 마이페이지_일반();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public 마이페이지_일반() {
		initialize();
	}

	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 359, 520);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JButton 메인으로이동버튼 = new JButton("exit");
		
		메인으로이동버튼.setBounds(264, 10, 67, 48);

		frame.getContentPane().add(메인으로이동버튼);

		메인으로이동버튼.addMouseListener(new MouseAdapter() {
//			@Override
//			public void mouseClicked(MouseEvent e) {
//				frame.dispose();
				//메인페이지.main(null); //아직 안만듬
				//메인페이지에 로그인 버튼 만들기
//			}
		});
		
		
		JButton 로그아웃버튼 = new JButton("로그아웃");
		로그아웃버튼.setBounds(224, 83, 107, 27);
		frame.getContentPane().add(로그아웃버튼);

		로그아웃버튼.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				로그아웃버튼.addMouseListener(new MouseAdapter() {
					@Override
					public void mouseClicked(MouseEvent e) {
						frame.dispose();
						로그인페이지.main(null); 
						//정보 초기화 후 메인으로 이동 or 로그인페이지로 이동
						//기능구현x
					}
				});
			}
		});
		
		JButton 부스신청버튼 = new JButton("\uBD80\uC2A4\uC2E0\uCCAD");
		부스신청버튼.setBounds(30, 164, 280, 55);
		frame.getContentPane().add(부스신청버튼);
		
		부스신청버튼.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				부스신청서.main(null); 
			}
		});

		JButton 신청서_수정삭제 = new JButton("\uBD80\uC2A4\uC2E0\uCCAD\uC11C_\uC218/\uC0AD");
		신청서_수정삭제.setBounds(30, 244, 269, 60);

		frame.getContentPane().add(신청서_수정삭제);
		
		신청서_수정삭제.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				부스신청서_수정.main(null); 
			}
		});


		JButton 신청현황조회버튼 = new JButton("\uC2E0\uCCAD\uD604\uD669\uC870\uD68C");
		신청현황조회버튼.setBounds(30, 324, 269, 60);
		frame.getContentPane().add(신청현황조회버튼);
		
		신청현황조회버튼.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				일반신청현황조회.main(null); 
			}
		});


		JButton 개인정보_수정탈퇴버튼 = new JButton("\uAC1C\uC778\uC815\uBCF4 \uC218/\uD0C8");
		개인정보_수정탈퇴버튼.setBounds(30, 405, 269, 66);
		frame.getContentPane().add(개인정보_수정탈퇴버튼);
		
		개인정보_수정탈퇴버튼.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.dispose();
				수정탈퇴_일반.main(null); 
				//수정탈퇴 에러뜸
			}
		});


		JLabel lbl_기관명 = new JLabel("\uC131\uBA85\uB744\uC6B0\uAE30");
		lbl_기관명.setFont(new Font("굴림", Font.BOLD, 30));
		lbl_기관명.setText(일반dao.selectID());
		lbl_기관명.setBounds(73, 89, 92, 32);
		frame.getContentPane().add(lbl_기관명);
		
		
		

		String url = getClass().getResource("").getPath();
		Image image17 = new ImageIcon(url + "image/17.png").getImage();
		JLabel lbl_img17 = new JLabel(new ImageIcon(image17.getScaledInstance(343, 481, Image.SCALE_SMOOTH)));
		lbl_img17.setBounds(0, 0, 343, 481);
		frame.getContentPane().add(lbl_img17);

	}

}
