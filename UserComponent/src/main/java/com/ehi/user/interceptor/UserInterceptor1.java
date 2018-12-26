package com.ehi.user.interceptor;

import com.ehi.component.anno.EHiInterceptorAnno;
import com.ehi.component.support.EHiRouterInterceptor;

/**
 * time   : 2018/12/03
 *
 * @author : xiaojinzi 30212
 */
@EHiInterceptorAnno(priority = 5)
public class UserInterceptor1 implements EHiRouterInterceptor {

    public UserInterceptor1() {
    }

    @Override
    public void intercept(Chain chain) throws Exception {
        chain.proceed(chain.request());
    }

}