# 🎟️ Sistema de Ingressos para Eventos

## 📌 Objetivo

Desenvolver um sistema Java Desktop para gerenciar diferentes tipos de ingressos — Normal, VIP e Meia-entrada — permitindo o **cadastro**, **consulta** e **cálculo de valores**, com uso dos conceitos de **herança** e **polimorfismo**.

---

## 📄 Descrição da Atividade

### 🔍 Análise e Modelagem

- **Identificação de Requisitos**:
  - Cadastrar ingressos para eventos.
  - Calcular o valor do ingresso conforme o tipo (Normal, VIP, Meia-entrada).
  - Exibir os detalhes do ingresso (informações e valor final).

- **Diagrama de Classes**:
  - Uma classe abstrata `Ingresso`.
  - Três subclasses: `IngressoNormal`, `IngressoVIP` e `IngressoMeia`.
  - Métodos abstratos:
    - `calcularValor()`
    - `imprimirIngresso()`

- **Diagrama de Sequência**:
  - Representa o caso de uso "Comprar Ingresso".
  - Demonstra como um objeto `Ingresso` pode ser tratado de forma uniforme, independentemente do tipo.

---

## 💻 Desenvolvimento em Java Desktop

- **Ambiente de Desenvolvimento**: 
  - Compatível com qualquer IDE Java (NetBeans, Eclipse, IntelliJ, etc.)

- **Implementação**:
  - Classe abstrata `Ingresso` com métodos para cálculo de valor e impressão.
  - Subclasses sobrescrevendo os métodos de acordo com as regras de negócio específicas.

- **Interface Gráfica (Swing)**:
  - Seleção do tipo de ingresso.
  - Entrada dos dados do evento.
  - Visualização de valor e detalhes do ingresso.
  - Demonstração prática de polimorfismo.

---

## ✅ Checklist de Entrega

- [x] Diagrama de Classes (UML)
- [x] Diagrama de Sequência (UML)
- [x] Código-fonte Java com uso de herança e polimorfismo
- [x] Interface gráfica funcional (Swing)
- [x] Relatório explicativo das decisões de modelagem e implementação

---

## 📚 Conceitos Aplicados

- **Herança**: Uma superclasse `Ingresso` e subclasses especializadas.
- **Polimorfismo**: Permite tratar diferentes tipos de ingresso de maneira uniforme, chamando os mesmos métodos (`calcularValor`, `imprimirIngresso`) com comportamentos distintos.
- **Escalabilidade**: Sistema preparado para inclusão futura de novos tipos de ingresso com facilidade.

---

## ✨ Autor

Desenvolvido por Gabriel como parte de atividade prática para fixação dos conceitos de POO com Java Desktop.
