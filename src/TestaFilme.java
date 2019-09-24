public class TestaFilme {
    public static void main(String[] args){
        Data d1 = new Data();
        d1.dia = 10;
        d1.mes = 10;
        d1.ano = 2010;
        
        Filme f1 = new Filme();
        f1.nome = "Rat race";
        f1.nota = 10;
        f1.dataDeLancamento = d1;
        System.out.println(d1.imprimir());
    }
}
