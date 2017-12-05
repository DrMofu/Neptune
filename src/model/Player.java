package model;

import java.util.ArrayList;

public class Player {
	/** 生命值*/
	public static int hp;
	/** 食物量*/
	public static int food;
	/** 水*/
	public static int water;
	/** 金钱*/
	public static int money;
	/** 航行的距离*/
	public static int distance;
	/** 位置x*/
	public static int x;
	/** 位置y*/
	public static int y;
	/** 攻击力*/
	public static int attack;
	/** 物品清单*/
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