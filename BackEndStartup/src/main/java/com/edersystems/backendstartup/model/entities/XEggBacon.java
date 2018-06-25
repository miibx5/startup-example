/*
 *  Projeto.......: BackEndStartup
 *  Developer.....: Éder Luciano da Costa
 *  Copyright.....: 2018
 *  Criação.......: 24/06/2018, 22:44:42
 *  Revisao.......: $Rev:$, $Id:$
 *  Codificacão...: UTF-8 (Utilizado na criação do arquivo)
 *  @author.......: Luciano
 *  .....................................................................................
 *  Éder L. Costa - © Copyright 2018 - All Rights Reserved
 *  .....................................................................................
 */
package com.edersystems.backendstartup.model.entities;

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
    Lanche montarLanche()
    {
        Lanche xEggBacon = new XEggBacon("X-Egg Bacon");
        xEggBacon.getPreco(xEggBacon.retornaIngredientes(this.getOvo(), this.getBacon(), this.getHamburger(), this.getQueijo()));
        return xEggBacon;
    }

}
