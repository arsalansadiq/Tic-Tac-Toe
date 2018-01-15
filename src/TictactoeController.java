import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class TictactoeController implements ActionListener {

	TictactoeModel model;
	TicTacToeFrame gui;
	int counter = 0;
	String p;
	public TictactoeController(TictactoeModel Model, TicTacToeFrame gui) {
		model = Model;
		this.gui = gui;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() instanceof JButton) {
			JButton buttonClicked = (JButton) e.getSource();

			String[] s = e.getActionCommand().split(" ");
			int i = Integer.parseInt(s[0]);
			int j = Integer.parseInt(s[1]);
			if (counter % 2 == 0) {
				buttonClicked.setText("O");
				buttonClicked.setEnabled(false);
				 p= buttonClicked.getText();
				model.setValue(i, j, 'O');
				counter++;
			} else {
				buttonClicked.setText("X");
				buttonClicked.setEnabled(false);
				p= buttonClicked.getText();
				model.setValue(i, j, 'X');
				counter++;
			}
			
			if(model.hasWon(i, j)){
				gui.Winner(p);
				gui.setallFalse();
			}

		}
		if(e.getActionCommand().equals("Restart")){
			gui.restart();
		}

	}

}
