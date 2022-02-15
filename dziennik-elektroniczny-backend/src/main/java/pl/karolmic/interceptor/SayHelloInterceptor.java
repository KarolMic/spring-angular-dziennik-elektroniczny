package pl.karolmic.interceptor;

import javax.interceptor.AroundInvoke;
import javax.interceptor.Interceptor;
import javax.interceptor.InvocationContext;

//@MySayHelloInterceptorBinding
@Interceptor
public class SayHelloInterceptor {

    @AroundInvoke
    public Object audit(InvocationContext ictx) throws Exception{
//        String interceptorText = "\nSay hello interceptor\n";
//        System.out.println(interceptorText);
//        return interceptorText;
        Object[] parameters = ictx.getParameters();
        parameters[0] = "Hello";
        ictx.setParameters(parameters);
        System.out.println("Say hello");
        return ictx.proceed();
    }

}
