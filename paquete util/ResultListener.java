package com.digitalhouse.retrofitcompleto.DAO;

public interface ResultListener<T> {
    void finish(T resultado);
}
