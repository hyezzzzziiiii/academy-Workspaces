package com.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.board.dto.BoardDto;
import com.board.util.Dbman;

public class BoardDao {
	private BoardDao() {};
	private static BoardDao ist = new BoardDao();
	public static BoardDao getInstance() { return ist; }
	
	Connection con = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	
	
	public void insertBoard(BoardDto bdto) {
		String sql = "insert into mboard(num, name, email, pass, title, content, replycnt) "
						+ "values(board_seq.nextVal, ?, ?, ?, ?, ?, 0)";
		try {
			con = Dbman.getConnection();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, bdto.getName());
			pstmt.setString(2, bdto.getEmail());
			pstmt.setString(3, bdto.getPass());
			pstmt.setString(4, bdto.getTitle());
			pstmt.setString(5, bdto.getContent());
			pstmt.executeUpdate();
		} catch (SQLException e) { 	e.printStackTrace();
		} finally {	Dbman.close(con, pstmt, rs); }
	}
	
		
	
	
	
	public ArrayList<BoardDto> selectAll(){
		
		ArrayList<BoardDto> list = new ArrayList<BoardDto>();
		String sql = "select * from  mboard  order by num desc";
				
		try {
			con = Dbman.getConnection();
			pstmt = con.prepareStatement(sql);
						
			rs = pstmt.executeQuery();	
			while(rs.next() ) {
				BoardDto bdto = new BoardDto();
				bdto.setNum( rs.getInt("num") );
				bdto.setName( rs.getString("name") );
				bdto.setEmail( rs.getString("Email") );
				bdto.setPass( rs.getString("pass"));
				bdto.setTitle( rs.getString("title") );
				bdto.setContent( rs.getString("content") );
				bdto.setReadcount( rs.getInt("readcount") );
				bdto.setWritedate( rs.getTimestamp("writedate") );
				bdto.setReplycnt( rs.getInt("replycnt"));
				list.add(bdto);
			}
		} catch (SQLException e) { e.printStackTrace();
		} finally { Dbman.close(con, pstmt, rs); }
		return list;
	}

}
