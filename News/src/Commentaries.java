
public class Commentaries extends Block implements Printable {


	public Commentaries(String header, String text, String author, String body, String footer, String commentaries) {
		super(text, null, null, author);
	}

	public void printHeader() {

	}

	public void printBody() {

	}

	public void printFooter() {
		System.out.println(getAuthor());
	}

	public void printCommentaries() {

	}

}
