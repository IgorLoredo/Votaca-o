package FirstProject.exceptions;

public class VotoException extends Exception {
    public VotoException(Long id, String cpf){
        super("O asscioado com CPF" + cpf+ "já votou nessa Sessão " + id);
    }
}
