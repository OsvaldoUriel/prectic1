package OOP;

public class Cat {
    private String name;
    public Cat (String name){
        this.name = name;
    }

    public Cat(){
    }

    public static void main(String[] args) {
        for (int i = 0; i < 1000000; i++) {
            Cat cat = new Cat();
            cat = null;
        }
    }

    @Override
    protected void finalize() throws Throwable{
        System.out.println("Cat object destroyed!");
    }


}
