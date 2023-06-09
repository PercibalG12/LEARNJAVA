# Display Variables
- The println() method is often used to display variables.

- To combine both text and a variable, use the + character:
- This is also known as `concatenation`

```java
public class Main{
    public static void main (String[] args){
        String name = "John";
        System.out.println("Hello " + name);
    }
}
```
- You can also use the + character to add a variable to another variable:

```java
public class Main{
    public static void main (String[] args){
        String firstName = "John ";
        String lastName = "Doe";
        String fullName = firstName + lastName;
        System.out.println(fullName);
    }
}
```
- For numeric values, the + character works as a mathematical operator (notice that we use int (integer) variables here):

```java
public class Main{
    public static void main (String[] args){
        int x = 5;
        int y = 6;
        System.out.println(x + y); // Print the value of x + y
    }
}
```

