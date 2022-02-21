package in.co.rays.model;

import java.util.HashMap;
import java.util.ResourceBundle;

public final class ModelFactory {
	
	private static ResourceBundle rb = ResourceBundle.getBundle("in.co.rays.bundle.system");
	private static final String DATABASE = rb.getString("DATABASE");
	private static ModelFactory mfactory = null;
	private static HashMap modelCache = new HashMap();
	
	
	private ModelFactory() {
		
	}
		
	public static ModelFactory getInstance() {
		if (mfactory==null) {
			mfactory = new ModelFactory();
		}
		
		return mfactory;
		
	}
	
	public UserModelInt getUserModel() {
		
		UserModelInt UserModel = (UserModelInt) modelCache.get("UserModel");
		if (UserModel == null) {
		if("Hibernate".equals(DATABASE)) {
			UserModel = new UserModelHibImp();
			
		}
		if("JDBC".equals(DATABASE)) {
			UserModel = new UserModelJDBCImp();
		}
		modelCache.put("UserModel",UserModel);
		
	}
		return UserModel;
}}
	