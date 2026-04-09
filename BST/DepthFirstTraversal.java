/*
a travessia consiste em passar por todos os nós da árvore
existem duas abordagens principais p isso: 

Busca em Profundidade 
    explorar o máximo de um ramo antes de retroceder 
Busca em Largura 
    explorar todos os nós de um nível antes de ir p prox nivel

nesse arquivo o foco é na busca por profundidade
*/

import java.util.LinkedList;

public class DepthFirstTraversal{
    public Node root; 
    public LinkedList<Integer> preOrderList;
    public LinkedList<Integer> inOrderList;
    public LinkedList<Integer> postOrderList;
    
    //construtor
    public DepthFirstTraversal(){
        this.root = null;
        this.preOrderList = new LinkedList<>();
        this.inOrderList = new LinkedList<>();
        this.postOrderList = new LinkedList<>();
    }

    // PRE ORDEM ------------------
    //metodo publico q o user chama
    public void preOrder(){
        preOrderList.clear();
        preOrder(this.root);
    }
    //metodo privado p implementar a logica
    private void preOrder(Node node){
        // caso base
        if(node == null){
            return;
        }
        
        // pré-ordem: visita - esq - direita
        preOrderList.add(node.key);
        preOrder(node.left);
        preOrder(node.right);
    }
    
    // EM ORDEM -------------------
    public void inOrder() {
        inOrderList.clear();
        inOrder(this.root);
    }
    
    private void inOrder(Node node) {
        //caso base
        if(node == null){
            return;
        }
        
        // em-ordem: esq - visita - direita
        inOrder(node.left);
        inOrderList.add(node.key);
        inOrder(node.right);
    }

    // POS ORDEM ------------------
    public void postOrder(){
        postOrderList.clear();
        postOrder(this.root);
    }

    private void postOrder(Node node){
        if(node == null){
            return;
        }

        // pós-ordem: esq - direita - visita
        postOrder(node.left);
        postOrder(node.right);
        postOrderList.add(node.key);
    }

}