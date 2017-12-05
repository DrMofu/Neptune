package view;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class MChooseView extends JFrame{
	/** 信息窗口的宽度 */
	private static final int INFO_W = 860;
	/** 信息窗口的高度 */
	private static final int INFO_H = 540;
	public static JButton[] choice=new JButton[4];
	public static JLabel[] tattr=new JLabel[4];
	public static JTextArea textLabel;
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
        JPanel contentPane=new JPanel();
        this.setContentPane(contentPane);
		contentPane.setLayout(null);
		contentPane.setBackground(new Color(220,220,220));
		initArea(contentPane);
		
	}
	private void initArea(JPanel contentPane) {		
		Font font14=new Font("Monospaced",Font.BOLD,14);//设置字体格式和大小
		Font font=new Font("Monospaced",Font.BOLD,18);//设置字体格式和大小
		Font font1=new Font("Monospaced",Font.BOLD,22);//设置字体格式和大小
		/** 左上角信息区域 */
		JPanel text=new JPanel();//显示选择区域
		text.setBackground(new Color(135,206,235));
		text.setBounds(30, 30, 500, 230);
		text.setLayout(null);
		contentPane.add(text);
		textLabel=new JTextArea("        "+"初始选择问题初始选择问题初始选择问题初始选择问题初始选择问题初始选择问题初始选择问题");
		textLabel.setLineWrap(true);
		textLabel.setFont(new Font("标楷体", Font.BOLD, 16));
		textLabel.setEditable(false);
		textLabel.setBackground(new Color(135,206,235));
		textLabel.setBounds(40, 50, 400, 150);
		text.add(textLabel);

		JLabel ttextTitle=new JLabel("事件");
		ttextTitle.setFont(font1);
		ttextTitle.setBounds(230, 5, 200, 40);
		text.add(ttextTitle);
		
		/** 左下角选择区域 */
		JPanel choiceAera=new JPanel();
		choiceAera.setBounds(30, 280, 500, 200);
		choiceAera.setBackground(new Color(135,206,235));
		contentPane.add(choiceAera);
		choiceAera.setLayout(null);
		choice[0] =new JButton("选择1");
		choice[0].setBounds(50, 60, 170, 50);
		choice[0].setFont(font14);
		choiceAera.add(choice[0]);
		choice[1]=new JButton("选择2");
		choice[1].setBounds(280, 60, 170, 50);
		choice[1].setFont(font14);
		choiceAera.add(choice[1]);
		choice[2] =new JButton("选择3");
		choice[2].setBounds(50, 130, 170, 50);
		choice[2].setFont(font14);
		choiceAera.add(choice[2]);
		choice[3] =new JButton("选择4");
		choice[3].setBounds(280, 130, 170, 50);
		choice[3].setFont(font14);
		choiceAera.add(choice[3]);
		
		JLabel tchoiceTitle=new JLabel("选择");
		tchoiceTitle.setFont(font1);
		tchoiceTitle.setBounds(230, 5, 200, 40);
		choiceAera.add(tchoiceTitle);
		
		/** 右上角物品区域 */
		JPanel itemAera=new JPanel();
		itemAera.setBounds(580, 30, 250, 230);
		itemAera.setBackground(new Color(135,206,235));
		contentPane.add(itemAera);
		itemAera.setLayout(null);

		JLabel tItemTitle=new JLabel("物品");
		tItemTitle.setFont(font1);
		tItemTitle.setBounds(100, 10, 180, 40);
		itemAera.add(tItemTitle);
		
		
		/** 右下角属性区域 */
		JPanel attrAera=new JPanel();
		attrAera.setBounds(580, 280, 250, 200);
		attrAera.setBackground(new Color(135,206,235));
		contentPane.add(attrAera);
		attrAera.setLayout(null);
		JLabel tAttrTitle=new JLabel("属性");
		tAttrTitle.setFont(font1);
		tAttrTitle.setBounds(100, 10, 180, 40);
		attrAera.add(tAttrTitle);
		JLabel tBlood=new JLabel("血量：   %");
		tBlood.setFont(font);
		tBlood.setBounds(70, 50, 180, 30);
		attrAera.add(tBlood);
		tattr[0]=new JLabel("100");
		tattr[0].setBounds(120, 50, 60, 30);
		tattr[0].setFont(font);
		attrAera.add(tattr[0]);
		
		JLabel tMoney=new JLabel("金钱： G");
		tMoney.setFont(font);
		tMoney.setBounds(70, 80, 100, 30);
		attrAera.add(tMoney);
		tattr[1]=new JLabel("0");
		tattr[1].setBounds(120, 80, 60, 30);
		tattr[1].setFont(font);
		attrAera.add(tattr[1]);
		
		JLabel tFood=new JLabel("食物：  包");
		tFood.setFont(font);
		tFood.setBounds(70, 110, 100, 30);
		attrAera.add(tFood);
		tattr[2]=new JLabel("10");
		tattr[2].setBounds(120, 110, 60, 30);
		tattr[2].setFont(font);
		attrAera.add(tattr[2]);
		
		JLabel tWater=new JLabel("水  ：  瓶");
		tWater.setFont(font);
		tWater.setBounds(70, 140, 120, 30);
		attrAera.add(tWater);
		tattr[3]=new JLabel("10");
		tattr[3].setBounds(120, 140, 60, 30);
		tattr[3].setFont(font);
		attrAera.add(tattr[3]);

		JLabel picture = new JLabel("");
	    picture.setIcon(new ImageIcon("img\\back.png"));
	    picture.setBounds(0, 0, INFO_W, INFO_H);
	    contentPane.add(picture);
	}
	
}