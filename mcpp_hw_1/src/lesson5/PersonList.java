package lesson5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Arrays;

import lesson4.Person;

public class PersonList
{

	public static void main(String[] args)  throws SQLException
	{
		ArrayList<Person> pp = new ArrayList<Person>();
		init();  

		printAll(pp);

		System.out.println(Arrays.asList(initFromH2()));
		
	}


	public static void printAll(ArrayList<Person> pp)
	{
		for (Person person : pp)
		{
			System.out.println(person);
		}

	}

	private static ArrayList<Person> init()
	{
		ArrayList<Person> arr = new ArrayList<>();
		return arr;
	}

	private static ArrayList<Person> initFromH2() throws SQLException
	{
		ArrayList<Person> arr = new ArrayList<>();
		Connection con = DriverManager.getConnection("jdbc:h2:~/test","sa","");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select * from KILLERSDB");
		while(rs.next())
		{
			arr.add( new Person(rs.getInt(1), rs.getString("FNAME"), rs.getString("LNAME"), rs.getInt("AGE")) );
		}
		return arr;
	}

}
