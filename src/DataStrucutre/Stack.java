package DataStrucutre;

public class Stack {
    static int counterIndex = 0;
    public static void main(String args[]){
        int[] stack = new int[]{-1,-1,-1,-1,-1};
        isEmpty(stack);
        push(stack,2);
        isEmpty(stack);
        push(stack,3);
        peek(stack);
       // pop(stack);
        printStack(stack);

    }
    public static int[] push(int[] stack, int value){
        if(counterIndex == 0){
            stack[0] = value;
            counterIndex++;
        }
        else if(counterIndex >= stack.length){
            System.out.println("StackOverFlow Exception");
        }
        else{
            for(int i = stack.length-1 ; i >= 0 ; i--){
                if(stack[i] != -1){
                    stack[i+1] = stack[i];
                }
            }
            stack[0] = value;
            counterIndex++;
        }
        System.out.println("index "+counterIndex);
        return stack;
    }

    public static void printStack(int[] stack){
        for(int i = 0 ; i < stack.length ; i++){
            System.out.print(stack[i]+" ");
        }
    }
    public static int[] pop(int[] stack){
        int popValue = stack[0];
        for(int i = 1; i < stack.length ; i++){
            stack[i-1] = stack[i];
        }
        stack[stack.length-1] = -1;
        System.out.println("Value Pop "+popValue );
        return stack;
    }
    public static int peek(int[] stack){
        if(stack[0] == -1){
            return -1;
        }
        else{
            System.out.println("Value at peek: "+stack[0]);
            return stack[0];
        }
    }
    public static boolean isEmpty(int[] stack){
        boolean isEmpty = true;
        if(stack[0] != -1){
            isEmpty = false;
        }
        System.out.println(isEmpty);
        return isEmpty;
    }

}
