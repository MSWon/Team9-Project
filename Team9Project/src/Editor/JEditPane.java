package Editor;
import javax.swing.JOptionPane;
import javax.swing.JTextPane;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;

public class JEditPane extends JTextPane {
	
	public void append(String s) {
	   try {
	      Document doc = this.getDocument();
	      doc.insertString(doc.getLength(), s, null);
	   } catch(BadLocationException exc) {
		   JOptionPane.showMessageDialog(null, "There is an error!!");
			exc.printStackTrace();
	   }
	}

}
