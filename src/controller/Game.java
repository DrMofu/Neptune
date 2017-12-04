package controller;

import java.sql.SQLException;
import java.util.Random;
import java.util.Scanner;

import model.Choice;
import model.Event;
import model.Player;

public class Game {
	/** �ܾ���*/
	public static final int DISTANCE=100;
	
	public static Random eRand=new Random();
	
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		new Player();
		Player.showDetails();
		Event.initialize();
		int eventId;
		Event aEvent = null;
		while(!gameOver()) {
			eventId=eRand.nextInt(4)+1;
			if(aEvent==null) {
				aEvent=Event.find(eventId);
			}	
			System.out.println(aEvent.getDescription()+":\nA."+aEvent.getChoices()[0].getDescription()+"\nB."+aEvent.getChoices()[1].getDescription()+"\nC."+aEvent.getChoices()[2].getDescription()+"\nD."+aEvent.getChoices()[3].getDescription()+"\n��ѡ��");
			Scanner sc=new Scanner(System.in);
			String pChoice=sc.nextLine();
			Choice curChoice=chooseEvent(pChoice,aEvent);
			curChoice.changeAttribute();
			aEvent=curChoice.newEvent(curChoice.getNextID());
			Player.showDetails();
		}
	}
	
	/**
	 * ѡ��
	 * @param pChoice ѡ��
	 * @param aEvent �¼�
	 * @return ѡ��
	 */
	public static Choice chooseEvent(String pChoice, Event aEvent) {
		if(pChoice.equals("A")||pChoice.equals("a")) {
			return aEvent.getChoices()[0];
		}else if(pChoice.equals("B")||pChoice.equals("b")) {
			return aEvent.getChoices()[1];
		}else if(pChoice.equals("C")||pChoice.equals("c")) {
			return aEvent.getChoices()[2];
		}else if(pChoice.equals("D")||pChoice.equals("d")) {
			return aEvent.getChoices()[3];
		}else {
			return null;
		}	
	}
	
	/**
	 * ��Ϸ�Ƿ����
	 * @return �Ƿ�
	 */
	public static boolean gameOver() {
		if(Player.food<=0||Player.hp<=0||Player.water<=0||Player.distance>=DISTANCE) {
			showResult();
			return true;
		}
		return false;
	}

	/**
	 * չʾ��Ϸ���
	 */
	public static void showResult() {
		if((Player.food<=0||Player.hp<=0||Player.water<=0)&&Player.distance<DISTANCE) {
			System.out.println("you lose");
		}else if(Player.food>=0 && Player.hp>=0 && Player.water>=0 && Player.distance>=DISTANCE) {
			System.out.println("you win");
		}
	}
}
