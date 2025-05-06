public class StudentAssignmentStack17 
{
    Student17[] stack;
    int top, size;

    public StudentAssignmentStack17(int size)
    {
        this.size = size;
        top = -1;
        stack = new Student17[size];
    }
    public boolean isFull()
    {
        if (top == size-1)
        {
            return true;
        }else 
        {
            return false;
        }
    }
    public boolean isEmpty()
    {
        if (top == -1)
        {
            return true;
        }else
        {
            return false;
        }
    }
    void push(Student17 std)
    {
        if (!isFull())
        {
            top++;
            stack[top] = std;
            
        }else
        {
            System.out.println("Stack is already full!!");
        }
    }
    Student17 pop()
    {
        if (!isEmpty())
        {
            Student17 std = stack[top];
            top--;
            return std;     
        }else
        {
            System.out.println("There is no data in stack!!");
            return null;
        }
    }
    Student17 peek()
    {
        if (!isEmpty())
        {
            return stack[top];  
        }else
        {
            System.out.println("There is no data in stack!!");
            return null;
        }
    }
    void print()
    {
        {
                for(int i = 0; i <= top; i++) {
                    System.out.println(stack[i].nim + "\t" + stack[i].name + "\t" + stack[i].className);
                }
            }
        
        System.out.println();
    }
    String convertToBinary(int grade)
    {
        ConverionStack17 stack = new ConverionStack17();
        while (grade > 0)
        {
            int mod = grade % 2;
            stack.push(mod);
            grade = grade / 2;
        }
        String binary = "";
        while (!stack.isEmpty())
        {
            binary += stack.pop();
        }
        return binary;   //exp2 modification
    }
    public Student17 peekBottom() {
        if (!isEmpty()) {
            return stack[0];
        }
        return null;   //qn5 modification
    }
    public int countAssignments() {
        return top + 1; //qn6 modification
    }
    
}
