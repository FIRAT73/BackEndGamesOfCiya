package Abstract;

import Entities.Gamer;
import Entities.Discount;
import Entities.Game;
import Entities.Sale;

public interface ISale {
	
	void add(Sale sale, Discount discount);
	void delete(Game game);
	
}
