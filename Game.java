import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.BufferedImage;
public class Game extends JFrame {

	JPanel Controls;
	JPanel Display;
	JPanel board;
	JPanel temp;
	JLabel Player1;
	private static int Location = 0;
			
    private Image getScaledImage(Image srcImg, int w, int h){
        BufferedImage resizedImg = new BufferedImage(w, h, BufferedImage.TYPE_INT_RGB);
        Graphics2D g2 = resizedImg.createGraphics();
        g2.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
        g2.drawImage(srcImg, 0, 0, w, h, null);
        g2.dispose();
        return resizedImg;
    }
	
    public Game(){


        //Frame settings
        setTitle("Stuyopoly");
        setDefaultCloseOperation(EXIT_ON_CLOSE );
        setLocation( 0, 0 );
        setSize(900,815);
		JPanel Controls = new JPanel (new GridBagLayout());
                Controls.setBackground(Color.PINK);
				
		GridBagLayout gbl = new GridBagLayout();
		
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
                                JPanel tile = new JPanel(new GridLayout(3,1));
                                c.gridx = x;
                                c.gridy = y;
								c.fill = GridBagConstraints.BOTH;      
                                board.add(tile, c);
								JLabel Player1 = new JLabel("");
								JLabel Property = new JLabel("");
								if (x == 4){
								Property.setText("Tribeca");
								}
								if (x ==3) {
								Property.setText("PE");
								tile.setBackground(Color.GRAY);}
								if (x == 2){
								Property.setText("Health");
								tile.setBackground(Color.GRAY);}
								if (x == 1){
								Property.setText("Chance");
								tile.setBackground(Color.RED);}
								if (x == 0){
								Property.setText ("Principal's Office");
								}
								JLabel Player2 = new JLabel("");
								tile.setPreferredSize(tile.size());
								tile.add(Player1);
								tile.add(Property);
								tile.add(Player2);
                                tile.setBorder(BorderFactory
                        .createLineBorder(Color.BLACK));
						}

		// East Row	(Excluding North and South Ends)					
				for (int y = 3; y > 0; y--){
								int x = 0;
                                JPanel tile = new JPanel(new GridLayout(3,1));
                                c.gridx = x;
                                c.gridy = y;
								c.fill = GridBagConstraints.BOTH;      
                                board.add(tile, c);
								JLabel Player1 = new JLabel("");
								JLabel Property = new JLabel("");
								if (y == 3){
								Property.setText("Geometry");
								tile.setBackground(Color.CYAN);}
								if (y == 2) {
								Property.setText("Trigonometry");
								tile.setBackground(Color.CYAN);}
								if (y == 1){
								Property.setText("Calculus");
								tile.setBackground(Color.CYAN);}
								JLabel Player2 = new JLabel("");
								tile.setPreferredSize(tile.size());
								tile.add(Player1);
								tile.add(Property);
								tile.add(Player2);
                                tile.setBorder(BorderFactory
                        .createLineBorder(Color.BLACK));
						}     
                                				
		// North Row (		
				for (int x = 0; x < 5; x++){
								int y = 0;
                                JPanel tile = new JPanel(new GridLayout(3,1));
                                c.gridx = x;
                                c.gridy = y;
								c.fill = GridBagConstraints.BOTH;      
                                board.add(tile, c);
								JLabel Player1 = new JLabel("");
								JLabel Property = new JLabel("");
								if (x == 0){
								Property.setText("Free Lunch");
								}
								if (x == 1) {
								Property.setText("Biology");
								tile.setBackground(Color.GREEN);}
								if (x == 2){
								Property.setText("Chemistry");
								tile.setBackground(Color.GREEN);}
								if (x == 3){
								Property.setText("Physics");
								tile.setBackground(Color.GREEN);}
								if (x == 4){
								Property.setText ("Go to Detention");
								}
								JLabel Player2 = new JLabel("");
								tile.setPreferredSize(tile.size());
								tile.add(Player1);
								tile.add(Property);
								tile.add(Player2);
                                tile.setBorder(BorderFactory
                        .createLineBorder(Color.BLACK));
						}
                                
