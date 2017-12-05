package view;

import controller.StartGame;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class MStartView extends JFrame{
	/** 信息窗口的宽度 */
	private static final int INFO_W = 960;
	/** 信息窗口的高度 */
	private static final int INFO_H = 600;
	public MStartView(String name){
		super(name);
		startViewInit();
		this.pack();
		this.setResizable(false);
		this.setVisible(true);
	}
	private void startViewInit() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(200, 100);
		this.setPreferredSize(new Dimension(INFO_W, INFO_H));
		// 添加成员组件
        JPanel contentPane=new JPanel();
        this.setContentPane(contentPane);
		contentPane.setLayout(null);
		int labelHigh=80;
		int labelWidth=100;
		JLabel start=new JLabel("开始");
		Font font=new Font("Monospaced",Font.BOLD,44);//设置字体格式和大小
		start.setFont(font);
		start.setBounds((INFO_W-labelWidth)/2, INFO_H/2, labelWidth, labelHigh);
		start.setForeground(new Color(255,255,255));
		start.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				StartGame.sv.setVisible(false);
				StartGame.cv=new MChooseView("Neptune");
				StartGame.bv=new MBattleView("Neptune");
			}

			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
			}

			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}

			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				start.setForeground(new Color(238,220,130));
			}

			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				start.setForeground(new Color(255,255,255));
			}
		});
	    contentPane.add(start);

		JLabel picture = new JLabel("");
	    picture.setIcon(new ImageIcon("img\\background.jpg"));
	    picture.setBounds(0, 0, INFO_W, INFO_H);
	    contentPane.add(picture);
	   
	}
}
