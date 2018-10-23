
public abstract class Block implements Printable {

	protected String text;
	protected String header;
	private String date;
	protected String author;

	public Block(String text, String header, String date, String author) {
		super();
		this.text = text;
		this.header = header;
		this.date = date;
		this.author = author;
	}

	protected String getText() {
		return text;
	}

	protected String getHeader() {
		return header;
	}

	protected String getDate() {
		return date;
	}

	protected String getAuthor() {
		return author;
	}

}
