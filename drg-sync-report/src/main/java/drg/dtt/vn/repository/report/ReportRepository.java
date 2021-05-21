package drg.dtt.vn.repository.report;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import drg.dtt.vn.model.report.Report;

public interface ReportRepository extends JpaRepository<Report, Long> {
	@Query(value = "SELECT COUNT ( * ) FROM hsbhyt_report rp WHERE rp.cskcb = :maCoSo "
			+ "AND (:maLK = '' or rp.ma_lk = :maLK) "
			+ "AND (:nam = 0 or rp.nam = :nam)  "
			+ "AND (:thang = 0 or rp.thang = :thang)", nativeQuery = true)
	Integer countAllByCS_LK_NAM_THANG(@Param("maCoSo") String maCoSo,@Param("maLK") String maLK,@Param("nam") int nam,@Param("thang") int thang);
	
	@Query(value = "SELECT * FROM hsbhyt_report rp WHERE rp.cskcb = :maCoSo "
			+ "AND (:maLK = '' or rp.ma_lk = :maLK) "
			+ "AND (:nam =0 or rp.nam = :nam) "
			+ "AND (:thang = 0 or rp.thang = :thang) "
			+ "ORDER BY rp.id DESC offset :offset limit :limit", nativeQuery = true)
	List<Report> getAllByCS_LK_NAM_THANG(@Param("maCoSo") String maCoSo,@Param("maLK") String maLK,
			@Param("nam") int nam,@Param("thang") int thang,
			@Param("offset") int offset,@Param("limit") int limit);
}
