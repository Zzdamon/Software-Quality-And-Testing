package ase.cts.laboratory3;

public enum ProductType {
	NEW(0), DISCOUNT(01.f), LIMITED_STOCK(0.25f), LEGACY(0.35f);
	
	private final float discount;
	
	private ProductType(float discount) {
		this.discount=discount;
	}
	
	public float getDiscount() {
		return this.discount;
	}
}
