## Eleição

<p><strong>Implementado as entidades e arquivos de mapeamento do Hibernate de forma a simular
um processo eleitoral. </p> 
<p>As entidades com seus atributos e as associações entre elas
podem ser vistas no diagrama abaixo:</strong></p>
<br>
<p align="center">
<img src="https://github.com/740fernando/projeto-processo-eleitoral/blob/master/assets/diagrama.PNG" />
</p>
<br>
<p><strong> Depois de pronta a implementação do modelo, foi criado a classe InserirDados que possui
um método main(). Ao ser executado, este método é responsável por criar as
entidades no banco de dados. Os dados devem refletir o que está contido na tabela
abaixo:</strong> </p>
<br>
<p align="center">
<img src="https://github.com/740fernando/projeto-processo-eleitoral/blob/master/assets/tabelaVotos.JPEG">
</p>
<br>
<p><strong>Foi criada uma classe ConsultarDados com um método main() que, ao ser
executada, faz uma busca nas entidades cadastradas no banco de dados. Os dados a
serem extraídos são:</strong></p>

1. Listar o nome de todos os candidatos a presidente. A lista deve ser ordenada
pelo nome dos candidatos.
2. Listar os candidatos e seus respectivos cargos nos quais o eleitor, cujo título é
56723, votou.
3. Mostrar o nome de cada candidato votado junto com o número de votos que
recebeu (dica: use o COUNT(*) e o GROUP BY para fazer a contagem dos votos).
