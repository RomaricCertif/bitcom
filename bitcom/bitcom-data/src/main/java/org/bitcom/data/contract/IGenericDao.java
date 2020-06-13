package org.bitcom.data.contract;

import java.io.Serializable;

/**
 * 
 * @author Romaric OKEMBA
 * 
 * 
 */
public interface IGenericDao <T, ID> extends Dao{
	
	/**
	 * Sauvegarde une entite
	 */
	<S extends T> S save(S entity);

	/**
	 * Sauvegarde de toutes les entites passees en parametres.
	 *
	 */
	public <S extends T> Iterable<S> saveAll(Iterable<S> entities);

	/**
	 * Recherche une entite par son ID
	
	 */
	 public T findById(ID id);

	/**
	 * verifie qu'une entite existe
	 *
	 */
	public boolean existsById(ID id);

	/**
	 * 
	 *
	 * @return all entities
	 */
	public Iterable<T> findAll();
	

	/**
	 * retourne toutes les entites par leurs IDS
	 */
	public Iterable<T> findAllById(Iterable<ID> ids);
	

	/**
	 * 
	 *
	 * @return le nombre total des enites
	 */
	public long count();

	/**
	 * 
	 * Supprime toutes les entites par leur IDS
	 *
	 * 
	 */
	public void deleteById(ID id);

	/**
	 * Supprime une entite 
	 *
	 
	 */
	public void delete(T entity);

	/**
	 * supprime toutes entites passees en parametres
	 *
	 */
	public void deleteAll(Iterable<? extends T> entities);

	/**
	 * supprime toutes les entites
	 */
	public void deleteAll();
	
	
	public boolean isNew ();
	
	
	public Serializable getId (T entite);
	

}
