import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Game extends JFrame {
    public Game(){


        //Frame settings
        setTitle("Stuyopoly");
        setDefaultCloseOperation(EXIT_ON_CLOSE );
        setLocation( 200, 200 );
        setSize(700,650);
        JPanel pane = new JPanel (new GridBagLayout());
		pane.setBackground(Color.CYAN);
        GridBagConstraints c = new GridBagConstraints();
        getContentPane().add (pane,BorderLayout.NORTH);
        c.gridx = 0;
        c.gridy = 0;
		c.ipady = 120;
		c.ipadx = 120;
		
		for (int x = 0; x < 3; x++){
			for ( int y = 0 ; y < 3; y++){	
				JPanel tile = new JPanel();
				c.gridx = x;
				c.gridy = y;
				pane.add(tile, c);
				tile.setBorder(BorderFactory
                        .createLineBorder(Color.BLACK));
						}
				}

        //Buttons
        JButton Dice = new JButton ("Roll");
		c.gridwidth = 3;
        c.insets = new Insets(10,0,0,0);
        c.ipady = 10;
        c.gridx = 0;
        c.gridy = 3;
        pane.add(Dice, c);
		
		JButton Buy = new JButton ("Buy");
		c.gridwidth = 3;
        c.insets = new Insets(10,0,0,0);
        c.ipady = 10;
        c.gridx = 0;
        c.gridy = 4;
        pane.add(Buy, c);
		
		JButton EndTurn = new JButton ("End Turn");
		c.gridwidth = 3;
        c.insets = new Insets(10,0,0,0);
        c.ipady = 10;
        c.gridx = 0;
        c.gridy = 5;
        pane.add(EndTurn, c);

        //TextArea
        final JTextArea Text = new JTextArea ("Welcome to Stuyopoly \n");
        Text.setEditable(false);
        c.gridwidth = 2;
		c.gridheight = 3;
        c.insets = new Insets(10,10,10,10);
        c.ipady = 300;
		c.ipadx = 70;
        c.gridx = 5;
        c.gridy = 0;
        pane.add(Text, c);

        //ScrollPane
        JScrollPane areaScrollPane = new JScrollPane(Text);
        pane.add (areaScrollPane,c);

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

        //Actions
        Dice.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e){
                 int rand = (int) (Math.random() * 6) + 1;
                 int rand2 = (int) (Math.random() * 6) + 1;
                 int rand3 = rand + rand2;
                 Text.append ("You rolled a " + rand3 + "\n");
                }
         });
        menuItem.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent r){
                Text.setText("Welcome to Stuyopoly \n"); 
                }
                 }  );
 

    }
    public static void main(String[] args){
        Game Stuyopoly = new Game();
        Stuyopoly.setVisible(true);
    }
}
