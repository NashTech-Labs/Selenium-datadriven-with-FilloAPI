package ExcelOpertaion;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import org.testng.annotations.Test;

public class CreateTable {

	private String filePath;

	// create table (worksheet)
	@Test
	public void test1() {
		filePath = "./files/SampleExcelFile1.xlsx";
		try {
			Fillo fillo = new Fillo();
			Connection connection = fillo.getConnection(filePath);
			connection.createTable("Sheet4", new String[] { "ID", "First Name", "Last Name", "Age" });
			connection.close();
		} catch (FilloException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
