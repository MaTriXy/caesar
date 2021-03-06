package com.github.vbauer.caesar.runner.impl;

import com.github.vbauer.caesar.runner.impl.base.AbstractReturnMethodRunner;
import rx.Observable;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;

/**
 * @author Vladislav Bauer 
 */

@SuppressWarnings("all")
public class ObservableMethodRunner extends AbstractReturnMethodRunner {

    @Override
    public Object wrapResultFuture(final Future<?> future, final ExecutorService executor) {
        return Observable.from(future);
    }

    @Override
    protected Class<?> getReturnClass() {
        return Observable.class;
    }

}
