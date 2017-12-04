package model;

import java.sql.SQLException;

/**
 * �¼���
 * @author ��֮��
 *
 */
public class Event {
	/** �¼�ID*/
	private int ID;
	/** �¼�����*/
	private String description;
	/** ѡ������*/
	private Choice[] choices;
	
	public Event(int id,String description,Choice[] choices) {
		this.setID(id);
		this.setDescription(description);
		this.setChoices(choices);
	}
	
	public static void initialize() throws ClassNotFoundException, SQLException {
		EventDA.initialize();
	}
	
	public static void terminate() throws SQLException {
		EventDA.terminate();
	}
	
	public static Event find(int id) throws SQLException {
		return EventDA.find(id);
	}
	
	public Event(int id) {
		this.setID(id);
	}
	
	public int getID() {
		return ID;
	}
	public void setID(int iD) {
		ID = iD;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Choice[] getChoices() {
		return choices;
	}
	public void setChoices(Choice[] choices) {
		this.choices = choices;
	}
	
	
}
