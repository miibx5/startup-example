/*
 *  Projeto.......: BackEndStartup
 *  Developer.....: Éder Luciano da Costa
 *  Copyright.....: 2018
 *  Criação.......: 26/06/2018, 21:33:09
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
public class XBacon extends Lanche
{
    private static final long serialVersionUID = 3376515640355370260L;

    public XBacon(final String nome)
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
        Lanche xBacon = new XBacon("X-Bacon");
        if(Objects.isNull(ingredientes) || ingredientes.length <= BigDecimal.ZERO.intValue())
        {
            xBacon.getPreco(xBacon.retornaIngredientes(this.getBacon(), this.getHamburger(), this.getQueijo()));
        }
        else
        {
            xBacon.getPreco(xBacon.retornaIngredientes(ingredientes));
        }

        return xBacon;
    }

}
