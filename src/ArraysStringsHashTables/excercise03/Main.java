package ArraysStringsHashTables.excercise03;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        GroupAnagrams groupAnagrams = new GroupAnagrams();
        List<List<String>> anagrams = groupAnagrams.groupAnagrams(new String[]{"saco","arresto","programa","rastreo","caso"});
        System.out.println(anagrams);



    }

}
