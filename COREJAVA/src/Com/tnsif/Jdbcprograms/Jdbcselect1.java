package Com.tnsif.Jdbcprograms;
import java.sql.*;
import javax.sql.*;  // step 1 import pacakges
public class Jdbcselect1 
{
	public static void main(String[] args) {
		
		// step2: load and register the driver
		
		// step 3:Establish connection
		
		try {
			Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/sriindu","root","Shiva@#$&1232");
			
			// step 4: create statement
			
			Statement st=conn.createStatement();
			
			// step 5: execute quary
			
			String strselect="Select maths,price,quantity from tn_student";
			
			// process the result to display
			
			ResultSet rst=st.executeQuery(strselect);
			System.out.println("The records are"); 
			int rowcount=0;
			while(rst.next()) {
				String booktitle=rst.getString("maths");
				int price=rst.getInt("price");
				int quantity=rst.getInt("quantity");
				
				System.out.println(booktitle+" "+price+" "+quantity);
				++rowcount;
			}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
	}



