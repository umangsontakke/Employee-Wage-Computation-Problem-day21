public class ParttimeEmpWage
{
        public static void main(String[] arg)
        {
                  //Constants
                int IS_PART_TIME=1;
                int IS_FULL_TIME=2;
                int EMP_RATE_PER_HOUR=20;
                        //Variables
                int empHrs=0;
                int empWage=0;
                        //Computation
                int empCheck=(Math.random()*10)%2;
                if(empCheck==IS_PART_TIME)
                empHrs=4;
                else if(empCheck==IS_FULL_TIME)
                empHrs=8;
                else
