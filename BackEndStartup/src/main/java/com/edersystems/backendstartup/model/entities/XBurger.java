/*
 *  Projeto.......: BackEndStartup
 *  Developer.....: Éder Luciano da Costa
 *  Copyright.....: 2018
 *  Criação.......: 24/06/2018, 22:44:12
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
public class XBurger extends Lanche
{
    public XBurger(final String nome)
    {
        super(nome);
    }

    @Override
    Lanche montarLanche()
    {
        Lanche xBurger = new XBurger("X-Burger");
        xBurger.getPreco(xBurger.retornaIngredientes(this.getHamburger(), this.getQueijo()));
        return xBurger;
    }

}
