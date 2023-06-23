# String Concatenation
- The + operator can be used between strings to combine them. This is called concatenation:

```java
public class Main{
    public static void main(Sting[] args){
        String firstName = "John";
        String lastName = "Doe";
        System.out.println(firstName + " " + lastName);
    }
}
```
> Note that we have added an empty text (" ") to create a space between firstName and lastName on print.
>
>>You can also use the concat() method to concatenate two strings:

```java
public class Main{
    public static void main(Sting[] args){
        String firstName = "John ";
        String lastName = "Doe";
        System.out.println(firstName.concat(lastName));
    }
}
```

# Java Numbers and Strings

- If you add a number and a string, the result will be a string concatenation:
```java
public class Main{
    public static void main(Sting[] args){
        String x = "10";
        int y = 20;
        String z = x + y;  // z will be 1020 (a String)
    }
}
```
