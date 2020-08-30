public class EmpWageBuilder{
  private int noOFCompany=0;
  private Company[]companies;
}

 public EmpWageBuilder(){ 
 companies= new Comapny[3];
 }
  public static void main(String[]args){
   final EmpWageBuilder empBuilder=new EmpWageBuilder();
   empBuilder.addCompany("SBI",20,20,100);
   empBuilder.addCompany("AXIS",10,20,100);
    empBuilder.addCompany("UCO",30,20,100);
   empBuilder.computeEmpWage();
  }
 
  public void addCompany(final String CompanyName , final int EMP_WAGE_PER_HR, final int NUM_OF_WORKING_DAYS,final int maxhrs){
    Companies[0]=new Company("SBI",20,20,100);
    Companies[1]=new Company("AXIS",20,20,100);
    Companies[2]=new Company("UCO",20,20,100);
    noOfCompany++;
  }

  private void computeEmpWage(){
  for(int i=0;i<noOfCompany;i++){
  final int totalWage=computeEmpWage(companies[i]);
  System.out.println(companies[i]);
  }
 
public int EmpWageComputation(){
         int empHrs=0;
         int Salary=0;
         int TotalWorkingDays=0;
         int TotalEmpHr=0;
        
         //Computation
           while(TotalEmpHr < company.getmaxhrs && TotalWorkingDays < company.getNUM_OF_WORKING_DAYS)
          {
              TotalWorkingDays++;
              final int empHrs=getempHrs();
              final int EMP_WAGE_PER_HR=getEMP_WAGE_PER_HR();
              TotalEmpHr+=empHrs;
              Salary=(TotalEmpHr*EMP_WAGE_PER_HR);
 
			 }
           return Salary;

}
   public int getempHrs(){
         final int IS_PART_TIME=2;
         final int IS_FULL_TIME=1;
         final int IS_ABSENT=0; 
         int empHrs=0;
         final int empCheck=Math.floor(Math.random()*10)%3;
          switch((int)empCheck ){
             case IS_FULL_TIME:
				      System.out.println("Employee Is full time");
			         empHrs=8;
                  break;
     	      case IS_PART_TIME:
				       System.out.println("Employee is Part time Employee");
					     empHrs=4;
                  break;
            case IS_ABSENT:
			           System.out.println("Employee Is Absent");
					     empHrs=0;
                    break;
             default:
                    System.out.println("invalid");
                    break;
		}
           
                     
                return empHrs;
 
}
class Company {

	private String name;
	private int EMP_WAGE_PER_HR;
	private int NUM_OF_WORKING_DAYS;
	private int maxhrs;
	private int Salary;

	public Company(final String CompanyName, final int EMP_WAGE_PER_HR, final int NUM_OF_WORKING_DAYS, final int maxhrs){
		this.CompanyName = CompanyName;
		this.EMP_WAGE_PER_HR = EMP_WAGE_PER_HR;
		this.NUM_OF_WORKING_DAYS = NUM_OF_WORKING_DAYS;
		this.maxhrs = maxhrs;
	}
  
	public String getCompanyName(){
		return this.Companyname;
	}

	public int getEMPWAGE_PER_HR(){ 
   return this.EMP_WAGE_PER_HR;
	}

	public int getNUM_OF_WORKING_DAYS(){
		return this.NUM_OF_WORKING_DAYS;
	}

	public int getmaxhrs(){
		return this.maxhrs;
	}

	public void setSalary(final int Salary){
		this.totalSalary=Salary;
	}

	@Override
	public String toString(){
		return "Total emp wage for company: "+CompanyName+" is "+ Salary;
	}

}
