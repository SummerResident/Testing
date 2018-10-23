
public class Publications extends Block implements Printable {

	private String[] additionalBlock;
	private String categories;

	public Publications(String text, String header, String date, String author, String[] additionalBlock,
			String categories) {
		super(text, header, date, author);
		this.additionalBlock = additionalBlock;
	}

	public void printHeader() {

		System.out.println("!!!!!!!!");
		System.out.println(getHeader());
		System.out.println("!!!!!!!!");

	}

	public void printBody() {
	
		for (String text : additionalBlock) {
			System.out.println("------block");
			System.out.println(text);
		}
	}

	public void printFooter() {
		
		System.out.println(getAuthor());

	}

	public void printCommentaries() {

	}

}
