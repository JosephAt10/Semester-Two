public class ExcuseLetter17 
{
    String id;
    String name;
    String className;
    char typeOfExcuse;
    int duration;

    ExcuseLetter17(String id, String name, String className, char typeOfExcuse, int duration)
    {
        this.id = id;
        this.name = name;
        this.className = className;
        this. typeOfExcuse = typeOfExcuse;
        this.duration = duration;
    }
    void display()
    {
            System.out.printf("%-8s %-8s %-12s %-6c %-8d\n", id, name, className, typeOfExcuse, duration);
        }
        
    }

