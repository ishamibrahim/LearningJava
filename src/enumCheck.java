class Priority{
    enum PriorityType{CRITICAL, BLOCKER, NEGLIGIBLE, OPTIONAL}
    PriorityType priorityType;
}

public class enumCheck {
    public static void main(String[] args){
        Priority attention = new Priority();
        attention.priorityType = Priority.PriorityType.BLOCKER;

        System.out.println("Current priority is : " + attention.priorityType );
    }

}
