
public class menu{
  getInput getInput = new getInput();
  Lab_1 mathStuff = new Lab_1();
  customMath customMath = new customMath();

  public menu(){
    String choice;
    int num1;
    int num2;
    String operator;
    int base=10;
    int answer;
    for (int i=1; i<=6; i++){
      System.out.print("\nInput "+i+":");
      choice=getInput.stringSample("\n");
      if (choice.equals("human")){
        base=10;
      }else if(choice.equals("elf")){
        base=7;
      }else if(choice.equals("dwarf")){
        base=4;
      }else if(choice.equals("wizard")){
        base=3;
      }else {
        System.out.print("\n"+choice+" is not a valid race, exiting now...");
        System.exit(0);
      }
      num1=getInput.integerSample("");
      num2=getInput.integerSample("");
      operator=getInput.stringLineSample("");
      
      System.out.print("Output "+i+":\n");
      System.out.print(""+num1+"\n");
      System.out.print(""+operator+num2+"\n");

      //TO DO: Convert answer back to base of choice
      answer=mathStuff.doMath(mathStuff.convertToBase10(num1, base), mathStuff.convertToBase10(num2, base), operator);

      for (int x=0;x<customMath.countDigits(answer);x++){
        System.out.print("-");
      }
      System.out.println("");
      System.out.print(answer);
      System.out.println("");
    }
  }
}