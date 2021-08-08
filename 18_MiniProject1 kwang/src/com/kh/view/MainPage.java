package com.kh.view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

import com.kh.common.ChangePanel;

public class MainPage extends JPanel{
	// ChangePanel�� ����� JFrame�� JPanel -> ����/���� â �̺�Ʈ - �гη� ȭ�� ��ȯ
	private MainFrame mfr;
	private JPanel mainPage;
	
	// �ڷγ� �����Ģ ��� ����
	ImageIcon bg = new ImageIcon("icon/background.jpg");
	
	public void paintComponent(Graphics g) {
		Dimension d = getSize();
		g.drawImage(bg.getImage(), 0, 0, d.width, d.height, null);
	}
	
	public MainPage(MainFrame mf) {
		this.mfr = mf;
		this.mainPage = this;
		
		this.setLayout(null);

		// �濪��Ģ ���� 1 -> ������, ����, Y/N��ư
		Image icon = new ImageIcon("icon/airplane.PNG").getImage();
		JLabel iconLabel = new JLabel(new ImageIcon(icon));
		iconLabel.setLocation(90, 430);
		iconLabel.setSize(55, 55);
		this.add(iconLabel);
		
		JLabel label = new JLabel("�ֱ� 2�� �� �ؿ� �湮�Ͻ� ���� �ֽ��ϱ�?");
		label.setFont(new Font("���� ����", Font.BOLD, 22));
		label.setForeground(Color.WHITE);
		label.setLocation(160, 430);
		label.setSize(500, 55);
		this.add(label);
		
		JRadioButton yes1 = new JRadioButton("��");
		yes1.setFont(new Font("���� ����", Font.BOLD, 22));
		yes1.setForeground(Color.WHITE);
		yes1.setContentAreaFilled(false);
		yes1.setFocusPainted(false);
		yes1.setLocation(610, 430);
		yes1.setSize(50, 55);
		JRadioButton no1 = new JRadioButton("�ƴϿ�");
		no1.setFont(new Font("���� ����", Font.BOLD, 22));
		no1.setForeground(Color.WHITE);
		no1.setContentAreaFilled(false);
		no1.setFocusPainted(false);
		no1.setLocation(670, 430);
		no1.setSize(100, 55);
		ButtonGroup yesNo1 = new ButtonGroup();
		yesNo1.add(yes1);
		yesNo1.add(no1);
		this.add(yes1);
		this.add(no1);
		
		// ���� 2
		Image icon2 = new ImageIcon("icon/temp.PNG").getImage();
		JLabel iconLabel2 = new JLabel(new ImageIcon(icon2));
		iconLabel2.setLocation(90, 510);
		iconLabel2.setSize(55, 55);
		this.add(iconLabel2);
		
		JLabel label2 = new JLabel("ü���� 37.5�� �̻��Դϱ�?");
		label2.setFont(new Font("���� ����", Font.BOLD, 22));
		label2.setForeground(Color.WHITE);
		label2.setLocation(160, 510);
		label2.setSize(500, 55);
		this.add(label2);
		
		JRadioButton yes2 = new JRadioButton("��");
		yes2.setFont(new Font("���� ����", Font.BOLD, 22));
		yes2.setForeground(Color.WHITE);
		yes2.setContentAreaFilled(false);
		yes2.setFocusPainted(false);
		yes2.setLocation(610, 510);
		yes2.setSize(50, 55);
		JRadioButton no2 = new JRadioButton("�ƴϿ�");
		no2.setFont(new Font("���� ����", Font.BOLD, 22));
		no2.setForeground(Color.WHITE);
		no2.setContentAreaFilled(false);
		no2.setFocusPainted(false);
		no2.setLocation(670, 510);
		no2.setSize(100, 55);
		ButtonGroup yesNo2 = new ButtonGroup();
		yesNo2.add(yes2);
		yesNo2.add(no2);
		this.add(yes2);
		this.add(no2);
		
		// ���� 3
		Image icon3 = new ImageIcon("icon/note.PNG").getImage();
		JLabel iconLabel3 = new JLabel(new ImageIcon(icon3));
		iconLabel3.setLocation(90, 590);
		iconLabel3.setSize(55, 55);
		this.add(iconLabel3);
		
		JLabel label3 = new JLabel("�������� ������ �����Ͻʴϱ�?");
		label3.setFont(new Font("���� ����", Font.BOLD, 22));
		label3.setForeground(Color.WHITE);
		label3.setLocation(160, 590);
		label3.setSize(500, 55);
		this.add(label3);
		
		JRadioButton yes3 = new JRadioButton("��");
		yes3.setFont(new Font("���� ����", Font.BOLD, 22));
		yes3.setForeground(Color.WHITE);
		yes3.setContentAreaFilled(false);
		yes3.setFocusPainted(false);
		yes3.setLocation(610, 590);
		yes3.setSize(50, 55);
		JRadioButton no3 = new JRadioButton("�ƴϿ�");
		no3.setFont(new Font("���� ����", Font.BOLD, 22));
		no3.setForeground(Color.WHITE);
		no3.setContentAreaFilled(false);
		no3.setFocusPainted(false);
		no3.setLocation(670, 590);
		no3.setSize(100, 55);
		ButtonGroup yesNo3 = new ButtonGroup();
		yesNo3.add(yes3);
		yesNo3.add(no3);
		this.add(yes3);
		this.add(no3);
		
		// Ȯ�� ��ư
		JButton btn = new JButton("Ȯ��");
		btn.setFont(new Font("���� ����", Font.BOLD, 22));
		btn.setForeground(new Color(70, 24, 90));
		btn.setBackground(Color.white);
		btn.setFocusPainted(false);
		btn.setLocation(820, 570);
		btn.setSize(150, 70);
		this.add(btn);
		
		// ������ Ȯ�ι�ư
		JButton btn2 = new JButton("������");
		btn2.setFont(new Font("���� ����", Font.BOLD, 22));
		btn2.setForeground(new Color(70, 24, 90));
		btn2.setBackground(new Color(126, 125, 125));
		btn2.setFocusPainted(false);
		btn2.setLocation(1020, 570);
		btn2.setSize(150, 70);
		this.add(btn2);
		
		// Ȯ�� ��ư �̺�Ʈ -> ���� N/N/Y�� �� ���Ұ��� ȭ������ ��ȯ, �������� �� �� ��� ȭ�� �� �Ѿ
		btn.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if(no1.isSelected() && no2.isSelected() && yes3.isSelected()) {
					ChangePanel.changePanel(mfr, mainPage, new PaymentScreen(mf));
				} else {
					JOptionPane.showMessageDialog(null, "�濪��Ģ�� ���ݵǰų� �������� ������ �������� �ʾ� �̿��Ͻ� �� �����ϴ�.", "MINI1 PC", JOptionPane.WARNING_MESSAGE);
				}
					
			}
		});
		
		// ������ Ȯ�� ��ư �̺�Ʈ -> �ٷ� �α��� ȭ������ ��ȯ
		btn2.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ChangePanel.changePanel(mfr, mainPage, new Login(mf));
			}
		});
		
		mf.add(this);
	}
	
}