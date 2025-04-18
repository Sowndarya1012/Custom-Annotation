WHAT IS CUSTOM ANNOTATION?

An annotation is a special kind of modifier that can be applied to classes, methods, variables, parameters, and packages.
It is a form of metadata, providing information about the code to the compiler, runtime, or other tools. They are represented by the @ symbol followed by the annotation name. Some built-in annotations in Java include @Override, @Deprecated, and @SuppressWarnings.

HOW THEY WORK?

Annotations work in different phases, depending on how they are defined:
1.	Compile-Time
Some annotations are processed by the compiler. If the rules are not followed, the compiler gives an error or warning.
2.	Runtime
Some annotations are available when the program is running. These are processed using Java's Reflection API, which allows you to inspect classes, methods, and annotations at runtime.
3.	Tools and Frameworks
Annotations are also used by development tools (like IDEs) or frameworks (like Spring or Hibernate) to auto-generate code, perform dependency injection, or configure behaviors.

Why Do We Use Annotations?

1.	To Give Instructions to the Compiler
Some annotations help the compiler catch mistakes during compile-time.
2.	To Provide Information to Tools or Frameworks
Many tools and frameworks use annotations to understand how to behave with your code.
3.	To Customize Behavior Using Custom Annotations
You can create your own annotations and use them to define special behaviors in your applications.

PROJECT GOAL

To implement simple depemdancy injection system using custom annotation and java reflection.

FOLDER STRUCTURE

Step 1: Created a project name webannotation using IntelliJ IDEA.

Step 2: Created a package name com.college.annotaion

i.	Inside that created a Inject.java file

Step 3: Created a package name com.college.client

ii.	Inside that created a App.java file

Step 4: Created a package name com.college.inejector

iii.	Inside that created a DependancyInjector.java file

Step 5: Created a package name com.college.service

iv.	Inside that created a EmailService.java file

Step 7:Created a simple web application using HTML and CSS.


OUTPUT

![image](https://github.com/user-attachments/assets/b50f8400-1c3e-4dcd-8b7e-22c01ccfda9f)

CONCLUSION

In this project, we created our own @Inject annotation to perform dependency injection using Java reflection. We injected the EmailService into our main class (App) without directly creating an object, which helps in making the code flexible and less dependent.
This small project shows how annotations work behind the scenes and gives us an idea of how big frameworks like Spring manage dependencies. We also created an HTML file to show the result, making it easy to understand and present.

This project helped us learn:

•	Annotations

•	Reflection

•	Dependency Injection

•	Loose Coupling





