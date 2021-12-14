package com.marinagaisina;

import com.marinagaisina.interImp.ComparatorImpl;
import com.marinagaisina.interImp.MyFunctionalInterface;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {
//        MyFunctionalInterface msg = () -> {
//            return "Hello Java";
//        };
//        System.out.println(msg.hello());
       ComparatorImpl reverse = (str) -> {
            StringBuilder sub_str = new StringBuilder();
            for (int i = str.length()-1; i>= 0; i--) {
                sub_str.append(str.charAt(i));
            }
            return sub_str.toString();
        };
        System.out.println(reverse.comparator("Hello Java"));

        MyFunctionalInterface byFive = (num) -> num+5;
        System.out.println(byFive.incrementByFive(22));
        //int byFiveFunc = (int a) -> a = a + 1;

       // ArrayList.forEach(function ()=> {});
        ComparatorImpl normal_noSpace = (str) -> {
            String result = "";
            for (int i=0; i< str.length(); i++) {
                String  s = Character.toString(str.charAt(i));
                if(!s.equals(" ")) {
                    result+=s;
                }
            }
            return result;
        };
        System.out.println(normal_noSpace.comparator("Hello Java"));

        List<String> myList = Arrays.asList("a1", "a2", "a3", "b1");
        myList.stream()
                .filter(s -> s.contains("a"))
                .forEach(System.out::println);
       // List<>
        Student s1 = new Student("Rajeev", 101);
        Student s2 = new Student("Daniel", 201);
        Student s3 = new Student("Greg", 301);

        List<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.stream()
                .filter(s -> s.studentName.equals("Rajeev"))
                .forEach(a -> System.out.println(a.studentName));
        Function<Integer, String> f = i -> i*i + "";
        System.out.println(f.apply(8));
    }
}
