package ExcelOpertaion;

import com.codoid.products.exception.FilloException;
import com.codoid.products.fillo.Connection;
import com.codoid.products.fillo.Fillo;
import org.testng.annotations.Test;

public class InsertValuesInExcel {

	private String query;
	private String filePath;

	@Test
	public void test1() {

		String query = "INSERT INTO \"Sheet3\"(ID,\"First Name\",\"Last Name\",\"Age\") VALUES(1,'Rohit','Sharma',18)";
		String filePath = "./files/SampleExcelFile1.xlsx";
		try {
			Fillo fillo = new Fillo();
			Connection connection = fillo.getConnection(filePath);
			connection.executeUpdate(query);
			connection.close();
		} catch (FilloException e) {
			e.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
