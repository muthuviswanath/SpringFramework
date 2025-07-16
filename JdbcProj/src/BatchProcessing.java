import java.sql.Connection;
import java.sql.PreparedStatement;

public class BatchProcessing {

	public static void main(String[] args) throws Exception{
		Connection con = JdbcUtil.getConnection();
		con.setAutoCommit(false);
		String query = "INSERT INTO BOOKS"
				+ "(BOOK_ID, TITLE, AUTHOR, PRICE, AVAILABLE_STOCK)"
				+ "VALUES (?, ?, ?, ?, ?)";
		PreparedStatement pstmt = con.prepareStatement(query);
		pstmt.setInt(1, 700);
		pstmt.setString(2, "Java Basics");
		pstmt.setString(3, "James Goslin");
		pstmt.setDouble(4, 3456.34);
		pstmt.setInt(5,10);
		pstmt.addBatch();
		
		pstmt.setInt(1, 701);
		pstmt.setString(2, "Git Basics");
		pstmt.setString(3, "Linus Torvalds");
		pstmt.setDouble(4, 4556.24);
		pstmt.setInt(5,50);
		pstmt.addBatch();
		
		int[] result  = pstmt.executeBatch();
		con.commit();
		System.out.println("Number of records inserted = " + result.length);
		
		con.close();
	}
}
