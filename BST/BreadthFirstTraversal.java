/*
a travessia consiste em passar por todos os nós da árvore
existem duas abordagens principais p isso: 

Busca em Profundidade 
    explorar o máximo de um ramo antes de retroceder 
Busca em Largura 
    explorar todos os nós de um nível antes de ir p prox nivel

nesse arquivo o foco é na busca em largura
*/

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BreadthFirstTraversal {
    public Node root;
    public LinkedList<Integer> resultList;

    //construtor 
    public BreadthFirstTraversal(){
        this.root = null;
        this.resultList = new LinkedList<>();
    }

    //método público p a travessia em largura
    public List<Integer> breadthFirst(){
        resultList.clear();
        Queue<Node> queue = new LinkedList<>();

        //inicializando a fila Q adicionando a raiz
        if (this.root != null) {
            queue.add(this.root);
        }

        // enquanto a fila não estiver vazia:
        while (!queue.isEmpty()) {
            // retirar primeiro elemento 'no' da fila
            Node currentNode = queue.poll();

            //adicionando na lista de resultado
            resultList.add(currentNode.key);

            // adicionar filhos do nó no final da fila
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }

        return resultList;
    }
}
