package Concrete;

import Abstract.ISale;
import Entities.Sale;
import Entities.Discount;
import Entities.Game;
import Entities.Gamer;

public class SaleManager implements ISale {

	
	@Override
	public void add(Sale sale, Discount discount) {
		
		System.out.println(sale.getGame().getName() + " oyununu kampanya fiyati ile " +
				(sale.getGame().getPrice()-(sale.getGame().getPrice()*discount.getPercentOfDiscount()/100)) +
				" dolar olarak satin alindi.");
		}
	

	
	@Override
	public void delete( Game game) {
		System.out.println(game.getName() + " oyunu silindi.");
		
	}
	

}
