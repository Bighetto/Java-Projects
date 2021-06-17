package Conversao;

public class calculos {
	
	public double price;
	public double quantity;
	
	public double calculo() {
		return price * quantity;
	}
	
	public double valuePercentage() {
		return calculo() /100;
	}

	public double calculoPercentage() {
		return valuePercentage() * 6;
	}
	public double resultFinal() {
		return calculo() + calculoPercentage();
	}
}