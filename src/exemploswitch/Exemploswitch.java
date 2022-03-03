package exemploswitch;


public class Exemploswitch {
    private int opcao;
    
    public int getOpcao(){
        return opcao;
    }
    public void setOpcao(int opcao){
        this.opcao=opcao;
    }
    public String escolherEstacao(){
        String texto;
        switch(this.opcao){
        case 1:
        texto = "Dez.Jan.Fev";
        break;
        case 2:
        texto = "Mar, Abril, Maio";
        break;
        case 3:
        texto = "Jun, Jul, Ago";
        break;
        case 4:
        texto = "Set, out, nov";
        break;
        default:
        texto = "Opção inválida";
        break;
    }
        return texto;
        
        
       
    }
@Override
    public String toString(){
    return "\nMeses da estação: "+escolherEstacao();
}
}
