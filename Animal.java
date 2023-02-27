class Animal{
    private int age;
    private String name;
}

class Dog extends Animal{
    public void bark(){
        System.out.println("Woof Woof");
    }
}

class Jindo extends Dog{
    private String origin;
}