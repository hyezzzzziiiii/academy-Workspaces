package com.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.board.dto.MemberDto;
import com.board.util.DataBaseManager;

public class MemberDao {
	private MemberDao() {}
	private static MemberDao ist = new MemberDao();
	public static MemberDao getInstance() { return ist; }
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	
	public void editMember(MemberDto mdto) {
		String sql = "Update member set pwd=?, name=?, "
				+"phone=?, email=?, admin=? where userid=?";
		con = DataBaseManager.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mdto.getPwd());
			pstmt.setString(2, mdto.getName());
			pstmt.setString(3, mdto.getPhone());
			pstmt.setString(4, mdto.getEmail());
			pstmt.setInt(5, mdto.getAdmin());
			pstmt.setString(6, mdto.getUserid());
			
			pstmt.executeUpdate();
		} catch (SQLException e) {	e.printStackTrace(); 		}
		DataBaseManager.close(con, pstmt, rs);
	}
	
	
	
	
	public void insertMember(MemberDto mdto) {
		String sql = "insert into member(userid, pwd, name, phone,"
				+"email, admin) values(?, ?, ?, ?, ?, ?)";
		con = DataBaseManager.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, mdto.getUserid());
			pstmt.setString(2, mdto.getPwd());
			pstmt.setString(3, mdto.getName());
			pstmt.setString(4, mdto.getPhone());
			pstmt.setString(5, mdto.getEmail());
			pstmt.setInt(6, mdto.getAdmin());
			pstmt.executeUpdate();
		} catch (SQLException e) {	e.printStackTrace(); 		}
		DataBaseManager.close(con, pstmt, rs);
	}
	
	
	
	
	
	public int confirmID(String userid) {
		int result = 0;
		String sql = "select userid from member where userid=?";
		con = DataBaseManager.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1,  userid);
			rs=pstmt.executeQuery();
			if(rs.next()) result = 1;		// 검색아이디가 사용중인 아이로 설	
		} catch (Exception e) {e.printStackTrace(); }
		DataBaseManager.close(con, pstmt, rs);
		return result;
	}
	
	
	
	public MemberDto getMember(String userid) {
		MemberDto mdto = null;
		String sql = "select * from member where userid = ?";
		con = DataBaseManager.getConnection();
		try {
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, userid);
			rs = pstmt.executeQuery();
			if( rs.next() ) {
				mdto = new MemberDto();
				mdto.setUserid( rs.getString("userid") );
				mdto.setName( rs.getString("name") );
				mdto.setPwd( rs.getString("pwd") );
				mdto.setEmail( rs.getString("email") );
				mdto.setPhone( rs.getString("phone") );
				mdto.setAdmin( rs.getInt("admin") );
			}
		} catch (SQLException e) { e.printStackTrace();		}
		DataBaseManager.close(con, pstmt, rs);
		return mdto;
	}
	
}
