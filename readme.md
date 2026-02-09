
# Strings
String s1 = new String("Hello");

1️⃣ "Hello" is first checked in String Constant Pool (SCP)
If not present → it is created in SCP

2️⃣ new String("Hello")
Creates another new object in heap memory

So now there are two objects:
One in String Pool
One in Heap (created by new)

✔ new keyword creates object in heap memory
✔ It does NOT reuse existing string pool object
✔ It consumes more memory
✔ Mostly avoided in real projects

When a String is created using the new keyword, Java creates a new object in heap memory even if the same value already exists in the String Constant Pool. Therefore, it always creates a separate object and consumes additional memory.

# StringBuilder

StringBuilder is a mutable class in Java used to modify strings without creating new objects. It was introduced to improve performance and reduce memory usage when multiple string modifications are required.

🔥 Why was StringBuilder needed?

Because...
👉 String is immutable
Every time you modify a String:

String s = "Hello";
s = s + " World";

Java creates a new object.
If you do this 1000 times:
1000 new objects
Wasted memory
Slower performance
Each step creates a new object.

🔥 Solution → StringBuilder

StringBuilder is mutable.
That means:
👉 It changes the same object
👉 No new object is created each time

🔹 Example
StringBuilder sb = new StringBuilder("Hello");
sb.append(" World");
System.out.println(sb);


Output:
Hello World


Here:
No new object created
Same object modified
Much faster ✅
More memory efficient ✅

🔹 Common StringBuilder Methods
append()
insert()
delete()
reverse()
replace()


🔥 When to Use StringBuilder?
✔ When you are doing many string modifications
✔ In loops
✔ In competitive programming
✔ Building large strings

# Strings vs Char[] array

1️⃣ String
String s = "Hello";

It is a class (object)
It is immutable
Stored in String Constant Pool (if literal)
Has many built-in methods

2️⃣ char Array
char[] arr = {'H','e','l','l','o'};

It is an array of primitive char
It is mutable
Stored in heap memory
No built-in string methods


🔥 Why char[] is Preferred for Passwords?

Because:
String stays in memory (String Pool) until garbage collected
You cannot modify it
It may remain in memory longer

But char[]:
You can overwrite values manually
More secure

Example:

char[] password = {'1','2','3','4'};
Arrays.fill(password, '0');   // erase it

🔥 Performance
For heavy modifications:
Use StringBuilder
Not String
Not char[] for text processing


String is an immutable class that represents a sequence of characters, while a char array is a mutable array of characters. Strings provide built-in methods and are stored in the String Constant Pool, whereas char arrays are stored in heap memory and can be modified directly.


# equals vs ==

if (s1 == s2)
👉 == compares memory reference
👉 It does NOT compare content


if (s1.equals(s2))
equals() compares content
Not memory location