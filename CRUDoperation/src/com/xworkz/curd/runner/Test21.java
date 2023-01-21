package com.xworkz.curd.runner;

public class Test21 {
	
	Q.1------>
	The collection Hierachy..Iterble-->collection-->1)List,2)Set,3)Queue..these are the interface,
	1)List--->1)ArrayList,2)LinkedList,3)Vectore,4)Stack.
	2)Set---->1)HashSet,2)LinkedHashSet..in set sortedSet is also an interface..
	3)Queue-->1)Dequeue.

	Q.2------>

	the implements of map-->HashMap-->TreeMap-->sortedMap-->LinkedHashMap--->

	Q.3------>

	Hash Set--->1)Hash set is implemented useing Hashtable
	            2) it allows the null object
			    3)it is used to equls method to compaire to object
				4)it is does not allows heterogineous object
				5)it dose not maintained any order.
	Tree Set--->1)it is implemented useing tree structure
	            2)it is dosenot allows the null object
	            3)it is used to compare method for comparing two object
	            4)it is allows heterogineous object
	            5) it maintained an object in sorted oreder
	Q.5------>
	Fail-Fast systems abort operation as-fast-as-possible exposing failures immediately 
	and stopping the whole operation.

	Whereas, Fail-Safe systems don't abort an operation in the case of a failure. 
	Such systems try to avoid raising failures as much as possible.

	Q.6------>
	The String API has a new method – chars() – with which we can obtain an instance of Stream from a String object. 
	This simple API returns an instance of IntStream from the input String.

	Simply put, IntStream contains an integer representation of the characters from the String object:

	Q.7------>
	Spliterators, like Iterator s, are for traversing the elements of a source. 
	The Spliterator API was designed to support efficient parallel traversal in addition to sequential traversal, 
	by supporting decomposition as well as single-element iteration.

	Q.8------>
	1. Overview
	In this quick article, we would learn how to use the Stream API to split a comma-separated String into
	 a list of Strings and how to join a String array into a comma-separated String.

	Q.9------>
	Core (spring-core) is the core of the framework that power features such as Inversion of Control and dependency injection. Beans (spring-beans) provides Beanfactory, 
	which is a sophisticated implementation of the factory pattern.

	Q.10------>
	In object-oriented programming (OOP) software design, dependency injection (DI) is the process of supplying
	 a resource that a given piece of code requires. The required resource, which is often a component of the 
	 application itself, is called a dependency.
	 
	 Q.11------>
	 StringBuilder in Java is a class used to create a mutable, or in other words, a modifiable succession of characters. Like StringBuffer, the StringBuilder class is an alternative 
	 to the Java Strings Class, as the Strings class provides an immutable succession of characters.
	 
	 Java StringBuffer class is used to create mutable (modifiable) String objects. 
	 The StringBuffer class in Java is the same as String class except it is mutable i.e. it can be changed.
	 
	 Q.14------>
	 BeanFactory--->
	 1)XMLBeanFactory implements BeanFactory 
	 2)Benafactory instantiate beans when  getBean() method gets called.
	 3)Bean factory does not have the ability to push events to the beans 
	 4)Lazy loading 
	 
	 Application context---->
	 1)FileSystemXmlApplicationContext, ClassPathXmlApplicationContext 
	 and AnnotationConfigWebApplicationContex implements ApplicationContext.
	 2)Application instainte bean at the time container start.
	 3)Application Context have ability to push to push events to the beans.
	 4)Aggressive Loading 
	 
	  Q.15------>
	  In Spring AOP, aspects are implemented using regular classes (the schema-based approach)
	  or regular classes annotated with the @Aspect annotation (the @AspectJ style).
	  
	  Spring IoC is the mechanism to achieve loose-coupling between Objects dependencies. To achieve loose coupling and dynamic binding of the objects at runtime,
	  objects dependencies are injected by other assembler objects.
	  
	  POJO is short for Plain old java object, an application implemented in pojo way means the logic resides in POJO with little to no boilerplate code, thus it's very portable.
	  An PoJo application can be ported from Spring to another container with little modification.
	  
	  Spring Component annotation is used to denote a class as Component. It means that Spring framework will autodetect these classes for dependency injection when annotation-based configuration 
	  and classpath scanning is used.
	  
	  One of the most important annotations in spring is @ComponentScan which is used along with the @Configuration annotation to specify the packages that we want to be scanned. 
	  @ComponentScan without arguments tells Spring to scan the current package and all of its sub-packages
	  
	  Spring Bean is nothing special, any object in the Spring framework that we initialize through Spring container is called Spring Bean. Any normal Java POJO class can be a
	  Spring Bean if it's configured to be initialized via container by providing configuration metadata information.
	  
	  Q.16------>
	  
	  16.public class country{
	private String country;
	private int code;
	  public static void main(String args[])
	  {
	  
	  Map<String,Integer>map=new TreeMap<String,Integer>();
	  map.put("India",93);
	  map.put("Korea",83);
	  map.put("China",73);
	  map.put("Sri Lanka",22);
	  map.put("Pakistan",66);
	  map.forEach(m)->System.out.println(n + " " +m);
	  map.forEach(n)->if(n.contains("India"){
	  System.out.println(n);
	  }
	  }
	}
	  
	  
	  
	 
	 




	 

}
