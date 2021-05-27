package drg.dtt.vn.repository.report;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.Temporal;
import org.springframework.data.repository.query.Param;

import drg.dtt.vn.model.report.Report;

public interface ReportRepository extends JpaRepository<Report, Long> {
	@Query(value = "SELECT COUNT ( * ) FROM hsbhyt_report rp WHERE rp.cskcb = :maCoSo "
			+ "AND (:maLK = '' or rp.ma_lk = :maLK) "
			+ "AND (:nam = 0 or rp.nam = :nam) "
			+ "AND (:thang = 0 or rp.thang = :thang)"
			+ "AND (:tuNgay >='9999-01-01' or rp.ngay_tao >= :tuNgay)"
			+ "AND (:denNgay >='9999-01-01' or rp.ngay_tao <= :denNgay)", nativeQuery = true)
	Integer countAllByCS_LK_NAM_THANG(@Param("maCoSo") String maCoSo,@Param("maLK") String maLK,
			@Param("nam") int nam,@Param("thang") int thang, @Param("tuNgay") @Temporal Date tuNgay, @Param("denNgay") @Temporal Date denNgay);
	
	@Query(value = "SELECT * FROM hsbhyt_report rp WHERE rp.cskcb = :maCoSo "
			+ "AND (:maLK = '' or rp.ma_lk = :maLK) "
			+ "AND (:nam =0 or rp.nam = :nam) "
			+ "AND (:thang = 0 or rp.thang = :thang) "
			+ "AND (:tuNgay >='9999-01-01' or rp.ngay_tao >= :tuNgay)"
			+ "AND (:denNgay >='9999-01-01' or rp.ngay_tao <= :denNgay)"
			+ "ORDER BY rp.id DESC offset :offset limit :limit", nativeQuery = true)
	List<Report> getAllByCS_LK_NAM_THANG(@Param("maCoSo") String maCoSo,@Param("maLK") String maLK,
			@Param("nam") int nam,@Param("thang") int thang
			, @Param("tuNgay") Date tuNgay, @Param("denNgay") Date denNgay,
			@Param("offset") int offset,@Param("limit") int limit);
	
	@Query(value = "SELECT COUNT ( * ) FROM hsbhyt_report rp WHERE rp.cskcb = :maCoSo AND rp.trangthai=0"
			+ "", nativeQuery = true)
	Integer countChiTietSync(@Param("maCoSo") String maCoSo);
	
	@Query(value = "SELECT * FROM hsbhyt_report rp WHERE rp.cskcb = :maCoSo AND rp.trangthai=0"
			+ "ORDER BY rp.id limit :limit", nativeQuery = true)
	List<Report> getChiTietSync(@Param("maCoSo") String maCoSo,@Param("limit") int limit);
	
	@Modifying
	@Query(value = "UPDATE hsbhyt_report set trangthai = 1 WHERE cskcb = :maCoSo AND id >= :minId and id <= :maxId", nativeQuery = true)
	void updateTrangThai(@Param("maCoSo") String maCoSo,
			@Param("minId") long minId,@Param("maxId") long maxId);
}
