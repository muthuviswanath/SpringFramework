import java.sql.CallableStatement;
import java.sql.Connection;
import java.util.Scanner;

public class StoredProcedure {
	public static void main(String[] args) throws Exception {
		 Scanner scan = new Scanner(System.in);
		 System.out.println("Enter Book Id:");
		 int bookId = scan.nextInt();
		 System.out.println("Enter Book Price:");
		 double price = scan.nextDouble();
		 Connection con =  JdbcUtil.getConnection();
		 
		 //INCREASE_BOOK_PRICE
		 String procedure_call = 
				 "{call INCREASE_BOOK_PRICE(?,?)}";
		 
		 // Prepare the callable statement
		 CallableStatement cstmt = 
				 con.prepareCall(procedure_call) ;
		 cstmt.setInt(1, bookId);
		 cstmt.setDouble(2, price);
		 cstmt.execute();
		 cstmt.closeOnCompletion();
		 con.close();
		 
	}
}
