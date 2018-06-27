/*
 *  Projeto.......: BackEndStartup
 *  Developer.....: Éder Luciano da Costa
 *  Copyright.....: 2018
 *  Criação.......: 26/06/2018, 21:30:26
 *  Revisao.......: $Rev:$, $Id:$
 *  Codificacão...: UTF-8 (Utilizado na criação do arquivo)
 *  @author.......: Luciano
 *  .....................................................................................
 *  Éder L. Costa - © Copyright 2018 - All Rights Reserved
 *  .....................................................................................
 */
package com.edersystems.backendstartup.model.entities;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Luciano
 */
public abstract class Lanche implements java.io.Serializable
{
    private static final long serialVersionUID = 3746576193671610368L;

    private String nome;

    private List<Ingrediente> ingredientes;

    protected Ingrediente alface = new Ingrediente("Alface", BigDecimal.valueOf(0.40d));

    protected Ingrediente bacon = new Ingrediente("Bacon", BigDecimal.valueOf(2d));

    protected Ingrediente hamburger = new Ingrediente("Hambúrger de Carne", BigDecimal.valueOf(3d));

    protected Ingrediente ovo = new Ingrediente("Ovo", BigDecimal.valueOf(0.80d));

    protected Ingrediente queijo = new Ingrediente("Queijo", BigDecimal.valueOf(1.50d));

    abstract Lanche montarLanche(Ingrediente... ingredientes);

    abstract BigDecimal getPreco(List<Ingrediente> ingredientes);

    public Lanche()
    {
        this(null, null);
    }

    public Lanche(String nome)
    {
        this(nome, null);
    }

    public Lanche(String nome, List<Ingrediente> ingredientes)
    {
        this.nome = nome;
        this.ingredientes = ingredientes;
    }

    protected List<Ingrediente> retornaIngredientes(Ingrediente... ingredientes)
    {
        if(Objects.isNull(this.ingredientes))
        {
            this.ingredientes = new ArrayList<>();
        }
        this.ingredientes.addAll(Arrays.asList(ingredientes));
        return this.ingredientes;
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

    public Ingrediente getAlface()
    {
        return alface;
    }

    public void setAlface(Ingrediente alface)
    {
        this.alface = alface;
    }

    public Ingrediente getBacon()
    {
        return bacon;
    }

    public void setBacon(Ingrediente bacon)
    {
        this.bacon = bacon;
    }

    public Ingrediente getHamburger()
    {
        return hamburger;
    }

    public void setHamburger(Ingrediente hamburger)
    {
        this.hamburger = hamburger;
    }

    public Ingrediente getOvo()
    {
        return ovo;
    }

    public void setOvo(Ingrediente ovo)
    {
        this.ovo = ovo;
    }

    public Ingrediente getQueijo()
    {
        return queijo;
    }

    public void setQueijo(Ingrediente queijo)
    {
        this.queijo = queijo;
    }

}
