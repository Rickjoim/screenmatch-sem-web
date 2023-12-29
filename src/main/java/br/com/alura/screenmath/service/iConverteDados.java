package br.com.alura.screenmath.service;

public interface iConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
