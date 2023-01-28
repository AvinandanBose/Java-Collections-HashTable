
<h1>Java Collections : HashTable </h1>

```mermaid

sequenceDiagram

   java.util.HashTable->>java.util.Dictionary:extends 
   java.util.HashTable->>java.util.Map:implements
   java.util.HashTable->>java.io.Serializable:implements
  java.util.HashTable->>java.lang.Cloneable:implements
  


```

<h3 align="Center">

```Syntax

public class Hashtable<K,V> extends Dictionary<K,V> implements Map<K,V>, Cloneable, Serializable

```

<h3>

<h1 align="Center"> HashTable </h1>

<h3> <li>1. The Hashtable class implements a hash table.</li></h3>

<h3> <li>2. A Hashtable is an array of a list. Each list is known as a Bucket. The position of the Bucket is identified by calling the <i><ins>HashCode()</ins></i> method.</li></h3> 


<h3> <li>3. Hashtable is synchronized.</li></h3>

<h3> <li>4. Hashtable stores key/value pair in Hash Table.</li></h3>

<h3> <li>5. A Hashtable contains values based on the key.</li></h3>

<h3> <li>6. Java Hashtable class doesn't allow null key or value.</li></h3>

<h3> <li>7. Java Hashtable class contains unique elements.</li></h3>

<h3> <li>8. In Hashtable we specify an object that is used as a key, and the value we want to associate to that key. The key is then hashed, and the resulting hash code is used as the index at which the value is stored within the table.</li></h3>

<h3> <li>9. The initial default capacity of Hashtable class is 11.</li></h3>

<h3> <li>10. The default loadFactor is 0.75 .</li></h3>

<h3> <li>11. HashMap doesn’t provide any Enumeration, while Hashtable provides not fail-fast Enumeration.</li></h3>
   
 <h1> </h1> 
   
<h1 align="Center"> Internal Workings of HashTable </h1>
   
![Screenshot (217)](https://user-images.githubusercontent.com/38869235/215149864-f79b6066-51c8-4f71-908e-e426262961b1.png)

<h3 align="Center"> <ins> Linked List </ins></i></h3>
   
 ![Screenshot (218)](https://user-images.githubusercontent.com/38869235/215150317-39759424-6c00-4cf2-8ab6-ea0541e9a2f0.png)

<h3 align="Center"> <ins> Buckets </ins></i></h3>

<h3> <li> 1. As we can see that item composed of Key/Value = Item placed in each Slot / Bucket according to Index. </li> </h3>
    
![Screenshot (220)](https://user-images.githubusercontent.com/38869235/215169920-bb923f8f-7c30-4031-8c22-617a168a6c41.png)


<h3 align="Center"> <ins> Process of Insertion of Keys and Values</ins></i></h3>
   
<h3> <li> 2. Each Key is converted to Hash by calling hashcode() method. </li> </h3>
<h3> <li> 3. Next each converted hash coded key modulo (%) with no. of slots present in the array of buckets from which we get index of the Bucket at which we can store that particular Key/Value pair . And this process continues for each Key-Value pair .</li> </h3>
