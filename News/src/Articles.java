
public class Articles extends Block implements Printable {

	private Commentaries commentary;
	protected String author;

	public Articles(String text, String header,  String author) {
		super(text, header, null, author);
		// TODO Auto-generated constructor stub
	}

	public void addComment(Commentaries[] comment) {
		if (comment == null) {
			comment = new Commentaries[10];
		}
		int countComments = 0;
		comment[countComments++] = commentary;
	}

	public void printHeader() {

		System.out.println("+++++Статья+++++++");
		System.out.println(getHeader());
	}

	public void printBody() {
		System.out.println();
	}

	public void printFooter() {
		System.out.println(getAuthor());
	}

	public void printCommentaries() {
		if (commentary != null) {
			
			
			
		}

	}

}
