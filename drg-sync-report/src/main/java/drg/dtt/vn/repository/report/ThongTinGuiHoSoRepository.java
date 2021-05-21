package drg.dtt.vn.repository.report;

import java.util.List;

import javax.persistence.TypedQuery;

import org.springframework.boot.autoconfigure.data.web.SpringDataWebProperties.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import drg.dtt.vn.model.report.ThongTinGuiHoSo;

public interface ThongTinGuiHoSoRepository extends JpaRepository<ThongTinGuiHoSo, Long> {

	@Query(value = "SELECT COUNT(*) FROM hsbhyt_thongtinguihoso t WHERE t.activecode = :activecode AND t.trangthai = :trangthai", nativeQuery = true)
	Integer countByActivecodeTrangthai(@Param("activecode") String activecode, @Param("trangthai") int trangthai);

	@Query(value = "SELECT * FROM hsbhyt_thongtinguihoso thongtinguihoso WHERE thongtinguihoso.trangthai = :trangthai", nativeQuery = true)
	List<ThongTinGuiHoSo> getAllTrangThai(@Param("trangthai") int trangthai);

	@Query(value = "SELECT * FROM hsbhyt_thongtinguihoso thongtinguihoso WHERE thongtinguihoso.activecode = :activecode", nativeQuery = true)
	ThongTinGuiHoSo getActivecode(@Param("activecode") String activecode);
	
	@Query(value = "SELECT COUNT(*) FROM hsbhyt_thongtinguihoso t WHERE t.ma LIKE %?1%", nativeQuery = true)
	Integer countAllByM_T_E_D_A_T(String ma);

	@Query(value = "SELECT COUNT(*) FROM hsbhyt_thongtinguihoso t WHERE t.ma LIKE %?1% AND t.trangthai = ?2", nativeQuery = true)
	Integer countOneByM_T_E_D_A_T(String ma, int trangThai);

	@Query(value = "SELECT * FROM hsbhyt_thongtinguihoso t WHERE t.ma LIKE %?1% ORDER BY t.tonggui DESC offset ?2 limit ?3 ", nativeQuery = true)
	List<ThongTinGuiHoSo> findAllByM_T_E_D_A_T(String ma, int offset, int limit);

	@Query(value = "SELECT * FROM hsbhyt_thongtinguihoso t WHERE t.ma LIKE %?1% AND t.trangthai = ?2 ORDER BY t.tonggui DESC offset ?3 limit ?4 ", nativeQuery = true)
	List<ThongTinGuiHoSo> findOneByM_T_E_D_A_T(String ma, int trangThai, int offset, int limit);
	
	// get thong tin co so
	
	@Query(value = "SELECT * FROM hsbhyt_thongtinguihoso t where t.ma = :ma", nativeQuery = true) 
	ThongTinGuiHoSo getValueByMa(@Param("ma") String ma);

}
