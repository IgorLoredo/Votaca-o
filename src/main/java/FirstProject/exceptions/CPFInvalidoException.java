package FirstProject.exceptions;

public class CPFInvalidoException extends Exception{
    public CPFInvalidoException( String cpf){
        super("CPF " + cpf + "é invalido");
    }
}
