package Concrete;

import Abstract.IGame;
import Entities.Game;

public class GameManager implements IGame {

	@Override
	public void add(Game game) {
		System.out.println(game.getId() + " numarali " + game.getName() + " isimli oyun " + game.getPrice() + " dolara eklendi.");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getId()+ " id'sine sahip " + game.getName() + " oyunu silindi.");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getId()+ " id'sine sahip " + game.getName() + " oyunu güncellendi.");		
		
	}

}
