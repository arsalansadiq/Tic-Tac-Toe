import java.awt.Dimension;
import java.awt.GridLayout;

import javax.swing.*;;


public class TicTacToeFrame extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private static final int size = 3;
	private JButton[][] buttons;
	private JMenuBar menuBar;
	private JMenu Option;
	private JMenuItem Restart;

	public TicTacToeFrame() {
		
		super("TicTacToe");
		TictactoeModel model = new TictactoeModel();
		TictactoeController controller = new TictactoeController(model, this);
		menuBar= new JMenuBar();
		Option = new JMenu("Option");
		Restart= new JMenuItem("Restart");
		Restart.addActionListener(controller);
		
		menuBar.add(Option);
		Option.add(Restart);
		
		setJMenuBar(menuBar);
		//Restart.setActionCommand(getName());
		
		this.setLayout(new GridLayout(size, size));
		buttons = new JButton[size][size];
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				JButton b = new JButton("");
				b.setActionCommand(i + " " + j);
				buttons[i][j] = b;
				this.add(b);
				b.addActionListener(controller);
			}
			
			
		}
		this.setSize(300, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
	}

	public void Winner(String s){
		JOptionPane.showMessageDialog(this,s+" has won the game.");
	}
	
	public void setallFalse(){
		for (int i = 0; i < size; i++) {
			for (int j = 0; j < size; j++) {
				buttons[i][j].setEnabled(false);
			}
		}
	}
	
	public void restart(){
		this.dispose();
		new TicTacToeFrame();
		
	}
	
	public static void main(String args[]) {
		new TicTacToeFrame();
	}
}
