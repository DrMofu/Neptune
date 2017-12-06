package controller;
import view.MStartView;
import view.MChooseView;

import java.sql.SQLException;
import java.util.Random;
import model.Event;
import model.Player;
import view.MBattleView;

public class StartGame {
	public static MStartView sv;
	public static MChooseView cv;
	public static MBattleView bv;
	
	//wzw edit-add
	/** 总距离*/
	public static final int DISTANCE=100;
	public static Random eRand=new Random();
	public static int curEventId;
	public static Event curEvent=null;
	//wzw
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		StartGame.sv=new MStartView("Neptune");
		//wzw edit-add
		new Player();
		Player.showDetails();
		Event.initialize();
		curEventId=Game.eRand.nextInt(4)+1;
		curEvent=Event.find(curEventId);
		//wzw
	}
	
	//wzw edit-add
	/**
	 * 游戏是否结束
	 * @return 是否
	 */
	public static boolean gameOver() {
		if(Player.food<=0||Player.hp<=0||Player.water<=0||Player.distance>=DISTANCE) {
			showResult();
			return true;
		}
		return false;
	}

	/**
	 * 展示游戏结果
	 */
	public static void showResult() {
		if((Player.food<=0||Player.hp<=0||Player.water<=0)&&Player.distance<DISTANCE) {
			System.out.println("you lose");
		}else if(Player.food>=0 && Player.hp>=0 && Player.water>=0 && Player.distance>=DISTANCE) {
			System.out.println("you win");
		}
	}
	//wzw
}
