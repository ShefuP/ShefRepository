package conditionalStatement;

public class IfElseStatement {
    //Arithmatic Operators= +Add -Subtracting *multification / divided %
    //Relational Operators = < less than >greater than <= less than or equal >=greater or Equal != not equal
    //logical Operator = && and ,|| or
    // ==
    int a  = 10;
    int b = 20;

    public void ifelse(){
        if(a>b){
            System.out.println("a is smaller than b");
        }
        else{
            System.out.println("a is greater than b");
        }
        if (a<=b){
            System.out.println("a less than or equal to b");
        }
        else {
            System.out.println("a greater than or equal to b");
        }

    }
    public static void main(String[] args) {
        IfElseStatement obj = new IfElseStatement();
        obj.ifelse();
    }
}
