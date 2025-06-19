let totalg = 0;
document.getElementById('listaProdutos').innerHTML = '';
document.getElementById('valorTotal').textContent = 'R$ 0';

function adicionar(){
    let produto = document.getElementById(`produto`).value;
    let nomeProduto = produto.split('-')[0];
    let preçoProduto = produto.split('R$')[1];
    let quantidade = document.getElementById(`quantidade`).value;
    let preco = quantidade * preçoProduto;
    let listaProdutos = document.getElementById(`listaProdutos`);
    let total = document.getElementById('valorTotal');
    listaProdutos.innerHTML = listaProdutos.innerHTML + ` <section class="carrinho__produtos__produto">
          <span class="texto-azul">${quantidade}x</span> ${nomeProduto} <span class="texto-azul">R$ ${preco}</span>
        </section>`;


    totalg = totalg + preco;

    total.textContent = `R$${totalg}`;
    document.getElementById('quantidade').value = 0;
}



function limpar(){
    totalg = 0;
    document.getElementById('listaProdutos').innerHTML = '';
    document.getElementById('valorTotal').textContent = 'R$ 0';

}