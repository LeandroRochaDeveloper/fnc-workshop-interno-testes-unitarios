public class ErroneousValueException extends Exception {

    @Override
    public String getMessage() {
        return "Valor incorreto informado";
    }

}
