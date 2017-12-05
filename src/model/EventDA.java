package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Event���ݷ���
 * @author ��֮��
 *
 */
public class EventDA {
	static Event aEvent;
	static Connection aConnection;
	static Statement aStatement;
	
	/** �¼�ID*/
	static int ID;
	/** �¼�����*/
	static String description;
	/** ѡ������*/
	static Choice[] choices;
	
	/**
	 * �������ݿ�
	 * @return ����
	 * @throws ClassNotFoundException
	 * @throws SQLException
	 */
	public static Connection initialize() throws ClassNotFoundException, SQLException {
			Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
			aConnection = DriverManager.getConnection("jdbc:odbc:Database", "Database", "database");
			aStatement = aConnection.createStatement();
		return aConnection;		
	}
	
	/**
	 * �Ͽ����ݿ�����
	 * @throws SQLException
	 */
	public static void terminate() throws SQLException {
		aStatement.close();
		aConnection.close();
	}
	
	/**
	 * �����¼�
	 * @param id �¼�id
	 * @return �¼�
	 * @throws SQLException
	 */
	public static Event find(int id) throws SQLException {
		aEvent=null;
		String sql="SELECT * FROM �¼�  WHERE ID="+id;
		ResultSet rs=aStatement.executeQuery(sql);
		boolean gotIt=rs.next();
		if(gotIt) {
			ID=rs.getInt(1);
			description=rs.getString(2);
			choices=new Choice[4];
			choices[0]=new Choice(rs.getString(3),rs.getInt(4),rs.getInt(5),rs.getInt(6),rs.getInt(7),rs.getInt(8),rs.getInt(9), rs.getInt(10));
			choices[1]=new Choice(rs.getString(11),rs.getInt(12),rs.getInt(13),rs.getInt(14),rs.getInt(15),rs.getInt(16),rs.getInt(17), rs.getInt(18));
			choices[2]=new Choice(rs.getString(19),rs.getInt(20),rs.getInt(21),rs.getInt(22),rs.getInt(23),rs.getInt(24),rs.getInt(25), rs.getInt(26));
			choices[3]=new Choice(rs.getString(27),rs.getInt(28),rs.getInt(29),rs.getInt(30),rs.getInt(31),rs.getInt(32),rs.getInt(33), rs.getInt(34));
			aEvent=new Event(ID,description,choices);
		}
		rs.close();
		return aEvent;	
	}
}
