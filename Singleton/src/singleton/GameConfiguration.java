package singleton;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Consumer;

public class GameConfiguration {
	
	private static GameConfiguration uniqueInstance;
	
	private String AppId;
	private String BuildId;
	private String Offline;
	private String AutoDLC;
	private String UpdateDB;
	private String WaitForExit;
	private String NoOperation;
	private String DLCName;
	private String UserName;
	private String Language;
	private String Signature;
	private String WindowInfo;
	private String LVWindowInfo;
	private String ApplicationPath;
	private String WorkingDirectory;

	
	private GameConfiguration() {
		
		String path = "/Users/rcosta/Documents/lista2-pp/Singleton/src/config.txt";

		
		Map<String, Consumer<String>> propertyMap = new HashMap<>();
		
			propertyMap.put("AppId", value -> this.AppId = value);
			propertyMap.put("BuildId", value -> this.BuildId = value);
			propertyMap.put("Offline", value -> this.Offline = value);
			propertyMap.put("AutoDLC", value -> this.AutoDLC = value);
			propertyMap.put("UpdateDB", value -> this.UpdateDB = value);
			propertyMap.put("WaitForExit", value -> this.WaitForExit = value);
			propertyMap.put("NoOperation", value -> this.NoOperation = value);
			propertyMap.put("DLCName", value -> this.DLCName = value);
			propertyMap.put("UserName", value -> this.UserName = value);
			propertyMap.put("Language", value -> this.Language = value);
			propertyMap.put("Signature", value -> this.Signature = value);
			propertyMap.put("WindowInfo", value -> this.WindowInfo = value);
			propertyMap.put("LVWindowInfo", value -> this.LVWindowInfo = value);
			propertyMap.put("ApplicationPath", value -> this.ApplicationPath = value);
			propertyMap.put("WorkingDirectory", value -> this.WorkingDirectory = value);
			
		
			try {
				
				BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
				
				String line = bufferedReader.readLine(); 
				
	            while (line != null) {
	            	
	                String[] result = line.split("=", 2);
	       
	                
	                if (result.length == 2) {
	                	
	                	String chave = result[0].trim();
	                	String value = result[1].trim();
	                	
	                	Consumer<String> propertySetter = propertyMap.get(chave);
	                	
		                 if (propertySetter != null) {
		                		
		                		propertySetter.accept(value);
		                		
		                 } else {
		                		
		                		System.out.println("Chave não encontrada " + chave);
		                 } 
		                 
                } else {
            	
            			System.out.println("Linha não encontrada");
                }
	               
	                line = bufferedReader.readLine(); 
	               
	         }
			
	           
	            
	            bufferedReader.close();
			   } catch (IOException e) {
			            System.out.println("Erro ao ler arquivo: " + e.getMessage());
			 }
			}

			
	
	
		public static GameConfiguration getInstance() {
			if(uniqueInstance == null) {
				uniqueInstance = new GameConfiguration();
			}
			return uniqueInstance;
		}




		@Override
		public String toString() {
			return "GameConfiguration [AppId=" + AppId + ", BuildId=" + BuildId + ", Offline=" + Offline + ", AutoDLC="
					+ AutoDLC + ", UpdateDB=" + UpdateDB + ", WaitForExit=" + WaitForExit + ", NoOperation="
					+ NoOperation + ", DLCName=" + DLCName + ", UserName=" + UserName + ", Language=" + Language
					+ ", Signature=" + Signature + ", WindowInfo=" + WindowInfo + ", LVWindowInfo=" + LVWindowInfo
					+ ", ApplicationPath=" + ApplicationPath + ", WorkingDirectory=" + WorkingDirectory + "]";
		}




		public String getAppId() {
			return AppId;
		}




		public void setAppId(String appId) {
			AppId = appId;
		}




		public String getBuildId() {
			return BuildId;
		}




		public void setBuildId(String buildId) {
			BuildId = buildId;
		}




		public String getOffline() {
			return Offline;
		}




		public void setOffline(String offline) {
			Offline = offline;
		}




		public String getAutoDLC() {
			return AutoDLC;
		}




		public void setAutoDLC(String autoDLC) {
			AutoDLC = autoDLC;
		}




		public String getUpdateDB() {
			return UpdateDB;
		}




		public void setUpdateDB(String updateDB) {
			UpdateDB = updateDB;
		}




		public String getWaitForExit() {
			return WaitForExit;
		}




		public void setWaitForExit(String waitForExit) {
			WaitForExit = waitForExit;
		}




		public String getNoOperation() {
			return NoOperation;
		}




		public void setNoOperation(String noOperation) {
			NoOperation = noOperation;
		}




		public String getDLCName() {
			return DLCName;
		}




		public void setDLCName(String dLCName) {
			DLCName = dLCName;
		}




		public String getUserName() {
			return UserName;
		}




		public void setUserName(String userName) {
			UserName = userName;
		}




		public String getLanguage() {
			return Language;
		}




		public void setLanguage(String language) {
			Language = language;
		}




		public String getSignature() {
			return Signature;
		}




		public void setSignature(String signature) {
			Signature = signature;
		}




		public String getWindowInfo() {
			return WindowInfo;
		}




		public void setWindowInfo(String windowInfo) {
			WindowInfo = windowInfo;
		}




		public String getLVWindowInfo() {
			return LVWindowInfo;
		}




		public void setLVWindowInfo(String lVWindowInfo) {
			LVWindowInfo = lVWindowInfo;
		}




		public String getApplicationPath() {
			return ApplicationPath;
		}




		public void setApplicationPath(String applicationPath) {
			ApplicationPath = applicationPath;
		}




		public String getWorkingDirectory() {
			return WorkingDirectory;
		}




		public void setWorkingDirectory(String workingDirectory) {
			WorkingDirectory = workingDirectory;
		}



		
		
		
}


				