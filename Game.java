public class Game {
    // 🔒 Atributos privados (encapsulados)
    private String nome;
    private double preco;
    private String categoria;
    private int classificacaoEtaria;

    // 🎯 Construtor
    public Game(String nome, double preco, String categoria, int classificacao) {
        this.nome = nome;
        this.preco = preco;
        this.categoria = categoria;
        this.classificacaoEtaria = classificacao;
    }

    // 📥 Getters
    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getClassificacaoEtaria() {
        return classificacaoEtaria;
    }

    // 📤 Setters com validação
    public void setNome(String nome) {
        if (nome != null && !nome.isEmpty()) {
            this.nome = nome;
        }
    }

    public void setCategoria(String categoria) {
        if (categoria != null && !categoria.isEmpty()) {
            this.categoria = categoria;
        }
    }

    public void setPreco(double preco) {
        if (preco >= 0) {
            this.preco = preco;
        }
    }

    public void setClassificacaoEtaria(int idade) {
        if (idade >= 0 && idade <= 18) {
            this.classificacaoEtaria = idade;
        }
    }

    // 🖨️ Método para exibir informações do jogo
    public static void exibirInformacoes(Game jogo) {
        System.out.println("Nome do jogo: " + jogo.getNome());
        System.out.println("Categoria: " + jogo.getCategoria());
        System.out.println("Preço do jogo: R$" + jogo.getPreco());
        System.out.println("Classificação etária: " + jogo.getClassificacaoEtaria() + " anos");
        System.out.println("-----------------------------------");
    }

    // 🚀 Método principal para testar a classe
    public static void main(String[] args) {
        Game jogo = new Game("Minecraft", 99.99, "Aventura", 10);
        Game jogo2 = new Game("The Witcher 3", 199.99, "RPG", 18);
        Game jogo3 = new Game("FIFA 21", 249.99, "Esporte", 0);

        exibirInformacoes(jogo);
        exibirInformacoes(jogo2);
        exibirInformacoes(jogo3);

        // 🧪 Testar preço inválido
        jogo.setPreco(-10.00); // Não deve alterar
        System.out.println("Tentativa de preço inválido: R$" + jogo.getPreco());

        // 🧪 Testar classificação etária válida
        jogo.setClassificacaoEtaria(12);
        System.out.println("Classificação etária atualizada: " + jogo.getClassificacaoEtaria());

        // 🧪 Testar classificação etária inválida
        jogo.setClassificacaoEtaria(25); // Não deve alterar
        System.out.println("Tentativa de classificação inválida: " + jogo.getClassificacaoEtaria());
    }
}