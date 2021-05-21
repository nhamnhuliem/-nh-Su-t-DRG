package drg.dtt.vn.model.report;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="data_config")
public class DataConfigModel {
  	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
  	
  	@Column(name="id")
    private Long id;
  	
  	@Column(name = "ma")
    private String ma;
  	
  	@Column(name = "value")
    private String value;
  	
  	@Column(name = "description")
    private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public DataConfigModel(String ma, String value, String description) {
		super();
		this.ma = ma;
		this.value = value;
		this.description = description;
	}
	
	public DataConfigModel() {
		super();
	}
  	
}
