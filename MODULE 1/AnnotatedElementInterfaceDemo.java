import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
// @Inherited
@interface MyAnno
{
    String str();
}

@MyAnno(str="hii")
class A {
}

class B extends A {
}

public class AnnotatedElementInterfaceDemo {
    public static void main(String[] args) {
        Class<?> AClass = A.class;
        @SuppressWarnings("unused")
        Class<?> BClass = B.class;  // same as obj.getClass()

        Annotation a[] = AClass.getDeclaredAnnotations();
        for (Annotation annotation : a) {
            System.out.println(annotation);
        }

        Annotation b[] = BClass.getAnnotations();
        for (Annotation annotation : b) {
            System.out.println(annotation);
        }
    }
}
