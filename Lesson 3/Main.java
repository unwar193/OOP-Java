
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
        List<Notebook> list = new ArrayList<>();
        list.add(new Notebook(35000.0, 2));
        list.add(new Notebook(40000.0, 4));
        list.add(new Notebook(45000.0, 8));
        list.add(new Notebook(40000.0, 2));
        list.add(new Notebook(45000.0, 4));
        list.add(new Notebook(50000.0, 8));
        list.add(new Notebook(50000.0, 2));
        list.add(new Notebook(70000.0, 4));
        list.add(new Notebook(75000.0, 8));

        Scanner scan = new Scanner(System.in);
        
        System.out.print("Список всех ноутбуков:\n");
        for (Notebook n : list) {
            System.out.println("цена: " + n.getPrice() + "\tпамять: " + n.getRam());
        }
        
        boolean start = true;
        while (start) {

            System.out.println();
            System.out.println("Выберите параметр:");
            System.out.println("1. по цене");
            System.out.println("2. по памяти");
            System.out.println("3. по памяти и цене");
            System.out.println("4. выход");
            System.out.print("Введите значение: ");
            String SortNotebook = scan.nextLine().toLowerCase();
                
            if(SortNotebook.equals("1")){
                list.sort(Comparator.comparingDouble(Notebook::getPrice));
                System.out.println("\nСортировка по цене: ");
                for (Notebook n : list) {
                    System.out.println("цена: " + n.getPrice() + "\tпамять: " + n.getRam());
                }
                boolean YesNoStart = true;
                while (YesNoStart) {                     
                    System.out.println("\nПродолжить выбор?");
                    System.out.println("1. Да");
                    System.out.println("2. Нет");
                    System.out.print("Введите значение: ");                    
                    String YesNo = scan.nextLine().toLowerCase();
                    if(YesNo.equals("1")){
                        YesNoStart = false;                                                                        
                    }
                    else if(YesNo.equals("2")){
                        YesNoStart = false;
                        start = false;                         
                    }
                    else{
                        System.out.println("Введено некорректное значение!");                        
                        continue;                        
                    }                                        
                }               
            }
            else if(SortNotebook.equals("2")){
                list.sort(Comparator.comparingInt(Notebook::getRam));
                System.out.println("\nСортировка по памяти: ");
                for (Notebook n : list) {
                    System.out.println("цена: " + n.getPrice() + "\tпамять: " + n.getRam());
                }
                
                boolean YesNoStart = true;
                while (YesNoStart) {                     
                    System.out.println("\nПродолжить выбор?");
                    System.out.println("1. Да");
                    System.out.println("2. Нет");
                    System.out.print("Введите значение: ");                    
                    String YesNo = scan.nextLine().toLowerCase();
                    if(YesNo.equals("1")){
                        YesNoStart = false;                                                                        
                    }
                    else if(YesNo.equals("2")){
                        YesNoStart = false;
                        start = false;                         
                    }
                    else{
                        System.out.println("Введено некорректное значение!");                        
                        continue;                        
                    }                                        
                }                
            }

            else if(SortNotebook.equals("3")){
                list.sort(Comparator.comparingInt(Notebook::getRam).thenComparing(Notebook::getPrice));
                System.out.println("\nСортировка сначала по памяти, потом по цене: ");
                for (Notebook n : list) {
                    System.out.println("цена: " + n.getPrice() + "\tпамять: " + n.getRam());
                }
                
                boolean YesNoStart = true;
                while (YesNoStart) {                     
                    System.out.println("\nПродолжить выбор?");
                    System.out.println("1. Да");
                    System.out.println("2. Нет");
                    System.out.print("Введите значение: ");                    
                    String YesNo = scan.nextLine().toLowerCase();
                    if(YesNo.equals("1")){
                        YesNoStart = false;                                                                        
                    }
                    else if(YesNo.equals("2")){
                        YesNoStart = false;
                        start = false;                         
                    }
                    else{
                        System.out.println("Введено некорректное значение!");                        
                        continue;                        
                    }                                        
                }
            }
            
            else if(SortNotebook.equals("4")){
                start = false;
            }

            else{
                System.out.println("Введено некорректное значение!");                
                continue;     
            }
        }
    }
}
