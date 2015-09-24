package com.yuantel.util.Aspect;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;






public class LogAspect implements MethodInterceptor {
	public Object invoke(MethodInvocation invocation ) throws Throwable {
		return invocation.proceed();
		}
	/*
	@Autowired
	private LogService logService;
	
	@Override
	public Object invoke(MethodInvocation invocation ) throws Throwable {
		LogInterface logInterface = AnnotationUtils.findAnnotation(
				 invocation.getMethod(), LogInterface.class );

		if(logInterface!=null){
			HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
					.getRequestAttributes()).getRequest();
			HttpSession httpSession = request.getSession();
			User user = (User) httpSession.getAttribute("user");
			if(user!=null){
				Log log=new Log();
				log.setUserName(user.getUsername());
				log.setDescription(logInterface.description());
				logService.addLog(log);
		}else{
				Object obj= invocation.proceed();
			 	user = (User) httpSession.getAttribute("user");
			 	Log log=new Log();
			 	if(user!=null){
			 		log.setUserName(user.getUsername());
					log.setDescription(logInterface.description());
					logService.addLog(log);
			 	}
				return obj;
			}
		}		return invocation.proceed();
	}
	*/
	
	/*
	private void resolvePassport(Method handlerMethod, Object[] args, HttpServletRequest request) {
        // 获得 登陆信息对象 通常由前端的服务器传入，Request对象中获取
        // final User passport = ...
        for ( int i = 0; i < args.length; i++ ) {
            MethodParameter methodParam = new MethodParameter(handlerMethod, i);
            Annotation[] paramAnns = methodParam.getParameterAnnotations();
            for (Annotation paramAnn : paramAnns) {
                if ( Part.class.isInstance( paramAnn ) ) {
                    Passport passportAnnotation = (Passport) paramAnn;
                    if ( passportAnnotation.required() ) {
                        if ( passport != null ) {
                            args[i] = passport;
                        }
                        else {
                            if ( isLocal() ) {
                                args[i] = passportAnnotation.testValue();
                            }
                        }
                    }
                }
            }
        }
    }*/

}
