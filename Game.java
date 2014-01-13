import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Game extends JFrame {
	public Game(){
		setTitle("Stuyopoly");
		setDefaultCloseOperation(EXIT_ON_CLOSE );
		setLocation( 250, 250 );
		setSize(700,500);
		//Layout
		setLayout(new BorderLayout());
		//Components
		final JTextArea TextArea = new JTextArea();
		JButton Dice = new JButton ("Roll Dice");
		
		JMenuBar menuBar = new JMenuBar();
		JMenu menu = new JMenu("Menu");
		menu.setMnemonic(KeyEvent.VK_A);
       		menu.getAccessibleContext().setAccessibleDescription(
                "Main Menu");
		menuBar.add (menu);
		JMenuItem menuItem = new JMenuItem("New Game");
        	menuItem.getAccessibleContext().setAccessibleDescription(
                "Starts a new Game");
		menu.add (menuItem);
		//Content Pane
		Container c = getContentPane();
		c.add (TextArea,BorderLayout.CENTER);
		c.add (menuBar, BorderLayout.NORTH);
		c.add (Dice , BorderLayout.SOUTH);
		//Behavior
		Dice.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
			int rand = (int) (Math.random() * 6) + 1;
			int rand2 = (int) (Math.random() * 6) + 1;
			int rand3 = rand + rand2;
	TextArea.append ("You rolled a " + rand3 + "\n");
		}
		});
		}
	public static void main(String[] args){
	Game Stuyopoly = new Game();
	Stuyopoly.setVisible(true);
	}
}
