# Types Of Inheritance

## Support through Classes

### Single Inheritance

```Java
class Animal{  
    void eat(){
        System.out.println("eating...");
    }  
} 

class Dog extends Animal{  
    void bark(){
        System.out.println("barking...");
    }  
} 

class TestInheritance{  
    public static void main(String[] args){  
        Dog d=new Dog();  
        d.bark();  
        d.eat();  
    }
}
```

### Multilevel Inheritance

```Java
class Animal{  
    void eat(){System.out.println("eating...");}  
}  

class Dog extends Animal{  
    void bark(){System.out.println("barking...");}  
}  

class BabyDog extends Dog{  
    void weep(){System.out.println("weeping...");}  
} 

class TestInheritance2{  
    public static void main(String[] args){  
        BabyDog d=new BabyDog();  
        d.weep();  
        d.bark();  
        d.eat();  
    }
}  
```

### Hierarchical Inheritance

```Java
class Animal{  
    void eat(){System.out.println("eating...");}  
}  

class Dog extends Animal{  
    void bark(){System.out.println("barking...");}  
}  

class Cat extends Animal{  
    void meow(){System.out.println("meowing...");}  
}  

class TestInheritance3{  
    public static void main(String[] args){  
        Cat c=new Cat();  
        c.meow();  
        c.eat();  
        //c.bark();   //would throw Compile Time Error  
    }
}
```

### Problem of Multiple Inheritance 

```Java
// This program gives COMPILE TIME ERROR

class A{  
    void msg(){System.out.println("Hello");}  
}  

class B{  
    void msg(){System.out.println("Welcome");}  
}  

class C extends A,B{  //suppose if it were possible  

    Public Static void main(String[] args){  
        C obj=new C();  
        obj.msg();  //Now which msg() method would be invoked?  
    }  
}
```

### Multiple Interface Inheritance

```Java
interface AnimalEat {
    void eat();
}

interface AnimalTravel {
    void travel();
}

class Animal implements AnimalEat, AnimalTravel {
    public void eat() {
        System.out.println("Animal is eating");
    }
    public void travel() {
        System.out.println("Animal is travelling");
    }
}

public class MultipleTest {
    public static void main(String[] args) {
        Animal a = new Animal();
        a.eat();
        a.travel();
    }
}
```

