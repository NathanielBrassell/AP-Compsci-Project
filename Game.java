import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Game2 extends JFrame {
    public Game2(){
	//Frame settings
	setTitle("Stuyopoly");
	setDefaultCloseOperation(EXIT_ON_CLOSE );
	setLocation( 250, 250 );
	setSize(500,500);
	JPanel pane = new JPanel (new GridBagLayout());
	GridBagConstraints c =  new GridBagConstraints();
	getContentPane().add (pane,BorderLayout.NORTH);

	//tiles
	JLabel tile1 = new JLabel("Tile 1");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.5;
	c.ipady = 60;
	c.gridx = 0;
	c.gridy = 0;
	pane.add(tile1, c);
	tile1.setBorder(BorderFactory
			.createLineBorder(Color.BLACK));

	JLabel tile2 = new JLabel("Tile 2");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.5;
	c.ipady = 60;
	c.gridx = 1;
	c.gridy = 0;
	pane.add(tile2, c);
	tile2.setBorder(BorderFactory
			.createLineBorder(Color.BLACK));

	JLabel tile3 = new JLabel("Tile 3");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.ipady = 60;
	c.weightx = 0.5;
	c.gridx = 2;
	c.gridy = 0;
	pane.add(tile3, c);
	tile3.setBorder(BorderFactory
			.createLineBorder(Color.BLACK));

	JLabel tile4 = new JLabel("Tile 4");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.ipady = 60;      //make this component tall
	c.weightx = 0.0;
	c.gridwidth = 3;
	c.anchor = GridBagConstraints.LINE_START;
	c.insets = new Insets(0,0,0,321);
	c.gridx = 0;
	c.gridy = 1;
	pane.add(tile4, c);
	tile4.setBorder(BorderFactory
			.createLineBorder(Color.BLACK));

	JLabel tile5 = new JLabel("Tile 5");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.ipady = 60;      //make this component tall
	c.weightx = 0.0;
	c.gridwidth = 3;
	c.insets = new Insets(0,161,0,0);
	c.gridx = 1;
	c.gridy = 1;
	pane.add(tile5, c);
	tile5.setBorder(BorderFactory
			.createLineBorder(Color.BLACK));

	JLabel tile6 = new JLabel("Tile 6");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.5;
	c.gridwidth = 1;
	c.insets = new Insets(0,0,0,0);
	c.ipady = 60;
	c.gridx = 0;
	c.gridy = 2;
	pane.add(tile6, c);
	tile6.setBorder(BorderFactory
			.createLineBorder(Color.BLACK));

	JLabel tile7 = new JLabel("Tile 7");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.weightx = 0.5;
	c.insets = new Insets(0,0,0,0);
	c.ipady = 60;
	c.gridx = 1;
	c.gridy = 2;
	pane.add(tile7, c);
	tile7.setBorder(BorderFactory
			.createLineBorder(Color.BLACK));

	JLabel tile8 = new JLabel("Tile 8");
	c.fill = GridBagConstraints.HORIZONTAL;
	c.insets = new Insets(0,0,0,0);
	c.ipady = 60;
	c.gridx = 2;
	c.gridy = 2;
	pane.add(tile8, c);
	tile8.setBorder(BorderFactory
			.createLineBorder(Color.BLACK));
	
	//Buttons
	JButton Dice = new JButton ("Roll");
	c.gridwidth = 3;
	c.fill = GridBagConstraints.HORIZONTAL;
	c.insets = new Insets(0,0,0,0);
	c.ipady = 10;
	c.gridx = 0;
	c.gridy = 3;
	pane.add(Dice, c);

	//TextArea
	final JTextArea Text = new JTextArea ();
	c.gridwidth = 3;
	c.fill = GridBagConstraints.HORIZONTAL;
	c.insets = new Insets(0,0,0,0);
	c.ipady = 70;
	c.gridx = 0;
	c.gridy = 4;
	pane.add(Text, c);

	//Actions
	Dice.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e){
		    int rand = (int) (Math.random() * 6) + 1;
		    int rand2 = (int) (Math.random() * 6) + 1;
		    int rand3 = rand + rand2;
		    Text.append ("You rolled a " + rand3 + "\n");
		}
	    });
   
 
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
    }
    public static void main(String[] args){
        Game2 Stuyopoly = new Game2();
        Stuyopoly.setVisible(true);
    }
}
