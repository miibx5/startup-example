/*
 *  Projeto.......: BackEndStartup
 *  Developer.....: Éder Luciano da Costa
 *  Copyright.....: 2018
 *  Criação.......: 26/06/2018, 21:41:24
 *  Revisao.......: $Rev:$, $Id:$
 *  Codificacão...: UTF-8 (Utilizado na criação do arquivo)
 *  @author.......: Luciano
 *  .....................................................................................
 *  Éder L. Costa - © Copyright 2018 - All Rights Reserved
 *  .....................................................................................
 */
package com.edersystems.backendstartup.model.entities;

import java.math.BigDecimal;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author Luciano
 */
public class XBurger extends Lanche
{
    private static final long serialVersionUID = -7236176102972726462L;

    public XBurger(final String nome)
    {
        super(nome);
    }

    @Override
    BigDecimal getPreco(List<Ingrediente> ingredientes)
    {
        return BigDecimal.ZERO;
    }

    @Override
    Lanche montarLanche(Ingrediente... ingredientes)
    {
        Lanche xBurger = new XBurger("X-Burger");
        if(Objects.isNull(ingredientes) || ingredientes.length <= BigDecimal.ZERO.intValue())
        {
            xBurger.getPreco(xBurger.retornaIngredientes(this.getHamburger(), this.getQueijo()));
        }
        else
        {
            xBurger.getPreco(xBurger.retornaIngredientes(ingredientes));
        }

        return xBurger;
    }

}
