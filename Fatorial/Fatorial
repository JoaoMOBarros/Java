import java.util.ArrayList;
import java.util.List;

public class Fatorial {

    private List<Integer> memoCache = new ArrayList<>();
/*
* A Classe fatorial tem como ideia de trocar o processamento de dados por
* alocação dinamica em memoria, para isso estabelecemos a condição inicial
* realizamos a recursão quando necessário e recuremos o valor array quando possivel
*
* */
    public Integer iterador(Integer entrada){
        if (entrada == 0){
            return 1;
        }else{
            if(entrada <= memoCache.size()){
                System.out.println("-> retirado da memoria");
                return memoCache.get(entrada-1);
            }
            else{
                System.out.println("-> Calculado pelo programa");
                Integer valorFatorial = entrada*iterador(entrada-1);
                memoCache.add(valorFatorial);
                return  valorFatorial;
            }
        }

    }
}
