import java.lang.annotation.*;

// default value & single member annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno3
{
    String str() default "some value here";
}

// marker annotation
@Retention(RetentionPolicy.RUNTIME)
@interface MarkerIt
{
    // supposed to be empty
}

// Documented annotation
@Documented
@Retention(RetentionPolicy.RUNTIME)
@interface docsAnno
{
    // String someone() default "docsy";
}


@MarkerIt
@docsAnno
@MyAnno3
public class AnnotationDefaultValueDemo {
    @Deprecated(since = "v1.0.34")
    static void doSomething() {
        System.out.println("Do not use this bro");
    }
    public static void main(String[] args) {
        doSomething();
        Annotation a[] = AnnotationDefaultValueDemo.class.getAnnotations();
        for (Annotation annotation : a) {
            System.out.println(annotation);
        }
    }
}
