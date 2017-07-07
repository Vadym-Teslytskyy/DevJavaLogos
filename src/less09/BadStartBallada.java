package less09;

public class BadStartBallada implements Ballada{ //патерн Декоратор(обгортка)

	private final Ballada ballada;

	public BadStartBallada(Ballada ballada) {
		this.ballada = ballada;
	}
	
	@Override
	public void song() {

		System.out.println("People: Booo-boooo");
		ballada.song();
	}
}
