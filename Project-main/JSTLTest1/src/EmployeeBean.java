package classic.web.app;

import java.sql.*;
import java.util.*;

public class EmployeeBean implements java.io.Serializable {

	private String id;
	private String password;
	private int dept_Id;

	public final String getId() { return id; }
	public final void setId(String value) { id = value; }

	public final int getDeptId() { return dept_Id; }
	public final void setDeptId(int value) { dept_Id = value; }

	public final String getPassword() { return password; }
	public final void setPassword(String value) { password = value; }

	

	public boolean authenticate() throws SQLException {
		try(var con = DB.connect()){
			var pstmt = con.prepareStatement("select count(id) from admin where id=? and password=?");
			pstmt.setString(1, id);
			pstmt.setString(2, password);
			var rs = pstmt.executeQuery();
			rs.next();
			int count = rs.getInt(1);
			rs.close();
			pstmt.close();
			if(count == 1)
				return true;
			id = password = null;
			return false;
		}
	}

	public List<OrderEntry> getOrders() throws SQLException {
		var orders = new ArrayList<OrderEntry>();
		try(var con = DB.connect()){
			var pstmt = con.prepareStatement("select dept_id, dept_name, dept_location from department ");
			//pstmt.setString(1, id);
			var rs = pstmt.executeQuery();
			while(rs.next())
				orders.add(new OrderEntry(rs));
			rs.close();
			pstmt.close();
		}
		return orders;
	}


	public static class OrderEntry {
		
		private int department_No;
		private String department_Name;
		private String location;
		

		OrderEntry(ResultSet rs) throws SQLException {
			department_No = rs.getInt("dept_id");
			department_Name = rs.getString("dept_name");
			location = rs.getString("dept_location");
			
		}

		public final int getDepartmentNo() { return department_No; }

		public final String getDepartmentName() { return department_Name; }

		public final String getLocation() { return location; }

		
	}
}

