/** Heading  **********************************************/
/*	Your name: Sarah Meyer
		Class block: 	G			Date Started: 9/22
		Lab Number: 1
		Title: Middle Earth Based Math
		Purpose: Making a base calculator for different races, blah blah.
*/

public class Lab_1{
  customMath customMath = new customMath();
  public Lab_1(){
  }

  public int convertFromBase10(int num, int base){
    int answer = 0;
    int num1 = num; //used as an intermediate stage in calculations
    int i=0;
    do {
      answer = (num1 % base)*customMath.power(10, i)+answer;
      num1 = num1/base;
      i++;
    }while(num1!=0);
    return answer;
  }

  public int convertToBase10(int num, int base){
    int answer = 0;
    for (int i=0;i<customMath.countDigits(num);i++){
      answer = answer + customMath.findDigit(num,i+1)*customMath.power(base,i);
    }
    return answer;
  }
  public int doMath(int num1, int num2, String operator){
    int answer=0;
    if (operator.equals("+")){
      answer=num1+num2;
    }else if (operator.equals("-")){
      answer=num1-num2;
    }else if (operator.equals("*")){
      answer=num1*num2;
    //}else if (operator.equals("/")){
     // answer=num1/num2;
    }else {
      System.out.print("Not a valid operator, exiting now...");
      System.exit(0);
    }
    return answer;
  }

}