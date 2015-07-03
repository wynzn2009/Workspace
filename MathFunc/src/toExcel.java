import java.io.File;
import java.text.DecimalFormat;

import jxl.*;
import jxl.write.Label;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;

public class toExcel {
	
	
	public static void Write(double[][] a){
		DecimalFormat df=new DecimalFormat("########0.00");
		try{
			WritableWorkbook book= Workbook.createWorkbook(new File("E:/t.xls")); 
			WritableSheet sheet=book.createSheet("第一页",0);
			for(int i=1;i<a[0].length+1;i++){
				sheet.addCell(new Label(i,0,df.format((i-1)*0.01)));
				sheet.addCell(new Label(0,i,df.format((i-1)*0.01)));
			}
			for(int i=0;i<a[0].length;i++){
				for(int j=0;j<a[0].length;j++){
					sheet.addCell(new Label(j+1,i+1,String.valueOf(a[i][j])));
				}
			}
			book.write(); 
            //关闭文件
            book.close(); 
		}catch(Exception e){
			
		}
	}
	
	
	
	
	
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
