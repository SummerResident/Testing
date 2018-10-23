
public class Publisher {

	void print(Printable printer) {
		printer.printHeader();
		printer.printBody();
		printer.printFooter();
		printer.printCommentaries();
		
	}

	public static void main(String[] args) {
		Publisher publisher= new Publisher();
		News news1 = new News("то то", " Текст статьи", " сегодня");
		publisher.print(news1);
		 Articles articles1 = new Articles("art", "text","author") ;
		publisher.print(articles1);
	}
	
}
