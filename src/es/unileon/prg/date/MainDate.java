package es.unileon.prg.date;

public class MainDate {

	public static void main(String[] args) {

		Date today;
	

		try {
			today = new Date(20, 11, 2017);
			System.out.println(today.toString());

			today = new Date(20,11,2017);
			System.out.println(today.isSameDay(21));

		} catch (DateException e) {
			System.out.println(e.getMessage());
		}

	}

}
