package Concrete;

import Abstract.BaseGamerManager;
import Abstract.IGamer;
import Abstract.IGamerCheckService;
import Entities.Gamer;

public class GamerManager extends BaseGamerManager implements IGamerCheckService{
	
	private IGamerCheckService _gamerCheckService;
	
	public GamerManager(IGamerCheckService gamerCheckManager) {
		super();
		this._gamerCheckService = gamerCheckManager;
	}
	
	public void save(Gamer gamer) {
		if(_gamerCheckService.CheckIfRealGamer(gamer)) {
			this.save(gamer);
			System.out.println("Kullanici eslestirmesi dogrulandi.");
		}else {
			System.out.println("Böyle bir kullanici yoktur.");
		}
	}

	@Override
	public void add(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " kayit eklendi.");
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " kayit silindi.");
		
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println(gamer.getFirstName() + " " + gamer.getLastName() + " kullanici kaydi güncellendi.");	
		
	}

	@Override
	public boolean CheckIfRealGamer(Gamer gamer) {
		return true;
	}
	
	
	

}
