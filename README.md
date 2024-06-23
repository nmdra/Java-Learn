# Java Learn

![Java](https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white)
![GitHub stars](https://img.shields.io/github/stars/nmdra/Java-Learn?style=for-the-badge)
![GitHub forks](https://img.shields.io/github/forks/nmdra/Java-Learn?style=for-the-badge)
![License](https://img.shields.io/github/license/nmdra/Java-Learn?style=for-the-badge)

A repository documenting my journey learning Java, featuring projects, code snippets, and notes on key concepts. Contributions and suggestions are welcome!

Last Update
Sun 23 Jun 2024 16:46:31 +0530

```Bash

-------------------------------------------------------------------------------
Language                     files          blank        comment           code
-------------------------------------------------------------------------------
Java                           572           2972            860           9796
Markdown                         2             53              0            191
Text                             3              1              0             16
-------------------------------------------------------------------------------
SUM:                           577           3026            860          10003
-------------------------------------------------------------------------------

```
<details>
<summary>Directory Structure</summary>
<br>

```Bash

.
└── src
    └── com
        ├── Basics
        │   ├── ExceptionHandling
        │   ├── fundamental
        │   ├── IO
        │   ├── LambdaExpression
        │   ├── Static
        │   └── Strings
        ├── Collections
        │   ├── ArrayList
        │   ├── HashMap
        │   ├── HashSet
        │   ├── Iterator
        │   ├── LinkedList
        │   ├── PriorityQueue
        │   ├── Queue
        │   ├── Stack
        │   └── Vector
        ├── DataStructures
        │   ├── LinkedList
        │   │   ├── DoublyLinkedList
        │   │   ├── LinkedList1
        │   │   └── LinkedList2
        │   ├── Queue
        │   ├── Stack
        │   └── Tree
        │       ├── Tree
        │       └── TreeX
        ├── DesignPatterns
        │   ├── AbstractFactory
        │   │   ├── Example1
        │   │   ├── Example2
        │   │   └── Example3
        │   ├── Adapter
        │   │   ├── Example1
        │   │   ├── Example2
        │   │   └── Example3
        │   ├── Bridge
        │   │   ├── Example1
        │   │   ├── Example2
        │   │   └── Example3
        │   ├── Builder
        │   │   ├── Example1
        │   │   ├── Example2
        │   │   └── Example3
        │   ├── Command
        │   │   ├── Example1
        │   │   ├── Example2
        │   │   ├── Example3
        │   │   └── Example4
        │   ├── Factory
        │   │   ├── FactoryMethod
        │   │   ├── FactoryMethod2
        │   │   ├── Pizza
        │   │   └── SimpleFactory
        │   ├── FlyWeight
        │   ├── Singleton
        │   │   ├── Basic
        │   │   ├── BasicMulti
        │   │   └── ThreadSafeSingleton
        │   ├── Strategy
        │   │   ├── Example1
        │   │   └── Example2
        │   └── Template
        │       ├── Example1
        │       ├── Example2
        │       └── Example3
        ├── Extra
        ├── GUI
        ├── LabEx
        │   ├── Collections
        │   │   └── Ex2
        │   ├── DesignPatterns
        │   │   ├── AbstractFactory
        │   │   └── Singleton
        │   ├── Lab1
        │   ├── Lab2
        │   │   └── Lab2Ex5
        │   ├── Lab3
        │   ├── Lab6
        │   └── LabTest
        │       ├── VersionA
        │       ├── VersionAExt
        │       └── VersionC
        ├── OnlineTest
        │   ├── OnlineTest01
        │   │   ├── Questions
        │   │   ├── Test01
        │   │   ├── Test02
        │   │   ├── Test03
        │   │   ├── Test04
        │   │   ├── Test05
        │   │   └── Test06
        │   └── OnlineTest2
        │       ├── GenericMethodProcessor
        │       ├── Questions
        │       ├── VersionA
        │       ├── VersionB
        │       ├── VersionC
        │       ├── VersionD
        │       ├── VersionE
        │       ├── VersionF
        │       └── VersionG
        ├── OOP
        │   ├── AbstractClasses
        │   ├── Enums
        │   ├── Generics
        │   │   ├── Examples
        │   │   └── KunalExamples
        │   ├── Inheritance
        │   │   ├── Animal
        │   │   ├── Compare
        │   │   └── Multiple
        │   ├── Interfaces
        │   │   ├── Cars
        │   │   ├── extendDemo
        │   │   ├── extendDemo2
        │   │   ├── nested
        │   │   └── Shapes
        │   ├── Polymophism
        │   │   └── Shapes
        │   └── Wrapper
        ├── PastPapers
        │   ├── Y19OctVerA
        │   │   └── Q03
        │   ├── Y19OctVerB
        │   │   ├── Q02
        │   │   └── Q04
        │   ├── Y22JuneVerA
        │   │   ├── Q01
        │   │   ├── Q03
        │   │   └── Q04
        │   ├── Y22NovVerA
        │   │   ├── Q01
        │   │   └── Q04
        │   ├── Y22NovVerB
        │   │   ├── Q01
        │   │   ├── Q02
        │   │   └── Q03
        │   ├── Y23JuneVerB
        │   │   ├── Q01
        │   │   ├── Q02
        │   │   ├── Q03
        │   │   └── Q04
        │   ├── Y23NovVerB
        │   │   ├── Q01
        │   │   ├── Q01Alt
        │   │   ├── Q02A
        │   │   ├── Q02B
        │   │   ├── Q02BAlt
        │   │   ├── Q03
        │   │   └── Q04
        │   ├── Y23NovVerD
        │   │   ├── Q01A
        │   │   ├── Q01B
        │   │   ├── Q02
        │   │   └── Q04
        │   ├── Y23NovVerE
        │   │   ├── Q01
        │   │   ├── Q03
        │   │   ├── Q03Alt
        │   │   └── Q03Alt2
        │   └── Y23NovVerF
        │       ├── Q01A
        │       ├── Q01B
        │       └── Q02
        ├── Threads
        │   ├── Sync
        │   └── SyncBlock
        └── Tutorials
            ├── Tutorial_1
            ├── Tutorial_2
            │   ├── Tute2ex1Ext
            │   ├── Tute2ex2
            │   └── Tute2ex3
            ├── Tutorial_3
            │   ├── Tute3ex1
            │   ├── Tute3ex2
            │   └── Tute3ex3
            └── Tutorial_4
                ├── Tute4ex2Ext
                └── Tute4ex3

184 directories

```
</details>

---

<div align="center">
  <a href="https://nmdra.github.io"> 🌎 nmdra.github.io</a> |
  <a href="https://github.com/nmdra"> 👨‍💻 Github</a> |
  <a href="https://twitter.com/nimendra_"> 🐦 Twitter</a>
</div>
