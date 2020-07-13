class Tester {
	public static void main(String[] args) {
		System.out.println(" main method started....");

		Bank bk = new Bank();
		bk.name="rwfij";

		NationalisedBank nb = new NationalisedBank();
		nb.name= " SBI";
		nb.branch= " Rajajinagar";
		nb.ifsccode= " RAJ0000123";
		nb.pincode=560010;
		nb.janDhanAccount= true;

		System.out.println(nb.name+"\n"+nb.branch+"\n"+nb.janDhanAccount);

		nb.openAccount();
		nb.acctivateNetBanking();

		System.out.println(" main method ended...");
	}
}