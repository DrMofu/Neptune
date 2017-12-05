package view;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class MBattleView extends JFrame{
	/** 信息窗口的宽度 */
	private static final int INFO_W = 1280;
	/** 信息窗口的高度 */
	private static final int INFO_H = 680;
	public MBattleView(String name){
		super(name);
		battleViewInit();
		this.pack();
		this.setResizable(false);
		this.setVisible(true);
	}
	private void battleViewInit() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocation(40, 20);
		this.setPreferredSize(new Dimension(INFO_W, INFO_H));
		// 添加成员组件
        JPanel contentPane=new JPanel();
        this.setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(220,220,220));
		initBattleAera(contentPane);		
	}
	private void initBattleAera(JPanel contentPane) {		
		
	}
}
