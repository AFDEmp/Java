package patterns206.behavioral.command;

import java.awt.Component;
import java.awt.event.ActionEvent;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.Icon;
import javax.swing.JOptionPane;

class ExitAction extends AbstractAction {
	private static final long serialVersionUID = 1L;
	private Component target;

	public ExitAction(String name, Icon icon, Component t) {
		putValue(Action.NAME, name);
		putValue(Action.SMALL_ICON, icon);
		putValue(Action.SHORT_DESCRIPTION, name + " the program");
		target = t;
	}

	public void actionPerformed(ActionEvent evt) {
		int answer = JOptionPane.showConfirmDialog(target,
				"Are you sure you want to exit? ", "Confirmation",
				JOptionPane.YES_NO_OPTION);
		if (answer == JOptionPane.YES_OPTION) {
			System.exit(0);
		}
	}
}
