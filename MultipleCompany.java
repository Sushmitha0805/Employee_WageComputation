public class MultipleCompany{

  final int IS_PART_TIME=1;
  final int IS_FULL_TIME=2;
  final int IS_ABSENT=0;
  
  private final String CompanyName;
  private final int EMP_WAGE_PER_HR;
  private final int NUM_OF_WORKING_DAYS;
  private int maxhrs;
 
  public MultipleCompany(final String CompanyName , final int EMP_WAGE_PER_HR, final int NUM_OF_WORKING_DAYS,final int maxhrs)
{
        this.CompanyName=CompanyName;
        this.EMP_WAGE_PER_HR=EMP_WAGE_PER_HR;
        this. NUM_OF_WORKING_DAYS= NUM_OF_WORKING_DAYS;
        this.maxhrs=maxhrs;
}
  public String getCompanyName(){
   return CompanyName; 
   }
  public int getEMP_WAGE_PER_HR(){
    return EMP_WAGE_PER_HR;
   }
  public int getmaxhrs(){
   return maxhrs;
   }
  public int getNUM_OF_WORKING_DAYS(){ 
   return NUM_OF_WORKING_DAYS;
   }

    public int EmpWageComputation(){
         int empHrs=0;
         int Salary=0;
         int TotalWorkingDays=0;
         int TotalEmpHr=0;
        
         //Computation
           while(TotalEmpHr <= maxhrs && TotalWorkingDays < NUM_OF_WORKING_DAYS)
          {
              TotalWorkingDays++;
           	int empCheck=(int)Math.floor(Math.random()*10)%3;
			 
         switch( empCheck ){
             case IS_FULL_TIME:
				      System.out.println("Employee Is full time");
			         empHrs=8;
                   break;
     	      case IS_PART_TIME:
				       System.out.println("Employee is Part time Employee");
					     empHrs=4;
                  break;
            case  IS_ABSENT:
			           System.out.println("Employee Is Absent");
					     empHrs=0;
                    break;
             default:
                    System.out.println("invalid");
		}
           TotalEmpHr=(TotalEmpHr+empHrs);
                        System.out.println("Day:"+TotalWorkingDays+" Emp Hours:"+ empHrs);

     }
                Salary=(TotalEmpHr*EMP_WAGE_PER_HR);
                 return Salary;                
 }

  public static void main(String args[]) {

              MultipleCompany AXISEmp= new MultipleCompany("AXIS", 25, 25, 100);
              int AXISWages=AXISEmp.EmpWageComputation();
                System.out.println("Axis Employee salary: "+AXISWages);

              MultipleCompany SBIEmp= new MultipleCompany("SBI", 25, 25, 100);
              int SBIWages=SBIEmp.EmpWageComputation();
                System.out.println("SBI Employee salary: "+SBIWages);
      }


}
