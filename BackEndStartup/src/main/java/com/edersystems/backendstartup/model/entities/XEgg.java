/*
 *  Projeto.......: BackEndStartup
 *  Developer.....: Éder Luciano da Costa
 *  Copyright.....: 2018
 *  Criação.......: 24/06/2018, 22:44:26
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
public class XEgg extends Lanche
{
    public XEgg(final String nome)
    {
        super(nome);
    }

    @Override
    Lanche montarLanche()
    {
        Lanche xEgg = new XEgg("X-Egg");
        xEgg.getPreco(xEgg.retornaIngredientes(this.getHamburger(), this.getQueijo()));
        return xEgg;
    }
}
