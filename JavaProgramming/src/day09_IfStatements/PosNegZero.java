package day09_IfStatements;

public class PosNegZero {

    public static void main(String[] args) {

/*
Multi-branch if: when there are three or more option/possibilities

		if(Condition1){
			StatementA
		}else if(Condition2){
			StatementB
		}else{
			StatementC
		}

		ONLY one block gets executed

		StatementA: Condition1 MUST be true
		StatementB: Condition1 MUST be false, Condition2 MUST be true
		StatementC: Condition1 & Condition2 MUST be false
 */
        int n = -3;

        if(n>0){
            System.out.println("Positive");
        }else if(n<0) {
            System.out.println("Negative");
        }else{
            System.out.println("Zero");
        }
    }
}
// if & else statement we can NEVER apply for the tasks that requires more than two condition!!