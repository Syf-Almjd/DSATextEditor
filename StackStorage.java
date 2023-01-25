
import java.util.Stack;

import javax.swing.JTextArea;

public class StackStorage {
	static JTextArea txtEditor = new JTextArea();
	static Stack<String> mainStack = new Stack<String>();
	static Stack<String> Redo = new Stack<String>();
	static Stack<String> CopyPaste = new Stack<String>();

	// Function to perform WRITE
	static void WRITE(Stack<String> mainStack, String X) {
		// Push an element to top
		mainStack.push(X);
	}

	// Function to perform WRITE
	static void COPY(Stack<String> CopyPaste, String X) {
		// Push an element to top
		CopyPaste.push(X);
	}

	static void PASTE() {
		// paste an element of top
		String txt = txtEditor.getText();
		String newtxt = CopyPaste.peek();
		txtEditor.setText(txt + newtxt);
	}

	static void CUT(Stack<String> CopyPaste, String X) {
		CopyPaste.push(X);
		txtEditor.setText("");
	}

	// Function to UNDO
	static void UNDO() {
		Redo.push(mainStack.pop());
		txtEditor.setText(mainStack.peek().toString());
	}

	// Function to perform REDO
	static void REDO() {
		mainStack.push(Redo.peek());
		txtEditor.setText(Redo.peek().toString());
		Redo.pop();
	}

	// Function to perform READ
	static void READ() {
		txtEditor.setText(mainStack.toString());
	}
}