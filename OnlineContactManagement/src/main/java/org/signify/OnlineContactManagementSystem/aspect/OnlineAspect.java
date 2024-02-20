package org.signify.OnlineContactManagementSystem.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class OnlineAspect {

    @After("execution(* saveContact(..))")
    public void afterSaveContact() {
        System.out.println("Contact created successfully");
    }

    @After("execution(* updateContact(..))")
    public void afterUpdateContact() {
        System.out.println("Contact updated successfully");
    }
}

