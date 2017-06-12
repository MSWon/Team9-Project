package Chapter;

import java.util.ArrayList;

public class ValueList {
	private ArrayList<String> KeyWord;
	public ValueList() {
		KeyWord = new ArrayList<String>();
	}

	public ArrayList<String> getKeyWord() {
		return KeyWord;
	}

	public void setKeyWord(String keyword) {
		KeyWord.add(keyword);
	}
	
}
