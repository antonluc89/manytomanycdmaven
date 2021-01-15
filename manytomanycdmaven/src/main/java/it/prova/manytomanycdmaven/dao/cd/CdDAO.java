package it.prova.manytomanycdmaven.dao.cd;

import java.util.List;

import it.prova.manytomanycdmaven.dao.IBaseDAO;
import it.prova.manytomanycdmaven.model.Cd;
import it.prova.manytomanycdmaven.model.Genere;

public interface CdDAO extends IBaseDAO<Cd>{

	public List<Cd> findAllByGenere(Genere genereInput);
	
	public Cd findByTitolo(String titoloInput) throws Exception;

}
