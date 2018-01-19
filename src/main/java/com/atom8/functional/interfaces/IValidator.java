package com.atom8.functional.interfaces;

/**
 * Created by thehellmaker on 11/27/2017.
 */
public interface IValidator<I> {

    /**
     * Validate the input passed to the functions. If the input is valid then the function returns safely else
     * it throws an Exception
     */
    void validate(I i) throws Exception;

}
