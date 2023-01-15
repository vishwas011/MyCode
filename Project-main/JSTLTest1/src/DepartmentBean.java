package classic.web.app;

import java.sql.*;
import java.util.*;

public class DepartmentBean implements java.io.Serializable {

	private int dept_Id;


	public final int getDeptId() { return dept_Id; }
	public final void setDeptId(int value) { dept_Id = value; }


	public List<DepartmentEntry> getDetails() throws SQLException {
		var details = new ArrayList<DepartmentEntry>();
		try(var con = DB.connect()){
    var pstmt = con.prepareStatement("select id,name,age,dept_no from employee_details where dept_no=?");
			pstmt.setString(1, String.valueOf(dept_Id));
			System.out.println("-");
			var rs = pstmt.executeQuery();
			while(rs.next())
			details.add(new DepartmentEntry(rs));
			rs.close();
			pstmt.close();
		}
		return details;
	}


	public static class DepartmentEntry {
		
		private int emp_id;
		private String emp_Name;
		private int emp_age;
		//private String emp_salary;
		private int emp_dept;

		DepartmentEntry(ResultSet rs) throws SQLException {
			emp_id = rs.getInt("id");
			emp_Name = rs.getString("name");
			emp_age = rs.getInt("age");
			//emp_salary=rs.getString("employee_salary");
			emp_dept=rs.getInt("dept_no");
		}

		public final int getEmp_id() { return emp_id; }

		public final String getEmp_Name() { return emp_Name; }

	       	public final int getEmp_age() { return emp_age; }
		
//		public final String getEmp_salary() { return emp_salary; }

	       	public final int getEmp_dept() { return emp_dept; }
	       	
	}
}
