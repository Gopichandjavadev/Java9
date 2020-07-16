package java9;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class FactoryMethods {

    public static void main(String[] args) {
        
        List immutableList = List.of();
        
        System.out.println(immutableList);
        
        List immutableList1 = List.of("one","two","three");
        
        System.out.println(immutableList1);
        
        Map emptyImmutableMap = Map.of();
        
        System.out.println(emptyImmutableMap);
                
        Map nonemptyImmutableMap = Map.of(1, "one", 2, "two", 3, "three");
        
        System.out.println(nonemptyImmutableMap);
        
        Set<String> immutableSet = Set.of();
        
        System.out.println(immutableSet);
        
        Set<String> immutableSet1 = Set.of("one","two","three");
        
        System.out.println(immutableSet1);

    }

}
