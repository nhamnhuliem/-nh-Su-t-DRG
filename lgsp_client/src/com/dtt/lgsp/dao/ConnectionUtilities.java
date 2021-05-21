package com.dtt.lgsp.dao;


import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import org.apache.log4j.Logger;

public class ConnectionUtilities {
	
	static final Logger  logger = Logger.getLogger(ConnectionUtilities.class);
	public static final String DRIVER = "org.apache.derby.jdbc.EmbeddedDriver";
	public static final String JDBC_URL = "jdbc:derby:4210db;create=true";
	public static Connection conn = null;
	
	
	public static void createTableFileSyned() {
		try {
			logger.info("System is creating table history_syned for store....!");
			Connection conn = getConnection();
			if(conn!=null) {
				DatabaseMetaData metas = conn.getMetaData();
				Statement stat = conn.createStatement();
				ResultSet tables = metas.getTables(conn.getCatalog(), null, "history_syned", null);
			
				if (!tables.next()) {
					stat.execute(" CREATE TABLE history_syned(id varchar(100)"
							+ ",filename varchar(200),status varchar(10)"
							+ ",count varchar(50),createdate varchar(100),desc_ varchar(400))");

				}
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e);
		}
	}
	
	public static void createHoSoSyned() {
		try {
			logger.info("System is creating table hoso_syned for store....!");
			Connection conn = getConnection();
			if(conn!=null) {
				DatabaseMetaData metas = conn.getMetaData();
				Statement stat = conn.createStatement();
				ResultSet tables = metas.getTables(conn.getCatalog(), null, "hoso_syned", null);
			
				if (!tables.next()) {
					stat.execute(" CREATE TABLE hoso_syned(id varchar(100)"
							+ ",malk varchar(200),createdate varchar(100),desc_ varchar(400))");

				}
				
			}
		} catch (Exception e) {
			// TODO: handle exception
			logger.error(e);
		}
	}
	
	public static Connection getConnection() throws Exception{
		try {
			Class.forName(DRIVER);
			return DriverManager.getConnection(JDBC_URL);
		} catch (Exception e) {
			throw e;
		}
	}
}
