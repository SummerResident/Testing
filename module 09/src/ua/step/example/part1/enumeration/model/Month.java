package ua.step.example.part1.enumeration.model;

public enum Month {
	JANUARY(31, "Январь"), 
	FEBRUARY(28, "Февраль"),
	MARCH(31, "Март"), 
	APRIL(30, "Апрель"), 
	MAY(31, "Май"), 
	JUNE(30, "Июнь"), 
	JULY(31, "Юиль"), 
	AUGUST(31, "Август"), 
	SEPTEMBER(30,"Cентябрь"), 
	OCTOBER(31, "Октябрь"), 
	NOVEMBER(30, "Ноябрь"), 
	DECEMBER(31, "Декабрь");

	// количество дней в месяце
	private int dayNumber;
	private String rusMonth;

	private Month(int dayNumber, String rusMonth) {
		this.dayNumber = dayNumber;
		this.rusMonth = rusMonth;
	}

	/**
	 * 
	 * @return возвращает количество дней в месяце
	 */
	public int getDayNumber() {
		return dayNumber;
	}

	public String toString() {
		return rusMonth;

	}

}
