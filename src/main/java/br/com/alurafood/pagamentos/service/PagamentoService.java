package br.com.alurafood.pagamentos.service;

import br.com.alurafood.pagamentos.repository.PagamentoRepository;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class PagamentoService {
    @Autowired
    private PagamentoRepository repository;


    private ModelMapper modelMapper;



}
