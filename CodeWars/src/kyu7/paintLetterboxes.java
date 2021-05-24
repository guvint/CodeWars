package kyu7;
/*
 * Developed skills: fundamentals.
 * 
 * You and a group of friends are earning some extra money in the school holidays by re-painting the numbers on people's 
 * letterboxes for a small fee.
 * Since there are 10 of you in the group each person just concentrates on painting one digit! For example, somebody will paint 
 * only the 1's, somebody else will paint only the 2's and so on...
 * But at the end of the day you realise not everybody did the same amount of work.
 * To avoid any fights you need to distribute the money fairly. That's where this Kata comes in.
 * 
 * Given the start and end letterbox numbers, write a method to return the frequency of all 10 digits painted.
 */
public class paintLetterboxes {

	public static int[] paint(final int start, final int end) {
		int[] freq = { 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

		for (int i = start; i <= end; i++) {
			int number = i;
			while (number > 0) {
				freq[number % 10]++;
				number /= 10;
			}
		}
		return freq;
	}
}