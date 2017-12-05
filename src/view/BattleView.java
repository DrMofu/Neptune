package view;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class BattleView extends JPanel implements KeyListener{
	int BATTLE_H=520;
	int BATTLE_W=800;
	public static int x=300;
	public static int y=500;
	int speed=10;
	int step=5;
	boolean U=false,D=false,L=false,R=false; 
	public BattleView() {
		MBattleView.boat = new JLabel("");
		MBattleView.boat.setIcon(new ImageIcon("img\\boat.png"));
		MBattleView.boat.setBounds(x, y, 100, 100);
	    this.add(MBattleView.boat);
	    
	    JLabel d1 = new JLabel("");
	    d1.setIcon(new ImageIcon("img\\d1.png"));
	    d1.setBounds(100, 30, 50, 57);
	    this.add(d1);
	    JLabel boss = new JLabel("");
	    boss.setIcon(new ImageIcon("img\\boss.png"));
	    boss.setBounds(300, 30, 150, 109);
	    this.add(boss);
	}
    public void paint(Graphics g)  
    {  
        super.paint(g);  
        MBattleView.boat.setBounds(x, y, 100, 100);
        if(x<0) {
			x=0;
			L = false;
		}
		else if(x>BATTLE_W) {
			x=BATTLE_W;
			R = false; 
		}
		if(y<0) {
			y=0;
			U =false;
		}
		else if(y>BATTLE_H) {
			y=BATTLE_H;
			D =false;
		}
        run();  
        try {  
            Thread.sleep(20);  
        } catch (InterruptedException e) {  
            // TODO 自动生成的 catch 块  
            e.printStackTrace();  
        }  
        repaint();
    }  
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		switch (e.getKeyCode()) {  
		case KeyEvent.VK_A:
        case KeyEvent.VK_LEFT:  
            L=true;  
            break;  
        case KeyEvent.VK_D:
        case KeyEvent.VK_RIGHT:  
            R=true;  
            break;  
        case KeyEvent.VK_W:
        case KeyEvent.VK_UP:  
            U=true;  
            break;  
        case KeyEvent.VK_S:
        case KeyEvent.VK_DOWN:  
            D=true;  
            break;  
        }  
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		 switch (e.getKeyCode()) { 
		 case KeyEvent.VK_A:
         case KeyEvent.VK_LEFT:  
             L=false;  
             break;  
         case KeyEvent.VK_D:
         case KeyEvent.VK_RIGHT:  
             R=false;  
             break;  
         case KeyEvent.VK_W:
         case KeyEvent.VK_UP:  
             U=false;  
             break;  
         case KeyEvent.VK_S:
         case KeyEvent.VK_DOWN:  
             D=false;  
             break;  
         }  
     }  
	
	public void run(){  
        if(!U&&!D&&L&&!R){  
            x-=step;  
        }else if(!U&&!D&&!L&&R){  
            x+=step;  
        }else if(U&&!D&&!L&&!R){  
            y-=step;  
        }else if(!U&&D&&!L&&!R){  
            y+=step;  
        }else if(U&&!D&&L&&!R){  
            x-=step;  
            y-=step;  
        }else if(!U&&D&&L&&!R){  
            x-=step;  
            y+=step;  
        }else if(U&&!D&&!L&&R){  
            x+=step;  
            y-=step;  
        }else if(!U&&D&&!L&&R){  
            x+=step;  
            y+=step;  
        }  
    } 
}
