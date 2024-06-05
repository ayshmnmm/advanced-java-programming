# Annotations

Annotations are a form of metadata that provide data about a program that is not part of the program itself. Annotations have no direct effect on the operation of the code they annotate. Annotations have a number of uses, among them:

- Information for the compiler — Annotations can be used by the compiler to detect errors or suppress warnings.
- Compile-time and deployment-time processing — Software tools can process annotation information to generate code, XML files, and so forth.
- Runtime processing — Some annotations are available to be examined at runtime.

## 1. Types of Annotations
```java
{{#include ../../MODULE_1/AnnotationDefaultValueDemo.java}}
```
OUTPUT
```bash
Do not use this bro
@MarkerIt()
@docsAnno()
@MyAnno3(str="some value here")
```

## 2. getAnnotations() vs getDeclaredAnnotations()
`@Inherited` must be used on interface to tell that it can be inherited by subclasses of annotated classes.
```java
{{#include ../../MODULE_1/AnnotatedElementInterfaceDemo.java}}
```
OUTPUT
```bash
getDeclaredAnnotations() output:
getAnnotations() output:
@MyAnno(str="hii")
```
