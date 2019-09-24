import java.util.Scanner;


public class GradeConverter {
	public static void main(String[] args) {


		convert13to7(5);
	}
	public static int convert13to7(int grade) {
		System.out.print("Indtast din gamle 13-skala karakter");

		Scanner number = new Scanner(System.in);

		int calcu = number.nextInt();
		String newGrade = "a";

		if (calcu == 00) {
			newGrade = "-3";
		} else if (calcu == 03) {
			newGrade = "00";
		} else if (calcu == 5) {
			newGrade = "00";
		} else if (calcu == 6) {
			newGrade = "02";
		} else if (calcu == 7) {
			newGrade = "04";		
		} else if (calcu == 8) {
			newGrade = "7";		
		} else if (calcu == 9) {
			newGrade = "7";		
		} else if (calcu == 10) {
			newGrade = "10";
		} else if (calcu == 11) {
			newGrade = "12";
		} else if (calcu == 13) {
			newGrade = "12";
		}																		
	}
}