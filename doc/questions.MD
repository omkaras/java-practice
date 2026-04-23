# Interview Preparation Notes

## Code Java
- JDK, JVM
- Interfaces
- Sealed class
- Inheritance
- Polymorphism
- Encapsulation
- Equals & HashCode
- Volatile Keyword
- Records
- Comparable & Comparator
- Singleton class
- Immutable class
- Reflection
- Hashing
- Create custom annotation
- HashMap, ConcurrentHashMap
- Spring autoconfiguration
- How dependency injection in Spring works
- Executor Service
- Virtual threads
- CompletableFuture, @Async
- Generics
- Garbage collection
- @Transactional
- Hibernate
- N+1 query problem in Hibernate/JPA
- JMS
- Explain CAS (Compare-And-Swap) in detail
- What causes memory leaks in Java?
- What is deadlock? How to detect and fix it?
- Difference between synchronized vs ReentrantLock
- JVM tuning basics (GC types, heap sizing)
- Why is contructor injection better than field injection?
- How will you create your own @Transaction impl. and how will you create proxies?

---

## Data Structures (DS)
- Stack
- Array
- LRU
- HashMap
- Linked List (Singly)
- Linked List (Doubly)
- Set
- Queue
- Tree

---

## Design Patterns
- Factory Method
- Singleton
- Builder
- SAGA Pattern
- Blue Green deployment
- A/B testing
- Canary testing

---

## System Design
- How will you handle large volume of data which is business critical, but difficult to use?
- Circuit Breaker
- SQL vs NoSQL — when to use each?
- Microservice
- API Gateway, Service Mesh
- Kubernetes (K8)
- RabbitMQ / ActiveMQ
- Design a high-volume, fault-tolerant system
- How would you design a multi-region distributed system?
- Design a system that handles millions of requests per second
- How do you ensure high availability vs consistency?
- Explain CAP theorem in real systems
- How do you handle backpressure?
- Strategies for data partitioning & sharding
- How do you design for eventual consistency?
- How do you reduce latency in a Java service?
- How does Kafka guarantee ordering?
- What is containerization? How Docker works internally?
- How does sharding work?
- How do you handle large data migrations?
- How do you design REST APIs at scale?
- ACID properties
- Security (OAuth, JWT)
- “Production is down. CPU is 100%. What will you do?”
- “Latency suddenly increased. How do you debug?”
- “Memory usage keeps increasing—how do you investigate?”
- Design a rate limiter
- Processes vs Threads
- Context switching
- How HTTP, HTTPS works (deep, not basic)
- TCP vs UDP
- Load balancing strategies (L4 vs L7)
- Caching
- Kubernetes Pod lifecycle
- How do you choose between Kafka vs RabbitMQ?

---

## Problems
- Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
- You are given two Singly Linked Lists of integers, which may have an intersection point. Your task is to return the first intersection node. If there is no intersection, return NULL.
- Given a singly linked list of 'N' nodes. The objective is to determine the middle node of a singly linked list. However, if the list has an even number of nodes, we return the second middle node.
- Sort an array of 0s, 1s and 2s
- Write a program to do basic string compression. For a character which is consecutively repeated more than once, replace consecutive duplicate occurrences with the count of repetitions. If a string has 'x' repeated 5 times, replace this "xxxxx" with "x5". The string is compressed only when the repeated character count is more than 1.
