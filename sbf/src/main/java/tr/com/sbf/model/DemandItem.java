/**
 * @author Mehmet
 *
 * 31 Ağu 2018
 *
 * 21:16:17
 */

package tr.com.sbf.model;

public class DemandItem {

	private final String id;
	private String userNameSurname;

	public DemandItem(String id, String userNameSurname) {
		this.id = id;
		this.userNameSurname = userNameSurname;
	}

	public String getUserNameSurname() {
		return this.userNameSurname;
	}

	public void setUserNameSurname(String userNameSurname) {
		this.userNameSurname = userNameSurname;
	}

	public String getId() {
		return this.id;
	}

}
