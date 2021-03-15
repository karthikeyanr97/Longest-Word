import java.util.Scanner;

public class LongestWord extends UserMainCode {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Enter the sentence:");
		String sentence = scanner.nextLine();

		String result = getLargestWord(sentence);
		System.out.println(result);

		scanner.close();
	}
}

class UserMainCode {

	public static String getLargestWord(String sentence) {

		if (sentence.length() > 100)
			return "Sentence exists max 100 characters";

		String words[] = sentence.split(" ");
		String result = "";

		for (int i = 0; i < words.length - 1; i++) {

			result = words[i];

			for (int j = i + 1; j < words.length; j++) {

				if (words[i].length() < words[j].length())
					result = words[j];

			}

		}
		return result;
	}
}