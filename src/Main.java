// Kapasov Amir
// SE-2502
// Assigment 2

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        // 1. Organizing
        List<EducationEntity> pool = new ArrayList<>();

        pool.add(new Student("Alice", 20, 3.8f));
        pool.add(new Student("Bob", 22, 2.5f));
        pool.add(new Teacher("Dr. Smith", 10, "Physics"));
        pool.add(new Teacher("Mr. Jones", 3, "Math"));
        pool.add(new Institution("MIT", "Cambridge", 160, null, null));
        pool.add(new Institution("Tech High", "Local St", 5, null, null));

        System.out.println("--- All Entities in Pool ---");
        pool.forEach(EducationEntity::info);

        // 2. Filtering 
        System.out.println("\n--- Filtering: Students with GPA > 3.0 ---");
        List<EducationEntity> highAchievers = pool.stream()
                .filter(e -> e instanceof Student)
                .map(e -> (Student) e)
                .filter(s -> s.getGpa() > 3.0f)
                .collect(Collectors.toList());
        highAchievers.forEach(EducationEntity::info);

        // 3. Searching
        String searchName = "MIT";
        System.out.println("\n--- Searching: Finding '" + searchName + "' ---");
        pool.stream()
                .filter(e -> e.getName().equalsIgnoreCase(searchName))
                .findFirst()
                .ifPresentOrElse(EducationEntity::info, 
                    () -> System.out.println("Not found"));

        // 4. Sorting 
        System.out.println("\n--- Sorting: By Name (A-Z) ---");
        List<EducationEntity> sortedList = pool.stream()
                .sorted(Comparator.comparing(EducationEntity::getName))
                .collect(Collectors.toList());
        sortedList.forEach(EducationEntity::info);
    }
}
