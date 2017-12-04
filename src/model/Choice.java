package model;

import java.sql.SQLException;

/**
 * 选项类
 * @author 王之威
 *
 */
public class Choice {
	/** 描述*/
	private String description;
	/** 金钱*/
	private int money;
	/** 食物*/
	private int food;
	/** 血量*/
	private int HP;
	/** 水*/
	private int water;
	/** 触发的函数*/
	private int whichFun;
	/** 下一个事件的ID*/
	private int nextID;
	/** 移动距离*/
	private int diatance;
	
	/**
	 * 选项构造函数
	 * @param des 选项描述
	 * @param money 金钱
	 * @param food 食物
	 * @param HP 血量
	 * @param water 水
	 * @param whichFun 选中后调用哪个方法
	 * @param nextID 下一个关联事件ID 
	 */
	public Choice(String des, int diatance,int money ,int food, int HP,int water, int whichFun,int nextID) {
		this.setDescription(des);
		this.setDiatance(diatance);
		this.setMoney(money);
		this.setFood(food);
		this.setHP(HP);
		this.setWater(water);	
		this.setNextID(nextID);
	}
	
	/**
	 * 产生特定的下一个事件
	 * @return 
	 * @throws SQLException 
	 */
	public Event newEvent(int nextID) throws SQLException {
		if(nextID!=0) {
			return Event.find(nextID);
		}
		return null;
	}
	
	/**
	 * 进入打斗界面
	 */
	public void fight() {
		new Fight(100,200);
		
	}
	
	/**
	 * 改变玩家属性
	 */
	public void changeAttribute() {
		Player.hp+=this.getHP();
		Player.food+=this.getFood();
		Player.water+=this.getWater();
		Player.money+=this.getMoney();
		Player.distance+=this.getDiatance();
	}
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public int getFood() {
		return food;
	}
	public void setFood(int food) {
		this.food = food;
	}
	public int getHP() {
		return HP;
	}
	public void setHP(int hP) {
		HP = hP;
	}
	public int getWater() {
		return water;
	}
	public void setWater(int water) {
		this.water = water;
	}
	public int getWhichFun() {
		return whichFun;
	}
	public void setWhichFun(int whichFun) {
		this.whichFun = whichFun;
	}
	public int getNextID() {
		return nextID;
	}
	public void setNextID(int nextID) {
		this.nextID = nextID;
	}

	public int getDiatance() {
		return diatance;
	}

	public void setDiatance(int diatance) {
		this.diatance = diatance;
	}
	
}
