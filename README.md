# Java Learn

Last Update
Fri 19 Apr 2024 03:20:42 +0530

```Bash

-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                           366           1870            647           5662
Markdown                         2             53              0            191
Text                             3              1              0             16
-------------------------------------------------------------------------------
SUM:                           371           1924            647           5869
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
        │   │   └── Basic.java
        │   ├── IO
        │   │   ├── bufReader.java
        │   │   ├── Monster.txt
        │   │   └── newFile.java
        │   ├── LambdaExpression
        │   │   └── LambdaFunctions.java
        │   ├── Static
        │   │   ├── StaticClass.java
        │   │   ├── StaticExampleDemo.java
        │   │   ├── StaticNote.md
        │   │   └── StaticVar.java
        │   └── Strings
        │       ├── Comparison.java
        │       ├── Methods.java
        │       ├── Operators.java
        │       ├── Output.java
        │       ├── Performance.java
        │       ├── PrettyPrinting.java
        │       ├── StringBuild.java
        │       └── StringValueOfExample.java
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
        │   ├── Adapter
        │   │   ├── Adapter.jpg
        │   │   ├── Example1
        │   │   │   ├── EmailClient.java
        │   │   │   ├── EmailProvider.java
        │   │   │   └── Gmail
        │   │   │       └── GmailClient.java
        │   │   ├── Example2
        │   │   │   ├── adapters
        │   │   │   │   └── SquarePegAdapter.java
        │   │   │   ├── Demo.java
        │   │   │   ├── OutputDemo.txt
        │   │   │   ├── round
        │   │   │   │   ├── RoundHole.java
        │   │   │   │   └── RoundPeg.java
        │   │   │   └── square
        │   │   │       └── SquarePeg.java
        │   │   └── Example3
        │   │       ├── avaFilters
        │   │       │   └── Caramel.java
        │   │       ├── CaramelAdapter.java
        │   │       ├── CaramelFilter.java
        │   │       ├── Demo.java
        │   │       ├── Filter.java
        │   │       ├── Image.java
        │   │       ├── ImageView.java
        │   │       └── VividFilter.java
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
        │   ├── Builder
        │   │   ├── Example1
        │   │   │   ├── Director.java
        │   │   │   ├── MainApp.java
        │   │   │   └── model
        │   │   │       ├── Builder.java
        │   │   │       ├── CarBuilder.java
        │   │   │       └── Car.java
        │   │   ├── Example2
        │   │   │   ├── Demo.java
        │   │   │   ├── MovieBuilder.java
        │   │   │   ├── Movie.java
        │   │   │   ├── PdfDocumentBuilder.java
        │   │   │   ├── PdfDocument.java
        │   │   │   ├── PresentationBuilder.java
        │   │   │   ├── PresentationFormat.java
        │   │   │   ├── Presentation.java
        │   │   │   └── Slide.java
        │   │   ├── Example3
        │   │   │   ├── builders
        │   │   │   │   ├── Builder.java
        │   │   │   │   ├── CarBuilder.java
        │   │   │   │   └── CarManualBuilder.java
        │   │   │   ├── cars
        │   │   │   │   ├── Car.java
        │   │   │   │   ├── CarType.java
        │   │   │   │   └── Manual.java
        │   │   │   ├── components
        │   │   │   │   ├── Engine.java
        │   │   │   │   ├── GPSNavigator.java
        │   │   │   │   ├── Transmission.java
        │   │   │   │   └── TripComputer.java
        │   │   │   ├── Demo.java
        │   │   │   ├── director
        │   │   │   │   └── Director.java
        │   │   │   └── OutputDemo.txt
        │   │   └── uml-of-builedr.jpg
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
        │   │   │   └── OnlineTest.java
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
        │   │   ├── AbstractFactory
        │   │   │   ├── Rectangle.java
        │   │   │   ├── ShapeFactory.java
        │   │   │   ├── Shape.java
        │   │   │   ├── Square.java
        │   │   │   └── OnlineTest.java
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
        │   ├── Lab2
        │   │   ├── Lab2Ex1.java
        │   │   ├── Lab2Ex2.java
        │   │   ├── Lab2Ex3.java
        │   │   ├── Lab2Ex4.java
        │   │   └── Lab2Ex5
        │   │       ├── EvenOddNumber.java
        │   │       └── NumCheck.java
        │   └── Lab3
        │       └── Ex04.java
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
        │   │   ├── Animal
        │   │   │   ├── Animal.java
        │   │   │   ├── animalTest.java
        │   │   │   └── Cat.java
        │   │   ├── Compare
        │   │   │   ├── compDemo.java
        │   │   │   ├── Point.java
        │   │   │   └── ThreePoint.java
        │   │   ├── Inheritance.md
        │   │   ├── Inheritance.png
        │   │   └── Multiple
        │   │       └── MultipleTest.java
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
        ├── OnlineTest
        │   ├── Questions
        │   ├── VersionA
        │   │   ├── Example1
        │   │   │   ├── Lottery.java
        │   │   │   └── lotteryTest.java
        │   │   ├── Example2
        │   │   │   ├── Lottery2.java
        │   │   │   └── Lottery2Test.java
        │   │   └── Example3
        │   │       ├── Lottery3.java
        │   │       └── Lottery3Test.java
        │   ├── VersionB
        │   │   ├── Example1
        │   │   │   ├── Alien.java
        │   │   │   ├── AlienPack.java
        │   │   │   ├── alienTest.java
        │   │   │   ├── MarshmalloAlien.java
        │   │   │   ├── MenInBlack2.java
        │   │   │   ├── MenInBlack.java
        │   │   │   ├── OrgeAlien.java
        │   │   │   └── SnakeAlien.java
        │   │   └── Example2
        │   │       ├── Alien.java
        │   │       ├── AlienPack.java
        │   │       ├── MarshmalloAlien.java
        │   │       ├── OgreAlien.java
        │   │       └── SnakeAlien.java
        │   ├── VersionC
        │   │   ├── Example1
        │   │   │   ├── RandNum.java
        │   │   │   └── RandNumTest.java
        │   │   └── Example2
        │   │       └── RandNum2.java
        │   ├── VersionD
        │   │   ├── arrayTest.java
        │   │   └── CharArray.java
        │   ├── VersionE
        │   │   ├── InvalidITNumberException.java
        │   │   ├── student.java
        │   │   └── studentTest.java
        │   ├── VersionF
        │   │   ├── AlarmClock.java
        │   │   ├── mainClock.java
        │   │   └── timeException.java
        │   └── VersionG
        │       ├── demo.java
        │       ├── Employee.java
        │       └── Manager.java
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

150 directories, 389 files

```
</details>

---

<div align="center">
  <a href="https://nmdra.github.io"> 🌎 nmdra.github.io</a> |
  <a href="https://github.com/nmdra"> 👨‍💻 Github</a> |
  <a href="https://twitter.com/nimendra_"> 🐦 Twitter</a>
</div>
