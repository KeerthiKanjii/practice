package day4;

import java.util.Arrays;

public class ArraySorting {

	public static void main(String[] args) {
		String[] names = { "Keerthi", "kusuma", "vaishu", "vijju", };

		Arrays.sort(names, (s1, s2) -> s1.compareTo(s2));

		System.out.println(Arrays.toString(names));
	}
}
