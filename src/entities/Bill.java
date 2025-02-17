package entities;

public class Bill {
	public char gender;
	public int beer;
	public int barbecue;
	public int softDrink;
	
	public double feeding() {
		return (beer * 5) + (softDrink * 3) + (barbecue * 7);
	}
	
	public double cover() {
		if (feeding() > 30.0) {
			return 0.0;
		}
		else {
			return 4.0;
		}
	}
	
	public double ticket() {
		if (gender == 'F') {
			return 8.0;
		}
		else {
			return 10.0;
		}
	}
	
	public double total() {
		return feeding() + cover() + ticket();
	}

	public String toString() {
		if (cover() == 0.0) {
			return String.format("RELATÓRIO:%nConsumo = R$ %.2f%nIsento de Couvert%nIngresso = R$ %.2f%n%nValor a pagar = R$ %.2f",
                    feeding(), ticket(), total());
		}
		else {
			return String.format("RELATÓRIO:%nConsumo = R$ %.2f%nCouvert = R$ %.2f%nIngresso = R$ %.2f%n%nValor a pagar = R$ %.2f",
                    feeding(), cover(), ticket(), total());
		}
	}

}
