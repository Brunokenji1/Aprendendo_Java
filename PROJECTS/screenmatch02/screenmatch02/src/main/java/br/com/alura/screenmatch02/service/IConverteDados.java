package br.com.alura.screenmatch02.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
}
