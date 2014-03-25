package uts.codesale.parse;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class ExcelOperator {
		
	public static void read(String xclFile) {
        try {
            Workbook book = Workbook.getWorkbook(new File(xclFile));
            //get the first spreadsheet
            Sheet sheet = book.getSheet(0);
            //get the cell of first row and first column
            Cell cell1 = sheet.getCell(0, 0);
            String result = cell1.getContents();
            System.out.println(result);
            book.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
	
	public static void create(String xclFile) {
        try {
            // open a excel file
            WritableWorkbook book = Workbook.createWorkbook(new File(xclFile));
            // generate the spreadsheet called "sheet1", the variable 0 means the first spreadsheet
            WritableSheet sheet = book.createSheet("sheet1", 0);
            // 在Label对象的构造子中指名单元格位置是第一列第一行(0,0),以及单元格内容为test
            Label label = new Label(0, 0, "test");

            // 将定义好的单元格添加到工作表中
            sheet.addCell(label);

            /*
             * 生成一个保存数字的单元格 必须使用Number的完整包路径，否则有语法歧义 单元格位置是第二列，第一行，值为789.123
             */
            jxl.write.Number number = new jxl.write.Number(1, 0, 555.12541);
            sheet.addCell(number);

            // 写入数据并关闭文件
            book.write();
            book.close();

        } catch (Exception e) {
            System.out.println(e);
        }
    }
	
	public static void update(String xclFile) {
        try {
            // Excel获得文件
            Workbook wb = Workbook.getWorkbook(new File(xclFile));
            // 打开一个文件的副本，并且指定数据写回到原文件
            WritableWorkbook book = Workbook.createWorkbook(new File(xclFile),wb);
            // 添加一个工作表
            WritableSheet sheet = book.createSheet("第二页", 1);
            sheet.addCell(new Label(0, 0, "第二页的测试数据"));
            book.write();
            book.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
	
	public static boolean compare(String xlsFile){
		
		try {
			boolean flag = true;
			Workbook workbook = Workbook.getWorkbook(new File(xlsFile));
	        //get the first sheet
	        Sheet sheet1 = workbook.getSheet(0);
	        //get the second sheet
	        Sheet sheet2 = workbook.getSheet(1);
	        //get the third sheet
	        
	        int columnum1 = sheet1.getColumns();//get the columns of sheet1
	        int rownum1 = sheet1.getRows();//get the rows of sheet1
	        int columnum2 = sheet2.getColumns();//get the columns of sheet2
	        int rownum2 = sheet2.getRows();//get the rows of sheet2
	        
	        //if the number of columns or rows is different, return false
	        if(columnum1!=columnum2||rownum1!=rownum2)
	        	return false;
	        
	        //create the results sheet in the current workbook
	        WritableWorkbook book = Workbook.createWorkbook(new File(xlsFile),workbook);
	        WritableSheet sheet3 = book.createSheet("Sheet4", 3);
	        
	        //use loop to read the corresponding data from two sheets and compare them
	        for (int i = 0; i < rownum1; i++)
	        {
	            for (int j = 0; j < columnum1; j++) {
	                Cell cell1 = sheet1.getCell(j, i);
	                Cell cell2 = sheet2.getCell(j, i);
	                if(cell1.getContents().equalsIgnoreCase(cell2.getContents())){
	                	 sheet3.addCell(new Label(j, i, "PASS"));
	                }else{
	                	sheet3.addCell(new Label(j, i, "FAIL(src:"+cell1.getContents()+" -- tgt:"+cell2.getContents()+")"));
	                	flag = false;
	                }
	            }
	        }
	        book.write();
	        book.close();
	        if(rownum1>0)
	        	return flag;
	        else
	        	return false;
		} catch (Exception e) {
            System.out.println(e);
            System.out.println(xlsFile);
            return false;
        }
	}
	
	public static void listFilesForFolder(File folder,String logFile ) 
	{
		try {
			BufferedWriter outBuffer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(logFile,true)));
			 for (File fileEntry : folder.listFiles()) {
			        if (fileEntry.isDirectory()) {
			            listFilesForFolder(fileEntry,logFile);
			        } else if(fileEntry.getName().endsWith(".xls")) {
//			            System.out.println(fileEntry.getAbsolutePath());
			            if(compare(fileEntry.getAbsolutePath())){
			        		outBuffer.write(fileEntry.getAbsolutePath());
			        		outBuffer.newLine();
			        		outBuffer.write("Pass");
			        		outBuffer.newLine();
			            }else{
			            	outBuffer.write(fileEntry.getAbsolutePath());
			        		outBuffer.newLine();
			        		outBuffer.write("Fail");
			        		outBuffer.newLine();
			            }
			        }
			    }
			    outBuffer.flush();
			 	outBuffer.close();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String logFile = "C:\\DEV\\temp\\comparing_20131114_int_sem_mapping.txt";	
		
		File count_File = new File(logFile);
		if (!count_File.exists()) {
			count_File.mkdirs();
		}
		
		String xslFolder = "C:\\ppss\\Pricing\\Trunk\\PROS_Pricing_Implementation_2013\\08 Testing\\02 SIT\\04_TestResult_Integration_Semantic\\Cycle5";
		File folder = new File(xslFolder);
		listFilesForFolder(folder,logFile);

	}

}
