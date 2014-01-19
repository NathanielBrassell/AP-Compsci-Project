import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Game extends JFrame {

	JPanel Controls;
	JPanel Display;
	JPanel board;
	JPanel temp;
	JLabel Player1;
	
	
    public Game(){


        //Frame settings
        setTitle("Stuyopoly");
        setDefaultCloseOperation(EXIT_ON_CLOSE );
        setLocation( 0, 0 );
        setSize(900,815);
		JPanel Controls = new JPanel (new GridBagLayout());
                Controls.setBackground(Color.PINK);
		
		JPanel Display = new JPanel (new GridBagLayout());
                Display.setBackground(Color.PINK);
				
        final JPanel board = new JPanel (new GridBagLayout());
                board.setBackground(Color.PINK);
				
        GridBagConstraints c = new GridBagConstraints();
		
        getContentPane().add (board,BorderLayout.CENTER);
		getContentPane().add (Controls,BorderLayout.EAST);
		getContentPane().add (Display,BorderLayout.WEST);
		
		c.ipadx = 100;
		c.ipady = 100;
		c.fill = GridBagConstraints.BOTH;     
		//South Row
                for (int x = 4; x >= 0; x--){
								int y = 4;
								if (x == 4){
                                final JPanel tile = new JPanel(new BorderLayout());
                                c.gridx = x;
                                c.gridy = y;
								c.fill = GridBagConstraints.BOTH;      
                                board.add(tile, c);
								JLabel Player1 = new JLabel("Player 1");				
								Player1.setPreferredSize(tile.size());
								tile.add(Player1);
                                tile.setBorder(BorderFactory
                        .createLineBorder(Color.BLACK));
                                                }
								else{
                                final JPanel tile = new JPanel(new BorderLayout());
                                c.gridx = x;
                                c.gridy = y;
								c.fill = GridBagConstraints.BOTH;      
                                board.add(tile, c);
								JLabel Player1 = new JLabel();				
								Player1.setPreferredSize(tile.size());
								tile.add(Player1);
                                tile.setBorder(BorderFactory
                        .createLineBorder(Color.BLACK));}								
								
                                }
								
		// East Row	(Excluding North and South Ends)					
				for (int y = 3; y > 0; y--){
								int x = 0;
                                JPanel tile = new JPanel(new BorderLayout());
                                c.gridx = x;
                                c.gridy = y;
								c.fill = GridBagConstraints.BOTH;     
                                board.add(tile, c);
								JLabel Player1 = new JLabel("");
								Player1.setPreferredSize(tile.size());								
								tile.add(Player1);
                                tile.setBorder(BorderFactory
                        .createLineBorder(Color.BLACK));      
                                }				
		// North Row (		
				for (int x = 0; x < 5; x++){
								int y = 0;
                                JPanel tile = new JPanel(new BorderLayout());
                                c.gridx = x;
                                c.gridy = y;
								c.fill = GridBagConstraints.BOTH;     
                                board.add(tile, c);
								JLabel Player1 = new JLabel();
								Player1.setPreferredSize(tile.size());								
								tile.add(Player1);								
                                tile.setBorder(BorderFactory
                        .createLineBorder(Color.BLACK));
                                                
                                }
		// West Row (Excluding North and South Ends)
				for (int y = 1; y < 4; y++){
								int x = 4;
                                JPanel tile = new JPanel(new BorderLayout());
                                c.gridx = x;
                                c.gridy = y;
								c.fill = GridBagConstraints.BOTH;     
                                board.add(tile, c);
								JLabel Player1 = new JLabel();
								Player1.setPreferredSize(tile.size());								
								tile.add(Player1);								
                                tile.setBorder(BorderFactory
                        .createLineBorder(Color.BLACK));
                                                
                                }									
					
								
		//Labels

		
        //Buttons
        JButton Dice = new JButton ("Roll");
        c.insets = new Insets(10,10,10,10);
        c.ipady = 10;
		c.ipadx = 10;
        c.gridx = 0;
        c.gridy = 0;
        Controls.add(Dice, c);
        
		JButton Buy = new JButton ("Buy");
        c.insets = new Insets(10,10,10,10);
        c.ipady = 10;
		c.ipadx = 10;
        c.gridx = 0;
        c.gridy = 1;
        Controls.add(Buy, c);
		
        JButton EndTurn = new JButton ("End Turn");
        c.insets = new Insets(10,10,10,10);
        c.ipady = 10;
		c.ipadx = 10;
        c.gridx = 0;
        c.gridy = 2;
        Controls.add(EndTurn, c);

        //TextArea
        final JTextArea Text = new JTextArea ("Welcome to Stuyopoly \n");
        Text.setEditable(false);
		Text.setPreferredSize(new Dimension(30,30));
        c.insets = new Insets(10,10,10,10);
        c.ipady = 300;
        c.ipadx = 70;
        c.gridx = 0;
        c.gridy = 0;
        Display.add(Text, c);
		
		final JTextArea Bank = new JTextArea ("Money! \n");
        Bank.setEditable(false);
		Text.setPreferredSize(new Dimension(30,30));
        c.insets = new Insets(10,10,10,10);
        c.ipady = 300;
        c.ipadx = 70;
        c.gridx = 0;
        c.gridy = 1;
        Display.add(Bank, c);
		Bank.append ("Player 1 has $200 \n");
		Bank.append ("Player 2 has $200 \n");
        //ScrollPane
        JScrollPane TextScrollPane = new JScrollPane(Text);
		c.gridx = 0;
        c.gridy = 0;
        Display.add (TextScrollPane,c);

		
		JScrollPane BankScrollPane = new JScrollPane(Bank);
		c.gridx = 0;
        c.gridy = 1;
        Display.add (BankScrollPane,c);
		
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
