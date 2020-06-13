package org.bitcom.data.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Version;


/**
 * 
 * @author Romaric OKEMBA
 * Base entity
 *
 */

public abstract class BaseEntity implements Serializable {

	private static final long serialVersionUID = 1L;

	@Version
	@Column(name = "version")
	private int version;

	

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (this.getId() != null ? this.getId().hashCode() : 0);

		return hash;
	}

	public abstract Serializable getId();
	
	
	public abstract void setId(Serializable id);


	@Override
	public boolean equals(Object object) {
		if (this == object)
			return true;
		if (object == null)
			return false;
		if (getClass() != object.getClass())
			return false;

		BaseEntity other = (BaseEntity) object;
		if (this.getId() != other.getId() && (this.getId() == null || !this.getId().equals(other.getId()))) {
			return false;
		}
		return true;
	}

	
}
