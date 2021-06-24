package net.vishnu.vms.dao;


import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.sql.DataSource;

import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.ResultSetExtractor;
import org.springframework.jdbc.core.RowMapper;


import net.vishnu.vms.model.Visitor;

public class VisitorDAOImpl implements VisitorDAO {
	@Override
	public String make(String freeText, String freeText1) {
		try {
			
		return (String) this.jdbcTemplate.queryForObject("select username from admin where username='"+freeText+"' and password='"+freeText1+"'",String.class);
	
		}
		catch(Exception e)
		{
			return null;
		}
		
		
		}

	private JdbcTemplate jdbcTemplate; 
	public  VisitorDAOImpl(DataSource dataSource)
	{
		this.jdbcTemplate=new JdbcTemplate(dataSource);
	}
	
	

	




	@Override
	public int todayvisitors() {
		return (int) this.jdbcTemplate.queryForObject("select COUNT(*) from tblvisitor where date(EnterDate)=CURDATE()",int.class);
		
	}





	@Override
	public int yesterdayvisitors() {
		return (int) this.jdbcTemplate.queryForObject("select COUNT(*) from tblvisitor where date(EnterDate)=CURDATE()-1",int.class);
		
	}










	@Override
	public int lastdaysvisitors() {
		
		return (int) this.jdbcTemplate.queryForObject("select COUNT(*) from tblvisitor where date(EnterDate)>=(DATE(NOW()) - INTERVAL 7 DAY)",int.class);
	}










	@Override
	public int totalvisitors() {
		return (int) this.jdbcTemplate.queryForObject("select COUNT(*) from tblvisitor",int.class);
	}










	@Override
	public int save(Visitor c) {
		String sql="INSERT INTO tblvisitor(visitorname,mobilenumber,address,apartment,floor,whomtomeet,reasontomeet) VALUES(?,?,?,?,?,?,?)";
		return	jdbcTemplate.update(sql,c.getVisitorname(),c.getMobilenumber(),c.getAddress(),c.getApartment(),c.getFloor(),c.getWhomtomeet(),c.getReasontomeet());
	}









	@Override
	public List<Visitor> list() {
		String sql="SELECT * FROM tblvisitor";
		RowMapper<Visitor> rowMapper=new RowMapper<Visitor>() {

			@Override
			public Visitor mapRow(ResultSet rs, int rowNum) throws SQLException {
				Integer id=rs.getInt("id");
				String visitorname=rs.getString("visitorname");
				String mobilenumber=rs.getString("mobilenumber");
				String address=rs.getString("address");
				String apartment=rs.getString("apartment");
				String floor=rs.getString("floor");
				String whomtomeet=rs.getString("whomtomeet");
				String reasontomeet=rs.getString("reasontomeet");
				String remark=rs.getString("remark");
				return new Visitor(id,visitorname,mobilenumber,address,apartment,floor,whomtomeet,reasontomeet,remark);
			}
		};
		
	return jdbcTemplate.query(sql, rowMapper);
	
	}








	@Override
	public Visitor get(Integer id) {
		
		String sql="SELECT * FROM tblvisitor WHERE id=" +id;
		ResultSetExtractor<Visitor> extractor = new ResultSetExtractor<Visitor>() {

			@Override
			public Visitor extractData(ResultSet rs) throws SQLException, DataAccessException {
				if(rs.next())
				{
					String visitorname=rs.getString("visitorname");
					String mobilenumber=rs.getString("mobilenumber");
					String address=rs.getString("address");
					String apartment=rs.getString("apartment");
					String floor=rs.getString("floor");
					String whomtomeet=rs.getString("whomtomeet");
					String reasontomeet=rs.getString("reasontomeet");
					String remark=rs.getString("remark");
					return new Visitor(id,visitorname,mobilenumber,address,apartment,floor,whomtomeet,reasontomeet,remark);
				}
				return null;
			}
			
			
			
			
		};
		
		
		
		return jdbcTemplate.query(sql, extractor);
	}





	@Override
	public int update(Visitor c) {
		String sql="UPDATE tblvisitor SET visitorname=?,mobilenumber=?,address=?,apartment=?,floor=?,whomtomeet=?,reasontomeet=?,remark=? WHERE id=?";
		return	jdbcTemplate.update(sql,c.getVisitorname(),c.getMobilenumber(),c.getAddress(),c.getApartment(),c.getFloor(),c.getWhomtomeet(),c.getReasontomeet(),c.getRemark(),c.getId());
		
	}








	@Override
	public List<Visitor> search(String freeText) {
		String sql="SELECT * FROM tblvisitor WHERE (visitorname='"+freeText+"'OR mobilenumber='"+freeText+"'OR address='"+freeText+"'OR apartment='"+freeText+"'OR floor='"+freeText+"'OR whomtomeet='"+freeText+"'OR reasontomeet='"+freeText+"')";
		RowMapper<Visitor> rowMapper=new RowMapper<Visitor>() {

			@Override
			public Visitor mapRow(ResultSet rs, int rowNum) throws SQLException {
				Integer id=rs.getInt("id");
				String visitorname=rs.getString("visitorname");
				String mobilenumber=rs.getString("mobilenumber");
				String address=rs.getString("address");
				String apartment=rs.getString("apartment");
				String floor=rs.getString("floor");
				String whomtomeet=rs.getString("whomtomeet");
				String reasontomeet=rs.getString("reasontomeet");
				String remark=rs.getString("remark");
				return new Visitor(id,visitorname,mobilenumber,address,apartment,floor,whomtomeet,reasontomeet,remark);
			}
		};
		
	return jdbcTemplate.query(sql, rowMapper);
	}








	@Override
	public List<Visitor> date(String date1, String date2) {
		String sql="select *from tblvisitor where date(enterdate) between '"+date1+"' and '"+date2+"'";
		RowMapper<Visitor> rowMapper=new RowMapper<Visitor>() {

			@Override
			public Visitor mapRow(ResultSet rs, int rowNum) throws SQLException {
				Integer id=rs.getInt("id");
				String visitorname=rs.getString("visitorname");
				String mobilenumber=rs.getString("mobilenumber");
				String address=rs.getString("address");
				String apartment=rs.getString("apartment");
				String floor=rs.getString("floor");
				String whomtomeet=rs.getString("whomtomeet");
				String reasontomeet=rs.getString("reasontomeet");
				String remark=rs.getString("remark");
				String enterdate=rs.getString("enterdate");
				String outtime=rs.getString("outtime");
				return new Visitor(id,visitorname,mobilenumber,address,apartment,floor,whomtomeet,reasontomeet,remark,enterdate,outtime);
			}
		};
		
	return jdbcTemplate.query(sql, rowMapper);
	}



















	

















	


}
