package FirstProject.Service.Impl;

import FirstProject.DTO.MessageDTO;
import FirstProject.DTO.Request.PautaRequestDTO;
import FirstProject.DTO.Response.PautaResponseDTO;
import FirstProject.Domain.Pauta;
import FirstProject.Repository.PautaRepository;
import FirstProject.Service.PautaService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Slf4j
@Service
public class PautaServiceImpl implements PautaService {

    @Autowired
    private PautaRepository repository;


    public MessageDTO createPauta(PautaRequestDTO requestDTO){
        try{
            Pauta pauta = Pauta.toRest(requestDTO);
            repository.save(pauta);
            MessageDTO messageDTO = new MessageDTO();
            messageDTO.setStatus("Pauta criada com sucesso");
            return messageDTO;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return new MessageDTO();
    }
}
