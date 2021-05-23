package Abstract;

import Entities.Gamer;

public abstract class BaseGamerManager implements IGamer {

	@Override
	public void save(Gamer gamer) {
		System.out.println(gamer.getFirstName()+ " " + gamer.getLastName()+" adli kullanici database eklendi");
	}
	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " isimli kayit olusturuldu.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Gamer gamer) {
		// TODO Auto-generated method stub
		
	}
	
	

}
