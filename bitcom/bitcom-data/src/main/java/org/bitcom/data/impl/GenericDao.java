package org.bitcom.data.impl;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.bitcom.data.contract.IGenericDao;

public abstract class GenericDao <T, ID> implements IGenericDao<T, ID> {

	@PersistenceContext
	protected EntityManager em;
	
	/*
	 * (non-Javadoc)
	 * @see org.bitcom.data.contract.IGenericDao#save(java.lang.Object)
	 */
	@Override
	public <S extends T> S save(S entity) {

		//if (entityInformation.isNew(entity)) {
			em.persist(entity);
			return entity;
		//} else {
			//return em.merge(entity);
		//}
	}
}
