# Java Learn

Last Update
Tue 26 Dec 2023 00:26:09 +0530

```Bash

-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                           280           1445            530           4220
Text                             1              0              0              4
-------------------------------------------------------------------------------
SUM:                           281           1445            530           4224
-------------------------------------------------------------------------------

```
<details>
<summary>Directory Structure</summary>
<br>

```Bash

.
├── README.md
└── src
    └── com
        ├── basic
        │   ├── commandArgs.java
        │   ├── ExceptionHandling
        │   │   ├── CheckedExample.java
        │   │   ├── CustomException.java
        │   │   ├── ExceptionHandling.java
        │   │   └── UncheckedExample.java
        │   ├── fundamental
        │   │   ├── Basic.java
        │   │   └── ExceptionHandling
        │   │       ├── CustomException.java
        │   │       └── ExceptionHandling.java
        │   ├── IO
        │   │   ├── bufReader.java
        │   │   ├── Monster.txt
        │   │   └── newFile.java
        │   ├── LambdaExpression
        │   │   └── LambdaFunctions.java
        │   ├── StaticClass.java
        │   └── Strings
        │       ├── Comparison.java
        │       ├── Methods.java
        │       ├── Operators.java
        │       ├── Output.java
        │       ├── Performance.java
        │       ├── PrettyPrinting.java
        │       └── StringBuild.java
        ├── Collections
        │   ├── ArrayList
        │   │   └── ArrayListEx.java
        │   ├── Collection-Framework-hi.png
        │   ├── HashMap
        │   │   └── HashMapEx.java
        │   ├── HashSet
        │   │   └── HashSetEx.java
        │   ├── LinkedList
        │   │   └── LinkedListEx.java
        │   ├── PriorityQueue
        │   │   └── PriorityQueueEx.java
        │   ├── Stack
        │   │   └── StackEx.java
        │   └── Vector
        │       └── VectorEx.java
        ├── DesignPatterns
        │   ├── AbstractFactory
        │   │   ├── Abstract-Factory-UML.png
        │   │   ├── Example1
        │   │   │   ├── factories
        │   │   │   │   ├── AsusManufacturer.java
        │   │   │   │   ├── Company.java
        │   │   │   │   └── MsiManufacturer.java
        │   │   │   ├── MainApp.java
        │   │   │   └── products
        │   │   │       ├── AsusGpu.java
        │   │   │       ├── AsusMonitor.java
        │   │   │       ├── Gpu.java
        │   │   │       ├── Monitor.java
        │   │   │       ├── MsiGpu.java
        │   │   │       ├── MsiMonitor.java
        │   │   │       └── Product.java
        │   │   ├── Example2
        │   │   │   ├── AbstractFactory.java
        │   │   │   ├── AbstractFactoryPatternDemo.java
        │   │   │   ├── Blue.java
        │   │   │   ├── Circle.java
        │   │   │   ├── ColorFactory.java
        │   │   │   ├── Color.java
        │   │   │   ├── FactoryProducer.java
        │   │   │   ├── Green.java
        │   │   │   ├── Rectangle.java
        │   │   │   ├── Red.java
        │   │   │   ├── ShapeFactory.java
        │   │   │   ├── Shape.java
        │   │   │   └── Square.java
        │   │   └── Example3
        │   │       ├── App
        │   │       │   └── Application.java
        │   │       ├── Buttons
        │   │       │   ├── Button.java
        │   │       │   ├── LinuxButton.java
        │   │       │   └── WindowsButton.java
        │   │       ├── Checkboxes
        │   │       │   ├── Checkbox.java
        │   │       │   ├── LinuxCheckbox.java
        │   │       │   └── WindowsCheckbox.java
        │   │       ├── Demo.java
        │   │       └── Factories
        │   │           ├── GUIFactory.java
        │   │           ├── LinuxFactory.java
        │   │           └── WindowsFactory.java
        │   ├── Bridge
        │   │   ├── Bridge.jpg
        │   │   ├── Example1
        │   │   │   ├── Assemble.java
        │   │   │   ├── AutoMobile.java
        │   │   │   ├── Bus.java
        │   │   │   ├── Demo.java
        │   │   │   ├── Produce.java
        │   │   │   └── WorkShop.java
        │   │   ├── Example2
        │   │   │   ├── AdvancedRemoteControl.java
        │   │   │   ├── Demo.java
        │   │   │   ├── Device.java
        │   │   │   ├── RemoteControl.java
        │   │   │   ├── SamsungTV.java
        │   │   │   └── SonyTV.java
        │   │   └── Example3
        │   │       ├── abstractions
        │   │       │   ├── AmericanRestaurant.java
        │   │       │   ├── ItalianRestaurant.java
        │   │       │   └── Restaurant.java
        │   │       ├── implementations
        │   │       │   ├── PepperoniPizza.java
        │   │       │   ├── Pizza.java
        │   │       │   └── VeggiePizza.java
        │   │       └── MainApp.java
        │   ├── Command
        │   │   ├── Command-GOF.jpg
        │   │   ├── Command.jpg
        │   │   ├── Example1
        │   │   │   ├── commands
        │   │   │   │   ├── Command.java
        │   │   │   │   ├── OpenCloseCurtainsCommand.java
        │   │   │   │   └── SwitchLightsCommand.java
        │   │   │   ├── components
        │   │   │   │   ├── Component.java
        │   │   │   │   ├── Curtains.java
        │   │   │   │   ├── FloorLamp.java
        │   │   │   │   ├── Light.java
        │   │   │   │   └── Room.java
        │   │   │   └── MainApp.java
        │   │   ├── Example2
        │   │   │   ├── Command
        │   │   │   │   ├── CommandHistory.java
        │   │   │   │   ├── Command.java
        │   │   │   │   ├── CopyCommand.java
        │   │   │   │   ├── CutCommand.java
        │   │   │   │   └── PasteCommand.java
        │   │   │   ├── Demo.java
        │   │   │   └── Editor
        │   │   │       └── Editor.java
        │   │   ├── Example3
        │   │   │   ├── Command.java
        │   │   │   ├── KitchenLight.java
        │   │   │   ├── Light.java
        │   │   │   ├── LightOffCommand.java
        │   │   │   ├── LightOnCommand.java
        │   │   │   ├── LivingRoomLight.java
        │   │   │   └── Test.java
        │   │   └── Example4
        │   │       ├── CustomerService.java
        │   │       ├── FX
        │   │       │   ├── AddCustomerCommand.java
        │   │       │   ├── Button.java
        │   │       │   └── Command.java
        │   │       └── ServiceDemo.java
        │   ├── Factory
        │   │   ├── FactoryMethod
        │   │   │   ├── CarFactory.java
        │   │   │   ├── Car.java
        │   │   │   ├── MainApp.java
        │   │   │   ├── MotorcycleFactory.java
        │   │   │   ├── Motorcycle.java
        │   │   │   ├── MotorVehicleFactory.java
        │   │   │   └── MotorVehicle.java
        │   │   ├── FactoryMethod2
        │   │   │   ├── BeefBurger.java
        │   │   │   ├── BeefBurgerRestaurant.java
        │   │   │   ├── Burger.java
        │   │   │   ├── MainApp.java
        │   │   │   ├── Restaurant.java
        │   │   │   ├── VeggieBurger.java
        │   │   │   └── VeggieBurgerRestaurant.java
        │   │   ├── Factory-Method-UML.jpeg
        │   │   └── SimpleFactory
        │   │       ├── EmailNotification.java
        │   │       ├── NotificationFactory.java
        │   │       ├── Notification.java
        │   │       ├── NotificationService.java
        │   │       ├── PushNotification.java
        │   │       └── SMSNotification.java
        │   ├── Singleton
        │   │   ├── Basic
        │   │   │   ├── SingletonDemo.java
        │   │   │   └── Singleton.java
        │   │   ├── BasicMulti
        │   │   │   ├── DemoMultiThread.java
        │   │   │   └── Singleton.java
        │   │   ├── Singleton-UML.jpeg
        │   │   └── ThreadSafeSingleton
        │   │       ├── DemoMultiThread.java
        │   │       └── Singleton.java
        │   ├── Strategy
        │   │   ├── Example1
        │   │   │   ├── Compress
        │   │   │   │   ├── Compressor.java
        │   │   │   │   ├── JpegCompressor.java
        │   │   │   │   └── WebpCompresser.java
        │   │   │   ├── Demo.java
        │   │   │   ├── Filter
        │   │   │   │   ├── AnimeFilter.java
        │   │   │   │   ├── BWFilter.java
        │   │   │   │   └── Filter.java
        │   │   │   └── ImageModify.java
        │   │   ├── Example2
        │   │   │   ├── Duck.java
        │   │   │   ├── FlyNoWay.java
        │   │   │   ├── FlyRocketPower.java
        │   │   │   ├── FlyWithWings.java
        │   │   │   ├── IFlyBehaviour.java
        │   │   │   ├── IQuackBehaviour.java
        │   │   │   ├── ModelDuck.java
        │   │   │   ├── ModelQuack.java
        │   │   │   ├── MollardDuck.java
        │   │   │   ├── Quack.java
        │   │   │   └── TestDuck.java
        │   │   ├── Strategy-GOF.jpg
        │   │   └── Strategy.jpg
        │   └── Template
        │       ├── Example1
        │       │   ├── Beverages.java
        │       │   ├── Coffee.java
        │       │   ├── Demo.java
        │       │   └── Tea.java
        │       ├── Example2
        │       │   ├── BaseGameLoader.java
        │       │   ├── DiabloLoader.java
        │       │   ├── MainApp.java
        │       │   └── WorldOfWarcraftLoader.java
        │       ├── Example3
        │       │   ├── Demo.java
        │       │   └── Template
        │       │       ├── AuditTrail.java
        │       │       ├── Task.java
        │       │       └── TransferMoneyTask.java
        │       ├── Template-GOF.jpg
        │       └── Template.jpg
        ├── Extra
        │   ├── ArrayManipulation.java
        │   ├── fibo.java
        │   ├── LabTest
        │   │   ├── VersionA
        │   │   │   ├── Lottery.java
        │   │   │   ├── LotteryTest.java
        │   │   │   └── VA.pdf
        │   │   ├── VersionAExt
        │   │   │   ├── Lotto.java
        │   │   │   └── LottoTest.java
        │   │   └── VersionC
        │   │       ├── RandNum.java
        │   │       ├── testRandNum.java
        │   │       └── VC.pdf
        │   └── Palin.java
        ├── GUI
        │   └── Main.java
        ├── LabEx
        │   ├── Collections
        │   │   ├── Ex1.java
        │   │   ├── Ex2
        │   │   ├── Ex2.java
        │   │   ├── Ex3.java
        │   │   ├── Ex4.java
        │   │   └── Student.java
        │   ├── DesignPatterns
        │   │   └── Singleton
        │   │       ├── SingletonDemo.java
        │   │       ├── Singleton.java
        │   │       ├── SingletonThreadDemo.java
        │   │       ├── SingletonThread.java
        │   │       └── ThreadImpl.java
        │   ├── Lab1
        │   │   ├── Lab1Ex1.java
        │   │   ├── Lab1Ex2.java
        │   │   ├── Lab1Ex3.java
        │   │   ├── Lab1Ex4.java
        │   │   ├── Lab1Ex5.java
        │   │   ├── Lab1Ex6.java
        │   │   └── Lab1Ex7.java
        │   └── Lab2
        │       ├── Lab2Ex1.java
        │       ├── Lab2Ex2.java
        │       ├── Lab2Ex3.java
        │       ├── Lab2Ex4.java
        │       └── Lab2Ex5
        │           ├── EvenOddNumber.java
        │           └── NumCheck.java
        ├── OOP
        │   ├── AbstractClasses
        │   │   ├── Developer.java
        │   │   ├── EmployeeApp.java
        │   │   ├── Employee.java
        │   │   └── Manager.java
        │   ├── Enums
        │   │   ├── A.java
        │   │   ├── Basic.java
        │   │   └── EnumExample.java
        │   ├── Generics
        │   │   ├── Examples
        │   │   │   ├── BoundType.java
        │   │   │   ├── BoundTypeTest.java
        │   │   │   ├── GenericClass.java
        │   │   │   ├── GenericClassTest.java
        │   │   │   ├── GenericMethod.java
        │   │   │   └── WildCards
        │   │   │       ├── LowerBoundedWildcardExample.java
        │   │   │       ├── UpperBoundedWildcardExample.java
        │   │   │       └── WildCard.java
        │   │   └── KunalExamples
        │   │       ├── comparing
        │   │       │   ├── Main.java
        │   │       │   └── Student.java
        │   │       ├── CustomArrayList.java
        │   │       ├── CustomGenArrayList.java
        │   │       ├── GenericInterface.java
        │   │       ├── GenericTest.java
        │   │       └── WildcardExample.java
        │   ├── Inheritance
        │   │   └── Animal
        │   │       ├── Animal.java
        │   │       ├── animalTest.java
        │   │       └── Cat.java
        │   ├── Interfaces
        │   │   ├── Cars
        │   │   │   ├── Brake.java
        │   │   │   ├── Car.java
        │   │   │   ├── CarTest.java
        │   │   │   ├── CDPlayer.java
        │   │   │   ├── ElecticEngine.java
        │   │   │   ├── Engine.java
        │   │   │   ├── Media.java
        │   │   │   ├── NiceCar.java
        │   │   │   ├── NiceCarTest.java
        │   │   │   └── PowerEngine.java
        │   │   ├── extendDemo
        │   │   │   ├── A.java
        │   │   │   ├── B.java
        │   │   │   └── Main.java
        │   │   ├── extendDemo2
        │   │   │   ├── A.java
        │   │   │   ├── B.java
        │   │   │   └── Main.java
        │   │   ├── nested
        │   │   │   ├── A.java
        │   │   │   └── Main.java
        │   │   └── Shapes
        │   │       ├── Area.java
        │   │       ├── GetInput.java
        │   │       ├── ShapeArea.java
        │   │       └── ShapeAreaTest.java
        │   ├── Polymophism
        │   │   └── Shapes
        │   │       ├── Circle.java
        │   │       ├── Eclipse.java
        │   │       ├── Rectangle.java
        │   │       ├── Shape.java
        │   │       ├── shapeTest.java
        │   │       └── Square.java
        │   └── Wrapper
        │       └── WrapperClass.java
        ├── Threads
        │   ├── Sync
        │   │   ├── Demo.java
        │   │   ├── SharedResource.java
        │   │   └── ThreadImpl.java
        │   ├── SyncBlock
        │   │   ├── SharedResource.java
        │   │   ├── SyncBlockDemo.java
        │   │   └── ThreadImpl.java
        │   ├── ThreadJoinExample.java
        │   ├── Thread-Life-Cycle.png
        │   └── YieldMethodTest.java
        └── Tutorials
            ├── Tutorial_1
            │   ├── Tute1ex1.java
            │   ├── Tute1ex2.java
            │   ├── Tute1ex3.java
            │   ├── Tute1ex4.java
            │   └── Tute1ex5Ext.java
            ├── Tutorial_2
            │   ├── Tute2ex1Ext
            │   │   ├── Student.java
            │   │   └── testStudent.java
            │   ├── Tute2ex2
            │   │   ├── Point3D.java
            │   │   └── PointApp.java
            │   └── Tute2ex3
            │       ├── BankAccount.java
            │       └── BankApp.java
            ├── Tutorial_3
            │   ├── Tute3ex1
            │   │   ├── StudentApp.java
            │   │   └── Student.java
            │   ├── Tute3ex2
            │   │   ├── Feet.java
            │   │   └── testFeet.java
            │   └── Tute3ex3
            │       ├── Calc.java
            │       └── DemoApp.java
            └── Tutorial_4
                ├── Tute4ex2Ext
                │   └── ShoppingCart.java
                └── Tute4ex3
                    ├── AgeValidationDemo.java
                    └── AgeValidationException.java

112 directories, 296 files

```
</details>

---

<div align="center">
  <a href="https://nmdra.github.io"> 🌎 nmdra.github.io</a> |
  <a href="https://github.com/nmdra"> 👨‍💻 Github</a> |
  <a href="https://twitter.com/nimendra_"> 🐦 Twitter</a>
</div>
