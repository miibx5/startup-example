/*
 *  Projeto.......: BackEndStartup
 *  Developer.....: Éder Luciano da Costa
 *  Copyright.....: 2018
 *  Criação.......: 26/06/2018, 21:43:25
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
public class XEgg extends Lanche
{
    private static final long serialVersionUID = -6676597668550875248L;

    public XEgg(final String nome)
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
        Lanche xEgg = new XEgg("X-Egg");
        if(Objects.isNull(ingredientes) || ingredientes.length <= BigDecimal.ZERO.intValue())
        {
            xEgg.getPreco(xEgg.retornaIngredientes(this.getHamburger(), this.getQueijo()));
        }
        else
        {
            xEgg.getPreco(xEgg.retornaIngredientes(ingredientes));
        }
        return xEgg;
    }

}
