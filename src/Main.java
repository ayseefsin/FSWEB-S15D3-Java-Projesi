import java.sql.SQLOutput;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Employee e1 = new Employee(1,"aysin","zeus");
        Employee e2 = new Employee(1,"merve","derin");
        Employee e3 = new Employee(2,"aysin","derya");
        Employee e4 = new Employee(3,"mehmet","deniz");
        Employee e5 = new Employee(4,"aysin","zeus");
        Employee e6 = new Employee(4,"aysin","zeus");
        Employee e7 = new Employee(5,"aysin","zeus");
        Employee e8 = new Employee(6,"aysin","zeus");
        LinkedList<Employee> initialEmployeeList = new LinkedList<>();
        initialEmployeeList.add(e1);
        initialEmployeeList.add(e2);
        initialEmployeeList.add(e3);
        initialEmployeeList.add(e4);
        initialEmployeeList.add(e5);
        initialEmployeeList.add(e6);
        initialEmployeeList.add(e7);
        initialEmployeeList.add(e8);
        Set<Employee> nonRepeatList= new HashSet<>(initialEmployeeList);
        System.out.println("initial list: " + initialEmployeeList);
        System.out.println("nonRepeat list" + nonRepeatList);
        System.out.println("**************************");
        String string = new String();
        string= "When the offensive resumed, the Turks received their first victory when the Greeks encountered stiff" +
                " resistance in the battles of First and Second İnönü," +
                " due to İsmet Pasha's organization of an irregular militia into a regular army. " +
                " The two victories led to Allied proposals to amend the Treaty of Sèvres where both Ankara " +
                "and Istanbul were represented, but Greece refused." +
                " With the conclusion of the Southern and Eastern fronts, Ankara was able to concentrate more " +
                "forces on the West against the Greeks." + " They also began to receive support from Soviet Union, " +
                "as well as France and Italy, who sought to check British influence in the Near East.\n" +
                " June–July 1921 saw heavy fighting in the Battle of Kütahya-Eskişehir. " +
                "While it was an eventual Greek victory, the Turkish army withdrew in good order to the Sakarya river, " +
                "their last line of defence." + " Mustafa Kemal Pasha replaced İsmet Pasha after the defeat as commander" +
                " in chief as well as his political duties." + " The decision was made in the Greek military command to " +
                "march on the nationalist capital of Ankara to force Mustafa Kemal to the negotiating table." +
                " For 21 days, the Turks and Greeks fought a pitched battle at the Sakarya river, " +
                "which ended in Greek withdrawal." + " Almost of year of stalemate without much fighting followed, " +
                "during which Greek moral and discipline faltered while Turkish strength increased." +
                " French and Italian forces evacuated from Anatolia. The Allies offered an armistice to the Turks, " +
                "which Mustafa Kemal refused.";

        String cleanString =  string.replaceAll("[,.]","");
        //System.out.println("cleanstring: " + cleanString);
        String[] words = cleanString.split("\s+");
        System.out.println(Arrays.toString(words));
        Map<String, Integer> wordsMap = new HashMap<>();
        for(String word: words){
            if(wordsMap.containsKey(word)){
                int counter = wordsMap.get(word);
                wordsMap.put(word, ++counter);

            }else{
                wordsMap.put(word, 1);
            }
        }
        printMap(wordsMap);

    }

    private static void printMap(Map<String , Integer> wordsMap) {
            for(Map.Entry entry : wordsMap.entrySet()){
            System.out.println("word: " + entry.getKey() + " count: " + entry.getValue());
            }
    }


}