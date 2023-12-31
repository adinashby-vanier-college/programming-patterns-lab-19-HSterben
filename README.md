[![Review Assignment Due Date](https://classroom.github.com/assets/deadline-readme-button-24ddc0f5d75046c5622901739e7c5dd533143b0c8e959d652212380cedb1ea36.svg)](https://classroom.github.com/a/WSy-iGo-)
# Programming Patterns - Lab 19

This template repository is the starter project for Programming Patterns Lab 19. Written in Java, and tested with Gradle/JUnit.

### Question(s)

Suppose you are given the following code:

```java
class FooBar {
  public void foo() {
    for (int i = 0; i < n; i++) {
      print("foo");
    }
  }

  public void bar() {
    for (int i = 0; i < n; i++) {
      print("bar");
    }
  }
}
```

The same instance of FooBar will be passed to two different threads:

thread `A` will call `foo()`, while
thread `B` will call `bar()`.
Modify the given program to output `"foobar"` `n` times.

**Example 1:**

```
Input: n = 1
Output: "foobar"
Explanation: There are two threads being fired asynchronously. One of them calls foo(), while the other calls bar().
"foobar" is being output 1 time.
```

**Example 2:**

```
Input: n = 2
Output: "foobarfoobar"
Explanation: "foobar" is being output 2 times.
```

**Constraints:**

`1 <= n <= 1000`

### Setup Command

`gradle clean`

### Run Command

`gradle test`
