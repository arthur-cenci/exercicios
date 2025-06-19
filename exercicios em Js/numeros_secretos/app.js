let numeroeSorteado = [];
let numeroSecreto = numeroAleatorio();
let tentativas = 1;

function textos(tag, texto){
    let campo = document.querySelector(tag);
    campo.innerHTML = texto;
    responsiveVoice.speak(texto, 'Brazilian Portuguese Female', {rate:1.2});
}

function mensagemInicial(){
    textos('h1', ' jogo dos numeros secretos');
    textos('p', 'escolha um numero de 1 a 10');
   
}

mensagemInicial();

function verificarChute(){
    let chute = document.querySelector('input').value;

    if (chute == numeroSecreto){
        textos('h1', 'parabens voce acertou');
        let palavraTentativa = tentativas > 1 ? 'tentativas' : 'tentativa';
        let mensagemTentativas = 'voce acertou com '+ tentativas +" "+ palavraTentativa;
        textos('p', mensagemTentativas);
        document.getElementById('reiniciar').removeAttribute('disabled');
    } else{
        if(chute > numeroSecreto){
            textos('h1', 'voce errou, tente novamente');
            textos('p', 'o numero e menor');
        } else{
            if(chute < numeroSecreto){
                textos('h1', 'voce errou, tente novamente');
                textos('p', 'o numero e maior');
            }
        }
        tentativas ++;
        limparCampo();
    }
}

function numeroAleatorio() {
    let numeroeEscolhido = parseInt(Math.random() * 10 + 1);
    let quantidadeDeNumerosNaLista = numeroeSorteado.length

    if(quantidadeDeNumerosNaLista == 10){
        numeroeSorteado = []
    }

    if (numeroeSorteado.includes(numeroeEscolhido)){
        return numeroAleatorio();
    }else{
        numeroeSorteado.push(numeroeEscolhido);
        return numeroeEscolhido;
    }
    
}

function limparCampo() {
    chute = document.querySelector('input');
    chute.value = '';
}

function reiniciarJogo() {
    numeroSecreto = numeroAleatorio();
    limparCampo();
    tentativas = 1;
    tentativas ++;
    mensagemInicial();
    document.getElementById('reiniciar').setAttribute('disabled', true )

}


