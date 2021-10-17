package FirstProject.Service.Impl;

import FirstProject.DTO.Request.PautaRequestDTO;
import FirstProject.DTO.Response.PautaResponseDTO;
import FirstProject.Service.PautaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class PautaServiceImpl implements PautaService {

    public PautaResponseDTO createPauta(PautaRequestDTO requestDTO){
        PautaResponseDTO response = new PautaResponseDTO();
        response.setStatus("ior");
        return response;
    }
}
