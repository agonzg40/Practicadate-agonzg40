package es.unileon.prg.date;

public class Date {

	private int day; //Aquí defino el día, mes y año
	private int month;
	private int year;


	public Date(int day, int month, int year) throws DateException{

		this.year = year;
		this.month=month;
		this.day=day;

		if(year<0) { //inicializo el if para decir que el año no vale
			throw new DateException("year"+year+"invalid");
		}
		else { //Aquí si valdría
			this.year=year;
		}
		if(month<1||month>12){ //inicializao el if para decir que el mes no vale
		throw new DateException("mes "+month+" no valido "+"valores posibles entre 1 y 12");
		}
		else{ //Aquí si valdría
		this.month=month;
		}
		if(day<1||day>getDaysOfMonth()) { //inicializo el if para decir que el dia no vale
			throw new DateException("combinacion de dia y mes incorrecta");
		}
		else{ //Aquí si valdría
			this.day=day;
		}
	}
	
	public Date(Date another){
		this.day=another.getDay();
		this.month=another.getMonth();
		this.year=another.getYear();
	
	}

	public int getDaysOfMonth(int month){ //comienzo con getDaysOfMonth

		int day=0; //defino day

		switch(this.month){ //aqui defino los diferentes casos para los meses

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

			case 4: //next
			case 6: //next
			case 9: //next
			case 11:

				day = 30;

				break;
}
			return day;


}
	
	public int getYear(){ //se devuelve this.year
		return this.year;
	}
	public int getMonth(){ //se devuelve this.year
		return this.month;
	}
	public int getDay(){ //se devuelve this.year
		return this.day;
	}

	public void setDay(int day) throws DateException{ //se dicen los valores posibles entre los que se pueden introducir
		
		if(day<1 || day>31){

		throw new DateException("Mes " + month + " no valido" +
					" Valores posibles entre 1 y 31.");
		} else { //si los valores introducidos son correctos
			this.day = day;
		}
}

	public void setMonth(int month) throws DateException{
		

		if (month < 1 || month > 12){ //se dicen los valores posibles entre los que se pueden introducir

			throw new DateException("Mes " + month + " no valido" +	" Valores posibles entre 1 y 12.");

		} else{ //si los valores introducidos son correctos

			this.month = month;
		}
		
		
	}

	public void setYear(int year)throws DateException{ //se dicen los valores posibles entre los que se pueden introducir

		if(year<0){

			throw new DateException("incorrect");

		}

		else { //si los valores introducidos son correctos

			this.year=year;

		}

	}

	public Date tomorrow() { //empiezo con el valor tomorrow

			Date tomorrow=null;

			int day, month, year; //defino las variables

			day=this.day;
			month=this.month;
			year=this.year;

			day++; //se introduce el ++, porque se van sumando días de uno en uno

			if(day>getDaysOfMonth(month)){ //if para que pasaría si los días fueran mayores

				day=1;
				month++; //hay que sumar los meses de 1 en uno

				if(month>12){ //si los meses fueran mayores de 12

					month=1;
					year++; //Hay que sumar 1 cada vez a los años

				}


			}

			try{

				tomorrow=new Date (day, month, year); //Llamo al constructor

			}catch(DateException e){

				System.err.println(e.getMessage());

			}

			return tomorrow; //Devuelvo tomorrow

		}

	public boolean isSameYearIf(Date another){ //si el año coincide

		if ( this.year == another.getYear() ){

			return true;

		}

		return false;

	}

	public boolean isSameYear(Date another){

		boolean verdad;

		verdad=(this.year==another.getYear());

		return verdad;

	}
	public boolean isSameMonthIf(Date another){

		if(this.month == another.getMonth()){

		return true;

		}

		return false;

	}

	public boolean isSameMonth(Date another){

		boolean verdad;

		verdad=(this.month==another.getMonth());

		return verdad;

	}

	public boolean isSameDayIf(Date another){

		if(this.day==another.getDay()){

			return true;

		}

		return false;

	}
	public boolean isSameDay(Date other){

		boolean verdad;

		verdad=(this.day==other.getDay());

		return verdad;

	}

	public boolean isSameIf(Date another){

		if((this.year == another.getYear())&&(this.month == another.getMonth())&&(this.day==another.getDay())){

		return true;

		}

		return false;

	}

