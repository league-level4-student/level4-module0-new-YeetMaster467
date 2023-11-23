package _03_Intro_to_Enums;

public enum StatesOfMatter {
	SOLID(0), LIQUID(25.55), GAS(100);
	
	double celsuisTemp;
	
	private StatesOfMatter (double celsuisTemp) {
		this.celsuisTemp = celsuisTemp;
	}
	
	public double convertToFahrenheit (double C) {
		return (C * 9/5) + 32;
	}
}
