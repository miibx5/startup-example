/*
 *  Projeto.......: BackEndStartup
 *  Developer.....: Éder Luciano da Costa
 *  Copyright.....: 2018
 *  Criação.......: 26/06/2018, 21:45:25
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
public class XEggBacon extends Lanche
{
    public XEggBacon(final String nome)
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
        Lanche xEggBacon = new XEggBacon("X-Egg Bacon");
        if(Objects.isNull(ingredientes) || ingredientes.length <= BigDecimal.ZERO.intValue())
        {
            xEggBacon.getPreco(xEggBacon.retornaIngredientes(this.getOvo(), this.getBacon(), this.getHamburger(), this.getQueijo()));
        }
        else
        {
            xEggBacon.getPreco(xEggBacon.retornaIngredientes(ingredientes));
        }
        return xEggBacon;
    }

}
