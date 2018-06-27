/*
 *  Projeto.......: BackEndStartup
 *  Developer.....: Éder Luciano da Costa
 *  Copyright.....: 2018
 *  Criação.......: 26/06/2018, 22:11:09
 *  Revisao.......: $Rev:$, $Id:$
 *  Codificacão...: UTF-8 (Utilizado na criação do arquivo)
 *  @author.......: Luciano
 *  .....................................................................................
 *  Éder L. Costa - © Copyright 2018 - All Rights Reserved
 *  .....................................................................................
 */
package com.edersystems.backendstartup.model.rest;

import com.edersystems.backendstartup.model.entities.Ingrediente;
import com.edersystems.backendstartup.model.entities.Lanche;
import java.util.Calendar;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Luciano
 */
public class Pedido
{
    private Long numero;

    private String nome;

    private Lanche lanche;

    private List<Ingrediente> ingredientes;

    public Pedido()
    {
    }

    public Pedido(String nome, Lanche lanche, List<Ingrediente> ingredientes)
    {
        this.numero = Calendar.getInstance().getTimeInMillis();
        this.nome = nome;
        this.lanche = lanche;
        this.ingredientes = ingredientes;
    }

    public Long getNumero()
    {
        return numero;
    }

    public void setNumero(Long numero)
    {
        this.numero = numero;
    }

    public String getNome()
    {
        return nome;
    }

    public void setNome(String nome)
    {
        this.nome = nome;
    }

    public Lanche getLanche()
    {
        return lanche;
    }

    public void setLanche(Lanche lanche)
    {
        this.lanche = lanche;
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
        hash = 89 * hash + Objects.hashCode(this.numero);
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
        final Pedido other = (Pedido)obj;
        return Objects.equals(this.numero, other.numero);
    }

    @Override
    public String toString()
    {
        return "Pedido{" + "numero=" + numero + ", nome=" + nome + ", lanche=" + lanche + ", ingredientes=" + ingredientes + '}';
    }

}
