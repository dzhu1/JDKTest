package annotation;

import java.lang.reflect.Method;

public class App {
	
    @MethodInfo(
            author = "dzhu1",
            date = "2014/02/14",
            version = 2)
    public String getAppName() {
        return "trinea";
    }
    
    public static void main(String[] args) {
        try {
            Class cls = Class.forName("annotation.App");
            for (Method method : cls.getMethods()) {
                MethodInfo methodInfo = method.getAnnotation(MethodInfo.class);
                if (methodInfo != null) {
                    System.out.println("method name:" + method.getName());
                    System.out.println("method author:" + methodInfo.author());
                    System.out.println("method version:" + methodInfo.version());
                    System.out.println("method date:" + methodInfo.date());
                }
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }    

}
