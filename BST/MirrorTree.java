/*
todos os filhos da esquerda passam a ser filhos da direita, e todos os filhos da direita passam a ser filhos da esquerda 

1. caso base: nó atual nulo
    apenas encerramos a execução (retorno vazio)
2. chamada recursiva: espelhar 
    2.1 primeiro a subárvore da esquerda 
    2.2 em seguida, a subárvore da direita
3. swap: variável temporária para 
    troca o ponteiro node.left pelo node.right
*/

public class MirrorTree {
    public Node root;

    public MirrorTree(){
        this.root = null;
    }

    public void mirror() {
        mirror(this.root);
    }

    private void mirror(Node node) {
        //caso base
        if (node == null) {
            return;
        }

        //chamada recursiva 2.1
        mirror(node.left);

        // chamada recursiva 2.2
        mirror(node.right);

        // caso swap
        Node aux = node.left;
        node.left = node.right;
        node.right = aux;
    }
}
