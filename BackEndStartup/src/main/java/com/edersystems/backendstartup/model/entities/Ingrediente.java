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
public class Ingrediente implements java.io.Serializable
{
    private static final long serialVersionUID = 8065281343260452403L;

    private Long id;

    private String nome;

    private BigDecimal preco;

    public Ingrediente()
    {
        this(null, null, null);
    }

    public Ingrediente(Long id, String nome, BigDecimal preco)
    {
        this.id = id;
        this.nome = nome;
        this.preco = preco;
    }

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id = id;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public BigDecimal getPreco()
    {
        return preco;
    }

    public void setPreco(BigDecimal preco)
    {
        this.preco = preco;
    }

    @Override
    public int hashCode()
    {
        int hash = 3;
        hash = 59 * hash + Objects.hashCode(this.id);
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
        return Objects.equals(this.id, other.id);
    }

    @Override
    public String toString()
    {
        return "Ingrediente{" + "id=" + id + ", nome=" + nome + ", preco=" + preco + '}';
    }

}
