package controller;
import view.MStartView;
import view.MChooseView;
import view.MBattleView;

public class StartGame {
	public static MStartView sv;
	public static MChooseView cv;
	public static MBattleView bv;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StartGame.sv=new MStartView("Neptune");
		
	}
}
