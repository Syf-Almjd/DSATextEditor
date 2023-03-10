import java.awt.Font;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import java.awt.event.*;

public class font {
	final JFrame f = new JFrame();
	JRadioButton jRadioButton1, jRadioButton2, jRadioButton3;
	JButton donebtn = new JButton("Done");
	ButtonGroup G1;
	JLabel fontLbl = new JLabel("Choose Font: ");

	void fonttype() {
		f.setBounds(300, 300, 300, 280);
		f.setTitle("Font Type:");
		f.setVisible(true);
		f.setLayout(null);
		jRadioButton1 = new JRadioButton("Monospaced");
		jRadioButton2 = new JRadioButton("Serif");
		jRadioButton3 = new JRadioButton("SansSerif");

		G1 = new ButtonGroup();
		fontLbl = new JLabel("Choose Font: ");

		jRadioButton1.setBounds(100, 20, 120, 50);
		jRadioButton2.setBounds(100, 55, 120, 50);
		jRadioButton3.setBounds(100, 85, 120, 50);

		donebtn.setBounds(100, 150, 80, 50);
		fontLbl.setBounds(10, 30, 100, 30);
		f.add(jRadioButton1);
		f.add(jRadioButton2);
		f.add(jRadioButton3);
		f.add(donebtn);

		f.add(fontLbl);

		G1.add(jRadioButton1);
		G1.add(jRadioButton2);
		G1.add(jRadioButton3);

		donebtn.addActionListener(new ActionListener() {
			Font textFont = StackStorage.txtEditor.getFont();
			String fontName = textFont.getName();
			int fontSize = textFont.getSize();
			int fontStyle = Font.PLAIN;

			public void actionPerformed(ActionEvent e) {

				if (jRadioButton1.isSelected()) {
					fontName = "Monospaced";
					f.setVisible(false);
				} else if (jRadioButton2.isSelected()) {
					fontName = "Serif";
					f.setVisible(false);

				} else if (jRadioButton3.isSelected()) {
					fontName = "SansSerif";
					f.setVisible(false);

				} else {
					JOptionPane.showMessageDialog(null, "Please choose one");
				}
				StackStorage.txtEditor.setFont(new Font(fontName, fontStyle, fontSize));

			}
		});
	}

	void fontstyle() {
		final JFrame f = new JFrame();
		JCheckBox c1, c2;
		JButton Donebtn = new JButton("Done");

		JLabel fontLbl;

		f.setBounds(280, 250, 280, 250);
		f.setTitle("Font Style:");
		f.setVisible(true);
		f.setLayout(null);
		c1 = new JCheckBox("Bold");
		c2 = new JCheckBox("ITALIC");

		fontLbl = new JLabel("Choose Style: ");
		Donebtn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				f.setVisible(false);
			}
		});

		c1.setBounds(100, 20, 120, 50);
		c2.setBounds(100, 55, 120, 50);
		Donebtn.setBounds(100, 120, 80, 50);
		fontLbl.setBounds(10, 30, 100, 30);
		f.add(c1);
		f.add(c2);
		f.add(Donebtn);

		f.add(fontLbl);

		Donebtn.addActionListener(new ActionListener() {
			Font textFont = StackStorage.txtEditor.getFont();
			String fontName = textFont.getName();
			int fontSize = textFont.getSize();
			int fontStyle = Font.PLAIN;

			public void actionPerformed(ActionEvent e) {

				if (c1.isSelected()) {
					fontStyle += Font.BOLD;
				} else if (c2.isSelected()) {
					fontStyle += Font.ITALIC;
				} else {
				}
				StackStorage.txtEditor.setFont(new Font(fontName, fontStyle, fontSize));

			}
		});
	}
}
