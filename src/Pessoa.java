public class Pessoa {

    private String primeiroNome;
    private String sobrenome;

    public Pessoa(String primeiroNome, String sobrenome){
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
    }
    public String getNomeCompleto(){
        return primeiroNome+" "+sobrenome;
    }
}
