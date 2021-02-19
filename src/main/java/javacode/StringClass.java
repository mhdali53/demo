package javacode;

public class StringClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "Mohammad Ali Yasir";
		int len = s1.length();
		int arr[] = new int[256];
		for (int i = 0; i < len; i++) {
			arr[s1.charAt(i)] = arr[s1.charAt(i)] + 1;
		}
		int max = -1;
		char c = ' ';
		for (int i = 0; i < s1.length(); i++) {
			if (max < arr[s1.charAt(i)]) {
				max = arr[s1.charAt(i)];
				c = s1.charAt(i);
			}
		}
		System.out.println(c);
	}

}
