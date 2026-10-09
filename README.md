# Motor Financeiro - Pagamento de Motoristas

Projeto da Tech UniDiasUp: calculo do pagamento liquido de motoristas de uma startup de mobilidade.

## Restricoes arquiteturais atendidas

- Sem interfaces.
- Sem composicao de objetos complexos: tudo resolvido com heranca, classe abstrata, polimorfismo e encapsulamento.
- Todos os atributos sao `private`, com acesso por getters.
- Clean Code: nomes descritivos, metodos pequenos, constantes nomeadas (sem numeros magicos).

## Estrutura

| Classe | Papel |
|---|---|
| `Motorista` (abstrata) | Atributos encapsulados, `registrarCorrida` e `calcularPagamentoLiquido` abstrato |
| `MotoristaIniciante` | Plataforma fica com 25%; taxa de inatividade de R$ 50 se tiver menos de 5 corridas |
| `MotoristaPremium` | Plataforma fica com 15%; `registrarCorrida` sobrescrito soma bonus de R$ 2 por corrida ao bruto |
| `MotoristaParceiroFrotista` | Plataforma fica com 20%; desconta aluguel de R$ 800; liquido minimo 0.0 |
| `Main` | Simulacao com um motorista de cada tipo e impressao do extrato |

## Como executar

```bash
javac -d out $(find src -name "*.java")
java -cp out br.com.techunidiasup.corridas.Main
```

Requer JDK 8 ou superior.
