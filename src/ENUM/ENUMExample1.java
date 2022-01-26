package ENUM;


interface num{
	
}

public enum ENUMExample1 implements num{

	KF,RC;
	
//	Every enum is internally implemented byusing class concept 
//	
//	every enum const is always public static final 
//	
//	every enum constant represent at object of type enum
	
	// enum declaration and usses
	
//	every enum constant is always public static final and hence we can access enum constant byusing enum name
	
//	we can declare  eithe witin ]class inside class but not inside method if r trying declar inside method than we we will get compile time error saying enum types must not be local

	// enum vs switch
	
//	enum vs inheritance
//	
//	every enum is always direct child class of java.lang.enum and hence over enum cant extends any other enum (because java ownt provide support for multiple inheritance)
//	
//	every enum is always final implecitly and hence for over enum we cant create child enum
	
//	because of above we can conclude inheritance concept not applicable for enum explictly and we cant use extends keyword for enum
	
}
