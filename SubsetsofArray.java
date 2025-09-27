
//this works but just has duplicate insertions which i understood while writing it. so im gonna go with set
//import java.util.List;
//import java.util.ArrayList;
//import java.util.Arrays;
//
//class SubsetsofArray{
//
//    static void helper(String str, List<List<String>> subsets ){
//
//        if(str.length()==1){
//            return;
//        }
//
//        for(int i =0;i<str.length();i++){
//            char currentChar = str.charAt(i);
//            String newStr = str.substring(0,i)+str.substring(i+1);
//            subsets.add(Arrays.asList(newStr));
//            helper(newStr,subsets);
//        }
//    }
//
//
//    public static void main(String args[]){
//        String str = "ABCD";
//        List<List<String>> subsets = new ArrayList<>();
//        helper(str,subsets);
//        System.out.println(subsets);
//    }
//}

import java.util.List;
import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Arrays;

class SubsetsofArray{

    static void helper(String str, Set<List<String>> subsets ){

        if(str.length()==1){
            // for adding []
            subsets.add(Arrays.asList(str.substring(0,str.length()-1)));
            return;
        }

        for(int i =0;i<str.length();i++){
            char currentChar = str.charAt(i);
            String newStr = str.substring(0,i)+str.substring(i+1);
            subsets.add(Arrays.asList(newStr));
            helper(newStr,subsets);
        }
    }


    public static void main(String args[]){
        String str = "ABCD";
        Set<List<String>> subsets = new LinkedHashSet<>();
        helper(str,subsets);
        System.out.println(subsets);
    }
}