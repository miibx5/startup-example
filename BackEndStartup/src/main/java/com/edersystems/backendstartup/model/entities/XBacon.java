/*
 *  Projeto.......: BackEndStartup
 *  Developer.....: Éder Luciano da Costa
 *  Copyright.....: 2018
 *  Criação.......: 24/06/2018, 22:43:31
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
public class XBacon extends Lanche
{
    public XBacon(final String nome)
    {
        super(nome);
    }

    @Override
    Lanche montarLanche()
    {
        Lanche xBacon = new XBacon("X-Bacon");
        xBacon.getPreco(xBacon.retornaIngredientes(this.getBacon(), this.getHamburger(), this.getQueijo()));
        return xBacon;
    }

}
