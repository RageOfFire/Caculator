import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.FlowLayout;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.BoxLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Caculator extends JFrame {

	private JPanel contentPane;
	private JTextField KetQua;
	private JPanel panel;
	private JButton So9;
	private JButton Delete;
	private JButton Cong;
	private JButton DeleteAll;
	private JButton So8;
	private JButton PhanTram;
	private JButton So7;
	private JButton So4;
	private JButton Tru;
	private JButton So1;
	private JButton Nhan;
	private JButton So5;
	private JButton So6;
	private JButton Chia;
	private JButton So0;
	private JButton So3;
	private JButton So2;
	private JButton ChamPhay;
	private JButton AmDuong;
	private JButton Bang;
	Double FirstNum;
	Double SecondNum;
	Double FinalKetQua;
	String ToanTu;
	String TraLoi;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Caculator frame = new Caculator();
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
	public Caculator() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		KetQua = new JTextField();
		KetQua.setBounds(5, 5, 426, 25);
		KetQua.setFont(new Font("Tahoma", Font.BOLD, 15));
		contentPane.add(KetQua);
		KetQua.setColumns(40);
		
		panel = new JPanel();
		panel.setBounds(5, 38, 421, 215);
		contentPane.add(panel);
		panel.setLayout(new GridLayout(5, 4, 5, 5));
		
		Delete = new JButton("\u2190");
		Delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String btnDelete = null;
				if (KetQua.getText().length() > 0) {
					StringBuilder str = new StringBuilder(KetQua.getText());
					str.deleteCharAt(KetQua.getText().length() - 1);
					btnDelete = str.toString();
					KetQua.setText(btnDelete);
				}
			}
		});
		Delete.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(Delete);
		
		DeleteAll = new JButton("C");
		DeleteAll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				KetQua.setText("");
			}
		});
		DeleteAll.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(DeleteAll);
		
		PhanTram = new JButton("%");
		PhanTram.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstNum = Double.parseDouble(KetQua.getText());
				KetQua.setText("");
				ToanTu = ("%");
			}
		});
		PhanTram.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(PhanTram);
		
		Cong = new JButton("+");
		Cong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstNum = Double.parseDouble(KetQua.getText());
				KetQua.setText("");
				ToanTu = "+";
			}
		});
		Cong.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(Cong);
		
		So7 = new JButton("7");
		So7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String so = KetQua.getText() + So7.getText();
				KetQua.setText(so);
			}
		});
		So7.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(So7);
		
		So8 = new JButton("8");
		So8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String so = KetQua.getText() + So8.getText();
				KetQua.setText(so);
			}
		});
		So8.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(So8);
		
		So9 = new JButton("9");
		So9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String so = KetQua.getText() + So9.getText();
				KetQua.setText(so);
			}
		});
		So9.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(So9);
		
		Tru = new JButton("-");
		Tru.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstNum = Double.parseDouble(KetQua.getText());
				KetQua.setText("");
				ToanTu = "-";
			}
		});
		Tru.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(Tru);
		
		So4 = new JButton("4");
		So4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String so = KetQua.getText() + So4.getText();
				KetQua.setText(so);
			}
		});
		So4.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(So4);
		
		So5 = new JButton("5");
		So5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String so = KetQua.getText() + So5.getText();
				KetQua.setText(so);
			}
		});
		So5.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(So5);
		
		So6 = new JButton("6");
		So6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String so = KetQua.getText() + So6.getText();
				KetQua.setText(so);
			}
		});
		So6.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(So6);
		
		Nhan = new JButton("*");
		Nhan.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstNum = Double.parseDouble(KetQua.getText());
				KetQua.setText("");
				ToanTu = "*";
			}
		});
		Nhan.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(Nhan);
		
		So1 = new JButton("1");
		So1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String so = KetQua.getText() + So1.getText();
				KetQua.setText(so);
			}
		});
		So1.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(So1);
		
		So2 = new JButton("2");
		So2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String so = KetQua.getText() + So2.getText();
				KetQua.setText(so);
			}
		});
		So2.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(So2);
		
		So3 = new JButton("3");
		So3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String so = KetQua.getText() + So3.getText();
				KetQua.setText(so);
			}
		});
		So3.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(So3);
		
		Chia = new JButton("/");
		Chia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				FirstNum = Double.parseDouble(KetQua.getText());
				KetQua.setText("");
				ToanTu = "/";
			}
		});
		Chia.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(Chia);
		
		So0 = new JButton("0");
		So0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String so = KetQua.getText() + So0.getText();
				KetQua.setText(so);
			}
		});
		So0.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(So0);
		
		ChamPhay = new JButton(".");
		ChamPhay.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(ChamPhay);
		
		AmDuong = new JButton("+-");
		AmDuong.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double aps = Double.parseDouble(String.valueOf(KetQua.getText()));
				aps = aps * (-1);
				KetQua.setText(String.valueOf(aps));
			}
		});
		AmDuong.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(AmDuong);
		
		Bang = new JButton("=");
		Bang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String TraLoi;
				SecondNum = Double.parseDouble(KetQua.getText());
				if (ToanTu == "+")
				{
					FinalKetQua = FirstNum + SecondNum;
					TraLoi = String.format("%.2f",FinalKetQua);
					KetQua.setText(TraLoi);
				}
				else if (ToanTu == "-") 
				{
					FinalKetQua = FirstNum - SecondNum;
					TraLoi = String.format("%.2f",FinalKetQua);
					KetQua.setText(TraLoi);
				}
				else if (ToanTu == "*") 
				{
					FinalKetQua = FirstNum * SecondNum;
					TraLoi = String.format("%.2f",FinalKetQua);
					KetQua.setText(TraLoi);
				}
				else if (ToanTu == "/") 
				{
					FinalKetQua = FirstNum / SecondNum;
					TraLoi = String.format("%.2f",FinalKetQua);
					KetQua.setText(TraLoi);
				}
				else if (ToanTu == "%") 
				{
					FinalKetQua = FirstNum % SecondNum;
					TraLoi = String.format("%.2f",FinalKetQua);
					KetQua.setText(TraLoi);
				}
			}
		});
		Bang.setFont(new Font("Tahoma", Font.BOLD, 12));
		panel.add(Bang);
	}
}
