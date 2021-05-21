package drg.dtt.vn.repository.report;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import drg.dtt.vn.model.report.DataConfigModel;

public interface DataConfigRepository extends JpaRepository<DataConfigModel, Long>{
	@Query(value = "SELECT * FROM data_config", nativeQuery = true) 
	List<DataConfigModel> getAll();
}
