package es.unileon.prg.date;

public class Date {

	private int day;
	private int month;
	private int year;

	public Date(int day, int month, int year) throws DateException{
		this.year = year;
		if (month < 1 || month > 12) {
			throw new DateException("Mes " + month + " no valido" +
					" Valores posibles entre 1 y 12.");
		} else {
			this.month = month;
		}
		//TODO falta comprobar el dia

		if((day > 0) && (day <getDaysOfMonth())){
		this.day = day;
		}
	
		else {

			throw new DateException("Día " +day+" no es válido "+" para el mes " +getMonthName()+"Valores posibles entre 1 y "+getDaysOfMonth());
		}
}




	public int getDaysOfMonth(){

		int day=0;

		switch(this.month){

			case 1: //next
			case 3: //next
			case 5: //next
			case 7: //next
			case 8: //next
			case 10: //next
			case 12:
			
				day = 31;

				break;

			case 2:
		
				day = 28;

				break;

			case 4:
			case 6:
			case 9:
			case 11:

				day = 30;

				break;
}
			return day;
}

	public String getMonthName(){

		String name="";

		switch(this.month){

			case 1:

				name="Enero";
				break;
			case 2:
				name="Febrero";
				break;
			case 3:
				name="Marzo";
				break;
			case 4:
				name="Abril";
				break;
			case 5:
				name="Mayo";
				break;
			case 6:
				name="Junio";
				break;
			case 7:
				name="Julio";
				break;
			case 8:
				name="Agosto";
				break;
			case 9:
				name="Septiembre";
				break;
			case 10:
				name="Octubre";
				break;
			case 11:
				name="Noviembre";
				break;
			case 12:
				name="Diciembre";
				break;

			
	}
		return name;
}			
			



	@Override
	public String toString() {
		return this.day + "/" + this.month + "/" + this.year;
	}
}

