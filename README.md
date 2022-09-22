# Prototype-Design-Pattern
![image](https://user-images.githubusercontent.com/86511874/191675869-7edb8cb5-1a24-4146-9749-64f19291c64a.png)
📍 The entire definition of this prototype design pattern can be expressed as “ AVOID THE CREATION”.

📍 There are some situations that the creating of an object becomes so expensive. So this Prototype Design Pattern encourages cloning the existing object without creating any new objects.

📍 The prototype design pattern belongs to the creational design pattern.

For an example, think of the below scenario,

Let’s say you design a system to rent vehicle application system. So in this application probably you need to show many vehicles(nearly hundreds or thousands)in the system. So that means you need to create instance of vehicle each time. So isnt it quiet expensive🧐

Yes, It is!😥

So what this prototype pattern encourages is, you create the first instance and you register that instance. And as the next step, you just clone from the original instance and you do not need to create a new instance again.

As another example, think of the below use case,

Consider abput creating e a shopping cart for a shopping system and you need to show items according to the search results. So by using this prototype design pattern, you could clone the objects and build the shopping cart.

♨️ Important notes
◼️ So we can say that the prototype design pattern avoids using the new keyword.

◼️ If the process of creation of an object is so much expensive and if you have many thongs to do, So this is the most suitable design pattern to use. (Because you could avoid many performance issues of the object creation process when using this design pattern)

◼️ Usually, we can implement the cloneable interface when we need to clone the object. (But a major drawback of this interface is that it always returns the object type and it does not know about the generics).

◼️ So we can say that this pattern supplies a process to copy the original object to a new object and then change it according to our requirements. So to do this, the prototype design pattern uses java cloning to copy the object.

📍 Most important thing is that you must have to use this Prototype method carefully due to the reason mentioned below ⬇️
When you clone, you need to make sure that, you need to shallow copy or deep copy in your software architecture.

What is Shallow Copy & Deep Copy 🙄
✨ Shallow Copy.

What actually happens when you shallow copy is that you just copy in the first level objects. (references to the objects)

