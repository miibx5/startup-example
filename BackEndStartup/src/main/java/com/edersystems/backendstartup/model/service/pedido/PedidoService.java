/*
 *  Projeto.......: BackEndStartup
 *  Developer.....: Éder Luciano da Costa
 *  Copyright.....: 2018
 *  Criação.......: 26/06/2018, 22:21:33
 *  Revisao.......: $Rev:$, $Id:$
 *  Codificacão...: UTF-8 (Utilizado na criação do arquivo)
 *  @author.......: Luciano
 *  .....................................................................................
 *  Éder L. Costa - © Copyright 2018 - All Rights Reserved
 *  .....................................................................................
 */
package com.edersystems.backendstartup.model.service.pedido;

import com.edersystems.backendstartup.model.entities.Ingrediente;
import com.edersystems.backendstartup.model.rest.Pedido;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 *
 * @author Luciano
 */
@Path("/pedido")
public class PedidoService
{
    @GET
    @Path("/get")
    @Produces(MediaType.APPLICATION_JSON)
    public Pedido pedido(final Long numero)
    {
        return null;
    }

    @POST
    @Path("/post")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response pedido(final String nome, final Ingrediente... ingredientes)
    {
        return null;
    }
}
