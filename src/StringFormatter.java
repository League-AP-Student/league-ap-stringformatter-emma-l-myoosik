import java.util.ArrayList;
import java.util.List;

public class StringFormatter
{
	public static int totalLetters(List<String> wordList) {
		int totalLetters = 0;
		for (String word: wordList) {
			totalLetters += word.length();
		}
		return totalLetters;
	}
	
	public static int basicGapWidth(List<String> wordList, int formattedLen) {
		int gap = wordList.size() - 1;
		int spaces = formattedLen - totalLetters(wordList);
		
		return spaces/gap;
	}
	
	public static String format(List<String> wordList, int formattedLen) {
		String newWord = "";
		int leftoverSpace = leftoverSpace(wordList, formattedLen);
		
		for (String word: wordList) {
			newWord += word;
			
			for (int i = 0; i < basicGapWidth(wordList, formattedLen); i++) {
				newWord += " ";
			}
			
			if (leftoverSpace > 0) {
				newWord += " ";
				leftoverSpace--;
			}
		}
		return newWord;
	}
	
	public static void main(String[] args) {
		ArrayList<String> wordList = new ArrayList<String>();
		wordList.add("AHam");
		wordList.add("Karma");
		wordList.add("Piano");
		System.out.println(StringFormatter.format(wordList, 25));
	}

	private static int leftoverSpace(List<String> wordList, int formattedLen) {
		// TODO Auto-generated method stub
		return 0;
	}
}