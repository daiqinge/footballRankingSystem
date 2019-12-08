package com.footballRanking.datasource;

import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class GlobalExecutor {

    /**
     * core thread 50,
     * max thread 200,
     * idle 20s destroy
     */
    private static final ThreadPoolExecutor GLOBAL_THREADPOOL=
            new ThreadPoolExecutor(50,200,20, TimeUnit.SECONDS,new LinkedBlockingDeque<>());

    public static void add(Runnable runnable){
        GLOBAL_THREADPOOL.execute(runnable);
    }

    public static ThreadPoolExecutor getGlobalThreadpool(){
        return GLOBAL_THREADPOOL;
    };
}
