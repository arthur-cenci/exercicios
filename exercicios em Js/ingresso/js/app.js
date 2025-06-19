//document.getElementById(`qtd-pista`).innerHTML = 100;
//document.getElementById(`qtd-superior`).innerHTML = 200;
//document.getElementById(`qtd-inferior`).innerHTML = 400;
function comprar(){

    let tipo = document.getElementById(`tipo-ingresso`);
    let quantidade = parseInt(document.getElementById(`qtd`).value);
    
    //let qtdinferior = document.getElementById(`qtd-superior`);
    //let qtdsuperior = document.getElementById(`qtd-inferior`);
    
    if(tipo.value == 'pista'){
        comprarpista(quantidade);
    }
    if(tipo.value == 'inferior'){
        comprarinferior(quantidade);        
    }
    if(tipo.value == 'superior'){
        comprarsuperior(quantidade);
    }

    document.getElementById('qtd').value = ''

}

function comprarpista(quantidade) {


    let qtdpista = parseInt(document.getElementById('qtd-pista').textContent);
    if(quantidade > qtdpista){
        alert('numero de ingressos invalido');
    }else{
        qtdpista = qtdpista - quantidade;
        document.getElementById('qtd-pista').textContent = qtdpista;
        alert('ingresso comprado!');

    }

    
}

function comprarinferior(quantidade) {


    let qtdinferior = parseInt(document.getElementById('qtd-inferior').textContent);
    if(quantidade > qtdinferior){
        alert('numero de ingressos invalido');
    }else{
        qtdinferior = qtdinferior - quantidade;
        document.getElementById('qtd-inferior').textContent = qtdinferior;
        alert('ingresso comprado!');

    }

    
}

function comprarsuperior(quantidade) {


    let qtdsuperior = parseInt(document.getElementById('qtd-superior').textContent);
    if(quantidade > qtdsuperior){
        alert('numero de ingressos invalido');
    }else{
        qtdsuperior = qtdsuperior - quantidade;
        document.getElementById('qtd-superior').textContent = qtdsuperior;
        alert('ingresso comprado!');

    }

    
}