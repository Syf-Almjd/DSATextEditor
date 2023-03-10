import javax.swing.JFrame;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.lang.Thread;
import java.awt.*;

public class DSATextEditor {

	final static JFrame frame = new JFrame("DSA Exclusive TextEditor");
	final static SpringLayout layout = new SpringLayout();
	final static JPanel panel = new JPanel(layout);
	final static saveFile SavetoDevice = new saveFile();
	final static font fontstyletype = new font();
	final static JLabel lblAddress = new JLabel("\t Editor");

	static JButton New = new JButton("New");
	static JButton save = new JButton("Save");
	static JButton saveas = new JButton("Save to Device");
	static JButton copy = new JButton("Copy");
	static JButton paste = new JButton("Paste");
	static JButton cut = new JButton("Cut");
	static JButton clear = new JButton("Clear");
	static JButton read = new JButton("Read Stack");
	static JButton font = new JButton("Font");
	static JButton style = new JButton("Style");
	static JButton undo = new JButton("Undo");
	static JButton redo = new JButton("Redo");
	static JButton exit = new JButton("Exit");

	public static void main(String[] args) {
		// JOptionPane.showMessageDialog(null, "Welcome to the DSA editor! you can use
		// shortcuts such as\n"
		// + "\n - Select all text in current document: Ctrl + A"
		// + "\n - Cut the current selection: Ctrl + X"
		// + "\n - Copy the current selection: Ctrl + C"
		// + "\n - Paste the contents of the clipboard: Ctrl + V"
		// + "\n\n (Note) To used the stack based options"
		// + "\n - Save to save to stack"
		// + "\n - Read Stack to read from stack"
		// + "\n - Undo to Undo text from stack"
		// + "\n - Redo to Redo text from stack"
		// + "\n\n Thank you for using our Text Editor",

		// "Pro TIPS!", JOptionPane.INFORMATION_MESSAGE);

		panel.add(New);
		panel.add(save);
		panel.add(saveas);
		panel.add(copy);
		panel.add(paste);
		panel.add(cut);
		panel.add(clear);
		panel.add(font);
		panel.add(style);
		panel.add(read);
		panel.add(undo);
		panel.add(redo);
		panel.add(exit);
		panel.add(lblAddress);

		New.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				Newbtn();
			}
		});

		save.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				savebtn();
			}

		});
		saveas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				saveasbtn();
			}
		});
		copy.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				copybtn();
			}
		});
		paste.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pastebtn();
			}
		});
		cut.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				cutbtn();
			}
		});

		clear.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				clearbtn();
			}
		});
		font.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				fontbtn();
			}
		});
		style.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				stylebtn();
			}
		});
		read.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				readbtn();
			}
		});
		undo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				undobtn();
			}
		});
		redo.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				redobtn();
			}
		});
		exit.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				exitbtn();
			}
		});
		
	
		StackStorage.txtEditor.setBorder(BorderFactory.createLineBorder(Color.black));
		StackStorage.txtEditor.setLineWrap(true);
		StackStorage.txtEditor.setWrapStyleWord(true);

		JScrollPane scrollPane = new JScrollPane(StackStorage.txtEditor,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
		scrollPane.setPreferredSize(new Dimension(1200, 600));
		panel.add(scrollPane);
	
	
		layout.putConstraint(SpringLayout.NORTH, New,
				20,
				SpringLayout.WEST, panel);

		layout.putConstraint(SpringLayout.NORTH, save,
				20,
				SpringLayout.WEST, panel);
		layout.putConstraint(SpringLayout.NORTH, saveas,
				20,
				SpringLayout.WEST, panel);
		layout.putConstraint(SpringLayout.NORTH, copy,
				20,
				SpringLayout.WEST, panel);

		layout.putConstraint(SpringLayout.NORTH, paste,
				20,
				SpringLayout.WEST, panel);
		layout.putConstraint(SpringLayout.NORTH, cut,
				20,
				SpringLayout.WEST, panel);
				layout.putConstraint(SpringLayout.NORTH, clear,
				20,
				SpringLayout.WEST, panel);

	
				layout.putConstraint(SpringLayout.NORTH, font,
				20,
				SpringLayout.WEST, panel);

				layout.putConstraint(SpringLayout.NORTH, style,
				20,
				SpringLayout.WEST, panel);
				layout.putConstraint(SpringLayout.NORTH, read,
				20,
				SpringLayout.WEST, panel);
				layout.putConstraint(SpringLayout.NORTH, undo,
				20,
				SpringLayout.WEST, panel);
				layout.putConstraint(SpringLayout.NORTH, redo,
				20,
				SpringLayout.WEST, panel);
		layout.putConstraint(SpringLayout.NORTH, exit,
				20,
				SpringLayout.WEST, panel);

		layout.putConstraint(SpringLayout.WEST, New,
				0,
				SpringLayout.WEST, panel);
		layout.putConstraint(SpringLayout.NORTH, lblAddress,
				10,
				SpringLayout.SOUTH, New);

		layout.putConstraint(SpringLayout.WEST, save,
				25,
				SpringLayout.EAST, New);
		layout.putConstraint(SpringLayout.WEST, saveas,
				25,
				SpringLayout.EAST, save);
				layout.putConstraint(SpringLayout.WEST, copy,
				25,
				SpringLayout.EAST, saveas);
		layout.putConstraint(SpringLayout.WEST, paste,
				25,
				SpringLayout.EAST, copy);

		layout.putConstraint(SpringLayout.WEST, cut,
				25,
				SpringLayout.EAST, paste);

		

		layout.putConstraint(SpringLayout.WEST, clear,
				25,
				SpringLayout.EAST, cut);

	
		layout.putConstraint(SpringLayout.WEST, font,
				25,
				SpringLayout.EAST, clear);

		layout.putConstraint(SpringLayout.WEST, style,
				25,
				SpringLayout.EAST, font);
				layout.putConstraint(SpringLayout.WEST, read,
				25,
				SpringLayout.EAST, style);

				layout.putConstraint(SpringLayout.WEST, undo,
				25,
				SpringLayout.EAST, read);
				layout.putConstraint(SpringLayout.WEST, redo,
				25,
				SpringLayout.EAST, undo);
		layout.putConstraint(SpringLayout.WEST, exit,
				25,
				SpringLayout.EAST, redo);
		layout.putConstraint(SpringLayout.NORTH, scrollPane,
				10,
				SpringLayout.SOUTH, lblAddress);

		frame.setSize(1270, 750);
		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setVisible(true);
		frame.getContentPane().add(panel);
		panel.setBorder(new EmptyBorder(10, 30, 10, 30));
		// panel.setBackground(Color.LIGHT_GRAY);
		New.setBackground(Color.WHITE);
		save.setBackground(Color.WHITE);
		saveas.setBackground(Color.WHITE);
		copy.setBackground(Color.WHITE);
		paste.setBackground(Color.WHITE);
		cut.setBackground(Color.WHITE);
		clear.setBackground(Color.WHITE);
		font.setBackground(Color.WHITE);
		style.setBackground(Color.WHITE);
		read.setBackground(Color.WHITE);
		undo.setBackground(Color.WHITE);
		redo.setBackground(Color.WHITE);
		exit.setBackground(Color.WHITE);
		StackStorage.txtEditor.grabFocus();
		while (true) {
			savebtn();
			Thread.sleep(500);
			savebtn();
            try {
                Thread.sleep(3000);
				savebtn();
            } catch (InterruptedException e) {
                System.out.println("Error saving to stack");
            }
        }
	}

	static void Newbtn() {
		SavetoDevice.savetoFile();
		StackStorage.txtEditor.setText("");
		StackStorage.txtEditor.grabFocus();
		savebtn();
		
	}

	static void savebtn() {
		String text = StackStorage.txtEditor.getText();
		StackStorage.WRITE(StackStorage.mainStack, text);
		StackStorage.txtEditor.grabFocus();
	}

	static void saveasbtn() {

		if (!SavetoDevice.savetoFile()) {
			JOptionPane.showMessageDialog(null, "Error saving, Please try again!", "Error", JOptionPane.ERROR_MESSAGE);
		}
		StackStorage.txtEditor.grabFocus();
	}

	static String copybtn() {
		StackStorage.COPY(StackStorage.CopyPaste, StackStorage.txtEditor.getText().toString());
		StackStorage.txtEditor.grabFocus();
		
		return StackStorage.txtEditor.getText();
	}

	static String pastebtn() {
		StackStorage.PASTE();
		StackStorage.txtEditor.grabFocus();
		return StackStorage.txtEditor.getText();
	}

	static String cutbtn() {
		StackStorage.CUT(StackStorage.CopyPaste, StackStorage.txtEditor.getText().toString());
		StackStorage.txtEditor.grabFocus();
		return StackStorage.txtEditor.getText();

	}

	static void clearbtn() {
		StackStorage.txtEditor.setText("");
	}

	static void fontbtn() {

		fontstyletype.fonttype();
		StackStorage.txtEditor.grabFocus();
	}

	static void stylebtn() {

		fontstyletype.fontstyle();
		StackStorage.txtEditor.grabFocus();
	}

	static String readbtn() {
		try {
			StackStorage.READ();
		} catch (Exception a) {
			JOptionPane.showMessageDialog(New, "No Saved Data!");
		}
		StackStorage.txtEditor.grabFocus();
		return StackStorage.txtEditor.getText();
	}

	static void undobtn() {
		try {
			StackStorage.UNDO();
		} catch (Exception a) {
			JOptionPane.showMessageDialog(New, "No Saved Data!");
		}
		StackStorage.txtEditor.grabFocus();
	}

	static void redobtn() {

		try {
			StackStorage.REDO();
		} catch (Exception a) {
			JOptionPane.showMessageDialog(New, "No More Data!");
		}
		StackStorage.txtEditor.grabFocus();

	}

	static void exitbtn() {
		int savingExit = JOptionPane.showConfirmDialog(New, "Do you want to save the file to your Device?",
				"Save to Device", JOptionPane.YES_NO_CANCEL_OPTION);
		if (savingExit == 0) {
			SavetoDevice.savetoFile();
			System.exit(0);
		} else if (savingExit == 1) {
			System.exit(0);
		}

	}

}
