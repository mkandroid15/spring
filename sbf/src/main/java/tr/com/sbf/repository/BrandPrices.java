/**
 * @author Mehmet
 *
 * 24 Tem 2018
 *
 * 23:15:10
 */

package tr.com.sbf.repository;

import java.io.Serializable;

import javax.persistence.ColumnResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedNativeQueries;
import javax.persistence.NamedNativeQuery;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

@Entity
@Table
@SqlResultSetMapping(name = "updateResult", columns = { @ColumnResult(name = "count") })
@NamedNativeQueries({
		@NamedNativeQuery(name = "abc", query = "UPDATE brand_prices SET fee_price = ?, first_price = ?, service_price = ? WHERE id = ?", resultSetMapping = "updateResult") })

public class BrandPrices implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	private int id;
	private double firstPrice;
	private double feePrice;
	private double servicePrice;

	public int getId() {
		return this.id;
	}

	public void setId(final int id) {
		this.id = id;
	}

	public double getFirstPrice() {
		return this.firstPrice;
	}

	public void setFirstPrice(final double firstPrice) {
		this.firstPrice = firstPrice;
	}

	public double getFeePrice() {
		return this.feePrice;
	}

	public void setFeePrice(final double itemPrice) {
		this.feePrice = itemPrice;
	}

	public double getServicePrice() {
		return this.servicePrice;
	}

	public void setServicePrice(final double servicePrice) {
		this.servicePrice = servicePrice;
	}

}
