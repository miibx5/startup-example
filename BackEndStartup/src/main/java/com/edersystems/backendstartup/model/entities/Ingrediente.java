/*
 *  Projeto.......: BackEndStartup
 *  Developer.....: Éder Luciano da Costa
 *  Copyright.....: 2018
 *  Criação.......: 24/06/2018, 21:24:39
 *  Revisao.......: $Rev:$, $Id:$
 *  Codificacão...: UTF-8 (Utilizado na criação do arquivo)
 *  @author.......: Luciano
 *  .....................................................................................
 *  Éder L. Costa - © Copyright 2018 - All Rights Reserved
 *  .....................................................................................
 */
package com.edersystems.backendstartup.model.entities;

import java.math.BigDecimal;
import java.util.Objects;

/**
 *
 * @author Luciano
 */
public class Ingrediente
{

    private String nome;

    private BigDecimal precoDeCusto;

    public Ingrediente()
    {
        this(null, null);
    }

    public Ingrediente(String nome, BigDecimal preco)
    {

        this.nome = nome;
        this.precoDeCusto = preco;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public BigDecimal getPrecoDeCusto()
    {
        return precoDeCusto;
    }

    public void setPrecoDeCusto(BigDecimal precoDeCusto)
    {
        this.precoDeCusto = precoDeCusto;
    }

    @Override
    public int hashCode()
    {
        int hash = 5;
        hash = 29 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this == obj)
        {
            return true;
        }
        if(obj == null)
        {
            return false;
        }
        if(getClass() != obj.getClass())
        {
            return false;
        }
        final Ingrediente other = (Ingrediente)obj;
        return Objects.equals(this.nome, other.nome);
    }

    @Override
    public String toString()
    {
        return "Ingrediente{" + "nome=" + nome + ", custo=" + precoDeCusto + '}';
    }

}
