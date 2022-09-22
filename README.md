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

![image](https://user-images.githubusercontent.com/86511874/191676241-1d3e4461-10a6-40a6-893e-f87efa3c24fa.png)

✨ Deep Copy

Here you go inside and clone every object and the values to the new object.

![image](https://user-images.githubusercontent.com/86511874/191676284-509a626a-0eef-45b4-9c30-11a0b9d246d8.png)


![image](https://user-images.githubusercontent.com/86511874/191676315-c3672f3a-6efd-44e3-af5c-1199b5e01501.png)

❗️ The shallow copy can be dangerous 🥵 WHY ❓
The shallow copy can be dangerous sometimes because you get the object and that means you copied some references to your new object. So if you did any modification to those references, that could affect the original object.

Structure of the Prototype Design Pattern

![image](https://user-images.githubusercontent.com/86511874/191676400-90812635-a6c0-4392-ba5e-2e007c12f0b5.png)
🎲 Prototype interface — This is an interface for cloning itself. Normally, it is a single clone method, but sometimes there could be some other methods declared if we wanted.

🎲Client —This represents the creation of a new object by calling a prototype to clone itself.

When to use the Prototype Design Pattern?
⚡️ When the creation of an object is expensive and it would be more productive to copy an object.

⚡️ When the creation of an object is very time-consuming.

⚡️ When you want to hide the complication of creating a new instance from the client.

⚡️ When needs to keep the no of classes in the system minimum.

Let’s take the below scenario as a real-world issue and the solution at the same time with the help of this Prototype Design Pattern.
💥 Scenario
Assume that there is a book store in your town and the shop owner asked you to build a system to keep the details of the book store. So here you need to keep the details of numerous number of books to the system. So Does that mean you need to create instances of Books everytime🧐

NO! 🥳 We can use the Prototype Design Pattern for this scenario.

Types of Books: Educational, Story, Literature

Details of books: book category, type, price

So in the below figure, it shows the UML representation of this scenario:
![image](https://user-images.githubusercontent.com/86511874/191676485-33ac16c1-565e-4965-a927-1ef70037ecf2.png)






