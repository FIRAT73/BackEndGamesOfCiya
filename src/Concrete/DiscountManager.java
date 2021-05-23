package Concrete;

import Entities.Discount;
import Abstract.IDiscount;

public class DiscountManager implements IDiscount {

	@Override
	public void add(Discount discount) {
		System.out.println("% " + discount.getPercentOfDiscount() + " oraninda " + discount.getNameOfCampaign() + " isimli kampanya eklendi." );
		
	}

	@Override
	public void delete(Discount discount) {
		System.out.println(discount.getNameOfCampaign() + " kampanya silindi.");
		
	}

	@Override
	public void update(Discount discount) {
		System.out.println(discount.getNameOfCampaign() + " isimli kampanya güncellendi.");
		
	}

}
