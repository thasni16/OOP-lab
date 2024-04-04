import java.util.*;
class ArrayLt
{
    public static void main(String args[])
    {
       ArrayList<String>obj=new ArrayList<String>();
       obj.add("one");
       obj.add("Three");
       obj.add("Four");
       obj.add("Five");
       obj.add(1,"Two");
       System.out.println("\nArrayList after add operation:");
       for(String str:obj)
       System.out.println(str);
       obj.remove("Five");
       obj.remove(3);
       System.out.println("\n ArrayList after remove operation:");
       for(String str:obj)
       System.out.println(str);
       System.out.println("\n Final ArrayList:");
       for(String str:obj)
       System.out.println(str);
       Collections.sort(obj);
       System.out.println("\n ArrayList after sorting:");
       for(String str:obj)
       System.out.println(str);
       System.out.println("\n object at index 2:"+obj.get(2));
       System.out.println("\n Six is in the ArrayList:"+obj.contains("six"));
       System.out.println("\n Two is in the ArrayList:"+obj.contains("Two"));
       System.out.println("\n size of the ArrayList:"+obj.size());
       obj.clear();
       System.out.println("\nArrayList after clear method:"+obj);
    }
}
