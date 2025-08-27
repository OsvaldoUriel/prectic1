package w3school;
/*The most common use of the super keyword is to eliminate the confusion between superclasses and subclasses that have methods with the same name.

It can be used in two main ways:

To access attributes and methods from the parent class
To call the parent class constructor*/

 class Animal2_super {
public void animalSound(){
    System.out.println("The animal make a sound");

 }
}

class Dog extends Animal2_super{
     public void animalSound(){
         super.animalSound();
         System.out.println("The dog says: bow bow");

     }
 }