		// West Row (Excluding North and South Ends)
				for (int y = 1; y < 4; y++){
								int x = 4;
                                JPanel tile = new JPanel(new GridLayout(3,1));
                                c.gridx = x;
                                c.gridy = y;
								c.fill = GridBagConstraints.BOTH;      
                                board.add(tile, c);
								JLabel Player1 = new JLabel("");
								JLabel Property = new JLabel("");
								if (y == 1){
								Property.setText("Chest");
								tile.setBackground(Color.YELLOW);}
								if (y == 2) {
								Property.setText("Intro To CS");
								tile.setBackground(Color.MAGENTA);}
								if (y == 3){
								Property.setText("AP CS");
								tile.setBackground(Color.MAGENTA);}
								JLabel Player2 = new JLabel("");
								tile.setPreferredSize(tile.size());
								tile.add(Player1);
								tile.add(Property);
								tile.add(Player2);
                                tile.setBorder(BorderFactory
                        .createLineBorder(Color.BLACK));
                                                
                                }									
					
								
		//Labels
		JPanel temp = (JPanel) board.getComponent(0);
		JLabel Player1 = (JLabel) temp.getComponent(0);
		ImageIcon icon = new ImageIcon("Teital.jpg");
	    final ImageIcon thumbnailIcon = new ImageIcon(getScaledImage(icon.getImage(), 30, 30));
		Player1.setIcon(thumbnailIcon);
		
		JLabel Player2 = (JLabel) temp.getComponent(2);
		ImageIcon icon2 = new ImageIcon("Zhang.jpg");
	    final ImageIcon thumbnailIcon2 = new ImageIcon(getScaledImage(icon2.getImage(), 30, 30));
		Player2.setIcon(thumbnailIcon2);
		
		
		
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

		final JTextArea Text = new JTextArea ("Welcome to Stuyopoly \n");
        Text.setEditable(false);

		
		final JTextArea Bank = new JTextArea ("Money! \n");
        Bank.setEditable(false);
		Bank.append ("Player 1 has $200 \n");
		Bank.append ("Player 2 has $200 \n");
		
        //ScrollPane
        JScrollPane TextScrollPane = new JScrollPane(Text);
		TextScrollPane.setPreferredSize(new Dimension(100,50));
		c.insets = new Insets(10,10,10,10);
		c.ipady = 300;
        c.ipadx = 70;
        c.gridx = 0;
        c.gridy = 0;
        Display.add (TextScrollPane,c);

		
		JScrollPane BankScrollPane = new JScrollPane(Bank);
		BankScrollPane.setPreferredSize(new Dimension(100,50));
		c.insets = new Insets(10,10,10,10);
        c.ipady = 300;
        c.ipadx = 70;
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
				 Text.setCaretPosition(Text.getDocument().getLength());
				 JPanel temp = (JPanel) board.getComponent(Location);
				 JLabel Player1 = (JLabel) temp.getComponent(0);
				 Player1.setIcon(null);
				 if (Location + rand3 > 15){
				 Location = Location - 16;}
				 temp = (JPanel) board.getComponent(Location + rand3);
				 Player1 = (JLabel) temp.getComponent(0);
			     Player1.setIcon(thumbnailIcon);
				 Location = Location + rand3;
                }
         });
        menuItem.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent r){
                Text.setText("Welcome to Stuyopoly \n"); 
				Bank.setText("Money! \nPlayer 1 has $200 \nPlayer 2 has $200 \n");
				JPanel temp = (JPanel) board.getComponent(Location);
				JLabel Player1 = (JLabel) temp.getComponent(0);
				Player1.setIcon(null);
				Location = 0;
				temp = (JPanel) board.getComponent(Location);
				Player1 = (JLabel) temp.getComponent(0);
			    Player1.setIcon(thumbnailIcon);
                }
                 }  );

 

    }
    public static void main(String[] args){
        Game Stuyopoly = new Game();
        Stuyopoly.setVisible(true);
    }
}
