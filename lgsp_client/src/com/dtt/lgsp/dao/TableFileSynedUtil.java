package com.dtt.lgsp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;
import org.apache.log4j.Logger;

import com.dtt.lgsp.entities.FileSynedEntity;

public class TableFileSynedUtil {
	static final Logger logger = Logger.getLogger(TableFileSynedUtil.class);
	static Connection conn = null;
	public static Map<String,String> fileMap = new HashedMap<String, String>();

	public static boolean dropTable() {
		PreparedStatement ps = null;

		try {
			
			conn = ConnectionUtilities.getConnection();
			String sql = " DROP table history_syned ";
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
	
	public static FileSynedEntity insert(FileSynedEntity entity) {
		PreparedStatement ps = null;

		try {
			if (entity == null) {
				return null;
			}
			conn = ConnectionUtilities.getConnection();
			String sql = "insert into history_syned(id,filename,status,count,createdate,desc_) values (?,?,?,?,?,?)";
			long id = System.currentTimeMillis();
			ps = conn.prepareStatement(sql);
			ps.setString(1, String.valueOf(id));
			ps.setString(2, entity.getFilename());
			ps.setString(3, entity.getStatus());
			ps.setString(4, entity.getCount());
			ps.setString(5, entity.getCreatedate());
			ps.setString(6, entity.getDesc());
			
			ps.execute();
			conn.commit();
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
		return entity;
	}
	
	public static void loadingToMap() throws Exception {
		fileMap = new HashedMap<String, String>();
		try {
			conn = ConnectionUtilities.getConnection();
			String sql = "select * from history_syned ";
			PreparedStatement ps = conn.prepareStatement(sql);
			ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					
					String filename = rs.getString("filename");
					String status = rs.getString("status");
					
					if(status != null 
							&& status.equalsIgnoreCase("OK")) {
						logger.info("Tải cấu hình:Các file đã đồng bộ thành công..:"+rs.getString("filename"));
						fileMap.put(filename, status);
					}
					
				}
			} catch (Exception e) {
		
			}
		
	}
	
	public static List<FileSynedEntity> search(String date) throws Exception {
		List<FileSynedEntity> result = new ArrayList<FileSynedEntity>();
		try {
			conn = ConnectionUtilities.getConnection();
			String sql = "SELECT * FROM history_syned WHERE createdate LIKE ? ORDER BY id desc";
			PreparedStatement ps = conn.prepareStatement(sql);
			ps.setString(1, "%"+date+"%");
			ResultSet rs = ps.executeQuery();
				while (rs.next()) {
					String id = rs.getString("filename");
					String filename = rs.getString("filename");
					String status = rs.getString("status");
					String count = rs.getString("count");
					String createdate = rs.getString("createdate");
					String desc = rs.getString("desc_");
					FileSynedEntity entity = new FileSynedEntity(id, filename, status, count, createdate,desc);
					result.add(entity);
				
					
				}
			} catch (Exception e) {
				e.printStackTrace();
		
			}
		return result;
		
	}
	
	
	

}
