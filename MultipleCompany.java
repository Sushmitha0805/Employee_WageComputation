public class MultipleCompany1{

  public static final int IS_PART_TIME=1;
  public static final int IS_FULL_TIME=2;
  public static final int IS_ABSENT=0;

  private final String company;
  private final int empRatePerHour;
  private final int numOfWorkingDays;
  private final int maxHoursPerMonth;
  private int totalEmpWage;

  public MultipleCompany1(String company, int empRatePerHour, int numOfWorkingDays,int maxHoursPerMonth){
   this.company=company;
   this.empRatePerHour=empRatePerHour;
   this.numOfWorkingDays=numOfWorkingDays;
   this.maxHoursPerMonth=maxHoursPerMonth;
 }



      private int computeEmpWage(){
     //variables
     int empHrs=0;
     int totalEmpHrs=0;
     int totalWorkingDays=0;
     //computation
     while(totalEmpHrs<=maxHoursPerMonth && totalWorkingDays  < numOfWorkingDays){
        int empCheck=(int)Math.floor(Math.random()*10)%3;
        switch(empCheck){
           case IS_PART_TIME:
              empHrs=4;
              break;
           case IS_FULL_TIME:
              empHrs=8;
              break;
           case IS_ABSENT:
              empHrs=0;
              break;
           default:
                       System.out.println("invalid");
                         System.out.println("invalid");
        }
        totalEmpHrs+=empHrs;
        System.out.println("Day#: " +totalWorkingDays + "EmpHr:" +empHrs);
     }
      totalEmpWage=totalEmpHrs*empRatePerHour;
     System.out.println("Total Emp Wage for comapny: " +company+ " is:" +totalEmpWage);
      return totalEmpWage;
 }
  //override
  public String toString(){
     return "Total Emp Wage for Company : " +company+ "is:" +totalEmpWage;
     }

   public static void main(String[] args){
        MultipleCompany1 DMART = new MultipleCompany1 ("DMART",20,20,100);
        MultipleCompany1 SBI = new MultipleCompany1 ("SBI",10,10,220);
        DMART.computeEmpWage( );
        System.out.println(DMART);
        SBI.computeEmpWage( );
        System.out.println(SBI);
    }

}


