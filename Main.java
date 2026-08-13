import java.util.*;
public class Main{
    public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    List<String> fruitsList= new ArrayList<>();
    Set<String> fruitsSet = new HashSet<>();
    Map<String, Integer> fruitsMap = new HashMap<>();

    int choice;
    do{
        
        System.out.println("\n--- Collections Menu ---");
            System.out.println("1. Add fruit");
            System.out.println("2. Remove fruit");
            System.out.println("3. Show list");
            System.out.println("4. Show set");
            System.out.println("5. Show Map (counts)");
            System.out.println("6. Exit");
            System.out.println("Enter choice:  ");
            choice=sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.print("Enter fruit name to add: ");
                    String fruitToAdd=sc.nextLine();
                    fruitsList.add(fruitToAdd);
                    fruitsSet.add(fruitToAdd);
                    fruitsMap.put(fruitToAdd, fruitsMap.getOrDefault(fruitToAdd, 0)+1);
                    System.out.println(fruitToAdd+" added.");
                    break;
                case 2:
                    System.out.print("Enter fruit name to remove: ");
                    String fruitToRemove=sc.nextLine();
                    fruitsList.remove(fruitToRemove);
                    fruitsSet.remove(fruitToRemove);
                    if(fruitsMap.containsKey(fruitToRemove)){
                        int count=fruitsMap.get(fruitToRemove);
                        if(count>1){
                            fruitsMap.put(fruitToRemove, count-1);
                        } else {
                            fruitsMap.remove(fruitToRemove);
                        }
                    }
                System.out.println(fruitToRemove+" removed");
                    break;

                case 3:
                    System.out.println("Fruits list: "+fruitsList);
                    break;
                case 4:
                    System.out.println("Fruits set: "+fruitsSet);
                    break;
                case 5:
                    System.out.println("Fruits Map: "+fruitsMap);
                    break;
                case 6:
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid choice.Try again.");
                    break;
            }
    }while(choice!=6);
    sc.close();
    }

}