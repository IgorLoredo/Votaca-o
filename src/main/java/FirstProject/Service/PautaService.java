package FirstProject.Service;

import FirstProject.DTO.MessageDTO;
import FirstProject.DTO.Request.PautaRequestDTO;
import FirstProject.DTO.Response.PautaResponseDTO;

public interface PautaService {

    public MessageDTO createPauta(PautaRequestDTO requestDTO);
}
