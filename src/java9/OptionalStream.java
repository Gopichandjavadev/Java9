package java9;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalStream {

    public static void main(String[] args) {
        
     // given
        Optional<String> value = Optional.of("a");
     
        // when
        List<String> collect = value.stream().map(String::toUpperCase).collect(Collectors.toList());
     
        System.out.println(collect);
       
    }
}
