public class EmpWageBuilder
{

   public static final int IS_PART_TIME=1;
  public static final int IS_FULL_TIME=2;
   public static final int EMP_WAGE_PER_HR=20;
  public static final int NUM_OF_WORKING_DAYS=20;

	public static void main(String[] args)
	{
  
       
		 	//Constants
         int empHrs=0;
         int Salary=0;
         //Computation
      	int empCheck=(int)Math.floor(Math.random()*10)%3;
			 
         switch( empCheck ){
             case IS_FULL_TIME:
				      System.out.println("Employee Is full time");
			         Salary = EMP_WAGE_PER_HR * empHrs;
                   empHrs=8;
				      System.out.println("Salary="+Salary);
                   break;
     	      case IS_PART_TIME:
				       System.out.println("Employee is Part time Employee");
					     empHrs=4;
					    Salary = EMP_WAGE_PER_HR * empHrs;
                   System.out.println("Salary = " +Salary);
                  break;
            default:
			           System.out.println("Employee Is Absent");
					     empHrs=0;
			   	     Salary = EMP_WAGE_PER_HR * empHrs;
			           System.out.println("Salary = " +Salary);
                    break;
		}

	}
}

