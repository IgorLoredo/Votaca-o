package FirstProject.Service;

import FirstProject.DTO.MessageDTO;
import FirstProject.DTO.Request.VotoRequestDTO;

public interface VotoService {

    public MessageDTO addVoto(VotoRequestDTO requestDTO);
}
