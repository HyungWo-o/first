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

import DAOVO.신청서_DAO;
import DAOVO.신청서_VO;

import javax.swing.JTextArea;

public class 부스신청서 {

	private JFrame frame;
	private JTextField 이름;
	private JTextField 사업자번호;
	private JTextField 연락처;
	private JTextField 희망부스번호;
	private JTextField 부스업종;
	private JTextField 부스소개;

	신청서_DAO 신청dao = new 신청서_DAO();
	private JTextField 첨부파일;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					부스신청서 window = new 부스신청서();
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
	public 부스신청서() {
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

		이름 = new JTextField();
		이름.setBounds(65, 85, 218, 21);
		frame.getContentPane().add(이름);
		이름.setColumns(10);

		사업자번호 = new JTextField();
		사업자번호.setColumns(10);
		사업자번호.setBounds(65, 121, 218, 21);
		frame.getContentPane().add(사업자번호);

		연락처 = new JTextField();
		연락처.setColumns(10);
		연락처.setBounds(65, 156, 218, 21);
		frame.getContentPane().add(연락처);

		희망부스번호 = new JTextField();
		희망부스번호.setColumns(10);
		희망부스번호.setBounds(65, 191, 218, 21);
		frame.getContentPane().add(희망부스번호);

		부스업종 = new JTextField();
		부스업종.setColumns(10);
		부스업종.setBounds(65, 226, 218, 21);
		frame.getContentPane().add(부스업종);

		부스소개 = new JTextField();
		부스소개.setColumns(10);
		부스소개.setBounds(65, 267, 218, 71);
		frame.getContentPane().add(부스소개);

		첨부파일 = new JTextField();
		첨부파일.setBounds(65, 381, 218, 21);
		frame.getContentPane().add(첨부파일);
		첨부파일.setColumns(10);
		
		JButton 파일불러오기 = new JButton("");
		파일불러오기.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {

				File file = null;
				JFileChooser chooser = new JFileChooser();
				int val = chooser.showSaveDialog(null);
				if (val == 0) {
					file = chooser.getSelectedFile();
					첨부파일.setText(file.getName());
				}

			}
		});
		
		
		파일불러오기.setBounds(126, 348, 97, 23);
		frame.getContentPane().add(파일불러오기);

		JButton 뒤로가기 = new JButton("");
		뒤로가기.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				frame.dispose();
				마이페이지_일반.main(null);

			}
		});
		뒤로가기.setBounds(57, 421, 97, 23);
		frame.getContentPane().add(뒤로가기);

		JButton 신청완료 = new JButton("");
		신청완료.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				신청서_VO vo = new 신청서_VO(이름.getText(), 사업자번호.getText(), 연락처.getText(), 희망부스번호.getText(), 부스소개.getText(), 첨부파일.getText());
				if (이름.getText().equals("") || 사업자번호.getSelectedText().equals("") || 연락처.getSelectedText().equals("")
						|| 희망부스번호.getSelectedText().equals("")) {
					신청dao.insertApply(vo);
					JOptionPane.showMessageDialog(null, "신청완료");
				} else {
					JOptionPane.showMessageDialog(null, "빈칸이 없는지 확인해주세요");
				}

			}
		});
		신청완료.setBounds(193, 421, 97, 23);
		frame.getContentPane().add(신청완료);

		String url = getClass().getResource("").getPath();
		Image image18 = new ImageIcon(url + "image/18.png").getImage();
		JLabel lbl_img18 = new JLabel(new ImageIcon(image18.getScaledInstance(343, 481, Image.SCALE_SMOOTH)));
		lbl_img18.setBounds(0, 0, 343, 481);
		frame.getContentPane().add(lbl_img18);
		
		

	}
}
