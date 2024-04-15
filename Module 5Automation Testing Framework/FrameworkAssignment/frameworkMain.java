package FrameworkAssignment;

public class frameworkMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		frameworkProgram1 rd = new frameworkProgram1("C:\\Users\\Priyanka\\OneDrive\\Desktop\\testExcel\\testlogindata.xlsx","logindata");
		int row = rd.rowCount();
		System.out.println("rows : "+row);
		
		int col = rd.colCount();
		System.out.println("cols : "+col);
		
		
		for(int i=1;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				String data = rd.getData(i,j);
				System.out.print(data);
			}
			System.out.println();
		}
		
		
	}

	}


