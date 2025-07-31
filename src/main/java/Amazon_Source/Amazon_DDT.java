package Amazon_Source;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.testng.annotations.Test;


public class Amazon_DDT {
	
	public static String ValidUn, ValidPw,ValidUsername, ValidPassword, InvalidUserName, InvalidPassword, NewEmail, MobileNumber, FullName, New_Password, Name, Mobile_number, Pincode, Flat, CardNumber, Area, Landmark, City ;

	@Test
public void AmazonLoginData() throws IOException   {
		
		FileInputStream f1 = new FileInputStream("C:\\Users\\hp\\eclipse-workspace\\Amazon_Code\\DataSheet\\Data_Sheet.xlsx");
		Workbook w1 = WorkbookFactory.create(f1);
		//valid creds
		ValidUsername = w1.getSheet("Login Creds").getRow(2).getCell(0).getStringCellValue();
		//System.out.println(ValidUsername);
		ValidPassword = w1.getSheet("Login Creds").getRow(2).getCell(1).getStringCellValue();
	//	System.out.println(ValidPassword);
	    //invalid creds
		InvalidUserName = w1.getSheet("Login Creds").getRow(1).getCell(0).getStringCellValue();
		System.out.println(InvalidUserName);
		InvalidPassword = w1.getSheet("Login Creds").getRow(1).getCell(1).getStringCellValue();
		System.out.println(InvalidPassword);
		CardNumber = NumberToTextConverter.toText(w1.getSheet("Login Creds").getRow(1).getCell(2).getNumericCellValue());
		System.out.println(CardNumber);
		
		ValidUn = w1.getSheet("Login Creds").getRow(3).getCell(0).getStringCellValue();
		System.out.println(ValidUn);
		ValidPw = w1.getSheet("Login Creds").getRow(3).getCell(1).getStringCellValue();
	    System.out.println(ValidPw);
		
		//NewEmail
		
		NewEmail = w1.getSheet("Registration_Page").getRow(1).getCell(3).getStringCellValue();
	//	System.out.println(NewEmail);
		
		//Mobile Number
	    MobileNumber = NumberToTextConverter.toText(w1.getSheet("Registration_Page").getRow(1).getCell(0).getNumericCellValue());
	//    System.out.println(MobileNumber);
	    
	    //Name
	    FullName = w1.getSheet("Registration_Page").getRow(1).getCell(1).getStringCellValue();
	//    System.out.println(FullName);
	    
	    //Password
	    New_Password= w1.getSheet("Registration_Page").getRow(1).getCell(2).getStringCellValue();
	//    System.out.println(New_Password);
		
//Edit page
	Name = w1.getSheet("Edit Page").getRow(1).getCell(0).getStringCellValue();
//	System.out.println(Name);
	Mobile_number = NumberToTextConverter.toText(w1.getSheet("Edit Page").getRow(1).getCell(1).getNumericCellValue());
//	System.out.println(Mobile_number);
	Pincode = NumberToTextConverter.toText(w1.getSheet("Edit Page").getRow(1).getCell(2).getNumericCellValue());
//	System.out.println(Pincode);
	Flat = w1.getSheet("Edit Page").getRow(1).getCell(3).getStringCellValue();
//	System.out.println(Flat);
	Area = w1.getSheet("Edit Page").getRow(1).getCell(4).getStringCellValue();
//	System.out.println(Area);
	Landmark = w1.getSheet("Edit Page").getRow(1).getCell(5).getStringCellValue();
//	System.out.println(Landmark);
	City = w1.getSheet("Edit Page").getRow(1).getCell(6).getStringCellValue();
//	System.out.println(City);
	
	
	
	
	
	}}
