package com.atom8.functional.interfaces;

/**
 * Created by thehellmaker on 11/27/2017.
 */
public interface IMapFunction<I, O> {

    /**
     * Transformer input of type I to output object type O
     */
    O map(I input) throws Exception;

}
