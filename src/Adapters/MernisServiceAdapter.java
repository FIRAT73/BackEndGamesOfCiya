package Adapters;

import Abstract.IGamerCheckService;
import Entities.Gamer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IGamerCheckService {

	@Override
	public boolean CheckIfRealGamer(Gamer gamer) {
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		boolean result = false;
		
		try {
			result = proxy.TCKimlikNoDogrula(Long.parseLong(gamer.getNationalityId()),gamer.getFirstName().toUpperCase(),gamer.getLastName().toUpperCase(), gamer.getDateOfBirth().getYear());
		}
		catch(Exception e) {
			System.out.println("Boyle bir kullanici yok.");
		}
		return result;
	}
	
	
}
