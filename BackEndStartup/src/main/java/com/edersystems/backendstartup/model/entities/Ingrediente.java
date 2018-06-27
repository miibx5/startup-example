/*
 *  Projeto.......: BackEndStartup
 *  Developer.....: Éder Luciano da Costa
 *  Copyright.....: 2018
 *  Criação.......: 26/06/2018, 21:29:28
 *  Revisao.......: $Rev:$, $Id:$
 *  Codificacão...: UTF-8 (Utilizado na criação do arquivo)
 *  @author.......: Luciano
 *  .....................................................................................
 *  Éder L. Costa - © Copyright 2018 - All Rights Reserved
 *  .....................................................................................
 */
package com.edersystems.backendstartup.model.entities;

import java.math.BigDecimal;

/**
 *
 * @author Luciano
 */
public class Ingrediente implements java.io.Serializable
{
    private static final long serialVersionUID = -4473159330572977721L;

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

}
