public class Produto {
    double preco;
    
    double calculardesconto(){
        return(this.preco/100)*75;
    }
}
