package codewars_kyu7;

public class Isograms {

	public static String isIsogram(String string) {
		// TODO Auto-generated method stub
		return null;
	}

	/*
	 * char[] charArray = str.toLowerCase().toCharArray();
	 * 
	 * if (str == "") { return true; }
	 * 
	 * int cnt = 0; for (int i = 0; i < str.length(); i++) { for (int j = i + 1; j <
	 * str.length(); j++) { if (charArray[i] == charArray[j] ) {
	 * System.out.println(charArray[j]); cnt++; return false; } } } return true;
	 * 
	 * }
	 * 
	 * 
	 * /* Character[] charObjectArray = str.chars().mapToObj(c ->
	 * (char)c).toArray(Character[]::new);
	 * 
	 * //Character[] charObjectArray = ArrayUtils.toObject(charArray);
	 * 
	 * for (int i = 0; i < charArray.length; i++) {
	 * 
	 * for (int j = i+1; j < charObjectArray.length; j++) {
	 * 
	 * if(charObjectArray[i].equals(charObjectArray[j])) { return false; } } }
	 * return true; }
	 */

	public static void main(String[] args) {

		System.out.println(isIsogram("asdfghfa"));

	}
}
