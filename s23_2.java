import java.util.ArrayList;
import java.util.Iterator; 
import java.util.ListIterator; 
public class StudentNames { 
public static void main(String[] args) { 
ArrayList<String> studentNames = new ArrayList<>(); 
ArrayList 
for (int i = 0; i < args.length; i++) { 
studentNames.add(args[i]); 
}  
System.out.println("Student names using Iterator:"); 
Iterator<String> iterator = studentNames.iterator(); 
while (iterator.hasNext()) { 
System.out.println(iterator.next()); 
}  
System.out.println("\nStudent names using ListIterator:"); 
ListIterator<String> listIterator = studentNames.listIterator(); 
while (listIterator.hasNext()) { 
System.out.println(listIterator.next()); 
} 
} 
}
