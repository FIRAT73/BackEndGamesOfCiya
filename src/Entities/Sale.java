package Entities;

import Abstract.IEntities;

public class Sale implements IEntities {
	private int id;
	private Game game;
	private Gamer gamer;
	
	public Sale() {
		
	}

	public Sale(int id, Game game, Gamer gamer) {
		super();
		this.id = id;
		this.game = game;
		this.gamer = gamer;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Game getGame() {
		return game;
	}

	public void setGame(Game game) {
		this.game = game;
	}

	public Gamer getGamer() {
		return gamer;
	}

	public void setGamer(Gamer gamer) {
		this.gamer = gamer;
	}
}
