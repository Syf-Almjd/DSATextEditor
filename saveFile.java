import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class saveFile {
	int chooserStatus;
	String filename = "";
	JFileChooser chooser = new JFileChooser();

	boolean success;
	FileWriter fwriter;
	PrintWriter outputFile;

	boolean savetoFile() {

		chooserStatus = chooser.showSaveDialog(null);
		if (chooserStatus == JFileChooser.APPROVE_OPTION) {
			File selectedFile = chooser.getSelectedFile();
			filename = selectedFile.getPath();
			JOptionPane.showMessageDialog(null, "Path of stored file is:" + filename);
		}

		try {
			fwriter = new FileWriter(filename + ".txt");
			outputFile = new PrintWriter(fwriter);
			outputFile.print(StackStorage.txtEditor.getText());
			outputFile.close();
			success = true;
		} catch (IOException e) {
			success = false;
			System.out.println(e);
		}
		return success;

	}
}