	public boolean isSame(Date other){

		boolean verdad;

		verdad=((this.year==other.getYear())&&(this.day==other.getDay())&&(this.month==other.getMonth()));

		return verdad;

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

	public int getDaysOfMonth(){

		return getDaysOfMonth(this.month);

	}

	public String getSeasonName(){

		String estacion=" ";

		switch(this.month){

			case 1: //next
			case 2: //next
			case 3: 

				estacion="Winter";

			break;

			case 4: //next
			case 5: //next
			case 6:

				estacion="Spring";

			break;

			case 7: //next
			case 8: //next
			case 9:
				estacion="Summer";

			break;

			case 10: //next
			case 11: //next
			case 12:

				estacion="Autumn";

			break;

			}

		return estacion;

		}
	
	public boolean isDayRight(int day){
		
			return((day>0)&&(day<=getDaysOfMonth(this.month)));

		}
	
	
	public String getMonthsLeft(){

		Date auxi= new Date(this); //Llamo al constructor
		StringBuffer month=new StringBuffer();

		try{

			for(int i=this.month+1;i<=12;i++){

			auxi.setMonth(i);

			month.append(auxi.getMonthName()+" ");

			}

		}catch(DateException e){

			System.err.println(e.getMessage());

		}

	return month.toString();

	}

	public String randomDates(){

		StringBuilder date=new StringBuilder();
		
		date=date.append((int)(Math.random()*(31)+1)+" "); //Realizo las operaciones para los números aleatorios
		date=date.append((int)(Math.random()*(12)+1)+" ");
		date=date.append((int)(Math.random()*(20)+2018));
		
	return date.toString();
	}
	
	
	public String getDaysLeftOfMonth(){

			Date auxi = new Date(this); //Llamo al constructor
			auxi=tomorrow();
			StringBuilder rest=new StringBuilder();

			try {

				for (int i=auxi.getDay();isDayRight(i);i++) {

					auxi.setDay(i);

					rest.append(auxi.toString() + (" "));

				}
				
			}catch(DateException e) {

				System.out.println(e.getMessage());

			}
					
				
			return rest.toString();

	}

	public String getMonthsSameDays(){
		
		Date auxi= new Date(this); //llamo al constructor
		StringBuilder month=new StringBuilder();

		try{

			for(int i=1;i<=12;i++){

				auxi.setMonth(i);

				if(auxi.getDaysOfMonth()==getDaysOfMonth()){
					
					month.append(auxi.getMonthName()+(" "));
	
				}
				
			}

		}catch(DateException e){

			System.err.println(e.getMessage());

		}

		return month.toString(); 
	
	}
	
	public int daysPast(){

		int suma=0, resultado=0; //Defino las variables

		try {

			Date auxiliar=new Date(1,1,this.year);

			for(int i=1;i<this.month;i++) {

				suma=suma+auxiliar.getDaysOfMonth(); //Realizo la operación
				auxiliar.setMonth(i+1);
				
			}

		}catch(DateException e){

			System.out.println(e.getMessage());

		}

		resultado=suma+this.day-1; //Realizo la operación

	return resultado; //devuelvo el resultado
			
		
}
		public int numRandomTriesEqualDate1(){

		int numIntentos=0, numAcertar1=this.day, numAcertar2=this.month; //Defino las variables

		boolean acierto=false;
		
		while(!acierto){

				int diaR=(int)(Math.random()*31+1); //Realizo las operaciones para los números aleatorios
				int mesR=(int)(Math.random()*12+1);

				if(diaR==numAcertar1&&mesR==numAcertar2){ //Se tienen que cumplir las dos condiciones para que pase lo de debajo del if

				acierto=true;

				}

				else if(diaR!=numAcertar1||mesR!=numAcertar2){

					numIntentos++;	

				}

			}

		System.out.println("El número de intentos:");

		return numIntentos; //Devuelvo el numero de intentos

		}

	
		public int numRandomTriesEqualDate(){ //Comienzo con los números aleatorios

		int numIntentos=0, diaR=0, mesR=0, yearR=0; //Defino las variables
	
		try{

			do{

				diaR=(int)(Math.random()*31+1); //Se realizan las operaciones
				mesR=(int)(Math.random()*12+1);

				yearR=this.year;

				if(diaR!=this.day||mesR!=this.month||yearR!=this.year){ //Si se cumple cualquiera de las condiciones los números de intentos se incrementa uno

					numIntentos++;

				}
	
			}while(isSame(new Date(diaR,mesR,yearR)));

		}catch (DateException e){

			System.out.println(e.getMessage());

		}

		return numIntentos; //devuelvo el número de intentos

	}
		private String dayNames(int day) { //Empiezo a trabajar con los nombres de los días

			String dayNames=" ";

				switch(day){ //Aquí se definirían los casos para los diferentes tipos de meses

					case 1:

						dayNames="Monday";

					break;

					case 2:

						dayNames="Tuesday";

					break;

					case 3:		

						dayNames="Wednesday";

					break;

					case 4:

						dayNames="Thursday";
	
					break;

					case 5:
	
						dayNames="Friday";

					break;

					case 6:
	
						dayNames="Saturday";

					break;

					case 7:

						dayNames="Sunday";

					break;
				
				}

			return dayNames; //Se devuelven los nombres de los días

		}

	public String dayOfWeek(int firstYear){ //Empiezo con los días de la semana

		int numer=0; //defino la variable

		numer=(daysPast()%7+firstYear)%7; //hago la operacíón 

		return dayNames(numer); //devuelvo el número

	}			



	@Override
	public String toString() { //Finalizo el programa con el String devolviendo el día, mes y año
		return this.day + "/" + this.month + "/" + this.year;
	}
}

