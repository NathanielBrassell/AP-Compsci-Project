import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Game extends JFrame {
	public Game(){
		//Frame settings
		setTitle("Stuyopoly");
		setDefaultCloseOperation(EXIT_ON_CLOSE );
		setLocation( 250, 250 );
		setSize(700,500);
		//Panel
		// North,South,East,West are the board
		JPanel north = new JPanel(new BorderLayout());
		JPanel south = new JPanel(new BorderLayout());
		JPanel east = new JPanel(new BorderLayout());
		JPanel west = new JPanel(new BorderLayout());
		// Center is buttons and display
		JPanel center = new JPanel(new BorderLayout());
		add (north);
		add (south);
  		add (east);
  		add (west);
		add (center);
		//Buttons
        JButton Dice = new JButton ("Roll Dice");
		JButton northb = new JButton ("North");
		JButton southb = new JButton ("South");
		JButton eastb = new JButton ("East");
		JButton westb = new JButton ("West");
		northb.setPreferredSize(new Dimension(100, 100));
		southb.setPreferredSize(new Dimension(100, 100));
		eastb.setPreferredSize(new Dimension(100, 100));
		westb.setPreferredSize(new Dimension(100, 100));
		north.add (northb);
		south.add (southb);
		east.add (eastb);
		west.add (westb);
		center.add (Dice);
		//Labels
		JLabel label = new JLabel ("Stuyopoly");
		//Menu
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("Menu");
        menu.setMnemonic(KeyEvent.VK_A);
        menu.getAccessibleContext().setAccessibleDescription("Main Menu");
        menuBar.add (menu);
        JMenuItem menuItem = new JMenuItem("New Game");
        menuItem.getAccessibleContext().setAccessibleDescription(
        "Starts a new Game");
        menu.add (menuItem);
		setJMenuBar (menuBar);
		//Content Pane
		Container c = getContentPane();
		c.add (north,BorderLayout.NORTH);
		c.add (south,BorderLayout.SOUTH);
		c.add (east,BorderLayout.EAST);
		c.add (west,BorderLayout.WEST);
		c.add (center,BorderLayout.CENTER);
		}

        public static void main(String[] args){
        Game Stuyopoly = new Game();
        Stuyopoly.setVisible(true);
	}
}
