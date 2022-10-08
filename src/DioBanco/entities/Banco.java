package DioBanco.entities;

import java.util.ArrayList;
import java.util.List;

public class Banco {

    private List<Conta> list = new ArrayList<>();

    public Banco(){
    }

    public List<Conta> getList() {
        return list;
    }

    public void addList(Conta conta){
        list.add(conta);
    }

    @Override
    public String toString() {
        return "Banco{" +
                "list=" + list +
                '}';
    }
}
