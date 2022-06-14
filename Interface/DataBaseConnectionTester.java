package Interface;

public class DataBaseConnectionTester {

	public static void main(String[] args) {
		
		DatabaseConnector data=new OracleDataBase();
		data.connectToDatabase();
	}
		
		public static void main(int[] args) {
			
		DatabaseConnector dataBase=new MongoDataBase();
		dataBase.connectToDatabase();
	
		DatabaseConnector dataFile=new SqlServerDataBase();
		dataFile.connectToDatabase();
	
	}
	

}
