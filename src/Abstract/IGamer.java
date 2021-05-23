package Abstract;

import Entities.Gamer;

public interface IGamer {
	void save(Gamer gamer);
	void add(Gamer gamer);
	void delete(Gamer gamer);
	void update(Gamer gamer);
	
}
