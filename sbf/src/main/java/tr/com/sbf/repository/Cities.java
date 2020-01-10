/**
 * 
 */
package tr.com.sbf.repository;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author Mehmet.Kaynak
 *
 *         7 Ara 2017
 *
 *         18:20:04
 */
@Entity
@Table
public class Cities {

    @Id
    int id;
    String name;

    public int getId() {
        return this.id;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

}
