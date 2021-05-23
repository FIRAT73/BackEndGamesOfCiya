import java.time.LocalDate;

import Abstract.BaseGamerManager;
import Adapters.MernisServiceAdapter;
import Concrete.DiscountManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.SaleManager;
import Entities.Gamer;
import Entities.Discount;
import Entities.Game;
import Entities.Sale;

public class Main {

	public static void main(String[] args) {
		BaseGamerManager gamerManager = new GamerManager(new MernisServiceAdapter());
		gamerManager.save(new Gamer(1,"Firat", "Seven", LocalDate.of(1999,12,8),"12345678910"));
		
		Gamer gamer1 = new Gamer();
		gamer1.setId(1);
		gamer1.setFirstName("Firat");
		gamer1.setLastName("Seven");
		gamer1.setNationalityId("12345678910");
		gamer1.setDateOfBirth(LocalDate.of(1999,12,8));
		
		gamerManager.add(gamer1);
		
		Game game1 = new Game();
		game1.setId(1);
		game1.setName("Ciya");
		game1.setPrice(150);
		game1.setDetail("Ciya oyunu doðada ölüm kalým mücadelesi veren bir oyundur.");
		
		Discount discount1 = new Discount();
		discount1.setNameOfCampaign("'Ýlk satiþa özel kampanya'");
		discount1.setPercentOfDiscount(25);
		
		Sale sale1 = new Sale();
		sale1.setId(1);
		sale1.setGame(game1);
		sale1.setGamer(gamer1);
		
				
		
		GameManager gameManager = new GameManager();
		gameManager.add(game1);
		
		DiscountManager discountManager = new DiscountManager();
		discountManager.add(discount1);
		
		SaleManager saleManager1 = new SaleManager();
		saleManager1.add(sale1,discount1);
		
		SaleManager saleManager2 = new SaleManager();
		saleManager2.delete(game1);

	}
	

}


