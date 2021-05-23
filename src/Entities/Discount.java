package Entities;

public class Discount {
	private double price;
	private String nameOfCampaign;
	private double percentOfDiscount;
	private double priceOfDiscount;
	
	public Discount() {
		
	}

	public Discount(double price, String nameOfCampaign, double percentOfDiscount, double priceOfDiscount) {
		super();
		this.price = price;
		this.nameOfCampaign = nameOfCampaign;
		this.percentOfDiscount = percentOfDiscount;
		this.priceOfDiscount = priceOfDiscount;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getNameOfCampaign() {
		return nameOfCampaign;
	}

	public void setNameOfCampaign(String nameOfCampaign) {
		this.nameOfCampaign = nameOfCampaign;
	}

	public double getPercentOfDiscount() {
		return percentOfDiscount;
	}

	public void setPercentOfDiscount(double percentOfDiscount) {
		this.percentOfDiscount = percentOfDiscount;
	}

	public double getPriceOfDiscount() {
		return priceOfDiscount;
	}

	public void setPriceOfDiscount(double priceOfDiscount) {
		this.priceOfDiscount = priceOfDiscount;
	}
}
