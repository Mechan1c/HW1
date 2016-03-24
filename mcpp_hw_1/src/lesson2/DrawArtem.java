package lesson2;

public class DrawArtem
{

	public static void main(String[] args)
	{
		tria1();
		tria2();
		tria3();
		tria4();
		tria5();
		tria6();
		tria7();
		tria8();
			
	}

		public static void tria1() 
		 {
		  for(int i = 4; i <= 7; i++)
		  {
		   for(int j = 1; j <= 7; j++)
		   {
		    if(i == 7 || i + j == 8 || i == j)
		    {
		     System.out.print("*");
		    }
		    else
		    {
		     System.out.print(" ");
		    }
		   }
		   
		   System.out.println(" ");
		  }
		 }





		 public static void tria2() 
		 {
		  for(int i = 1; i <= 7; i++)
		  {
		   for(int j = 1; j <= 4; j++)
		   {
		    if(j == 1|| i == j || i + j == 8)
		    {
		     System.out.print("*");
		    }
		    else
		    {
		     System.out.print(" ");
		    }
		   }

		   System.out.println(" ");
		  }
		 }




		public static void tria3() 
		 {
		  for(int i = 1; i <= 7; i++)
		  {
		   for(int j = 4; j <= 7; j++)
		   {
		    if(j == 7 || i + j == 8 || j == i)
		    {
		     System.out.print("*");
		    }
		    else
		    {
		     System.out.print(" ");
		    }
		   }

		   System.out.println(" ");
		  }
		 }






		public static void tria4() 
		 {
		  for(int i = 1; i <= 4; i++)
		  {
		   for(int j = 1; j <= 7; j++)
		   {
		    if(i == 1 || i == j || i + j == 8)
		    {
		     System.out.print("*");
		    }
		    else
		    {
		     System.out.print(" ");
		    }
		   }

		   System.out.println(" ");
		  }
		 }








		//Целый

		public static void tria5() 
		 {
		  for(int i = 1; i <= 7; i++)
		  {
		   for(int j = 1; j <= 7; j++)
		   {
		    if(i == 7 || j == 1 || i == j)
		    {
		     System.out.print("*");
		    }
		    else
		    {
		     System.out.print(" ");
		    }
		   }

		   System.out.println(" ");
		  }
		 }





		public static void tria6() 
		 {
		  for(int i = 1; i <= 7; i++)
		  {
		   for(int j = 1; j <= 7; j++)
		   {
		    if(i == 1 || j == 1 || i + j == 8)
		    {
		     System.out.print("*");
		    }

		    else
		    {
		     System.out.print(" ");
		    }
		   }

		   System.out.println(" ");
		  }
		 }



		public static void tria7() 
		 {
		  for(int i = 1; i <= 7; i++)
		  {
		   for(int j = 1; j <= 7; j++)
		   {
		    if(i == 7 || j == 7 || i + j == 8)
		    {
		     System.out.print("*");
		    }
		    else
		    {
		     System.out.print(" ");
		    }
		   }

		   System.out.println(" ");
		  }
		 }



		public static void tria8() 
		 {
		  for(int i = 1; i <= 7; i++)
		  {
		   for(int j = 1; j <= 7; j++)
		   {
		    if(i == 1 || j == 7 || j == i)
		    {
		     System.out.print("*");
		    }
		    else
		    {
		     System.out.print(" ");
		    }
		   }

		   System.out.println(" ");
		  }
		 }
	

}
