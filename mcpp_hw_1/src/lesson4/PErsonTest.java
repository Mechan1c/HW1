package lesson4;


public class PErsonTest 
{
	public static void main(String[] args) 
	{
		Person [] pp = new Person[30];

		pp[0] = new Person(1,"Gula","Gropotova",23);
		pp[1] = new Person(2,"Hula","Grohonova",26);
		pp[2] = new Person(3,"Pula","Grohomova",29);
		pp[3] = new Person(4,"Fula","Prohotova",19);
		pp[4] = new Person(5,"Kula","Wrohotova",41);
		pp[5] = new Person (6,"Ben","Ren",34);
		pp[6] = new Person (7,"Ren","ottov",21);
		pp[7] = new Person (8,"Awen","ferov",32);
		pp[8] = new Person (9,"Waren","JOpov",65);
		pp[9] = new Person (10,"Caren","Garhov",25);
		pp[10] = new Person (11,"Deen","opov",21);
		pp[11] = new Person (12,"Seen","rov",16);
		pp[12] = new Person (13,"Veren","Getten",33);
		pp[13] = new Person (14,"naten","Zetter",65);
		pp[14] = new Person (15,"Qween","Gente",54);
		pp[15] = new Person (16,"QwRen","fepon",45);
		pp[16] = new Person (17,"Feren","Gov",43);
		pp[17] = new Person (18,"Jaten","Ken",24);
		pp[18] = new Person (19,"Cven","Len",33);
		pp[19] = new Person (20,"Qahov","Rov",32);
		pp[20] = new Person (21,"Ben","Terov",86);
		pp[21] = new Person (22,"Seen","Asertov",76);
		pp[22] = new Person (23,"Deen","Qasserman",54);
		pp[23] = new Person (24,"Joten","Gofterman",30);
		pp[24] = new Person (25,"Koten","Ren",30);
		pp[25] = new Person (26,"Veren","Malen",20);
		pp[26] = new Person (27,"Zahen","ren",40);
		pp[27] = new Person (28,"Leen","ren",50);
		pp[28] = new Person (29,"Caren","Gafen",50);
		pp[29] = new Person (30,"Ben","Tojten",80);

		toUpperCase(pp);
		//add1000(pp); 
		//changeOvToEev(pp);
		//printAll(pp);

		//printAgeMore40(pp);
		//printAge18To65(pp);
		//printAge203040(pp);
		//printEqualFLLength(pp);
		//printLnameLength6(pp); 
		//printEvenId(pp); 

		//printIfHasA(pp);
		printDuplicate(pp);


	}

	public static void printAll(Person[] pp) 
	{
		for (int i = 0; i < pp.length; i++) 
		{
			System.out.println(pp[i]);
		}
		System.out.println();
	}
	public static void printAgeMore40(Person[] pp) 
	{
		for (int i = 0; i < pp.length; i++) 
		{
			if(pp[i].age > 40)
			{
				System.out.println(pp[i]);
			}
		}
		System.out.println();
	}
	public static void printAge18To65(Person[] pp) 
	{
		for (int i = 0; i < pp.length; i++) 
		{
			if(pp[i].age > 18 && pp[i].age<65)
			{
				System.out.println(pp[i]);
			}
		}
		System.out.println();
	}

	public static void printAge203040(Person[] pp) 
	{
		for (int i = 0; i < pp.length; i++) 
		{
			if(pp[i].age == 20 || pp[i].age==30 || pp[i].age == 40)
			{
				System.out.println(pp[i]);
			}
		}
		System.out.println();
	}

	public static void printEqualFLLength(Person[] pp) 
	{
		for (int i = 0; i < pp.length; i++) 
		{
			if(pp[i].fname.length() == pp[i].lname.length())
			{
				System.out.println(pp[i]);
			}
		}
		System.out.println();
	}

	public static void printLnameLength6(Person[] pp) 
	{
		for (int i = 0; i < pp.length; i++) 
		{
			if(pp[i].lname.length() == 6)
			{
				System.out.println(pp[i]);
			}
		}
		System.out.println();
	}

	public static void printEvenId(Person[] pp) 
	{
		for (int i = 0; i < pp.length; i++) 
		{
			if(pp[i].id % 2 == 0)
			{
				System.out.println(pp[i]);
			}
		}
		System.out.println();
	}

	public static void toUpperCase(Person[] pp) 
	{
		for (int i = 0; i < pp.length; i++) 
		{
			pp[i].fname = pp[i].fname.substring(0,1).toUpperCase() + pp[i].fname.substring(1);
			pp[i].lname = pp[i].lname.substring(0,1).toUpperCase() + pp[i].lname.substring(1);
		}
	}

	public static void printIfHasA(Person[] pp) 
	{
		for (int i = 0; i < pp.length; i++) 
		{

			if(pp[i].lname.indexOf('a')>0 && pp[i].lname.indexOf('a')<pp[i].lname.length()-1)
			{
				System.out.println(pp[i]);
			}
		}
		System.out.println();
	}

	public static void printDuplicate(Person[] pp) 
	{

		for (int i = 0; i < pp.length; i++) 
		{
			for (int k = i+1; k<pp.length; k++)
			{
				if (k!=i) 
				{
					if(pp[i].lname.equals(pp[k].lname) )
					{

						System.out.println((pp[i].fname +" "+ pp[i].lname)+ " & " + (pp[k].fname + " " + pp[k].lname));

					}
				}
			}
		}
		System.out.println();
	}

	public static void add1000(Person[] pp) 
	{
		for (int i = 0; i < 10; i++) 
		{
			pp[i].id+=1000;

		}
	}
	
	public static void changeOvToEev(Person[] pp) 
	{
		for (int i = 0; i < pp.length; i++) 
		{
			if (pp[i].lname.substring(pp[i].lname.length()-2,pp[i].lname.length() ).equals("ov") )
			{
				pp[i].lname = pp[i].lname.substring(0, pp[i].lname.length()-2)+"eev";
				System.out.println(pp[i]);
			}
			if (pp[i].lname.substring(pp[i].lname.length()-3,pp[i].lname.length() ).equals("ova") )
			{
				pp[i].lname = pp[i].lname.substring(0, pp[i].lname.length()-3)+"eeva";
				System.out.println(pp[i]);
			}
		}
	}
}