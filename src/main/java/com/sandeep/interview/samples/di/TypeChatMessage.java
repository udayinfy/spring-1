package com.sandeep.interview.samples.di;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

/**
 * Created by SMALA on 10/8/2015.
 */
public class TypeChatMessage implements MessageService, InitializingBean, DisposableBean {

    private String messageOne;
    private String messageTwo;

    public TypeChatMessage(String msg1, String msg2) {
        this.messageOne = msg1;
        this.messageTwo = msg2;
    }

    @Override
    public String getMessageOne() {
        return messageOne + "||" + messageTwo;
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("\nInitializingBean.afterPropertiesSet : " + this.getClass());
    }

    public void create() {
        System.out.println("create : " + this.getClass());
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean.destroy : " + this.getClass());
    }

    public void destroyUserDefined() {
        System.out.println("destroy : " + this.getClass());
    }

}
