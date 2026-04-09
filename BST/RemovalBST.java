/*
1. nó sem filhos (nó folha): 
	caso mais simples. só remover o nó
2. nó com apenas um filho: 
	só "subir" esse filho p posição do nó que tá sendo 
	removido
3. nó com dois filhos: 
	caso mais complexo. precisa substituir o nó que vai 
	sair por um "candidato" viável para manter a ordem 
	da árvore. temos dois candidatos possíveis:
		3.1 o maior nó do ramo esquerdo 
		3.2 ou o menor nó do ramo direito
*/

// neste algoritmo usaremos o caso 3.1
public class RemovalBST{
	public Node root;

	// construtor
	public RemovalBST(){
		this.root = null;
	}

	// método publico que o user chama
	public void delete(int key){
		this.root = delete(this.root, key);
	}

	// método privado que aplica a logica	
	private Node delete(Node node, int key){
		// caso base: arvore vazia ou valor n ta no nó
		if (node == null){
			return null;
		}
		
		// caso recursivo: procurar o valor
		if(key < node.key){
			// valoor ta na esquerda
			node.left = delete(node.left, key);
		}else if(key > node.key){
			// valor ta na direita
			node.right = delete(node.right, key);
		}else{
			// key == node.key. achamos o no p ser removido

			// caso 1: folha e caso 2: apemas um filho
			if(node.left == null){
				return node.right;
			}else if(node.right == null){
				return node.left;
			}

			// caso 3: o no tem dois filhos
			
			// implementando 3.1: maior valor do ramo esquerdo
			Node maxNode = maxLeft(node.left);
			// substitui o valor do no atual pelo valor encontrado
			node.key = maxNode.key;
			//remove o no q foi consiferado o maior da esquerda
			node.left = delete(node.left, maxNode.key);

			/* 
			// implementando 3.2: menor valor do ramo direito
            Node minNode = minRight(node.right);
            // substitui o valor do nó atual pelo menor valor encontrado
            node.key = minNode.key;
            // remove o nó que foi movido (o menor da direita)
            node.right = delete(node.right, minNode.key);
			*/
		}

		//costurando a árvore na volta da recursão
		return node;
	}

	//metodos auxiliares pra achar os valores

	//3.1
	private Node maxLeft(Node node){
		while(node.right != null){
			node = node.right;
		}
		return node;
	}
	/* 	
	// 3.2
	private Node minRight(Node node){
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }
	*/
}