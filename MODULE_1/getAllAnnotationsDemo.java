import java.lang.annotation.*;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno1
{
    // multi member annotation
    String str();
    int val();
}

@Retention(RetentionPolicy.RUNTIME)
@interface MyAnno2
{
    // single member annotation
    String str();
}

@MyAnno1(str="Annotation 1", val=100)
@MyAnno2(str="Annotation 2")
public class getAllAnnotationsDemo {
    @MyAnno2(str="annotated 2 main method")
    public static void main(String[] args) throws NoSuchMethodException
    {
        // getAllAnnotationsDemo obj = new getAllAnnotationsDemo();
        // Class<?> c = obj.getClass();
        // System.out.println(getAllAnnotationsDemo.class);
        // System.out.println(obj.getClass());

        Class<?> c = getAllAnnotationsDemo.class;
        Annotation allAnnotations[] = c.getAnnotations();
        for (Annotation annotation : allAnnotations) {
            // print str() of annotations
            System.out.println(annotation);
        } 

        Method m = c.getMethod("main", String[].class);
        Annotation allMethodAnnotations[] = m.getAnnotations();
        for (Annotation annotation : allMethodAnnotations) {
            System.out.println(annotation);
        } 

    }
}
