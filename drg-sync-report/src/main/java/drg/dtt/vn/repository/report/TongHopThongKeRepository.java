package drg.dtt.vn.repository.report;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import drg.dtt.vn.model.report.TongHopThongKe;

public interface TongHopThongKeRepository extends JpaRepository<TongHopThongKe, Long>{
	@Query(value = "SELECT COUNT ( * ) FROM hsbhyt_tonghop_thongke rp WHERE rp.ma_cskcb = :maCoSo "
			+ "AND (:nam = 0 or rp.nam_qt = :nam)  "
			+ "AND (:thang = 0 or rp.thang_qt = :thang)", nativeQuery = true)
	Integer countAllByCS_LK_NAM_THANG(@Param("maCoSo") String maCoSo,@Param("nam") int nam,@Param("thang") int thang);
	
	@Query(value = "SELECT * FROM hsbhyt_tonghop_thongke rp WHERE rp.ma_cskcb = :maCoSo "
			+ "AND (:nam =0 or rp.nam_qt = :nam) "
			+ "AND (:thang = 0 or rp.thang_qt = :thang) "
			+ "ORDER BY rp.nam_qt DESC offset :offset limit :limit", nativeQuery = true)
	List<TongHopThongKe> getAllByCS_LK_NAM_THANG(@Param("maCoSo") String maCoSo,
			@Param("nam") int nam,@Param("thang") int thang,
			@Param("offset") int offset,@Param("limit") int limit);
}
