package org.br.mineradora.controller;

import jakarta.inject.Inject;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Response;
import org.br.mineradora.dto.ProposalDetailsDTO;
import org.br.mineradora.service.ProposalService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Path("/api/proposal")
public class ProposalController {

    private final Logger LOG = LoggerFactory.getLogger(ProposalController.class);

    @Inject
    private ProposalService proposalService;

    @GET
    @Path("/{id}")
    public ProposalDetailsDTO findFullProposal( @PathParam("id") Long id ) {
        return proposalService.findFullProposal(id);
    }

    @POST
    public Response createNewProposal(ProposalDetailsDTO proposalDetailsDTO ) {

        LOG.info("--- Receiving Proposal ---");
        try {
            proposalService.createNewProposal(proposalDetailsDTO);
            return Response.ok().build();
        } catch (Exception e) {
            return Response.serverError().build();
        }

    }
    @DELETE
    @Path("/{id}")
    public Response removeProposal(@PathParam("id") long id){
        LOG.info("--- Removing Proposal ---");
        try {
            proposalService.removeProposal(id);
            return Response.ok().build();
        } catch (Exception e) {
            return Response.serverError().build();
        }
    }
}
