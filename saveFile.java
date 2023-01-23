import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class saveFile {
    StackStorage mainfile = new StackStorage();
     boolean savetoFile() {
		int chooserStatus;
		String filename ="";
			JFileChooser chooser = new JFileChooser();
			chooserStatus = chooser.showSaveDialog(null);
			if (chooserStatus == JFileChooser.APPROVE_OPTION) {
				File selectedFile = chooser.getSelectedFile();
				filename = selectedFile.getPath();
				JOptionPane.showMessageDialog(null, "Path of stored file is:" + filename);
			}
	
		boolean success;
		FileWriter fwriter;
		PrintWriter outputFile;
		String Text = mainfile.txtEditor.getText();

		try {
			fwriter = new FileWriter(filename+".txt");
			outputFile = new PrintWriter(fwriter);
			outputFile.print(Text);
			outputFile.close();
			success = true;
		} catch (IOException e) {
			success = false;
			System.out.println(e);
		}
		return success;
		
	}
}
