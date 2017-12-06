package controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import model.Player;
import view.ContentPane;

public class ChoiceListener implements ActionListener{

	private int choice;
	private ContentPane cp;
	
	public ChoiceListener(int choice,ContentPane cp) {
		this.setChoice(choice);
		this.setCp(cp);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		StartGame.curEvent.getChoices()[this.choice].changeAttribute();
		try {
			StartGame.curEvent=StartGame.curEvent.getChoices()[this.choice].newEvent(StartGame.curEvent.getChoices()[this.choice].getNextID());
		} catch (SQLException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		ContentPane.textLabel.setText(StartGame.curEvent.getDescription());
		ContentPane.textLabel2.append(StartGame.curEvent.getChoices()[this.choice].getDiary()+"\n");
		ContentPane.tattr[0].setText(""+Player.hp);
		ContentPane.tattr[1].setText(""+Player.money);
		ContentPane.tattr[2].setText(""+Player.food);
		ContentPane.tattr[3].setText(""+Player.water);
		ContentPane.tattr[4].setText(""+Player.torpedo);
		if(StartGame.gameOver()) {
			// TODO
		}
	}
	public int getChoice() {
		return choice;
	}
	public void setChoice(int choice) {
		this.choice = choice;
	}
	public ContentPane getCp() {
		return cp;
	}
	public void setCp(ContentPane cp) {
		this.cp = cp;
	}

}
