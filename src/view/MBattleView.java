package view;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import controller.playerController;

public class MBattleView extends JFrame{
	/** 信息窗口的宽度 */
	public static final int INFO_W = 1280;
	/** 信息窗口的高度 */
	public static final int INFO_H = 680;
	public static JLabel boat;
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
		JPanel leftAera=new JPanel();
		leftAera.setBounds(20, 20, 350, 610);
		leftAera.setBackground(new Color(135,206,235));
		contentPane.add(leftAera);
		leftAera.setLayout(null);
		
		BattleView battleAera=new BattleView();
		battleAera.setBounds(400, 20, 850, 610);
		battleAera.setBackground(new Color(135,206,235));
		contentPane.add(battleAera);
		battleAera.setLayout(null);
		this.addKeyListener(battleAera);
		playerController pc=new playerController();
		battleAera.addMouseListener(pc);
	}
}