/*
1. comparar a chave procurada com a chave do nó atual
2. são iguais? 
    achamos o nó ent retorna true
3. o nó atual é nulo? 
    significa que chegamos ao fim do caminho e a chave não existe ent retornamos false
4. a chave procurada é menor?
    fazemos a chamada recursiva para a esquerda
5. é maior? 
    para a direita
*/

public class SearchBST{
    public Node root;

    // constutor
    public SearchBST(){
        this.root = null;
    }

    // metodo publico q o user chama
    public boolean search(int key){
        return search(this.root, key);
    }

    // metdo privado q implementa a logica
    private boolean search(Node node, int key){
        // caso base 3: foi ate o final da arvore e n achou nd
        if(node == null){    
            return false; 
        }

        // caso base 2: achamos o no 
        if(key == node.key){
            return true;
        }

        // caso recursivo 4
        if(key < node.key){
            return search(node.left, key);
        // caso recursivo 5
        }else{
            return search(node.right, key);
        }
    }
}