package futuretrend.testdatareader;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadTestDataFile {




	public Map<Integer, List<Object>> readxlsFile(String xlsfilename,String subsheet)
	{

		Map<Integer, List<Object>> map=new LinkedHashMap<Integer, List<Object>>();
		int rowcount=0;
		try {


			String path=System.getProperty("user.dir")+"\\testdata\\"+xlsfilename;

			FileInputStream file=new FileInputStream(path);

			Workbook book=WorkbookFactory.create(file);

			Sheet sheet=book.getSheet(subsheet);

			Iterator<Row> rowitr=sheet.rowIterator();

			while(rowitr.hasNext())
			{

             List<Object> rowList=new ArrayList<Object>();

				Row rowdata=rowitr.next();

				Iterator<Cell> cellitr=rowdata.cellIterator();


				while(cellitr.hasNext())
				{

					Cell celldata=cellitr.next();


					switch (celldata.getCellType()) {
					case STRING:
                       rowList.add(celldata.getStringCellValue());
						
						break;

					case NUMERIC:
						
						rowList.add(celldata.getNumericCellValue());

						break;

					case BOOLEAN:

						rowList.add(celldata.getBooleanCellValue());
						
						break;

					case FORMULA:
						
						rowList.add(celldata.getCellFormula());

						break;

					case BLANK:
                         rowList.add("Blank Cell");
						break;

					default:
						System.out.println("None of the above");
						break;
					}


				}

              map.put(rowcount, rowList);
              rowcount++;




			}






		} catch (Exception e) {
			e.printStackTrace();
		}
		return map;




	}



}
