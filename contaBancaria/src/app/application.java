package app;

public class application {

	private int id;	
	private String name;
	private double deposit;
	private double accDeposit;
	public char resp;
	private double totalDeposit;
	private double withdraw;
	private double totalWithdraw;
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public double getDeposit() {
		return deposit;
	}
		
	public void setDeposit(double deposit) {
		this.deposit = deposit;
	}
	
	public double getAccDeposit() {
		return accDeposit;
	}
	
	public void setAccDeposit(double accDeposit) {
		this.accDeposit = accDeposit;
	}
	
	public double calc() {
		return deposit + accDeposit;
	}
	
	public double getTotalDeposit() {
		return calc();
	}
	
	public double getWithdraw () {
		return withdraw;
	}
	
	public void setWithdraw(double withdraw) {
		this.withdraw = withdraw;
	}
	
	public double getTotalWithdraw() {
		return getTotalDeposit() - withdraw - 5.0;
	}
	
}
