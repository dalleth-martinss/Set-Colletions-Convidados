import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {

    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados(){
        this.convidadoSet = new HashSet<>();
    }
    public void adicionarConvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null; // esta variavel será usada para armazenar o convidado que deve ser removido
        for(Convidado c : convidadoSet){      //Ele itera sobre o conjunto de convidados.
            if (c.getCodigoConvite() == codigoConvite){ //Para cada convidado, verifica se o código do convite corresponde ao fornecido.
                convidadoParaRemover = c; //Se encontrar o convidado correto, armazena esse convidado na variável e sai do loop.
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);  //Após o loop, remove o convidado encontrado do conjunto.
    }
    public int contarConvidados(){
        return convidadoSet.size();
    }
    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }
}





