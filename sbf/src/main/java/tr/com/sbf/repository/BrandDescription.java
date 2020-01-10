/**
 * @author Mehmet
 *
 * 24 Tem 2018
 *
 * 22:11:48
 */

package tr.com.sbf.repository;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class BrandDescription {
	@Id
	private int id;
	@Column(length = 5000)
	private String descrpition;

	public int getId() {
		return this.id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public String getDescrpition() {
		return this.descrpition;
	}

	public void setDescription(final String descrpition) {
		this.descrpition = descrpition;
	}
}
