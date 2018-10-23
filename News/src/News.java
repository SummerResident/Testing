
public class News extends Block implements Printable {



	public News(String header, String date, String text) {
		
		super(header,text, date, null);
		//getAuthor()=null;
	}

	public void printHeader() {

		
		System.out.println("==========");
		System.out.println(getHeader());
		System.out.println("==========");

	}

	public void printBody() {

		System.out.println(getText());
		
	}

	public void printFooter() {

		System.out.println("Дата публикации");
		System.out.println(getDate());

		
	}
	
	public void printCommentaries() {
		
	}

}
