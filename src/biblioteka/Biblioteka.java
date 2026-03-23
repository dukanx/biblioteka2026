package biblioteka;

import java.util.ArrayList;
import java.util.List;

import Interfejs.BibliotekaInterface;

public class Biblioteka implements BibliotekaInterface {

	@Override
	public void dodajKnjigu(Knjiga knjiga) {
		// TODO Auto-generated method stub

	}

	@Override
	public void obrisiKnjigu(Knjiga knjiga) throws IllegalAccessException {
		if(knjiga == null)
			throw new IllegalAccessException();

	}

	@Override
	public List<Knjiga> vratiSveKnjige() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Knjiga> pronadjiKnjigu(Autor autor, long isbn, String naslov, String izdavac) {
		if(autor==null) {
			throw new IllegalAccessException();
		}
		
		List<Knjiga> rezultati = new ArrayList<Knjiga>();
		
		for(Knjiga k: knjige)
			if(k.getNaslov().toUpperCase().contains(naslov.toUpperCase()))
				rezultati.add(k);
		
		
		return rezultati;
	}

}
