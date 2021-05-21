package com.dtt.lgsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Map;
import org.apache.commons.collections4.map.HashedMap;
import org.apache.log4j.Logger;
import com.dtt.lgsp.entities.HoSoSyncEntity;

public class HoSoSynedUtil {
	static final Logger logger = Logger.getLogger(HoSoSynedUtil.class);
	static Connection conn = null;
	public static Map<String,String> hoSoMap = new HashedMap<String, String>();

	public static boolean dropTable() {
		PreparedStatement ps = null;

		try {
			
			conn = ConnectionUtilities.getConnection();
			String sql = " DROP table hoso_syned ";
			ps = conn.prepareStatement(sql);			
			ps.execute();
			conn.commit();
			return true;
		} catch (Exception e) {
			logger.error(e.getMessage());
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return false;
	}
	
	public static HoSoSyncEntity insert(HoSoSyncEntity entity) {
		PreparedStatement ps = null;

		try {
			if (entity == null) {
				return null;
			}
			conn = ConnectionUtilities.getConnection();
			String sql = "insert into hoso_syned(id,malk,createdate,desc_) values (?,?,?,?)";
			long id = System.currentTimeMillis();
			ps = conn.prepareStatement(sql);
			ps.setString(1, String.valueOf(id));
			ps.setString(2, entity.getMalk());
			ps.setString(3, entity.getCreatedate());
			ps.setString(4, entity.getDesc());
			
			ps.execute();
			conn.commit();
		} catch (Exception e) {
			logger.error(e.getMessage());
		} finally {
			if (ps != null) {
				try {
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if (conn != null) {
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		return entity;
	}
	
	public static void loadingToMap() throws Exception {
		hoSoMap = new HashedMap<String, String>();
		try {
			conn = ConnectionUtilities.getConnection();
			String sql = "select * from hoso_syned ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					String malk = rs.getString("malk");
					hoSoMap.put(malk, malk);
					
					logger.info("Add to map: " + malk);
				}
		} catch (Exception e) {
		
		}
		
	}
	public static int countByMa(String malk) {
		int count =0;
		try {
			conn = ConnectionUtilities.getConnection();
			String sql = "SELECT COUNT(*) FROM hoso_syned WHERE malk = ?";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, malk);
			ResultSet rs = ps.executeQuery();
			count = rs.getRow();
		} catch (Exception e) {
			// TODO: handle exception
		}
		return count;
	}

}
