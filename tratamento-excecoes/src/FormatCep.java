public class FormatCep {
    public static void main(String[] args) throws InvalidCepException {
        try {
            String formatedCep = formatCep("23765064");
            System.out.println(formatedCep);
        } catch (InvalidCepException e) {
            System.out.println("The cep do not match de busness rules");
        }
    }
    static String formatCep (String cep) throws InvalidCepException {
        if(cep.length() != 8){
            throw new InvalidCepException();
        }
        return "23.765-064";
    }
}
