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
 *         18:25:30
 */
@Entity
@Table
public class Districts {

    @Id
    long districtid;
    int cityCode;
    String name;

    public long getDistrictid() {
        return this.districtid;
    }

    public void setDistrictid(final long districtid) {
        this.districtid = districtid;
    }

    public int getCityCode() {
        return this.cityCode;
    }

    public void setCityCode(final int cityCode) {
        this.cityCode = cityCode;
    }

    public String getName() {
        return this.name;
    }

    public void setName(final String name) {
        this.name = name;
    }

}
