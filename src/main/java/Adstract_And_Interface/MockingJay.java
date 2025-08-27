package Adstract_And_Interface;

public  class MockingJay extends Bird{

    @Override
    public void fly(){
    System.out.println("Fly, bird!");
}

    public static void main(String[] args) {
        MockingJay mockingJay = new MockingJay();
        mockingJay.setAge(19);

        System.out.println(mockingJay.getAge());
}

}
