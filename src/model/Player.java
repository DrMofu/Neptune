package model;

import java.util.ArrayList;

public class Player {
	/** ����ֵ*/
	public static int hp;
	/** ʳ����*/
	public static int food;
	/** ˮ*/
	public static int water;
	/** ��Ǯ*/
	public static int money;
	/** ���еľ���*/
	public static int distance;
	/** λ��x*/
	public static int x;
	/** λ��y*/
	public static int y;
	/** ������*/
	public static int attack;
	/** ��Ʒ�嵥*/
	public static ArrayList<Buff> buffs;
	
	public Player() {
		hp=100;
		food=100;
		water=100;
		money=100;
		distance=0;
		buffs=null;
	}
	
	public static void showDetails() {
		System.out.println("Hp:"+hp+" food:"+food+" water:"+water+" money:"+money+" distance:"+distance);
	}
}