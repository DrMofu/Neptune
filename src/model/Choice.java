package model;

import java.sql.SQLException;

/**
 * ѡ����
 * @author ��֮��
 *
 */
public class Choice {
	/** ����*/
	private String description;
	/** ��Ǯ*/
	private int money;
	/** ʳ��*/
	private int food;
	/** Ѫ��*/
	private int HP;
	/** ˮ*/
	private int water;
	/** �����ĺ���*/
	private int whichFun;
	/** ��һ���¼���ID*/
	private int nextID;
	/** �ƶ�����*/
	private int diatance;
	
	/**
	 * ѡ��캯��
	 * @param des ѡ������
	 * @param money ��Ǯ
	 * @param food ʳ��
	 * @param HP Ѫ��
	 * @param water ˮ
	 * @param whichFun ѡ�к�����ĸ�����
	 * @param nextID ��һ�������¼�ID 
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
	 * �����ض�����һ���¼�
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
	 * ����򶷽���
	 */
	public void fight() {
		new Fight(100,200);
		
	}
	
	/**
	 * �ı��������
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
