package w3school;

 class AnimaSuper {
    String type = "Animal";

 }

 class Dog2 extends AnimaSuper{
     String type = "Dog";

 public void printType(){
     System.out.println(super.type);

  }

}