import java.util.*;

class todolist {
    static ArrayList<String> tasks = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice;

        while(true) {
            System.out.println("\n--- TO-DO LIST ---");
            System.out.println("1. add task");
            System.out.println("2. view tasks");
            System.out.println("3. remove task");
            System.out.println("4. exit");
            System.out.print("enter choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:
                    System.out.print("enter task: ");
                    String task = sc.nextLine();
                    tasks.add(task);
                    System.out.println("task added.");
                    break;

                case 2:
                    System.out.println("\nyour tasks:");
                    if(tasks.isEmpty()) {
                        System.out.println("no tasks.");
                    } else {
                        for(int i=0; i<tasks.size(); i++) {
                            System.out.println((i+1) + ". " + tasks.get(i));
                        }
                    }
                    break;

                case 3:
                    System.out.print("enter task number to remove: ");
                    int num = sc.nextInt();
                    if(num>0 && num<=tasks.size()) {
                        tasks.remove(num-1);
                        System.out.println("task removed.");
                    } else {
                        System.out.println("invalid number.");
                    }
                    break;

                case 4:
                    System.out.println("goodbye!");
                    System.exit(0);

                default:
                    System.out.println("invalid choice.");
            }
        }
    }
}
