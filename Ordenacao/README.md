PRÁTICA - ORDENAÇÃO

Você foi contratado para desenvolver um sistema que ordene uma lista de números de diferentes maneiras, dependendo da escolha do usuário. Para isso, você deve implementar o padrão Strategy, garantindo flexibilidade para adicionar novos algoritmos de ordenação no futuro.
Requisitos:
Crie uma interface EstrategiaOrdenacao com o método ordenar(List<Integer> numeros) que cada estratégia de ordenação implementará.
Crie classes concretas que representem diferentes estratégias de ordenação:
OrdenacaoBubbleSort
OrdenacaoSelectionSort
OrdenacaoInsertionSort
Cada uma deve implementar o método ordenar(List<Integer> numeros) da interface EstrategiaOrdenacao.
Crie uma classe ContextoDeOrdenacao que terá uma referência para um objeto do tipo EstrategiaOrdenacao. Esta classe deverá ter os métodos:
setEstrategia(EstrategiaOrdenacao estrategia): para definir qual estratégia será utilizada.
executarOrdenacao(List<Integer> numeros): que executa o método ordenar() da estratégia definida.
Na classe Principal, permita ao usuário escolher qual algoritmo de ordenação será usado e aplique a ordenação à lista fornecida.