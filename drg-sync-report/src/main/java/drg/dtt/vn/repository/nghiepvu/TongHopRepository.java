package drg.dtt.vn.repository.nghiepvu;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import drg.dtt.vn.model.nghiepvu.TongHop;

public interface TongHopRepository extends JpaRepository<TongHop, Long> {
	
	@Query(value = "SELECT * FROM hsbhyt_tonghop th WHERE th.ma_lk = :maLK and th.ma_cskcb = :maCoSo",nativeQuery = true)
	TongHop getByMaLKMaCoSo(@Param("maLK") String maLK, @Param("maCoSo") String maCoSo);
}
