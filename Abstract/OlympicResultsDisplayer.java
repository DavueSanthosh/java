package Abstract;

public class OlympicResultsDisplayer {
	public static void main(String[] args) {

		Athelete shuttle = new PVSindhu();
		
		shuttle.eat();
		shuttle.sleep();
		
		shuttle.event();
		shuttle.accomplishment();
		
		Athelete run = new NeerajChopra();
		run.event();
		run.accomplishment();
	
		Athelete game = new RaviKumar();
		game.event();
		game.accomplishment();
	
	}

}
