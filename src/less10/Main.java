package less10;

public class Main {

	public static void main(String[] args) {

		Header header = new SimpleHeader();
		Body body = new SimpleBody();
		Footer footer = new SimpleFooter();
		Page page = new Page(header, body, footer);
		page.printPage();
		System.out.println();
		Body leftbody = new LeftBody();
		Page leftPage = new Page(header, leftbody, footer);
		leftPage.printPage();
		System.out.println();
		Page leftPageNoFooter = new Page(header, leftbody, null);
		leftPageNoFooter.printPage();
		System.out.println();
	}

}
