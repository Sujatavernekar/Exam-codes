import java.util.ArrayList;

import java.util.HashMap;

import java.util.List;

import java.util.Map;

import java.util.Map.Entry;





public class Ascending {



  public static void main(String[] args){



    Map<String, Integer> map = new HashMap<>();

map.put("s",1020);

map.put("u",300);

map.put("j",100);

map.put("a",500);

map.forEach((n,v)->System.out.println(n+"="+v));

   

System.out.println("After Sorting by value");

   List<Entry<String,Integer>>list=new ArrayList<>(map.entrySet());

   list.sort(Entry.comparingByValue());

   list.forEach(System.out::println);

  }

}
