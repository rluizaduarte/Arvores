/*
o método insert "desce" pela árvore chamando a si mesmo até encontrar um espaço vazio 
(no == null) e, quando encontra, cria o new Node(key). 
em seguida, na volta da recursão, ele vai "costurando" a árvore de volta usando os 
retornos (return node).
*/

public class InsertionBST {
	// toda classe precisa comecar criando a raiz
	public Node root;

	// construtor
	public InsertionBST(){
		//inicialmente a arvore ta vazia
		this.root = null;
	}

	// metodo publico que o user chama
	public insert(int key){
		// todo o resultado da inserção é atribuido a raiz
		this.root = insert(this.root, key)
	}

	// metodo privado q a implementa a logica
	private Node insert(Node node, int key){
		// caso base: o nó é nulo?
		if(node == null){
			// retorna um novo nó passando a chave
			return new Node(key);
		}

		// caso recursivo: inserir na direita ou na esquerda
		if(key < node.key){
			//inserção na esquerda
			no.left = insert(node.left, key);
		}else if(key > no.key){
			// inserção na direita
			no.right = inser(node.right, key);
		}

		//retorna o nó inalterado para reconstruir a árvore na volta da recursão
		return node;
	}
}