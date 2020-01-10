/**
 * @author Mehmet
 *
 * 10 Ağu 2018
 *
 * 21:42:24
 */

package tr.com.sbf.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class DemandTypes {

	@Id
	private int id;
	private String description;

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
