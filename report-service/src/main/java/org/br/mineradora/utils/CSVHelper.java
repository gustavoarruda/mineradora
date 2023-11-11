package org.br.mineradora.utils;

import org.apache.commons.csv.CSVFormat;
import org.br.mineradora.dto.OpportunityDTO;

import java.io.ByteArrayInputStream;
import java.util.List;

public class CSVHelper {

    public static ByteArrayInputStream opportunitiesToCSV(List<OpportunityDTO> opportunities) {
        final CSVFormat format = CSVFormat.DEFAULT.withHeader("ID Proposta", "Cliente", "Preço por Tonelada", "Melhor cotação de moeda");
        return null;
    }

}
