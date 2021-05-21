package drg.dtt.vn.repository.report;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import drg.dtt.vn.model.report.TongHopChiTiet;

public interface TongHopChiTietRepository extends JpaRepository<TongHopChiTiet, Long>{
	@Query(value = "SELECT COUNT ( * ) FROM hsbhyt_tonghop_chitiet rp WHERE rp.ma_cskcb = :maCoSo AND rp.trangthai=0"
			+ "", nativeQuery = true)
	Integer countChiTietSync(@Param("maCoSo") String maCoSo);
	
	@Query(value = "SELECT * FROM hsbhyt_tonghop_chitiet rp WHERE rp.ma_cskcb = :maCoSo AND rp.trangthai=0"
			+ "ORDER BY rp.id limit :limit", nativeQuery = true)
	List<TongHopChiTiet> getChiTietSync(@Param("maCoSo") String maCoSo,@Param("limit") int limit);
	
	@Modifying
	@Query(value = "UPDATE hsbhyt_tonghop_chitiet set trangthai = 1 WHERE ma_cskcb = :maCoSo AND id >= :minId and id <= :maxId", nativeQuery = true)
	void updateTrangThai(@Param("maCoSo") String maCoSo,
			@Param("minId") long minId,@Param("maxId") long maxId);
}
