public class EmpWageBuilderUC3 {
	
	   //class members(constant)
   	      public static void main(String[] args) {
    	  int IS_FULL_TIME = 1;
    	  int IS_PART_TIME = 2;
    	  int EMP_RATE_PER_HOUR = 20;
    	
    	//class variables(constant)
    	   int empHours = 0;
    	   int empWage =0;
    	
    	//computation
    	double empCheck = Math.floor(Math.random()*10 %2);
    	   if(empCheck == IS_FULL_TIME)
    		empHours = 8;
    	   else if(empCheck == IS_PART_TIME );
    	     empHours = 4;
    	empWage = EMP_RATE_PER_HOUR * empHours;
    	System.out.println("Employee Wage:"+empWage);
    	}
}
