package codeIns;

import java.sql.*;
import java.util.Iterator;
import java.util.List;
public class TestMe {

	/**
	 * @param args
	 */
public String reverseWords(String s) {
	String[] ss=s.split(" ");
	String result="";
	for(int i=0;i<ss.length;i++){
		int ssl=ss[i].length();
		char[] chars=new char[ssl];
		for(int j=0;j<ssl;j++){
			chars[ssl-j-1]=ss[i].charAt(j);
		}
		ss[i]=new String(chars);
		result+=ss[i]+" ";
	}
	return result.trim();
    }

public int noSenseMtd(int a,int b,int c,int d){
	int result=0;
	if(a>2 && b<5){
		result=a+b;
	}
	if(d==4 || c==6){
		result+=Math.abs(c-d);
	}
	while(d<=a){
		d+=5;
	}
	result+=d;
	return result;
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String driver="com.mysql.jdbc.Driver";
//		String url="jdbc:mysql://localhost:3306/testA";
//		String user="root";
//		String pwd="";
//		try{
//			Class.forName(driver);
//			Connection con=DriverManager.getConnection(url,user,pwd);
//			if(!con.isClosed())
//				System.out.println("succeed");
//			Statement st=con.createStatement();
//			String sql="select * from students where age=22";
//			ResultSet rs=st.executeQuery(sql);
//			while(rs.next()){
//				System.out.print(rs.getString("name")+'\t');
//			}
//			
//		}catch(ClassNotFoundException e){
//			System.out.println("Not Find Driver");
//		}
//		catch(SQLException e){
//			e.printStackTrace();
//		}
		TestMe tm=new TestMe();
		System.out.println(tm.reverseWords("ni hao")+"!!!!");
	}

}
