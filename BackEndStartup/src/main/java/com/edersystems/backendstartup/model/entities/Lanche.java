/*
 *  Projeto.......: BackEndStartup
 *  Developer.....: Éder Luciano da Costa
 *  Copyright.....: 2018
 *  Criação.......: 24/06/2018, 21:37:05
 *  Revisao.......: $Rev:$, $Id:$
 *  Codificacão...: UTF-8 (Utilizado na criação do arquivo)
 *  @author.......: Luciano
 *  .....................................................................................
 *  Éder L. Costa - © Copyright 2018 - All Rights Reserved
 *  .....................................................................................
 */
package com.edersystems.backendstartup.model.entities;

import java.util.List;
import java.util.Objects;

/**
 *
 * @author Luciano
 */
public class Lanche implements java.io.Serializable
{
    private static final long serialVersionUID = -1756235890624059781L;

    private String nome;

    private List<Ingrediente> ingredientes;

    public Lanche()
    {
        this(null, null);
    }

    public Lanche(String nome, List<Ingrediente> ingredientes)
    {
        this.nome = nome;
        this.ingredientes = ingredientes;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public List<Ingrediente> getIngredientes()
    {
        return ingredientes;
    }

    public void setIngredientes(List<Ingrediente> ingredientes)
    {
        this.ingredientes = ingredientes;
    }

    @Override
    public int hashCode()
    {
        int hash = 5;
        hash = 41 * hash + Objects.hashCode(this.nome);
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
        final Lanche other = (Lanche)obj;
        return Objects.equals(this.nome, other.nome);
    }

    @Override
    public String toString()
    {
        return "Lanche{" + "nome=" + nome + ", ingredientes=" + ingredientes + '}';
    }

}
