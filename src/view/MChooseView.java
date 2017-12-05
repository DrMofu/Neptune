package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import controller.ChoiceListener;
import controller.StartGame;

public class MChooseView extends JFrame{
	/** 信息窗口的宽度 */
	private static final int INFO_W = 860;
	/** 信息窗口的高度 */
	private static final int INFO_H = 540;

	public MChooseView(String name){
		super(name);
		chooseViewInit();
		this.pack();
		this.setResizable(false);
		this.setVisible(true);
	}
	private void chooseViewInit() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(50, 100);
		this.setPreferredSize(new Dimension(INFO_W, INFO_H));
		// 添加成员组件
		ContentPane contentPane=new ContentPane();
        this.setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(220,220,220));
	}
	
}