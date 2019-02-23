package controlflow;

public class SwitchStatement {

	public static void main(String[] arg) {

		String days = "sunday";

		switch (days) {

		case "monday":
			System.out.println("Day 1");
			break;
		case "tuesday":
			System.out.println("Day 2");
			break;
		case "wednesday":
			System.out.println("Day 3");
			break;
		case "Thursday":
			System.out.println("Day 4");
			break;
		case "Friday":
			System.out.println("Day 5");
			break;
		case "Saturday":
			System.out.println("Day 6");
			break;
		case "Sunday":
			System.out.println("Day 7");
			break;
		default:
			System.out.println("Default Day is 1");
		}
	}
}
